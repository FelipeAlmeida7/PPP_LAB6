abstract class Pedido {

    public  void processarPedido(int quantidade, double valorItem) {

        double total = quantidade * valorItem;

        processarPagamento(total);
        decidirEntrega();
    }

    protected abstract void processarPagamento(double total);

    protected abstract void decidirEntrega();
}