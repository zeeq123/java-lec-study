package ex15;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("input.txt"));
            outputStream = new PrintWriter(new FileWriter("output.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);

            }
        } finally {
            if (inputStream != null){ inputStream.close();}
            if (outputStream != null){ outputStream.close();}

        }


    }
}
