package ex03;

public class ForExample1 {
    public static void main(String[] args) {
        // for(초기식; 조건식; 증감식;){}
        for(int i = 1; i <= 10; i++){ // i = 0으로 시작, i가 5보다 작을때까지 반복, 반복할때마다 i++
            System.out.println("i의 값은: " + i);
        }
    }
}
