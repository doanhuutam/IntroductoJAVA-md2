import java.util.Scanner;

public class giaiPtBn {
    public static void main(String[] args) {
        System.out.println("hihii");
        System.out.println("nahp hang so cho phuong trinh bac nhat");
        Scanner scanner=new Scanner(System.in);
        System.out.println("a");
        double a =scanner.nextDouble();
        System.out.println("b");
        double b =scanner.nextDouble();
        System.out.println("c");
        double c= scanner.nextDouble();
        if (a!=0){
            double anser=(c-b)/a;
            System.out.println("ket qua chuong trinh \n" + anser);
        }else{
            if (b==c){
                System.out.println("tieensg anh");
            }else{
                System.out.println("vo nghiem,");
            }
        }

    }
}
