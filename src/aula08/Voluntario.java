package aula08;

//Não pode ser instanciada diretamante: new Voluntario()
public abstract class Voluntario {

    private String nome;
    private String email;

    public Voluntario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Método Concreto: compartilhado por todas as subclasses
    public String getInfo(){
        return "Nome: " + this.nome + " | Email: " + this.email;
    }

    // MÉTODOS ABSTRATOS: Não tem corpo {} (implementação - não tem codigo)
    //Obrigaram qualquer classe filha concreta a implementar a lógica específica do método
    public abstract void realizarAcao();
    public abstract  double calcularHorasDedicadas();


}
