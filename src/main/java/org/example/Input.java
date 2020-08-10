package org.example;

import java.util.Scanner;

public class Input {
    public static int getInteger(){
        Scanner getInput = new Scanner(System.in);
        int input = 0;
        boolean hasExceptions;
        do {
            hasExceptions = false;
            try {
                input = Integer.parseInt(getInput.nextLine());
            } catch(Exception e){
                hasExceptions = true;
                System.out.println("Input error. Try again");
            }
        }while(hasExceptions);
        return input;
    }

    public static String getString(){
        Scanner getInput = new Scanner(System.in);
        String input = "";
        boolean hasExceptions;
        do {
            hasExceptions = false;
            try {
                input = getInput.nextLine();
            } catch(Exception e){
                hasExceptions = true;
            }
        }while(hasExceptions);
        return input;
    }
}
