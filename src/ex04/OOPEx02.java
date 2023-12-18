package ex04;

class Person4 {
    // 상태 = 변수
    private int weight = 100; // private 어디에서도 접근 불가능

    public int getWeight(){
        return weight;
    }
    // 행위 = 메서드
    public void exercise(){ // public 어디에서든 접근 가능
        weight = weight - 10;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {
        Person4 p4 = new Person4();
        System.out.println("p3의 몸무게 : " + p4.getWeight());
        for (int i = 0; i < 10; i++) {
            p4.exercise();
            System.out.println("p3의 몸무게 : " + p4.getWeight());
        }
    }
}
