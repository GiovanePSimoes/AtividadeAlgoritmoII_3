/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author giovane.psimoes
 */
public class Pilha {

    private Object[] dados;
    private int top;

    public Pilha(int size) {
        dados = new Object[size];
        top = -1;
    }

    public boolean isFull() {
        return (top == dados.length - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(Object x) {
        if (!isFull()) {
            top++;
            dados[top] = x;
        } else {
            System.out.println("Pilha Cheia!");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            Object x = dados[top];
            top--;
            return x;
        }else{
            System.out.println("Pilha Vazia!");
            return null;
        }
    }
    
    public Object top(){
        if (!isEmpty()){
            return dados[top];
        }else{
            System.out.println("Pilha Vazia!");
            return null;
        }
    }
}
