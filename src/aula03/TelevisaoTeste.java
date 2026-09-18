package aula3;

public class TelevisaoTeste {

    public static void main(String[] args) {
        System.out.println("---- Minha Televisão ----");

        // Instanciando Objeto - Tipo = Televisão.
        Televisao tv = new Televisao();

        System.out.println("\nObjeto: " + tv);

        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Ligado: " + tv.getLigado());

        // Alterando os dados do objeto tv de forma direta

        tv.setCanal(-5);
        tv.setVolume(1000);
        tv.setLigado(false);
        tv.setMarca("LG");

        System.out.println("\n-------------------------------------");

//         System.out.println("Canal: " + tv.canal);
//        System.out.println("Volume: " + tv.volume);
//        System.out.println("Ligado: " + tv.ligado);

        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Ligado: " + tv.getLigado());
        System.out.println("Marca: " + tv.getMarca());

        System.out.println("Ligando a tv");
        tv.ligar();

        tv.setCanal(100);

    }
}