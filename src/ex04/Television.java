package ex04;

public class Television {
    private int channel;
    private int volume;
    private boolean onOff;

    Television(int c, int v, boolean o){
        channel = c;
        volume = v;
        onOff = o;
    }

    void print(){
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }
    public static void main(String[] args) {
//        Television myTv = new Television();
//        myTv.channel = 7;
//        myTv.volume = 10;
//        myTv.onOff = true;
//
//        Television yourTv = new Television();
//        yourTv.channel = 9;
//        yourTv.volume = 12;
//        yourTv.onOff = true;
//        System.out.println("나의 텔레비전의 채널은 " + myTv.channel + "이고 볼륨은 " + myTv.volume + "입니다.");
//        System.out.println("너의 텔레비전의 채널은 " + yourTv.channel + "이고 볼륨은 " + yourTv.volume + "입니다.");
    }
}
