package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Professor {
    private String nomeProfessor;
    private String especialidade[];
    private Seminario[] seminario;

    public Professor(String nomeProfessor, String[] especialidade) {
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
    }

    public Professor(String nomeProfessor, String[] especialidade, Seminario[] seminario) {
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("Prof.(a): " + this.nomeProfessor);
        for (String especialildades : getEspecialidade()) {
            System.out.println("Espeialidade(es): " + especialildades);
        }
        if (this.seminario == null) return;
        System.out.println("### Seminário(os) cadastrado(os) ###");
        for (Seminario arrSeminario : this.seminario) {
            System.out.println("Títilo: " + arrSeminario.getTitulo());
            System.out.println("Endereço: " + arrSeminario.getLocal().getEndereco());
            if (arrSeminario.getAlunos() == null || arrSeminario.getAlunos().length == 0) continue;
            System.out.println("*** Aluno(os) ***");
            for (Aluno alunos : arrSeminario.getAlunos()) {
                System.out.println("Aluno(os): " + alunos.getNomeAluno() + " - idade: " + alunos.getIdadeAluno());
            }
        }
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String[] getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String[] especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
