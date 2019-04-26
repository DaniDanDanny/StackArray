/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackarray;

/**
 *
 * @author Dan
 */
public abstract class StackArray {
    
    private static final int DEFAULT_CAPACITY = 0;
    private Object[] theArray;
    private int topOfStack;
    
    public StackArray(){
        theArray = new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }
    
    public abstract void push(Object o);
    public abstract Object pop();
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract Object top();
}
