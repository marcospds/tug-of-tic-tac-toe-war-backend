package com.marcospds;

public class TicTacToeLine {

	private String left;
	private String center;
	private String rigth;

	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public String getRigth() {
		return rigth;
	}

	public void setRigth(String rigth) {
		this.rigth = rigth;
	}

	public void move(int pos, boolean x) {

		String team = x ? "X" : "O";

		switch (pos) {
		case 1:
			setLeft(team);
			break;
		case 2:
			setCenter(team);
			break;
		case 3:
			setRigth(team);
			break;
		}
	}
}