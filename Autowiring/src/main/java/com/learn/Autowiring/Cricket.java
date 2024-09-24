package com.learn.Autowiring;



public class Cricket {

	
	
	private String player;
	private Batsman batsman;
	
	
	Cricket()
	{
		super();
	}
	
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public Batsman getBatsman() {
		return batsman;
	}
	public void setBatsman(Batsman batsman) {
		this.batsman = batsman;
	}
	@Override
	public String toString() {
		return "Cricket [player=" + player + ", batsman=" + batsman + "]";
	}
	
	public void show()
	{
		System.out.println(player);
		System.out.println(batsman);
		
	}
	
}
	
	