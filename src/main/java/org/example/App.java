package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{public static void main( String[] args ) {

    Scanner scan = new Scanner(System.in);

    System.out.print("What is the length of the ceiling? ");
    int length = scan.nextInt();
    System.out.print("What is the width of the ceiling? ");
    int width = scan.nextInt();

    int f2 = width * length;
    double gallon = Math.ceil(f2 / 350.0);

    System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet.\n", gallon, f2);
}
}
