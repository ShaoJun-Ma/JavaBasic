package demo02;

class Animal {
    private String name;
    private Integer age;

    Animal(String myName,Integer myAge){
        this.name = myName;
        this.age = myAge;
    }

    public void show(){
        System.out.println(name+"已经"+age+"岁了");
    }
    public void eat(){

    }
}
