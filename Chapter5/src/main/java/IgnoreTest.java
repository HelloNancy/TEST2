import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1执行");
    }
    //当没有enabled属性时，默认是true
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2执行");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3执行");
    }

}
