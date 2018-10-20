package com.yao.reflection;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class ReflectionAndClassLoader {



    //自己打包个jar,然后调用其中的类，jar cvf xx
    public static void main(String[]args) throws Exception {


        File file = new File("/Users/robin/Tmp/Hello.jar");
/*
        System.out.println(file.isFile());

        FileReader reader = new FileReader(file);

        char [] cbuf = new char[1024];

        while (reader.read(cbuf)>0){
            System.out.println(cbuf);
            cbuf = new char[1024];
        }*/



        //自定义类加载加载jar中的类，通过反射调用
        ClassLoader classLoader = new URLClassLoader(new URL[]{file.toURI().toURL()});

        Class<?> clazz = classLoader.loadClass("com.yao.reflection.HelloWorld");

        Method sayHelloMethod = clazz.getMethod("sayHello",new Class<?>[]{String.class});

        Object target =clazz.getDeclaredConstructor().newInstance();

        sayHelloMethod.invoke(target,"test---");

    }



}
