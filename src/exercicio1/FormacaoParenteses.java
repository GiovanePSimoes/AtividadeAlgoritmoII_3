package exercicio1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author giovane.psimoes
 */
public class FormacaoParenteses {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String expressao = teclado.next();
        Pilha pilha = new Pilha(expressao.length());

        for (int i = 0; i < expressao.length(); i++) {
            if(expressao.charAt(i)=='('){
                pilha.push(expressao.charAt(i));
            }else if(expressao.charAt(i)==')'){
                pilha.pop();
            }
        }
        if(pilha.isEmpty()){
            System.out.println("Mal Formada!");
        }
    }

}
