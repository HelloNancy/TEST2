package com.course.testng.suite;

import org.testng.annotations.Test;

public class ExpectException {

    @Test(expectedExceptions =RuntimeException.class)
    public void exception1(){
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions =RuntimeException.class)
    public void exception2(){
        System.out.println("这是成功的异常测试");
        throw new RuntimeException();

    }
}
