package com.marcospds;

public class TicTacToeTable {

	private static final String X_TEAM = "x";
	private static final String O_TEAM = "o";

	private String[][] lines = new String[3][3];
	private int xVictorys = 0;
	private int oVictorys = 0;
	private String lastTeam = O_TEAM;

	public void move(int line, int column, String team) {

		if (team.equals(lastTeam) || lines[line][column] != null)
			throw new RuntimeException();

		lines[line][column] = team;
		lastTeam = team;
	}

	public void refresh() {

		try {
			if (verifyLineWin(0) || 
				verifyLineWin(1) || 
				verifyLineWin(2) || 
				verifyColumnWin(0) || 
				verifyColumnWin(1) || 
				verifyColumnWin(2) || 
				verifyCrossWin()) {

				if (lastTeam.equalsIgnoreCase(X_TEAM))
					xVictorys++;
				else
					oVictorys++;

				clean();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void clean() {
		lastTeam = O_TEAM;
		lines = new String[3][3];
	}

	private boolean verifyLineWin(int line) {

		return lines[line][0].equals(lines[line][1]) && lines[line][1].equals(lines[line][2]);
	}

	private boolean verifyColumnWin(int column) {

		return lines[0][column].equals(lines[1][column]) && lines[1][column].equals(lines[2][column]);
	}

	private boolean verifyCrossWin() {

		return lines[0][0].equals(lines[1][1]) && lines[1][1].equals(lines[2][2])
				|| lines[0][2].equals(lines[1][1]) && lines[1][1].equals(lines[2][0]);
	}

	public String[][] getLines() {
		return lines;
	}

	public int getXVictorys() {
		return xVictorys;
	}

	public int getOVictory() {
		return oVictorys;
	}
}