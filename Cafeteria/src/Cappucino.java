class Capuccino extends Bebida {

    @Override
    protected void preparar() {
        System.out.println("Preparando café com leite...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando canela.");
    }
}