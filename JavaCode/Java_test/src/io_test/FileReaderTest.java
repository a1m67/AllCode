package io_test;
import java.io.*;

public class FileReaderTest {
    public char[] arr = new char[100000];
    public void read() {
        int n = -1;
        int count = 0;
        FileReader in = null;
        try {
            File f = new File("C:\\Users\\孟乐航\\Desktop\\io_test.txt");
            in = new FileReader(f);
            while ((n = in.read()) != -1) {
                System.out.print((char) n);
                arr[count++] = ((char) n);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("File read Error" + e);
        }
        System.out.println(" " + count);
    }

    public static void main(String[] a) {
//            int n= -1 ;
//            int count=0;
//            FileReader in = null;
//            try{
//                File f= new File("C:\\Users\\孟乐航\\Desktop\\io_test.txt");
//                in = new FileReader(f);
//                while((n = in.read())!=-1){
//                    System.out.print((char)n);
//                    count++;
//                }
//                in.close();
//            }
//            catch (IOException e){
//                System.out.println("File read Error" + e);
//            }
//            System.out.println(" "+count);
//        }
    }
}