package com.te.springannotationdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springannotationdemo.beans.Branch;

@Configuration
public class BranchConfig {

	@Bean
	public Branch getBranch(){
		Branch branch=new Branch();
		branch.setBid(100);
		branch.setBname("cs");
		return branch;
	}
		@Bean
	public Branch getBranchec(){
		Branch branch=new Branch();
		branch.setBid(101);
		branch.setBname("ec");
		return branch;
	}
	
	@Bean
	public Branch getBranchme(){
		Branch branch=new Branch();
		branch.setBid(102);
		branch.setBname("me");
		return branch;
	}
}
