package ex03;

public class GugudanEx03 {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + (j*i) + "\t");
            }
            System.out.println("");
        }
    }
}
