import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteListaDeAula {

    public static void main(String[] args) {

        List<Aula> lista = new ArrayList<>();
        Aula aula1 = new Aula("Threads Java 1", 10);
        Aula aula2 = new Aula("Threads Java 2", 20);
        Aula aula3 = new Aula("Java Collections", 15);

        lista.add(aula1);
        lista.add(aula2);
        lista.add(aula3);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(lista);






    }
}
