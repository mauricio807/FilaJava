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
public class ClassTest {
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        
        Vetor cad = new Vetor(2);
        
        
        cad.add(p);    
        
        /*metodos para imprimir*/
        System.out.println(cad.tamanho()); 
        System.out.println(cad.toString());
        
        
        
       
        
        
    }
    
}
