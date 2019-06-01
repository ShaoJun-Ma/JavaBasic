package demo03;

import org.junit.Test;

//封装：不注重底层细节
public class TestDemo {

    @Test
    public void test03(){
        Preson preson = new Preson("小白");
        preson.eat();
        preson.run();
        preson.sleep();
    }
}
