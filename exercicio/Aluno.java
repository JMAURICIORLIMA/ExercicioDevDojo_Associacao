package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Aluno {
    private String nomeAluno;
    private int idadeAluno;
    private Seminario seminario;

    public Aluno(String nomeAluno, int idadeAluno) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
