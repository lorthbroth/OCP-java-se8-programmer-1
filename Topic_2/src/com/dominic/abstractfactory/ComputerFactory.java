package com.dominic.abstractfactory;

import com.dominic.bean.Computer;

public class ComputerFactory {
	
	public static Computer createComputer(ComputerAbstractFactory caf) {
		return caf.creatComputer();
	}

}
