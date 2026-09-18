package aula4;

public class Personagem {

    //atributos
    private String nome;
    private int nivel;
    private int vida;

    //construtores

    //Construtor padrão (default)
    public Personagem(){
        this.nome = "Novato";
        this.nivel = 1;
        this.vida = 100;
    }

    //Construtor parametrizado
    public Personagem(String nome, int nivel){
        this.nome = nome;
        this.nivel = nivel;
        this.vida = nivel * 50;
    }



    //getters and setters
    /*
    Gerar getters and setters de forma automática
    - Apertar M2
    - Generate -> getters and setters
    - Selecione todos e clique em generate
    */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    //outros métodos
    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
    }
}
