package Atividade1;

public class TesteProduto {

    public static void main(String[] args) {

        // Utilizando construtor vazio
        Produto produto1 = new Produto();

        produto1.setNome("Notebook");
        produto1.setPreco(3500.00);
        produto1.setQuantidadeEstoque(10);

        // Utilizando onstrutor parametrizado
        Produto produto2 = new Produto("Mouse", 80.00, 20);

        boolean resultadoAdicao = produto1.adicionarEstoque(5);
        System.out.println("Resultado da adição de estoque: " + resultadoAdicao);

        boolean resultadoVenda1 = produto1.realizarVenda(3);
        System.out.println("Resultado da venda de 3 unidades: " + resultadoVenda1);

        boolean resultadoVenda2 = produto1.realizarVenda(20);
        System.out.println("Resultado da venda de 20 unidades: " + resultadoVenda2);


        System.out.println("\n--- Produto 1 ---\n");
        produto1.exibirInfo();
        System.out.println("\n--- Produto 2 ---\n");
        produto2.exibirInfo();
    }
}
