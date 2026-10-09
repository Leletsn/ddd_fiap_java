package aula4;

public class TestePersonagem {

    public static void main(String[] args){

        //1. Usando o construtor PADRÃO (default)
        aula4.Personagem p1 = new aula4.Personagem();
        aula4.Personagem p2 = new aula4.Personagem();

//        System.out.println("Dados do objeto p1: ");
//        System.out.println("Nome: " + p1.getNome());
//        System.out.println("Nível: " + p1.getNivel());
//        System.out.println("Vida: " + p1.getVida());

        p1.exibirInfo();

        System.out.println("\n------------------------");

//        System.out.println("Dados do objeto p2: ");
//        System.out.println("Nome: " + p2.getNome());
//        System.out.println("Nível: " + p2.getNivel());
//        System.out.println("Vida: " + p2.getVida());

        p2.exibirInfo();

        System.out.println("\n------------------------");

        //2. Usando o construtor parametrizado
        aula4.Personagem p3 = new aula4.Personagem("Aragorn", 10);
        aula4.Personagem p4 = new aula4.Personagem("Legolas", 10);

//        System.out.println("Dados objeto p3: ");
//        System.out.println("Nome: " + p3.getNome());
//        System.out.println("Nível: " + p3.getNivel());
//        System.out.println("Vida: " + p3.getVida());

        p3.exibirInfo();

        System.out.println("\n------------------------");

//        System.out.println("Dados objeto p4: ");
//        System.out.println("Nome: " + p4.getNome());
//        System.out.println("Nível: " + p4.getNivel());
//        System.out.println("Vida: " + p4.getVida());

        p4.exibirInfo();

    }


}
