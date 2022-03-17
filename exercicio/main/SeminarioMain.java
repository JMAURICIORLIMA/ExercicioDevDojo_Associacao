package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.main;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Seminario;

public class SeminarioMain {
    public static void main(String[] args) {

        Local local = new Local("Av. Brasil");

        Aluno aluno1 = new Aluno("João", 18);
        Aluno aluno2 = new Aluno("Daniel", 23);

        Aluno[] alunos = {aluno1, aluno2};

        Professor professor1 = new Professor("Marcos", new String[]{"Java", "Spring"});

        Seminario seminario = new Seminario("Aulão programação", alunos, local);
        Seminario[] seminariosEmAberto = {seminario};

        professor1.setSeminario(seminariosEmAberto);

        professor1.imprime();

    }
}
