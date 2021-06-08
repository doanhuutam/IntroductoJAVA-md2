import java.util.Scanner;

public class ktraNamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("so nam ktar");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("laf nam nhuan");
                } else {
                    System.out.println("kp nM Nhuan");
                }
            } else {
                System.out.println(" nam nhuan");
            }
        } else {
            System.out.println("kp nam nhuan");
        }
    }
}

