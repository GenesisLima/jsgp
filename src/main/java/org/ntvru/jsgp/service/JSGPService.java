package org.ntvru.jsgp.service;

import java.util.List;

public interface JSGPService<T> {

	 void save(T t);
	void delete(Long id);
	List<T> list();
	T getById(Long id);
	}
