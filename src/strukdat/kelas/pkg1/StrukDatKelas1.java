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
public class StrukDatKelas1 {

    
    public static void main(String[] args) {
       myList<Integer> list = new myList();
       
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
      
       list.removeObject(4);
       list.print();
        System.out.println("=======");
       list.printReverse(list.head);
    }
    
}
