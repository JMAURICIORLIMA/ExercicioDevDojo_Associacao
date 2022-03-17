package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Seminario;

public class TesteSeminario {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 18);
        Aluno aluno2 = new Aluno("Daniel", 23);
        Aluno[] alunos = {aluno1, aluno2};

        Seminario seminario = new Seminario("Centro de converções", alunos);

        Professor professor1 = new Professor("Marcos", new String[]{"Java", "Spring"});

        System.out.println("------- Aluno (os) -------");
        aluno1.setSeminario(seminario);
        aluno1.imprime();
        System.out.println("------- Professor (es) -------");
        professor1.setSeminario(professor1.getSeminario());
        professor1.imprime();
        System.out.println("------- Seminario -------");
        seminario.getAlunos();
        seminario.imprime();



    }
}
