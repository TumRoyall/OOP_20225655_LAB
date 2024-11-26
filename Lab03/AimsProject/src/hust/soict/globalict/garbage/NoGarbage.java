package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "C:\\Program Files (x86)\\MP3 Key Shifter\\mp3key.exe";
        byte[] inputBytes = new byte[0];
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (byte b : inputBytes) {
            sb.append((char) b); // Sử dụng StringBuilder thay vì phép toán +
        }
        String outputString = sb.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
