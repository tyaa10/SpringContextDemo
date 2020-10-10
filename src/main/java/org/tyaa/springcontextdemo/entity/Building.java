package org.tyaa.springcontextdemo.entity;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/* Annotations approach */
@Component
public abstract class Building {

	public String name;
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Lookup
	public abstract Unit produceUnit();
}
