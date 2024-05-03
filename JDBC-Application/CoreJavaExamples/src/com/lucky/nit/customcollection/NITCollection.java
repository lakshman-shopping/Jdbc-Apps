package com.lucky.nit.customcollection;

import java.util.Arrays;

public class NITCollection {
      private Object[] elementData;
      private int elementCount;
      
      public NITCollection() {
    	  elementData = new Object[10];
    	  elementCount = 0;
      }
      public void add(Object obj) {
    	  if(size()== capacity()) {
    		  grow();
    	  }
    	 elementData[elementCount] = obj;
    	 elementCount++;
      }
      private void grow() {
		
    	  Object[] tempobj = new Object[capacity() * 2];
    	  
    	  for(int i=0; i<elementData.length; i++) {
    		  tempobj[i] = elementData[i];
    	  }
    	  elementData = tempobj;
	}
	public int capacity() {
    	  return elementData.length;
      }
      public int size() {
    	  
    	  return elementCount;
      }
      
      @Override
      public String toString() {
    	  if(elementCount==0){
    		return "[]";  
    	  }
    	 StringBuilder br = new StringBuilder();
    	 br.append("[");
    	  for(int i=0; i<elementCount; i++) {
    		  Object obj = elementData[i];
    		  br.append(obj);
    		 br.append(", ");
    	  }
    	  int start = br.lastIndexOf(", ");
    	  br.delete(start, start+2);
    	  br.append("]");
    	  return br.toString();
      }
}
