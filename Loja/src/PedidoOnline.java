class PedidoOnline extends Pedido {

    @Override
    protected void processarPagamento(double total) {
        System.out.println("Pagamento online realizado.");
        System.out.println("Valor total: R$ " + total);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Entrega será realizada.");
    }
}