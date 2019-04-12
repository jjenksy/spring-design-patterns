package com.springdesignpatterns.springdesignpatterns.rule;

public class Rule1 implements VisitorRule {
	@Override
	public boolean accept() {
		System.out.println("Rule 1");
		return true;
	}
}
