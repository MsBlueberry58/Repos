import java.util.*;

public class TestandoListas {
    public static void main(String[] args) {
        List<String> ListaCursos = new ArrayList<>();
        String curso1 = "Java Threads pt 2";
        String curso2 = "Java Threads pt 1";
        String curso3 = "Java Collections";

        ListaCursos.add(curso1);
        ListaCursos.add(curso2);
        ListaCursos.add(curso3);

    /*    ListaCursos.remove(0);*/
        System.out.println(ListaCursos.get(1));

        System.out.println(ListaCursos);

        for (int i = 0; i < ListaCursos.size(); i++) {
            System.out.println("Aula : " + ListaCursos.get(i));

        }

        Collections.sort(ListaCursos);
        System.out.println(ListaCursos);
    }
}
