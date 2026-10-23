package AtividadeHeranca;

public class Main {

    public static void main(String[] args) {

        Caixa caixa = new Caixa();

        Produto produto1 = new Produto("Caderno Inteligente", 50.0);

        Produto produto2 = new Eletronico("Alienware 16 aurora", 4000.0, 50.0);

        Produto produto3 = new Vestuario("Saia Jeans", 70.0, 15.0);

        caixa.imprimirEtiqueta(produto1);
        caixa.imprimirEtiqueta(produto2);
        caixa.imprimirEtiqueta(produto3);

        caixa.simularCompraPorCategoria(1, "Alienware 16 aurora", 4000.0);
    }
}
