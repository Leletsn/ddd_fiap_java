package aulo06;

//SubClasse de Conteudo (Herança)

public class Serie extends Conteudo{

    //Atributo
    private int totalTemporadas;

    //Construtor
    public Serie(String titulo, String genero, int duracaoMinutos, int totalTemporadas) {
        super(titulo, genero, duracaoMinutos);
        this.totalTemporadas = totalTemporadas;
    }

    public int getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(int totalTemporadas) {
        if (totalTemporadas > 0) {
            this.totalTemporadas = totalTemporadas;
        }else {
            System.out.println("ERRO: Não foi possível definir a TEMPORADA!");
        }
    }

    //Exibir dados da Série
    public void exibirDetalhes(){
        System.out.println(" === EXIBIR DETALHES DA SÉRIE ===");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Duracao minutos: " + this.getDuracaoMinutos());
        System.out.println("Temporadas: " + this.totalTemporadas);
    }
}
