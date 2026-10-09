package aulo06;

public class Filme extends Conteudo{
    //Atributo
    private boolean indicacaoOscar;

    //Construtor
    public Filme(String titulo, String genero, int duracaoMinutos, boolean indicacaoOscar) {
        super(titulo, genero, duracaoMinutos);
        this.indicacaoOscar = indicacaoOscar;
    }

    //get() e set()
    public boolean isIndicacaoOscar() {
        return indicacaoOscar;
    }

    public void setIndicacaoOscar(boolean temOscar) {
        this.indicacaoOscar =  indicacaoOscar;
    }

    //Exibir os dados do Filme
    public void exibirDetalhes(){
        System.out.println(" === EXIBIR DETALHES DO FILME ===");

        //Atenção: usamos o metodo getTitulo() porque os atributos titulo e genero são privados
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Duracao minutos: " + this.getDuracaoMinutos());

        if (this.indicacaoOscar) {
            System.out.println("Filme INDICADO para o OSCAR!");
        }else {
            System.out.println("Filme NÃO foi INDICADO para o OSCAR!");
        }
    }


}
