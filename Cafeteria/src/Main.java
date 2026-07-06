public class Main {

    public static void main(String[] args) {

        Bebida cafe = new Cafe();
        Bebida capuccino = new Capuccino();
        Bebida cha = new Cha();

        System.out.println("Café");
        cafe.prepararBebida();

        System.out.println();

        System.out.println("Capuccino");
        capuccino.prepararBebida();

        System.out.println();
        System.out.println("Chá");
        cha.prepararBebida();
    }
}