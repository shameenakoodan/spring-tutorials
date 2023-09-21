package com.shameenakoodan.SportDemo.myServices;

import org.springframework.stereotype.Component;

@Component
public class BasketBall implements SportWin{

	@Override
	public boolean getWin() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public String getSportName() {
        return "BasketBall";
    }
	@Override
	public String getSportType() {
		// TODO Auto-generated method stub
		return "Outdoor";
	}
}
