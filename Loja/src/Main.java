/*
Diferença entre Template Method e Decorator:

Template Method:
- Define um algoritmo fixo em uma classe abstrata.
- As subclasses implementam apenas algumas etapas do algoritmo.
- O objetivo é reutilizar um mesmo processo, alterando apenas partes dele.

Decorator:
- Adiciona novas funcionalidades a um objeto sem modificar sua classe.
- Os comportamentos podem ser combinados dinamicamente.
- O objetivo é estender funcionalidades.
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