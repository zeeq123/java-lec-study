package ex06.example4;

public class StarApp {
    public static void gameStart(Protos u1, Protos u2){
        u1.attack();
        u2.attack();
        System.out.println();
    }

    public static void main(String[] args) {
        Protos z1 = new Zealot("z1"); // [Zealot, Protos]
        Protos d1 = new Dragoon("d1"); // [Dragoon, Protos]
        Protos r1 = new River("r1"); // [River, Protos]
        Protos dark1 = new Dark("dark1"); // [Dark, Protos]

        gameStart(z1, d1);
        gameStart(dark1, d1);
    }
}
