package ex03;

public class SelectedEx01 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};
        final int N = arr.length;
        int rep;
        int min;

        for (int j = 0; j < N-1; j++) {
            rep = j;
            min = rep;
            for (int i = rep+1; i < N; i++) {
                if(arr[min] > arr[i]){
                    min = i;
                }
            }

            if(rep != min){
                int temp = arr[min];
                arr[min] = arr[rep];
                arr[rep] = temp;
            }
        }
        for(int v : arr){
            System.out.print(v + " ");
        }
    }
}
