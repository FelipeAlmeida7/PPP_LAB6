abstract class Bebida {

    // Template Method
    public void prepararBebida() {
        aquecerAgua();
        preparar();
        colocarNaXicara();
        adicionarCondimentos();
    }

    private void aquecerAgua() {
        System.out.println("Aquecendo a água...");
    }

    private void colocarNaXicara() {
        System.out.println("Colocando na xícara...");
    }

    protected abstract void preparar();

    protected abstract void adicionarCondimentos();
}