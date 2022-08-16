package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组得测试方法1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端的测试方法2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端的测试方法3");
    }

    @BeforeGroups("server")
    public void BeforeTest(){
        System.out.println("服务端测试组前运行的方法");
    }

    @AfterGroups("client")
   public void AfterTest(){
       System.out.println("客户端测试组后运行的方法");
   }

}
