class Cafe extends Bebida {

    @Override
    protected void preparar() {
        System.out.println("Passando o café...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando açúcar.");
    }
}