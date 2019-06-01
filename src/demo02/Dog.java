package demo02;

class Dog extends Animal{
    Dog(String myName, Integer myAge) {
        super(myName, myAge);
    }

    public void eat(){
        System.out.println("吃骨头");
    }
}
