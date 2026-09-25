package aula05;

public class TesteControleRemoto {
    public static void main(String[] args){

        // Criar objeto de Controle Remoto (construtor vazio)
        ControleRemoto controle = new ControleRemoto();

        System.out.println(" *** Controle Remoto ***");
        System.out.println("Ligado: " + controle.isLigado());
        System.out.println("Volume: " + controle.getVolume());
        System.out.println("Canal atual: " + controle.getCanal());

        System.out.println("--- Teste 1 ---");
        controle.setVolume(300);
        System.out.println("Volume: " + controle.getVolume());

        System.out.println("--- Teste 2 ---");
        controle.ligarDesligar();
        System.out.print("Ligado: " + controle.isLigado());

        System.out.println("--- Teste 3 ---");
        controle.aumentarVolume();
        controle.aumentarVolume();
        System.out.println("Volume: " + controle.getVolume());
        controle.setVolume(-3);

        System.out.println("--- Teste 4 ---");
        controle.diminuirVolume();
        controle.diminuirVolume();
        controle.diminuirVolume();
        System.out.println("Volume: " + controle.getVolume());
        controle.setVolume(200);
        System.out.println("Volume: " + controle.getVolume());

        System.out.println("--- Teste 5 - Canais ---");
        controle.mudarCanal(50);
        System.out.println("Canal atual: " + controle.getCanal());
        controle.subirCanal();
        System.out.println("Canal atual: " + controle.getCanal());
        controle.subirCanal();
        System.out.println("Canal atual: " + controle.getCanal());
        controle.descerCanal();
        System.out.println("Canal atual: " + controle.getCanal());
    }
}