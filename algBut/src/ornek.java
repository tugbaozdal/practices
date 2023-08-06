import java.util.Scanner;
// dizideki elemanları tersten yazma
public class ornek {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("5 adet sayı giriniz");
        int[] list= new int[5];
        for (int i=0;i< list.length;i++){
            list[i]=input.nextInt();
        }
        int degisken;
        int j=5-1;
        for (int i=0;i<j;i++){
            degisken=list[i];
            list[i]=list[j];
            list[j]=degisken;
            j--;
        }
        System.out.println("ters çevrilmiş dizi: ");
        for (int i=0;i<5; i++){
            System.out.print(" "+list[i]);
        }
    }
}
