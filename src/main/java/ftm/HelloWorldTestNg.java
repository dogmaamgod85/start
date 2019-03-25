package ftm;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HelloWorldTestNg {
    Object object = new Object();

    @Test
    public void test1() {
        System.out.println("I am object: " + object.toString());
        Assert.assertTrue(false, "Error appeared Test failed as expected!" );
    }

    @Test
    public void test2() {
        System.out.println("I am object: " + object.toString());
    }

}
