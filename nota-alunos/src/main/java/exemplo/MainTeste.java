package exemplo;

public class MainTeste {
    public static void main(String[] args) {


        Aluno aluno = new Aluno("Diego", 5153);
        double[] notas = {9.5, 6.3, 8.5};

        System.out.println("A nota é: " + calcularMedia(aluno, notas));
        System.out.println(verificarAprovado(aluno));

    }

    public static double calcularMedia(Aluno aluno, double[] arrayNotas) {
        double soma = 0;
        aluno.setListNotas(arrayNotas);
        for (double numero : arrayNotas) {
            soma += numero;
        }
        double media = soma / arrayNotas.length;
        return media;
    }

    public static String verificarAprovado(Aluno aluno) {
        if (calcularMedia(aluno, aluno.getListNotas()) >= 7) {
            return "Aprovado";
        }
        return "Reprovado";
    }
}
