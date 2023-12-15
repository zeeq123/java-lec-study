package ex03;

import java.util.Objects;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요(+, -, *, /): ");
        String s = sc.next();
        System.out.println("피연산자 2개를 입력하세요 :");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        if(Objects.equals(s, "+")){
            System.out.println(n1 + s + n2 + " = " + (n1 + n2));
        } else if (Objects.equals(s, "-")) {
            System.out.println(n1 + s + n2 + " = " + (n1 - n2));
        } else if (Objects.equals(s, "*")) {
            System.out.println(n1 + s + n2 + " = " + (n1 * n2));
        } else if (Objects.equals(s, "/")) {
            if (n2 == 0){
                System.out.println("계산 불가능");
            }else{
                System.out.println(n1 + s + n2 + " = " + (n1 / n2));
            }
        }
    }
}
