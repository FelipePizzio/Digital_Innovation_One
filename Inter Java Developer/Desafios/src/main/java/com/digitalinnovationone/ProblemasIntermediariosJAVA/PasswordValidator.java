/*
Desafio
    Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e pediram a sua ajuda. 
    Sua task é fazer o código que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:

    A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
    A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
    Além disso, a senha pode ter de 6 a 32 caracteres.

Entrada
    A entrada contém vários casos de teste e termina com final de arquivo. 
    Cada linha tem uma string S, correspondente a senha que é inserida pelo usuário no momento do cadastro.

Saída
    A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, 
    se um ou mais requisitos não forem atendidos.
 
Exemplo de Entrada 	                            Exemplo de Saída

Digital Innovation One                          Senha invalida.

AbcdEfgh99                                      Senha valida.

DigitalInnovationOne123                         Senha valida.

Digital Innovation One 123                      Senha invalida.

Aass9                                           Senha invalida.

Aassd9                                          Senha valida.
*/

package com.digitalinnovationone.ProblemasIntermediariosJAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PasswordValidator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String input = st.nextToken();

        while (input != null) {
            if (verify(input)) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
            input = br.readLine();
        }
    }

    private static boolean verify(String input) {
        String specialChars = " ~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        char currentCharacter;
        boolean numberPresent = false;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean specialCharacterNotPresent = true;

        if (input.length() < 6 || input.length() > 32) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                numberPresent = true;
            } else if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCasePresent = true;
            } else if (specialChars.contains(String.valueOf(currentCharacter))) {
                specialCharacterNotPresent = false;
            }
        }
        return numberPresent && upperCasePresent && lowerCasePresent && specialCharacterNotPresent;
    }
}
