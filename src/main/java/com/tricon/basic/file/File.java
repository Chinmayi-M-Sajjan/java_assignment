package com.tricon.basic.file;

import java.io.*;

public class File {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a File I/O example in Java.\n");
            writer.write("We are writing and reading from a text file.\n");
            writer.write("End of file content.");
            writer.close();
            System.out.println("Data successfully written to file: " + fileName);
        } catch (IOException e) {
            System.out.println(" Error while writing: " + e.getMessage());
        }

        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            System.out.println("\nFile Content:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
