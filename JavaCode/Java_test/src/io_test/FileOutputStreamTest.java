package io_test;

import java.io.*;

public class FileOutputStreamTest {
    public static void main(String []a) throws IOException {
//        FileReaderTest fileReader = new FileReaderTest();
//        fileReader.read();
//        System.out.println(fileReader.arr.toString());
        byte[] s1  ="新年快乐".getBytes();
        byte[]s2 = "happy new year".getBytes();
        File file = new File("C:\\Users\\孟乐航\\Desktop\\o_test.txt");
        OutputStream out = new FileOutputStream(file);
        System.out.println(file.getName()+"的大小:"+file.length()+"字节");
        out.write(s1);
        out.close();



        out = new FileOutputStream(file,true);
        System.out.println(file.getName()+"的大小:"+file.length()+"字节");
        out.write(s2,0,s2.length);
        System.out.println(file.getName()+"的大小:"+file.length()+"字节");
        out.close();
    }
}
