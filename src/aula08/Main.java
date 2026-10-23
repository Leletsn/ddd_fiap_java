package aula08;

public class Main {

    public static void main(String[] args) {

        //1. Tentar instanciar a classe abstrata
        //Voluntario v = new Voluntario("Ana", ana@gmail.com);

        //2.Criando instâncias das classes concretas
        DentistaVoluntario dentista = new DentistaVoluntario("Maria", "maria@gmail.com", "SP-123456", 4);
        EducadorVoluntario educador = new EducadorVoluntario("João", "joao@gmail.com", 2);

        //3. Executando os métodos de FORMA DIRETA
//        System.out.println("--- VOLUNTARIO 1 ---");
//        System.out.println(dentista.getInfo());
//        dentista.realizarAcao();
//        System.out.println("Horas: " + dentista.calcularHorasDedicadas() + "h\n");

//        System.out.println("--- VOLUNTARIO 2 ---");
//        System.out.println(educador.getInfo());
//        educador.realizarAcao();
//        System.out.println("Horas: " + educador.calcularHorasDedicadas() + "h\n");

        //o mesmo metodo imprimirRelatorio aceita qualquer filho de Voluntario
        imprimirRelatorio(dentista);
        imprimirRelatorio(educador);
    }

    //Metodo polimorfico: recebe a classe ABSTRATA como parâmetro
    public static void imprimirRelatorio(Voluntario v) {
        System.out.println("--- RELATÓRIO ---");
        System.out.println(v.getInfo());
        v.realizarAcao(); //Executa o comportamennto específico da sub classe
        System.out.println("Horas: " + v.calcularHorasDedicadas() + "h\n");
        System.out.println("------------------------------------\n");
    }
}

