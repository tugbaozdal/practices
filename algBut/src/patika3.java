import java.util.Scanner;
public class patika3 {
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
        System.out.print("kaç elemanlı dizi istersiniz: ");
        int n=input.nextInt();
        int [] list= new int[n];
        int sumCift=0 , sumTek=0;
        System.out.println(" dizinin elemanlarını giriniz: ");
        for (int i=0; i<n;i++){
            list[i]= input.nextInt();
        }
        for (int i=0;i<n;i++){
            if (list[i]%2==0){
                sumCift+=list[i];
            }else
                sumTek+=list[i];
        }
        System.out.println("tekk sayıların toplamı: "+ sumTek);
        System.out.println("çift sayıların toplamı: "+ sumCift);
    }
}
