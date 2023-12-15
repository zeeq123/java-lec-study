package ex03;

public class Program03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            int count = 0;
            int a = i / 10;
            int b = i % 10;

            if (a == 3 || a == 6 || a == 9){
                count++;
            }
            if (b == 3 || b == 6 || b == 9){
                count++;
            }

            if (count == 0){
                System.out.print(i + " ");
            } else if (count == 1) {
                System.out.print("짝 ");
            } else if (count == 2){
                System.out.print("짝짝 ");
            }
        }
    }
}
