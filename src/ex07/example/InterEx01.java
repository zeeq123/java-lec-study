package ex07.example;

interface Remocon { // interface 는 메서드를 강제화, new 불가
    void on();
    void off();
}

class SamsungRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("삼성 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 off");
    }
}

class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("엘지 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("엘지 리모컨 off");
    }
}

/**
 * 작성자 : 홍길동
 * 날짜 : 2023.12.26
 * 구현체 : SamsungRemocon, LgRemocon
 */
class CommonRemocon {
    private Remocon r;

    public CommonRemocon(Remocon r) {
        this.r = r;
    }

    public void on(){
        r.on();
    }

    public void off(){
        r.off();
    }

}

public class InterEx01 {
    public static void main(String[] args) {
        CommonRemocon cr = new CommonRemocon(new SamsungRemocon());
        cr.on();
    }
}