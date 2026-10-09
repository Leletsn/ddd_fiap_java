package aulo06;

public class Main {
    public static void main(String[] args) {

    //1. Instanciando e testando um filme
        Filme meuFilme = new Filme("Interestelar", "Ficção Centifica", 170, true);
        meuFilme.exibirDetalhes();
        meuFilme.darPlay(); //metodo Herdado

        System.out.println("\n================================================\n");

     //2. Instanciando e testando uma Série
        Serie minhaSerie = new Serie("O rei de porcelana", "Dorama", 60, 1);
        minhaSerie.exibirDetalhes();
        minhaSerie.darPlay(); //O MESMO metodo HERDADO e rodando na Serie


    }
}
