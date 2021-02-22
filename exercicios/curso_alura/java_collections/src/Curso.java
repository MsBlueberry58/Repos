import java.util.*;

public class Curso {

    List<Aula> ColecaoCursos = new LinkedList<>();
    String nome;
    String instrutor;
    private Set<Aluno> alunos = new HashSet<>();
    Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();


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

    public boolean estaMatriculado(Aluno outro){
        return this.alunos.contains(outro);
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
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
