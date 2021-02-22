import java.util.Set;

public class TesteCursoComAluno {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Java parte 1", "John Adams");

        Aluno aluno1 = new Aluno("sjs", 743743);

        cursoJava.adicionar(new Aula("Aula1", 47));
        cursoJava.adicionar(new Aula("Aula2", 13));
        cursoJava.adicionar(new Aula("Aula1", 22));

        cursoJava.matricula(new Aluno("Bruna", 18293));
        cursoJava.matricula(new Aluno("Jose", 45672));
        cursoJava.matricula(new Aluno("Camila", 85743));

        System.out.println(cursoJava);
        Set<Aluno> alunos = cursoJava.getAlunos();

        alunos.add(aluno1);
    }
}
