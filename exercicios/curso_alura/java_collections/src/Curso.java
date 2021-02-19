import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    List<Aula> ColecaoCursos = new LinkedList<>();
    String nome;
    String instrutor;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getColecaoCursos() {
        return ColecaoCursos;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }
}
