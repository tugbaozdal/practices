import java.util.Scanner;

public class patika {
    public static void main(String[] args) {
        //dizideki elemanların ortalamasını bulan program
        Scanner input= new Scanner(System.in);
        System.out.print("ortalamasını almak istediğiniz sayı miktarını giriniz: ");
        int n= input.nextInt();
        int[] list= new int[n];
        int sum=0;
        System.out.println(" sayıları giriniz : ");
        for (int i=0; i<n;i++){
            list[i]=input.nextInt();
        }
        for (int i=0;i<n;i++){
            sum=list[i]+sum;
        }
        System.out.print("ortalama: "+ (sum/n));
    }
}
