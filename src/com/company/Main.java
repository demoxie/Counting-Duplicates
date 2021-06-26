package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        DuplicateCounter dp = new DuplicateCounter();
        System.out.println(dp.filterDuplicateCharacters(str));

    }
}
