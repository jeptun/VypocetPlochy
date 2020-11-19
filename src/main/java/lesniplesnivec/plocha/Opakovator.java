package lesniplesnivec.plocha;
import java.util.Scanner;

public class Opakovator
{
    public Boolean opakovat () {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Chcete opakovat Ano/Ne ?");
        Boolean vysledek = true;
        Boolean konec = true;

        do {
            String vstup = sc.nextLine();
            if ("ano".equalsIgnoreCase(vstup)) {
                konec = false;
                vysledek = true;

            } else if ("ne".equalsIgnoreCase(vstup)) {
                konec = false;
                vysledek = false;
            } else {

                System.out.println("Neplatna volba zadej znovu! ");
            }
        }
        while (konec);
        return vysledek;
    }

}
