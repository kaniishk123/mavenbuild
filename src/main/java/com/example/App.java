package com.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Maven + Java!");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of X");
        int x=sc.nextInt();
        System.out.println("enter the value of Y");
        int y=sc.nextInt();
        System.out.println("the sum is" +(x+y));
        
        
    }
}
