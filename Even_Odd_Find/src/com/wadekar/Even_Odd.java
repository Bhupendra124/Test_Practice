package com.wadekar;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        int number = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        number=s.nextInt();

        if (number%2==0)
        {
            System.out.println("The Number is Even" + number);
        }
        else
        {
            System.out.println("The Number is Odd" + number);
        }
    }
}
