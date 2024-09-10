import java.util.Scanner;
public class Opg_3_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast et årstal for at tjekke om det er et skudår.");
        int aarsTal = input.nextInt();

        boolean divByFour = (aarsTal % 4 == 0);
        boolean divByHundred = (aarsTal % 100 == 0);

        if (divByFour || divByHundred) {
            System.out.println("Året er et skudår.");
        } else {
            System.out.println("Året er ikke et skudår.");
        }





    }
}
