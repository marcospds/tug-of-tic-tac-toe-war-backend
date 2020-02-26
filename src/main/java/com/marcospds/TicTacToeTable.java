package com.marcospds;

import java.util.List;

public class TicTacToeTable {

	private List<TicTacToeLine> lines = List.of(new TicTacToeLine(), new TicTacToeLine(), new TicTacToeLine());

	public List<TicTacToeLine> getLines() {
		return lines;
	}
}