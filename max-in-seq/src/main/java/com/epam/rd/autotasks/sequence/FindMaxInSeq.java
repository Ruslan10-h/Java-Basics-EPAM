package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner= new Scanner(System.in);

        double max = Integer.MIN_VALUE;
        while(true){
            int n = scanner.nextInt();
            if(n==0){
                break;
            }
            if(n>max){
                max=n;
            }

        }
        return (int)max;


    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
