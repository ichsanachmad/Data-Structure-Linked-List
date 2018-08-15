/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukdat.kelas.pkg1;

/**
 *
 * @author sanstation
 */
public class Node<T> {
    Node next;
    private T obj;
    
    Node(T obj){
        this.obj = obj;
    }
    
    
    public T getData(){
        return obj;
    }
    
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next=next;
    }
    
}
