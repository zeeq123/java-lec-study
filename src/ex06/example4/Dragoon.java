package ex06.example4;

public class Dragoon extends Protos {
    String name;

    public Dragoon(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("드라군이 공격합니다 : " + name);
    }
}
