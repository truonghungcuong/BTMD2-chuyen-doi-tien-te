import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double usd;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số tiền (USD): ");
        usd=scanner.nextDouble();
        double quydoi = usd *23000;
        System.out.println("Giá trị VND: "+quydoi);
    }
}
