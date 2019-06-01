package demo03;

public class Preson {
    private String name;

    public Preson(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name+"正在吃");
    }

    public void run(){
        System.out.println(name+"正在跑");
    }

    public void sleep(){
        System.out.println(name+"正在睡觉");
    }
}
