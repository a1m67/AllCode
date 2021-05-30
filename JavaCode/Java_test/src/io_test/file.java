package io_test;
import java.io.*;
public class file {
    public static void main(String []a) throws IOException {
        File f = new File("C:\\Users\\孟乐航\\Desktop\\io_test.txt");

        System.out.println(f.getName()+"是可读的吗:"+f.canRead());
        System.out.println(f.getName()+"的长度:"+f.length());
        System.out.println(f.getName()+"的绝对路径:"+f.getAbsolutePath());

        if (!f.exists()){
            System.out.println("创建新文件");

            f.createNewFile();
            System.out.println("创建成功");
        }


    }
}
