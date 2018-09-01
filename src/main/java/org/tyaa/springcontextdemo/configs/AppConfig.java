package org.tyaa.springcontextdemo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tyaa.springcontextdemo.entity.Unit;
import org.tyaa.springcontextdemo.entity.Weapon;

@Configuration
public class AppConfig {

	@Bean
	public Unit getUnit() {
		return new Unit();
	}
	
	@Bean("weapon-sword")
	public Object getSword() {
		Weapon weapon = new Weapon();
		weapon.name = "sword";
		return weapon;
	}
	
	@Bean("warrior")
	public Object getWarrior(Weapon _weapon) {
		Unit unit = new Unit();
		unit.name = _weapon.getName() + "sman";
		return unit;
	}
}
