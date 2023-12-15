package ex03;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("철수");
        list.add("영희");
        list.add("순신");
        list.add("지영");

        System.out.println(list.get(3));

        list.remove(3); // list 배열의 3번 인덱스에 위치한 데이터를 삭제

//      System.out.println(list.get(3));
    }
}
