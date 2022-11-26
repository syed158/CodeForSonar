/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Iterator;

/**
 *
 * @author asmasthan
 */
public class FibonacciIterator implements Iterator<Integer>{

@Override
public boolean hasNext() {
  if(next() != null) {
    return true;
  }
  return false;
}

    @Override
    public Integer next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
