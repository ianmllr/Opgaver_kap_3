public class Opg_3_3 {
    public static void main(String[] args) {


        int kopperKaffe = (int)(Math.random() * 4);
        System.out.println("Du har drukket " + kopperKaffe + " kopper kaffe.");

        if (kopperKaffe == 0) {
            System.out.println("Du virker træt, du har brug for kaffe!");
        } else if (kopperKaffe <=2) {
            System.out.println("Du er godt kørende!");
        }
        else {
            System.out.println("Tag det roligt, måske lidt for meget kaffe!");
        }
    }
}
