package demo01;

import org.junit.Test;

//继承
public class TestDemo {
    @Test
    public void test01(){
        Animal dog = new Dog("小黄",2);
        dog.eat();
        dog.run();
    }
}
