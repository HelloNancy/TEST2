package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforsuite(){
        System.out.println("before suite 运行");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite 运行");
    }
}
