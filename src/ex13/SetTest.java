package ex13;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {

        // HashSet 순서 없이 중복 데이터를 막음
        // LinkedHashSet 입력된 순서대로 정렬, 중복 데이터를 막음
        // TreeSet 알파벳 순서대로 정렬, 중복 데이터를 막음
        HashSet<String> set = new HashSet<>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);

        if (set.contains("Ham")){ // constains() 괄호 안의 자료가 있는지 없는지 확인하는 메소드
            System.out.println("Ham도 포함되어 있음");
        }
    }
}
