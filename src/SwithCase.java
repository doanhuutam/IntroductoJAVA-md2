import java.util.Scanner;

public class SwithCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("which casi gif ddos");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                    System.out.println("cos khoang 30 ngay");
                    break;
            case 4:
            case 6:
            case 8:
                        System.out.println("bao nhieu khong biet");
                        break;
        }
    }
}
