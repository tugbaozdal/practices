import java.util.Scanner;
// dizideki en büyük elemandan bir küçük elamanı  bulan program
public class ornek2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] list= new int[5];
        System.out.println(" dizinin elemanlarını gir en büyük değerden önceki değeri bulalım  :)");
        for (int i=0; i<list.length;i++){
            list[i]=input.nextInt();
        }
        int enB=list[0];
        for (int i=0;i<list.length;i++){
            if (list[i]>enB){
                enB=list[i];
            }
        }
        int enBk=list[0];
        for (int i=0;i<list.length;i++){
            if (list[i]>enBk){
                if (list[i]<enB){
                    enBk=list[i];
                }
            }
        }
        System.out.println("en büyükten önceki değer: "+ enBk);
    }
}
