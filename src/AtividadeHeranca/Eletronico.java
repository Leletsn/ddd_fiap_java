package AtividadeHeranca;

public class Eletronico extends Produto {

    private double taxaGarantiaEstendida;

    public Eletronico(String nome, double precoBase, double taxaGarantiaEstendida) {
        super(nome, precoBase);
        this.taxaGarantiaEstendida = taxaGarantiaEstendida;
    }

    public double getTaxaGarantiaEstendida() {
        return taxaGarantiaEstendida;
    }

    public void setTaxaGarantiaEstendida(double taxaGarantiaEstendida) {
        this.taxaGarantiaEstendida = taxaGarantiaEstendida;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.10 + taxaGarantiaEstendida;
    }
}