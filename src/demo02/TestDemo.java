package demo02;

import org.junit.Test;

//多态：同一件事发生在不同对象表现出不同的行为
public class TestDemo {
    @Test
    public void test02(){
        Animal dog = new Dog("小狗",1);
        dog.show();
        dog.eat();
        Animal cat = new Cat("小猫",2);
        cat.show();
        cat.eat();
    }
}
