import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;

public class demo1 {
    Scanner sc = new Scanner(System.in);

    static ArrayList stus = new ArrayList();
    String driver ="org.hsqldb.jdbc.JDBCDriver";
    String url ="jdbc:hsqldb:hsql://localhost";
    String user ="SA";
    String pass="";
    Connection con =null;
    public void init()throws Exception{
        if (con!=null)
            return;
        Class.forName(driver);
        con =DriverManager.getConnection(url,user,pass);
    }
    public void close() throws Exception{
        if(con!=null)
        con.close();
    }
    public void initTable()throws SQLException{
        String sql ="create table student(id bigint,name varchar(120),";
        sql+="os decimal,math decimal,java decimal)";
        Statement stmt =con.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
    }

    public void showAll() throws Exception {
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM student";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            long id = rs.getLong("id");
            String name =rs.getString("name");
            double os = rs.getDouble("os");
            double math = rs.getDouble("math");
            double java = rs.getDouble("java");
            Stud s1 = new Stud(id,name,os,math,java);
            stus.add(s1);
            System.out.println(id+" "+name+" "+os+" "+math+" "+java+" ");
        }
        System.out.println("打印成功，即将返回菜单");
        System.out.println("");
        menu();
    }
    public void Search() throws Exception {
        Statement stmt = con.createStatement();
        System.out.println("请选择查找方式\n1.根据学号查找\n2.根据姓名查找");
        int op ;
        String Search_sql= new String();
//        String test = new String();
        op=sc.nextInt();

        if (op==1){
            System.out.println("请输入要查找的学号");
            String id = sc.next();
            Search_sql = "SELECT * FROM student where id =" + id;
        }
        else if (op==2){
            System.out.println("请输入要查找的姓名");
            String name =sc.next();
            Search_sql = "SELECT * FROM student where name ="+"\'"+name+"\'";
        }
        else {
            System.exit(0);
        }
//        System.out.println(Search_sql);
        ResultSet rs=stmt.executeQuery(Search_sql);
        int flag=0;
        int time =0;
        while (rs.next()){
            flag=1;
            long id = rs.getLong("id");
            String name = rs.getString("name");
            double os = rs.getDouble("os");
            double math = rs.getDouble("math");
            double java = rs.getDouble("java");
            if(time==0)
            {System.out.println("查找成功，即将返回菜单");time++;}
            System.out.println(id+" "+name+" "+os+" "+math+" "+java+" ");
        }
        if (flag==0){
            System.out.println("查无此人，即将返回菜单");
        }
        System.out.println("");

        this.menu();
    }
    public void mySort() throws Exception {
        int flag;
        Statement stmt= con.createStatement();
        String Sort_sql = new String();
        int opt ;
        while (true){
        System.out.println("请选择排序方式\n0.返回菜单\n1.按照学号进行排序\n2.按照os成绩排序\n3.按数学成绩排序\n4.按java成绩排序\n\n\n");
            flag=0;
            opt=sc.nextInt();
        if(opt==1) {
             Sort_sql = "SELECT * FROM student ORDER BY id asc";
        flag=1;
        }
        else if(opt==2) {
             Sort_sql = "SELECT * FROM student ORDER BY os asc";
            flag=1;
        }
        else if(opt==3){
             Sort_sql = "SELECT * FROM student ORDER BY math asc";
            flag=1;
        }
        else if(opt==4){
             Sort_sql = "SELECT * FROM student ORDER BY java asc";
            flag=1;
        }
        else if(opt==0){
            this.menu();}
        else{
            System.out.println("非法输入，请重新输入\n");
            }

         if(flag==1) {  ResultSet rs =  stmt.executeQuery(Sort_sql);
            while (rs.next()){
                long id = rs.getLong("id");
                String name =rs.getString("name");
                double os = rs.getDouble("os");
                double math = rs.getDouble("math");
                double java = rs.getDouble("java");
                System.out.printf("%-16d%-16s%8.2f%8.2f%8.2f\n",id,name,os,math,java);
        }}
        //想法解决long类型的输出
//            System.out.println(id+" "+name+" "+os+" "+math+" "+java+" ");
        }
    }
    public void Insert() throws Exception {
        System.out.println("请输入要添加的学生的学号,姓名,os成绩,math成绩,java成绩\n每个数据占一行");
        String id = sc.next();
        String name = sc.next();
        String osScore =sc.next();
        String mathScore = sc.next();
        String javaScore =sc.next();
        Statement stmt =con.createStatement();

        String Insert_sql = "insert into student values("+id+",\'"+name+"\',"+osScore+","+mathScore+","+javaScore+")";
        stmt.executeUpdate(Insert_sql);
        System.out.println("添加成功!即将返回菜单\n\n");
        System.out.println("");
        menu();
    }
    public void Delete() throws Exception {
        System.out.println("请输入要删除的学生的学号:");
        String Delete_id = sc.next();
        String Delete_sql = "DELETE FROM STUDENT WHERE ID ="+Delete_id;
        Statement stmt = con.createStatement();
        int m= stmt.executeUpdate(Delete_sql);
//        System.out.println(m);
        if (m==1) {
            System.out.println("删除成功，系统将返回菜单\n\n");
        }
        else {
            System.out.println("查无此人，系统将返回菜单\n\n");
        }
        menu();
    }
    public void menu() throws Exception {
        this.init();
        System.out.println("1.添加一个学生\n" +
                "2.打印所有学生的信息\n" +
                "3.查找\n" +
                "4.根据id删除学生信息\n" +
                "5.根据指定字段排序");
        int option ;
        while (true){
            option= sc.nextInt();
            if (option==1){
                this.Insert();
            }
            if(option==2){
               this.showAll();
            }
            if (option==3){
                this.Search();
            }
            if (option==4){
                this.Delete();
            }
            if (option==5)
            {
                this.mySort();
            }
        }
    }
    public static void main(String []args) throws Exception{
     demo1 demo = new demo1();
     demo.menu();
     demo.close();
}
}
class Stud{
    long id;
    String name;
    double os;
    double math;
    double java;
    Stud(long id,String name,double os,double math,double java){
        this.id=id;
        this.name =name;
        this.os= os;
        this.math=math;
        this.java=java;
    }
}