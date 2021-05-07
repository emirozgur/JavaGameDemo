package javaGameDemo.concretes;

import javaGameDemo.abstracts.BaseService;

public class BaseManager<T> implements BaseService<T> {

	@Override
	public void add(T entity) {
		System.out.println("Eklendi.");
		
	}

	@Override
	public void update(T entity) {
		System.out.println("G�ncellendi.");
		
	}

	@Override
	public void delete(T entity) {
		System.out.println("Silindi.");
		
	}


}
