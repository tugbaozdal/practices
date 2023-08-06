import java.util.Scanner;
// max min bulan program
public class patika1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("kaç sayı yazdıracaksınız: ");
        int n=sc.nextInt();
        int[] list= new int[n];
        System.out.println("sayıları giriniz: ");
        for (int i=0; i<n;i++){
            list[i]=sc.nextInt();
        }
        int max= list[0];
        int min= list[0];
        for (int i: list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }

        } System.out.println("en büyük değer: " + max);

        System.out.print("en küçük değer: " + min);
    }
}
