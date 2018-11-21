/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.EmptyStackException;

/**
 *
 * @author Jonas
 */
public interface Stack {
    
    public int size();
    
    public boolean isEmpty();
    
    public Object top() throws EmptyStackException;
    
    public void push(Object Pessoa);
    
    public Object pop() throws EmptyStackException;
    
    
    
    
}
