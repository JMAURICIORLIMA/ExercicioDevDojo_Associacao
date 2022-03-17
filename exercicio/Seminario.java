package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Títilo do seminário: " + this.titulo);
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
