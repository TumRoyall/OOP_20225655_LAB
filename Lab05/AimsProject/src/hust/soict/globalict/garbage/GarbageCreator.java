package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
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
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b; // Sử dụng phép toán + để nối chuỗi, tạo ra nhiều đối tượng String
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian sử dụng phép toán \'+\' là: " + (endTime - startTime) + " ms");
    }
}
