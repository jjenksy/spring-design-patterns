package com.springdesignpatterns.springdesignpatterns.rule;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyRules {

	private List<VisitorRule> visitorRuleList;

	public ApplyRules(List<VisitorRule> visitorRuleList) {
		this.visitorRuleList = visitorRuleList;
	}


	public boolean runRules(){
		boolean rule = false;
		for (VisitorRule visitorRule: visitorRuleList) {
			rule = visitorRule.accept();
		}

		return rule;
	}
}
