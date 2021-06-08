package com.company;

import java.util.Scanner;

public class tesst {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int max=0;
        for (int i=1;i<number;i++){
            if (number%i==0){
                max=i;
            }
        }
        System.out.println(max);

    }
}
//tìm ước lớn nhất của 1 số