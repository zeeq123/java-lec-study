package ex04;

public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television(4,10,true);
        myTv.print();

        Television yourTv = new Television(11,20,true);
        yourTv.print();
    }
}
