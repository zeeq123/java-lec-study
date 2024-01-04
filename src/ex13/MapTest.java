package ex13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        System.out.println(map.get("lee")); // get.("lee") lee가 가지고 있는 key(word)를 반환

        for (String key : map.keySet()){ // keySet() 키들의 집합을 반환
            String value = map.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        map.remove(3); // 해당하는 key 값을 가진 항목 하나를 삭제한다.
        map.put("choi", "password"); // 하나의 항목을 대치한다.
        System.out.println(map);
    }
}
