package com.dominic.abstractfactory;

import com.dominic.bean.Computer;
import com.dominic.bean.PC;

public class PCFactory implements ComputerAbstractFactory {

	@Override
	public Computer creatComputer() {
		return new PC(this.RAM, this.HDD, this.CPU);
	}
	
	private String RAM;
	private String HDD;
	private String CPU;
	
	public PCFactory(String ram, String hdd, String cpu) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}

}
