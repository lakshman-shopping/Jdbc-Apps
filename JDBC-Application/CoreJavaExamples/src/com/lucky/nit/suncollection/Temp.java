package com.lucky.nit.suncollection;

import java.util.Objects;

public class Temp {
	 int i;
      public Temp(int i) {
		
		this.i = i;
	}
	@Override
	public int hashCode() {
		return Objects.hash(i);
	}
	@Override
	public String toString() {
		
		return i + " ";
	}
	
}
