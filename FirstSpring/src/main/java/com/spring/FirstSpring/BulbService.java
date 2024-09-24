package com.spring.FirstSpring;

public class BulbService {
	
	
private Bulb bulb;
	
	public Bulb getBulb() {
	return bulb;
}

public void setBulb(Bulb bulb) {
	this.bulb = bulb;
}

	public String askBulb()
	{
		return bulb.getBulb();
	}

}
