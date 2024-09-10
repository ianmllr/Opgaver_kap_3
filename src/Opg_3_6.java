import java.util.Scanner;
public class Opg_3_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv et tal mellem 1 og 7 og det vil blive konverteret til en ugedag.");


        switch (input.nextInt()) {
            case 1:
                System.out.println("Mandag");
                break;

            case 2:
                System.out.println("Tirsdag");
                break;

            case 3:
                System.out.println("Onsdag");
                break;

            case 4:
                System.out.println("Torsdag");
                break;

            case 5:
                System.out.println("Fredag");
                break;

            case 6:
                System.out.println("Lørdag");
                break;

            case 7:
                System.out.println("Søndag");
                break;

            }

    }

}
