package com.topic3;

public class GenericClass<T> {
	
	private T t;
	
	public void add(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

}
