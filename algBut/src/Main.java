import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("tam dosya adını giriniz");
        String dos = input.next();

        int a = dos.indexOf('.');

        String ad = dos.substring(0,a);
        String uz = dos.substring(a+1);

        System.out.println(ad);
        System.out.println(uz);
    }
}