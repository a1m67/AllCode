package io_test;
import java.io.*;
public class FileInputStreamTest {
        public char []arr =new char[10000];
        public void read(){
            int n=-1;
            int count=0;
            InputStream in = null;
            try{
                File f= new File("C:\\Users\\孟乐航\\Desktop\\io_test.txt");
                in = new FileInputStream(f);
                while((n = in.read())!=-1){
                    System.out.print((char)n);

                    arr[count++]= ((char)n);
                }
                in.close();
            }
            catch (IOException e){
                System.out.println("File read Error" + e);
            }
            System.out.println(" "+count);
        }

    public static void main(String []a){
    }
}
