package com.springdesignpatterns.springdesignpatterns.rule;

public class Rule2 implements VisitorRule {

	@Override
	public boolean accept() {
		System.out.println("Rule 2");
		return true;
	}
}
