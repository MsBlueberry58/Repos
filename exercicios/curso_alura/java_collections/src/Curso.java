import java.util.ArrayList;
import java.util.Collections;
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
        return Collections.unmodifiableList(ColecaoCursos);

    }

    public void adicionar(Aula aula){
        ColecaoCursos.add(aula);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public int getTempoTotal(){
        ColecaoCursos = this.ColecaoCursos;
        int total = 0;

        for (Aula aula:ColecaoCursos) {
            total += aula.getTempo();
        }
        return total;


    }

    @Override public String toString() {
        return "Curso: " +
                this.getNome() +
                ", tempo total: " +
                this.getTempoTotal() +
                " minutos" +
                ", aulas: " +
                this.getColecaoCursos()
               ;
    }
}
