package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class Annotion {

    @Test(invocationCount = 10,threadPoolSize = 3)//线程、线程池
    public void test(){
        System.out.println(1);
        System.out.printf("线程id：%s%n",Thread.currentThread().getId());
    }
}
