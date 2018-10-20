package com.yao;

import java.util.concurrent.TimeUnit;

public class Hello {

    public static void main(String[]args) throws InterruptedException {

        System.out.println(TestInterface9.methodC());

        TimeUnit.SECONDS.sleep(5);

        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println(currentProcess.pid());

        ProcessHandle.allProcesses().forEach(p ->{
            System.out.println(p.pid());
            System.out.println(p.info().command().orElseGet(()->{
                return "null";
            }));
        });

    }

}
