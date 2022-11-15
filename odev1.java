import java.util.Scanner;

public class odev1 {
    /**
     * @hidayetullah
      */
    public static void main(String[] args) {
        double kilo, boy;

        Scanner inp = new Scanner(System.in);

        System.out.print("lutfen boyunuzu(metre cinsinden) giriniz: ");
        boy = inp.nextDouble();
        System.out.print("lutfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        double vucutkitle = kilo / boy * boy;
        System.out.print("vucut kitle indeksiniz: " + vucutkitle);
    }
}
