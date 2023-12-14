package ex03;

public class Sum02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 6 == 0){
                sum = sum + i;
            }
        }
        System.out.println("1부터 100까지 사이에서 6의 정수의 합은: " + sum);
    }
}
