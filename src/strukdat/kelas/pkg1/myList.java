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
public class myList<T> {
    public Node head;
    private T obj;
    
    public void add(T obj){
        Node current= head;
        if(head==null){
            head= new Node(obj);
        }else{
            while(current.getNext()!=null){
                current=current.getNext();
            }
            current.setNext(new Node(obj));
        }
    }
    
    public void removeHead(){
        head=head.getNext();
    }
    
    public void removeTail(){
        Node current=head;
        Node prev=null;
        
        if(head==null){
            System.out.println("");
        }else{
            while(current.getNext()!=null){
                prev=current;
                current=current.getNext();
            }
            if(prev==null){
                head=null;
            }else{
                prev.setNext(null);
                current=null;
            }
        }
        
    }
    
    public void removeObject(T data){
        Node current = head;
        Node prev = null;
        
        if(current!=null && current.getData()==data){
            head = current.getNext();
            return;
        }
        while(current!=null && current.getData()!=data){
            prev= current;
            current=current.getNext();
        }
        if(prev==null)return;
        prev.next=current.getNext();
    }
    
    public void print(){
        Node current=head;
        while(current!=null){
            System.out.println(current.getData());
            current= current.getNext();
        }
    }
    public void printReverse(Node head){
        if(head==null)return;
        printReverse(head.next);
        System.out.println(head.getData());
    }
}
