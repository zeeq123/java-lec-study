package ex04.example;

import ex04.example.model.Account;
import ex04.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 1. 고객 2명 만들기
        User ssar = new User(1111,"ssar","ssar@nate.net");
        User cos = new User(2222,"cos","cos@nate.net");
        User love = new User(3333,"love","love@nate.net");

        // 2. 계좌 2개 만들기
        Account ssarAccount = new Account(1,1000,1111);
        Account cosAccount = new Account(2,1000,2222);
        Account loveAccount = new Account(3,1000,3333);

        // 3. 고객에게 정보를 받기 (sender, receiver, amount)
        long amount = 100L;

        // 4. 이체(ssar -> cos 100원)
        BankService.이체(ssarAccount, cosAccount, amount);

        // 5. 이체(ssar -> cos 100원)
        BankService.이체(ssarAccount, loveAccount, amount);

        // 6. 이체 (cos -> love 100원)
        BankService.이체(cosAccount, loveAccount, amount);

        // 7. 객체 상태 확인
        System.out.println(ssarAccount);
        System.out.println(cosAccount);
        System.out.println(loveAccount);

        // 8. 출금
        BankService.출금(ssarAccount, amount);
    }
}
