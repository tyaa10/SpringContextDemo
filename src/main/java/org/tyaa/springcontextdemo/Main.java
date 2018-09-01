package org.tyaa.springcontextdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tyaa.springcontextdemo.configs.AppConfig;
import org.tyaa.springcontextdemo.entity.Building;
import org.tyaa.springcontextdemo.entity.Unit;
import org.tyaa.springcontextdemo.entity.Weapon;

public class Main {

	public static void main(String[] args) {
		
		/* Annotations approach */
		
		/*ApplicationContext context =
				new AnnotationConfigApplicationContext("org.tyaa.springcontextdemo.entity");
		
		Unit unit = context.getBean(Unit.class);
		Building building = (Building) context.getBean("building");
		Weapon weapon = context.getBean("weapon-sword", Weapon.class);

		System.out.println(unit.getName());
		System.out.println(building.getName());
		System.out.println(weapon.getName());*/
		
		
		/* Java config approach */
		
		//Class name
		//or several class names separated by comma
		//or package name
		//or several package names separated by comma
		//or parent package name
		ApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Weapon weapon = context.getBean("weapon-sword", Weapon.class);
		Unit unit = context.getBean("warrior", Unit.class);
		
		System.out.println(unit.getName());
		System.out.println(weapon.getName());
	}
}