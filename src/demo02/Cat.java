package demo02;

class Cat extends Animal {
    Cat(String myName, Integer myAge) {
        super(myName, myAge);
    }

    public void eat(){
        System.out.println("吃鱼");
    }
}
