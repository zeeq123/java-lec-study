package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx03 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;

        for (int i = 0; i < 6; i++) {

            num = r.nextInt(45) + 1; // i==0 비교
            arr[i] = num;

            for (int j = i-1; j >= 0; j--) {
                if(arr[j] == num){
                    i--;
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
