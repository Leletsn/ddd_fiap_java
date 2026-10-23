package AtividadeHeranca;

public class Caixa {

    public void imprimirEtiqueta(Produto produto) {
        System.out.println(" === ETIQUETA DO PRODUTO ===");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco base: R$ " + produto.getPrecoBase());
        System.out.println("Preco final: R$ " + produto.calcularPrecoFinal());
    }

    public void simularCompraPorCategoria(int opcao, String nome, double precoBase) {
        Produto produto;
        if (opcao == 1) {
            produto = new Eletronico(nome, precoBase, 50.0);
        }else if (opcao == 2) {
            produto = new Vestuario(nome, precoBase, 15.0);
        }else {
            produto = new Produto(nome, precoBase);
        }
        imprimirEtiqueta(produto);
    }
}
