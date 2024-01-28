import java.util.Scanner;
public class DaireAlanVeCevre {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double r  ;
      final double pi = 3.141593;

        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = input.nextDouble();

        double dairealan = pi * r * r ;

        double dairecevre = 2*pi*r;

        System.out.println("Dairenin alanı = " +  dairealan );

        System.out.print("Dairenin çevresi = " +  dairecevre );
    }
}
