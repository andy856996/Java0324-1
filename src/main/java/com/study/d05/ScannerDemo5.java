package com.study.d05;

import java.io.File;
import java.util.Scanner;

public class ScannerDemo5 {
    public static void main(String[] args) throws Exception {
        File f = new File("src\\main\\java\\com\\study\\d05\\myfile.txt");
        Scanner sc = new Scanner(f, "UTF-8").useDelimiter("\\A"); // 全部抓
        System.out.println(sc.next());
    }
}
