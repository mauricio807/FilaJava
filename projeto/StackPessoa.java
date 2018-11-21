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
public class StackPessoa implements Stack {

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object top() throws EmptyStackException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void push(Object Pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object pop() throws EmptyStackException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static final int MAXSIZE=100;
    private final Object Pessoa[];
    private final int top;
    private final int cap;

    public StackPessoa(Object[] Pessoa, int top, int cap) {
        this.Pessoa = Pessoa;
        this.top = top;
        this.cap = cap;
    }

    
    
    
    
    
    
    
    
}
