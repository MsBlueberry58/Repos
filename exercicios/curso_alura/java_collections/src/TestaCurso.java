import java.util.List;

public class TestaCurso {
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


        System.out.println(aulasCurso);

    }
}
