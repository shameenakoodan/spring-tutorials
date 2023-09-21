package com.shameenakoodan.SportDemo.myServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SportsClass implements ISportInterface {
	@Autowired
	@Qualifier("baseBall")
	private SportWin isport;

	public SportsClass() {

	}

	public SportsClass(SportWin thesportwin) {
		isport = thesportwin;
		
	}

	@Override
	public String getSportName() {
		// TODO Auto-generated method stub
		return isport.getSportName();	 
	}

	@Override
	public String getSportType() {

		// TODO Auto-generated method stub
		return isport.getSportType();
	}

	@Override
	public boolean getWin() {
		// TODO Auto-generated method stub
		return isport.getWin();
	}

}
