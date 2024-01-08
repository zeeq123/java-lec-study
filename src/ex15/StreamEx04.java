package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("안녕\n");
            bw.write("반가워");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
