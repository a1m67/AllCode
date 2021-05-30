package io_test;

import java.io.*;

public class FileWriterTest {
    public static void main(String []args) throws IOException {
        File source = new File("C:\\Users\\孟乐航\\Desktop\\o_test.txt");
        File target = new File("C:\\Users\\孟乐航\\Desktop\\o2_test.txt");
        char c[] = new char[10];
        Writer out = new FileWriter(target,true);
        Reader in = new FileReader(source);
        int n=-1;
        while ((n=in.read(c))!=-1){
            out.write(c,0,n);

        }
        in.close();
        out.close();
    }
}
