package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Calcul c=new Calcul();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int nb=scanner.nextInt();
        System.out.println("Fact of "+nb+" is : "+ c.factRecursive(nb));
    }
}

class Calcul{
    int factRecursive(int n){
        if(n==1) return 1;
        else{
            return n*factRecursive(n-1);
        }
    }
}
