package ex13;

import java.util.HashSet;
import java.util.Set;

public class FindDupplication {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        String[] sample = {"사과", "사과", "바나나", "토마토"};
        for (String a : sample)
            if(!s.add(a)){ // HashSet 에는 중복 값이 들어가지 않아 중복된 값이라면 s.add()가 되지 않는다.
                System.out.println("중복된 단어: " + a);
            }

        System.out.println(s.size() + " 중복되지 않은 단어: " + s);
    }
}
