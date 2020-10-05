import implementacoes.profissoes.Guerreiro;
import implementacoes.races.Horc;

public class Application {
    public static void main(String[] args) {
        System.out.println("\tBEM VINDO AO MUNDO RPG");
        System.out.println("*---------------------------*");
        System.out.println("VEJA SUAS INFORMAÇOES ABAIXO");
        System.out.println("*---------------------------*");
        System.out.println();

        Context raceContext = new Context(new Horc(new Guerreiro()));
        raceContext.getRaceInformation();
        System.out.println("*---------------------------*");
    }
}
