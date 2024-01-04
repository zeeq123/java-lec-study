package ex13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        System.out.println(list);
        list.add(1, "APPLE");        // 인덱스 1에 "APPLE"을 삽입
        System.out.println(list);
        list.set(2, "GRAPE");                     // 인덱스 2의 값을 "GRAPE" 로 대체
        System.out.println(list);
        list.remove(3);                     // 인덱스 3의 값을 삭제
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
