import java.util.Scanner;
public class Opg_3_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hvor gammel er du?");
        int userAge = input.nextInt();

        System.out.println("Er du VIP-medlem?");
        boolean vipMedlem = input.nextBoolean();

        System.out.println("Er du på forbudsliste?");
        boolean forbudsListe = input.nextBoolean();

        String adgangNaegtet = "Du har ikke adgang til festen.";

        if (!forbudsListe) {
            if (userAge >= 21 && userAge <= 40 || vipMedlem) {
                System.out.println("Du har adgang til festen!");
            } else {
                System.out.println(adgangNaegtet);
            }
        }
        else {
            System.out.println(adgangNaegtet);
        };

    }
}