package org.tyaa.springcontextdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tyaa.springcontextdemo.entity.Building;
import org.tyaa.springcontextdemo.entity.Unit;
import org.tyaa.springcontextdemo.entity.Weapon;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext("org.tyaa.springcontextdemo.entity");

			Unit unit = context.getBean(Unit.class);
			Building building = (Building) context.getBean("building");
			Weapon weapon = context.getBean("weapon-sword", Weapon.class);

			System.out.println(unit.getName());
			System.out.println(building.getName());
			System.out.println(weapon.getName());
	}
}
