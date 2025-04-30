package exemplo;

public class Aluno {

    private String nome;
    private int matricula;
    double[] listNotas;

    @Override
    public String toString() {
        return nome;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getListNotas() {
        return listNotas;
    }

    public void setListNotas(double[] listNotas) {
        this.listNotas = listNotas;
    }
}
