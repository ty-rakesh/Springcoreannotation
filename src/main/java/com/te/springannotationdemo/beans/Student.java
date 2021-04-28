package com.te.springannotationdemo.beans;

import lombok.Data;

@Data
public class Student {
	
	private int id;
	
	private String name;

	private Branch branch;
}
