/*

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360

*/

import java.util.Scanner;

public class daireHesap {
    public static void main(String[] args) {
        
    double  pi=3.14 , r , cevre , alan , alpha;

    System.out.println("Dairenin Yarı Çapını Giriniz : ");
    
    Scanner input = new Scanner(System .in);
    
    r = input.nextDouble();

    
    System.out.println("Dairenin Merkez Açısının Ölçüsünü Giriniz : ");
    
    Scanner input2 = new Scanner(System .in);
    
    alpha = input2.nextDouble();

    alan = ((pi*r*r)*alpha)/360;
     

    System.out.println("Dairenin Alanı " +alan);


    }
    
}
