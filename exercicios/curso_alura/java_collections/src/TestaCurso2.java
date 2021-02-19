import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso ColecoesJava = new Curso("Java Collections", "Joaozinho");
        List<Aula> aulasCurso = ColecoesJava.getColecaoCursos();
        System.out.println(aulasCurso);


        Aula aula1 = new Aula("Orientação a objetos", 60);
        Aula aula2 = new Aula("Threads pt. 1", 10);
        Aula aula3 = new Aula("Collections", 35);

        ColecoesJava.adicionar(aula1);
        ColecoesJava.adicionar(aula2);
        ColecoesJava.adicionar(aula3);

        List<Aula> aulasImutaveis = ColecoesJava.getColecaoCursos();

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        System.out.println("Tempo total dos cursos = " + ColecoesJava.getTempoTotal());

        System.out.println(ColecoesJava);

    }


}
