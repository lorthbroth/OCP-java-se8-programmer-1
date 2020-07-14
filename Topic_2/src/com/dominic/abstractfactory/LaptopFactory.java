package com.dominic.abstractfactory;

import com.dominic.bean.Computer;
import com.dominic.bean.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {

	
	public Computer creatComputer() {
		
		return new Laptop();
	}

}
