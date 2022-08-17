package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DateProviderTest {


    @Test(dataProvider = "data")
    public void test1(String name, int age) {
        System.out.println("name=" + name + ",age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] test2() {
        Object[][] o = {
                {"liumeilan", 25},
                {"xcguang", 30},
                {"xiongbeibei", 1}
        };
        return o;
    }

    @Test(dataProvider = "methodDate")
    public void test3(String name, int age) {
        System.out.println("test3方法 name=" + name + ",age=" + age);
    }

    @Test(dataProvider = "methodDate")
    public void test4(String name, int age) {
        System.out.println("test4方法 name=" + name + ",age=" + age);
    }

    @DataProvider(name = "methodDate")
    public Object[][] MethodTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test3")) {
            result = new Object[][]{
                    {"刘梅兰", 10},
                    {"熊贝", 2}
            };
        } else if (method.getName().equals("test4")) {
            result = new Object[][]{{"熊晨光", 30}};

        }
        return result;
    }


}


