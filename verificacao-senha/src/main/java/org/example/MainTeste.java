package org.example;

public class MainTeste {
    //Escreva um metodo Java para verificar se uma string é uma senha segura.
    //Resultado esperado:
    //1. Uma senha deve conter pelo menos 8 caracteres.
    //2. Uma senha consiste apenas de letras e dígitos.
    //3. Uma senha deve conter pelo menos dois dígitos.
    //4. A senha válida é : abdc1234
    public static void main(String[] args) {

        String senha = "abcd1234";

        if (verificaSenha(senha)) {
            System.out.println("É segura");
        } else {
            System.out.println("Não é segura");

        }
    }

    public static boolean verificaSenha(String senha) {
        if (senha.length() >= 8) {
            if (senha.matches("^(.*\\d.*\\d.*)$")) {
                if (senha.matches("^[a-zA-Z0-9]+$")) {
                    return true;
                }
            }
        }
        return false;
    }
}


