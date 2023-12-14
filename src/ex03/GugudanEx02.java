package ex03;

import java.util.Scanner;

public class GugudanEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단을 출력할 정수를 입력하시오: ");
        int x = sc.nextInt();

        for (int i = 2; i <= 9; i++) {
            System.out.println(x + "*" + i + "=" + (x*i));
        }
    }
}
