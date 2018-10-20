package com.yao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWith {

    public static void main(String[]args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("/Users/robin/Workspace/demo/src/main/java/com/yao/Hello.java"));

        //try(reader){
        //    String line = null;
        //    while ( (line = reader.readLine()) !=null){
        //        System.out.println(line);
        //    }
        //}

        //try(reader){
        //    reader.lines().forEach((l)->{
        //        System.out.println(l);
        //    });
        //}

    }
}
