package ex04;
class Pizza{
    int size;
    String type;

    public Pizza(){
        size = 12;
        type = "슈퍼스프림";
    }
    public Pizza(int s, String t){
        size = s;
        type = t;
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza();
        System.out.println("(" + obj1.type + "," + obj1.size + ")");

        Pizza obj2 = new Pizza(24, "포테이토");
        System.out.println("(" + obj2.type + "," + obj2.size + ")");

    }
}
