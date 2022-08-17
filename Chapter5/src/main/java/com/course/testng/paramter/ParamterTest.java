package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void test1(String name,String age){
        System.out.println("name="+name+",age="+age);

    }
}
//需要配置文件
// Paramter.xml