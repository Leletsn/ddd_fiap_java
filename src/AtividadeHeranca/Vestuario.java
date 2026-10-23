package AtividadeHeranca;

public class Vestuario extends Produto {

    private double percentualDesconto;

    public Vestuario(String nome, double precoBase, double percentualDesconto) {
        super(nome, precoBase);
        this.percentualDesconto = percentualDesconto;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * (1 - percentualDesconto / 100);
    }
}