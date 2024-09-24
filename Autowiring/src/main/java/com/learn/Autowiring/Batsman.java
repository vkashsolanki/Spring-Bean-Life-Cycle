package com.learn.Autowiring;

public class Batsman {
	
	private int run;

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "Batsman [run=" + run + "]";
	}
	

}
