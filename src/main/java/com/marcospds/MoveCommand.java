package com.marcospds;

public class MoveCommand {
	
	private int line;
	private int pos;
	private boolean x;

	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public boolean isX() {
		return x;
	}
	public void setX(boolean x) {
		this.x = x;
	}
}