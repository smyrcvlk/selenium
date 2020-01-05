package day13.examples.suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class task1 {

    @Test
    public void Task1() {
        System.out.println("Task1");
    }

    @Test
    public void Task2() {
        System.out.println("Task 2");
    }

    @Test
    public void Task3() {
        System.out.println("Task 3");
    }

    @BeforeMethod
    public void beforemethod()
    {
        System.out.println("Before");
    }

    @AfterMethod
    public void aftere(){
        System.out.println("Aftere");
    }
}


