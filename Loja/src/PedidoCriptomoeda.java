class PedidoCriptomoeda extends Pedido {

    @Override
    protected void processarPagamento(double total) {
        System.out.println("Pagamento realizado com criptomoeda.");
        System.out.println("Valor total: R$ " + total);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Entrega será realizada.");
    }
}