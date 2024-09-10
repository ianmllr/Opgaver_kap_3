import java.util.Scanner;
public class Opg_3_5_anden_måde {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hvor gammel er du?");
        int userAge = input.nextInt();
        boolean oldEnough = userAge >= 21 && userAge <40;

        System.out.println("Er du VIP-medlem?");
        boolean userVIP = input.nextBoolean();

        System.out.println("Er du på forbudslisten?");
        boolean userBanned = input.nextBoolean();

        if (!userBanned) {

            if (oldEnough || userVIP) {

                System.out.println("Du har adgang til festen!");
            }
            else {
                System.out.println("Du har ikke adgang til festen!");
            }
        }
        else System.out.println("Du har ikke adgang til festen!");

    }
}
