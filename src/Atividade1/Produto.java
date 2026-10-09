package Atividade1;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor vazio
    public Produto() {
        this.nome = "Sem Nome";
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
    }

    // Construtor parametrizado
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Metodo de exibição
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }

    // Adicionar estoque
    public boolean adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidadeEstoque = quantidadeEstoque + qtd;
            return true;
        } else {
            return false;
        }
    }

    // Realizar venda
    public boolean realizarVenda(int qtd) {
        if (qtd > 0 && qtd <= quantidadeEstoque) {
            quantidadeEstoque = quantidadeEstoque - qtd;
            return true;
        } else {
            return false;
        }
    }
}
