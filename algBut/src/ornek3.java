import java.util.Scanner;
// dizide eleman arama
public class ornek3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arr={82,22,10,2003,1997,1970,1974};
        System.out.print("listede aratmak istediğiniz numarayı giriniz: ");
        int n=input.nextInt();
        int f=0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]==n){
             f=1;
             break;
            }
        }
        if (f==1)
            System.out.println("aradığınız numara listede bulunmaktadır");
        else if (f==0)
            System.out.println("aradığınız değer listede bulunmamaktadır.");
    }
}
