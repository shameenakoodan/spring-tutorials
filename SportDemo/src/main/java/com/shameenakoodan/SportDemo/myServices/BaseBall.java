package com.shameenakoodan.SportDemo.myServices;

import org.springframework.stereotype.Component;

@Component
public class BaseBall implements SportWin{

	@Override
	public boolean getWin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getSportName() {
		// TODO Auto-generated method stub
		return "BaseBall";
	}

	@Override
	public String getSportType() {
		// TODO Auto-generated method stub
		return "Indoor";
	}

}
