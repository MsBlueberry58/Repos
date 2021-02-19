import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso ColecoesJava = new Curso("Java Collections", "Joaozinho");
        List<Aula> aulasCurso = ColecoesJava.getColecaoCursos();
        System.out.println(aulasCurso);


    }
}
