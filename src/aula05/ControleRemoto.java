package aula05;

public class ControleRemoto {

    // 1. Atributos
    private boolean ligado;
    private int volume;
    private int canal;

    // 2. Construtores
    public ControleRemoto() {
        this.ligado = false;
        this.volume = 10;
        this.canal = 1;
    }

    public ControleRemoto(boolean ligado, int volume) {
        this.ligado = ligado;
        this.volume = volume;
        this.canal = 1;
    }

    // 3. Getters e Setters
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    // Getter do Canal
    public int getCanal() {
        return canal;
    }

    public void setVolume(int volume) {
        // validação simples com condicionais
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume alterado: " + volume);
        }else{
            System.out.println("Volume inválido");
        }
    }

    // 4. Métodos Operacionais

    // Metodo Ligar e Desligar a TV
    public void ligarDesligar() {
        this.ligado = !this.ligado;

        if (this.ligado) {
            System.out.println("TV LIGADA!");
        }else{
            System.out.println("TV DESLIGADA!");
        }
    }

    // Aumentar Volume (+1)
    public void aumentarVolume() {

        if (!this.ligado) {
            System.out.println("Erro: TV DESLIGADA!");

        }else if (this.volume >= 100) {
            System.out.println("Aviso: Volume Máximo (100)");

        }else{
            this.volume++;
            System.out.println("Volume: " + this.volume);
        }
    }

    // Diminuir Volume (-1)
    public void diminuirVolume() {

        if (!this.ligado) {
            System.out.print("Erro: TV DESLIGADA!");

        }else if (this.volume <= 0) {
            System.out.print("Aviso: A TV está no Mínimo (0)");

        }else{
            this.volume--;
            System.out.println("Volume diminuído para: " + this.volume);
        }
    }

    // 5. Controle de canais

    // Mudança direta de canal
    public void mudarCanal(int novoCanal) {

        if (!this.ligado) {
            System.out.println("Erro: TV DESLIGADA!");

        }else if (novoCanal > 0 && novoCanal <= 500) {
            this.canal = novoCanal;
            System.out.println("Canal alterado para: " + this.canal);

        }else{
            System.out.println("Canal inválido");
        }
    }

    // Subir canal (+1)
    public void subirCanal() {

        if (!this.ligado) {
            System.out.println("Erro: TV DESLIGADA!");

        }else if (this.canal == 500) {
            this.canal = 1;
            System.out.println("Canal: " + this.canal);

        }else{
            this.canal++;
            System.out.println("Canal: " + this.canal);
        }
    }

    // Descer canal (-1)
    public void descerCanal() {

        if (!this.ligado) {
            System.out.println("Erro: TV DESLIGADA!");

        }else if (this.canal == 1) {
            this.canal = 500;
            System.out.println("Canal: " + this.canal);

        }else{
            this.canal--;
            System.out.println("Canal: " + this.canal);
        }
    }
}