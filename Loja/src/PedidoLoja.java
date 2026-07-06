class PedidoLoja extends Pedido {

    @Override
    protected void processarPagamento(double total) {
        System.out.println("Pagamento realizado na loja.");
        System.out.println("Valor total: R$ " + total);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Cliente retirará o pedido na loja.");
    }
}