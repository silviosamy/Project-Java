package exemplo;

public class MainTeste {
    public static void main(String[] args) {
        //Exercício : Sistema de Gerenciamento de Alunos
        //Crie uma classe chamada Aluno com os seguites atributos:
        //nome(String) ; matricula(int); notas(array de 3 doubles);
        //Implementar 3 métodos :
        //calcularMedia() - retorna a média das 3 notas
        //verificarAprovacao() - retorna "Aprovado" se a média for maior ou igual 7, se não "Reprovado"
        //exibirInformacoes() - Exibe o nome, matrícula, média e status(aprovado ou reprovado).
        //Na classe main : Crie um Objeto Aluno, atribua nome, matrícula e notas.
        //Exiba as informações do Aluno com os métodos criados.


        Aluno aluno = new Aluno("Diego", 5153);
        double[] notas = {9.5, 6.3, 8.5};
        aluno.setListNotas(notas);

        System.out.println(exibirInformacoes(aluno));

    }

    public static double calcularMedia(double[] arrayNotas) {
        double soma = 0;
        for (double numero : arrayNotas) {
            soma += numero;
        }
        double media = soma / arrayNotas.length;
        return media;
    }

    public static String verificarAprovacao(Aluno aluno) {
        if (calcularMedia(aluno.getListNotas()) >= 7) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    public static String exibirInformacoes(Aluno aluno) {
        return "Nome: " + aluno.getNome() +
                "\nMatrícula: " + aluno.getMatricula() + "\nMédia: " +
                calcularMedia(aluno.getListNotas()) + "\nCondição: " +
                verificarAprovacao(aluno);
    }

}
