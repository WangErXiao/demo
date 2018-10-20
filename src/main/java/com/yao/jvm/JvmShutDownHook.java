package com.yao.jvm;

import java.util.concurrent.TimeUnit;

public class JvmShutDownHook {

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                JvmShutDownHook.hookHandler();
            }
        }));
    }


    public static void main(String[]args) throws InterruptedException {

        System.out.println("jvm start");

        TimeUnit.SECONDS.sleep(2);

        System.out.println("jvm to stop");

    }

    public static void hookHandler(){
        System.out.println("jvm cleared --");
    }


}
