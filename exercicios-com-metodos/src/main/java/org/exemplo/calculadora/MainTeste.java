package org.exemplo.calculadora;

public class MainTeste {
    public static void main(String[] args) {

        System.out.println("Soma: " + somar(6, 2));
        System.out.println("Subtração: " + subtrair(6, 2));
        System.out.println("Multiplicação: " + multiplicar(6, 2));
        System.out.println("Divisão: " + dividir(6, 2));
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Não é possível dividir por 0");
        } else {
            return a / b;
        }
        return 0;
    }
}
