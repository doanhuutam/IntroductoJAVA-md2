import java.util.Scanner;

public class sdToantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter withd");
        width=scanner.nextFloat();
        System.out.println("enter height");
        height= scanner.nextFloat();
        float area=width*height;
        System.out.println("dien tich la"+area);
    }
}
