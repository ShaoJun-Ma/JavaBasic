package demo01;

class Animal {
    private String name;
    private Integer id;

    Animal(String myName,Integer myId){
        this.name = myName;
        this.id = myId;
    }

    void eat(){
        System.out.println(id+""+name+"正在吃");
    }

    void run(){
        System.out.println(id+""+name+"正在跑");
    }
}
