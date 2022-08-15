import org.testng.annotations.*;

public class BasicAnnotation {


//最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testcase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testcase2(){
        System.out.println("这是测试用例2");
    }
    //before after 在方法之前和之后运行，有多个方法就运行多次
    @BeforeMethod
    public void before(){
        System.out.println("这是在测试方法之前运行的");
    }
    @AfterMethod
    public void after(){
        System.out.println("这是在测试方法后运行");
    }
    @BeforeClass
    public void beforevclass(){
        System.out.println("这是类运行前的方法");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("这是类运行后的方法");
    }

    @BeforeSuite
    public void beforesuit(){
        System.out.println("beforesuit测试套件");
    }
    @AfterSuite
    public void aftersuit(){
        System.out.println("aftersuit测试套件");
    }
}
