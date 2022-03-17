package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Professor {
    private String nomeProfessor;
    private String Especialidade[];
    private Seminario[] seminario;

    public Professor(String nomeProfessor, String[] especialidade) {
        this.nomeProfessor = nomeProfessor;
        Especialidade = especialidade;
    }

    public Professor(String nomeProfessor, String[] especialidade, Seminario[] seminario) {
        this.nomeProfessor = nomeProfessor;
        Especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("Prof. (a)" + this.nomeProfessor);
        if (Especialidade.length > 0){
            for (int i = 0; i < Especialidade.length; i++){
                System.out.println("Especialidade (es): " + Especialidade[i]);
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
        return Especialidade;
    }

    public void setEspecialidade(String[] especialidade) {
        Especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
