package com.pojo;

public class Player {
	int pos;
	
	String name;
	public Player(String name) {
		this.name= name;;
		this.pos = 0;
	}

	public int getPos() {
		return pos;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPos(int pos) {
		this.pos = pos;
	}
	
}
