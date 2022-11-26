/*]
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author asmasthan
 */
public class NewClass {
    
   
    
    private NewClass() {
    }
    
    public static void main(String[] args) {

        String name = "Masthan";
        int rows = 5;
        String name2 = "Masthan";

        System.out.println("name =" + Integer.valueOf(name));

        List<String> namesList = new ArrayList<>();
        namesList = null;

        namesList.add("Ravi");
        namesList.add("Kumar");
        namesList.add("Raj");

        //---------------------------------
        double d = 1.1;
        BigDecimal bd1 = new BigDecimal(d);
        
        //--------------------------------------------------
        
        ArrayList<String> list = new ArrayList<String>();
  
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
  
        // Iterator to traverse the list
        Iterator iterator = list.iterator();
  
        System.out.println("List elements : ");
  
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
  
        System.out.println();
    }
}
