package day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {

    @Test
    public void test(){
        int number1=1;
        int number2=1;
        Assert.assertEquals(number1,number2);
    }

    @Test
    public void test1(){
        String actual="st";
        String expected="st";
        Object obj1=new Object();
        Object obj2=new Object();

        Assert.assertEquals(obj1,obj2);
    }
}
