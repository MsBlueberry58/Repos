import java.util.Objects;

public class Aluno {
    String nome;
    int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        if (nome == null){
            throw new NullPointerException("Nome não pode ser vazio");
        }
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome='" + nome + '\'' + ", matricula =" + numeroMatricula + '}';
    }

   /* @Override
    public boolean equals(Object o) {
        Aluno aluno = (Aluno) o;
        return this.nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }*/

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Aluno))
            return false;
        Aluno aluno = (Aluno) o;
        return numeroMatricula == aluno.numeroMatricula && Objects.equals(nome, aluno.nome);
    }

    @Override public int hashCode() {
        return Objects.hash(nome, numeroMatricula);
    }

    public Aluno buscaMatriculado(int numeroMatricula){
        return this.buscaMatriculado(numeroMatricula);
    }
}

