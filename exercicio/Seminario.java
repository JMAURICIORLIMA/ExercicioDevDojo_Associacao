package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Seminario {
    private String endereco;
    private Aluno[] alunos;

    public Seminario(String endereco) {
        this.endereco = endereco;
    }

    public Seminario(String endereco, Aluno[] alunos) {
        this.endereco = endereco;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Endereço: " + this.endereco);
        if (alunos == null) {
            System.out.println("Ainda não existe aluno(os). ");
            return;
        }
        System.out.println("Aluno(os): ");

        if (alunos.length > 0) {
            for (Aluno aluno : alunos) {
                System.out.print(aluno.getNomeAluno() + ", ");
            }
            System.out.println();
        } else {
            return;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
