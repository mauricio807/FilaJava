/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author Jonas
 */
public class Pessoa {
    
    String nome;
    int idade;
    int pri;

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }
    
    public Pessoa(){}
    public Pessoa(String nome, int id){
        nome = this.nome;
        id = this.idade;
    }
    
    public void setnome(String nome){
        nome = this.nome;
    }
    
    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
    }
    
    
}
