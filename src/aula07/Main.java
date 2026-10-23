package aula07;

public class Main {

    //Metodo que aceita QUALQUER Notificação - O coração do Polimorfismo
    public static void dispararAlerta(Notificacao notificacao) {
        System.out.println("\n [SISTEMA DE ALERTA]");
        notificacao.enviar(); //O Java decide em tempo de execução qual metodo enviar() será chamado.
    }


    public static void main(String[] args) {

        //Declaração de tipo genérico (Generics) apontando para instâncias especificas
        Notificacao n1 = new Email("aluno@fiap.com.br", "CP realizado co sucesso!", "Aviso importante");
        Notificacao n2 = new SMS("1199999-8888", "Aula de HOJE - Não se atrase!");

        //Chamada Direta
        n1.enviar();
        n2.enviar();

        //Usando o metodo POLIMORFICO sem condicionais simples
        dispararAlerta(n1);
        dispararAlerta(n2);

        //Usando o metodo POLIMORFICO com condicionais simples
        //1 - E-mail
        //2 - ESMS
        int tipoCanal = 1;
        Notificacao notificacaoEscolhida = null;

        if(tipoCanal == 1) {
            notificacaoEscolhida = new Email("aluno2@fiap.com.br", "Alô, TURMA!", "Aula de Java");
        }else if(tipoCanal == 2) {
            notificacaoEscolhida = new SMS("1197777-1111", "Aula de HOJE- Estamos quase terminando...");
        }

        //Não importa o tipo do dado Concreto, o metodo trata TODOS como Notificação
        dispararAlerta(notificacaoEscolhida);
    }
}
