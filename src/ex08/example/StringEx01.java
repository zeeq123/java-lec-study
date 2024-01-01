package ex08.example;
// AABBBCCCCDDDDD -> A2B3C4D5 encoding
// A2B3C4D5 -> AABBBCCCCDDDDD decoding

import ex03.ArrayListTest;

import java.util.ArrayList;

public class StringEx01 {


    // charAt(index) 인덱스 위치의 문자를 반환
    static String encoding(String a){
        int count = 0;
        int c = 1;
        ArrayList<Character> arr = new ArrayList<Character>();

//        char arr[] = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if(i == 0){
                arr.add(a.charAt(i));
//                arr[i] = a.charAt(i);
                count++;
            }
            if(i != a.length() - 1){
                if(a.charAt(i) == a.charAt(i + 1)){
                    c++;
                } else if(a.charAt(i) != a.charAt(i + 1)) {
                    arr.add((char)(c + '0'));
                    arr.add(a.charAt(i + 1));
//                    arr[count] = (char)(c + '0');
//                    count++;
//                    arr[count] = a.charAt(i + 1);
//                    count++;
                    c = 1;
                }
            }else{
                arr.add((char)(c + '0'));
//                arr[count] = (char)(c + '0');
//                count++;
            }

        }
        a = new String(String.valueOf(arr));
        return a;
    }

    void decoding(){

    }

    public static void main(String[] args) {
        String s1 = "AABBBCCCCDDDDD";
        String s2 = "A2B3C4D5";
        String result = encoding(s1);
        System.out.println(result);
    }
}
