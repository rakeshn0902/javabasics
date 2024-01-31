package com.training.quest2;

import java.util.Scanner;

public class ExtractorMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which kind of extractor: ");
        String extract = scanner.next();
        String[] fileNames = {"a.txt", "b.txt", "c.txt"};
        if (extract.equalsIgnoreCase("z")) {
            Extractor extractor = new ZipExtractor();
            extractor.extractFiles(fileNames);
        } else if (extract.equalsIgnoreCase("j")) {
            Extractor extractor = new JarExtractor();
            extractor.extractFiles(fileNames);
        } else if (extract.equalsIgnoreCase("r")) {
            Extractor extractor = new RarExtractor();
            extractor.extractFiles(fileNames);
        } else {
            System.out.println("Enter right extractor");
        }

    }
}
