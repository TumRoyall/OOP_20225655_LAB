package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "D:\\TAI LIEU\\Github\\OOP_20225655_LAB01\\Lab03\\AimsProject\\src\\hust\\soict\\globalict\\garbage\\test.txt";
        byte[] inputBytes = new byte[0];
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (byte b : inputBytes) {
            sb.append((char) b); // Sử dụng StringBuilder thay vì phép toán +
        }
        String outputString = sb.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian sử dụng stringBuilder là: " + (endTime - startTime) + " ms");
    }
}
