package ex08;

class Account extends Object { // extends Object 모든 클래스에 있지만 생략돼있다.
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("홍길동", 1111, 1000);
        System.out.println(account);
        System.out.println(account2);

        // '==' 메모리 값 비교, (주소 비교)
        if(account == account2){
            System.out.println("같다");
        }

        // account -> equals(오브젝트) (주소비교)
        // account.toString -> equals() (주소비교 and 값비교)
        if(account.toString().equals(account2.toString())){
            System.out.println("같다");
        }
    }
}
