import java.util.Scanner;

public class denem1231 {
    public static void main(String[]args){
        Scanner t = new Scanner(System.in);
       int basamak = t.nextInt();//kullanıcıdan basamağı aldım
        int toplam = 0,sayı =1;

        for(int x =0,onbasamak=1;x < basamak;x++) {
            onbasamak *= 10;
            toplam += sayı;
        sayı += onbasamak;
            System.out.println(sayı);
            System.out.println(toplam);
          //sasa
            System.out.println("deneme1232131");

        }
    }
}
