package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iveskite sveika skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%7==0){
            System.out.println("Ivestas skaicius dalinasi is 7");
        } else if(a%5==0){
            System.out.println("Ivestas skaicius dalinasi is 5");
        } else if(a%3==0){
            System.out.println("Ivestas skaicius dalinasi is 3");
        } else System.out.println("Ivestas skaicius nesidalina is 7, 5 ir 3");

    }
}