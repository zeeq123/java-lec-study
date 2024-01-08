package ex14;

import java.util.ArrayList;

class User {
    private String name;
    private int age;

    public void changeAge(){
        this.age = this.age - 1;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StreamEx02 {
    public static void main(String[] args) {
        // User 3명 만들기
        User user1 = new User("홍길동", 10);
        User user2 = new User("장보고", 11);
        User user3 = new User("임꺽정", 12);
        // ArrayList에 User 담기
        ArrayList<User> arr = new ArrayList<>();
        arr.add(user1);
        arr.add(user2);
        arr.add(user3);

        // stream으로 순회하면서 map으로 가공하기(나이 - 1)
        arr.stream().map(u -> {
            u.changeAge();
            return u;
        }).toList();

        arr.stream().forEach(user -> {
            System.out.println(user.getAge());
        });
    }
}