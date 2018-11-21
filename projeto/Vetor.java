/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonas
 */
public class Vetor {
    
    
    private final Pessoa[] cad;
    private int tamanho; 
    
    public Vetor(int cad){
        this.cad = new Pessoa[cad];
        this.tamanho = 0;
    }
    
    public void add(Pessoa p){ 
        for(int i=0; i<this.cad.length; i++){
            if (this.cad[i] == null){
                
                String nome = JOptionPane.showInputDialog("informe seu nome");
                int id = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade"));
              this.cad[i] = new Pessoa(nome, id);
              this.tamanho++;
             
    } 
    }
    }
    
    /*public void add(Pessoa p) throws Exception{
        if (this.tamanho < this.cad.length) {
        this.cad [this.tamanho] = p;
        this.tamanho++;   
        }else{
            throw new Exception("Vetor já esta cheio");
        }    
  }*/
    /*public void add(Pessoa p){
            for(int i=0; i<this.cad.length; i++)
                if (this.tamanho < this.cad.length) {
                String nome = JOptionPane.showInputDialog("informe seu nome", null);
                int id = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade", null));
                this.cad [i] = new Pessoa(nome,id);
                this.tamanho++;  
                System.out.println(this.tamanho);
                System.out.println("adicionado com sucesso");
                
                }else
                    System.out.println("vetor cheio");
            }*/
    
    
    public int tamanho(){
        return this.tamanho;
    }
    
    
    public Pessoa busca(int index){
        if (index <= 0 && index > tamanho) {
            throw new IllegalArgumentException("posição invalida");
        }else{
            return this.cad[index];    
        }
        
        
    } 
    
    @Override
    public String toString() {
        return Arrays.toString(cad);
    }
     
    
    
}