import java.util.Scanner;

public class bMi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double chieucao,cannang,chiso;
        System.out.println("nhap chieu cao");
        chieucao=scanner.nextDouble();
        System.out.println("nhap can nang");
        cannang=scanner.nextDouble();
        chiso=cannang/Math.pow(chieucao,2);
        if (chiso<18) {
            System.out.println("Underweight!");
        } else if (chiso<25) {
            System.out.println("Normal!");
        } else if (chiso<30) {
            System.out.println("Overweight!");
        } else {
            System.out.println("Obese!");
        }
    }
}
