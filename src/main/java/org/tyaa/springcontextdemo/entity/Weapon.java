package org.tyaa.springcontextdemo.entity;

import org.springframework.stereotype.Component;

@Component("weapon-sword")
public class Weapon {

	public String name;
	public Integer power;
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
