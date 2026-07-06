/*
O padrão Template Method é utilizado quando existe um processo que sempre segue a mesma sequência de passos
mas algumas etapas podem variar essas etapas são implementadas pelas subclasses
 enquanto a estrutura do algoritmo fica definida na classe abstrata

Já o padrão Decorator serve para adicionar novas funcionalidades a um objeto sem precisar alterar sua classe original, com ele
é possível combinar diferentes comportamentos de forma dinâmica, tornando o objeto mais flexível.
*/

public class Main {

    public static void main(String[] args) {

        Pedido pedidoOnline = new PedidoOnline();
        Pedido pedidoLoja = new PedidoLoja();
        Pedido pedidoCripto = new PedidoCriptomoeda();

        System.out.println("Pedido Online");
        pedidoOnline.processarPedido(3, 20);

        System.out.println();

        System.out.println("Pedido na Loja");
        pedidoLoja.processarPedido(2, 50);

        System.out.println();

        System.out.println(" Pedido com Criptomoeda ");
        pedidoCripto.processarPedido(5, 15);
    }
}