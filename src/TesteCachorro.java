public class TesteCachorro {

    public static void main(String args[]){

        Cachorro bob = new Cachorro();
        bob.tamanho = 70;
        Cachorro rex = new Cachorro();
        rex.tamanho = 8;
        Cachorro scooby = new Cachorro();
        scooby.tamanho = 35;

        bob.latir();
        rex.latir();
        scooby.latir();

    }
}
