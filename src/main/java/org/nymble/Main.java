package org.nymble;

import java.io.InputStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner myObj = new Scanner(System.in);
        System.out.println("Write an integer");
        int s = myObj.nextInt();

        System.out.println("Hello and welcome!" + s);
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}