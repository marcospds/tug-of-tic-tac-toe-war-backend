package com.marcospds;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tugoftictactoewar")
public class TicTacToeController {

	private static TicTacToeTable table = new TicTacToeTable();

	@GET
	@Path("/table")
	@Produces(MediaType.APPLICATION_JSON)
	public TicTacToeTable getTable() {

		return table;
	}

	@POST
	@Path("/lines")
	public void setTable(String msg) {

		System.out.println(msg);

		try {
			String move = extractMove(msg);
			String team = extractTeam(move);
			int line = extractLine(move);
			int column = extractColumn(move);

			System.out.println(team + " " + line + " " + column);

			table.move(line, column, team);
			
			table.refresh();
			
		} catch (RuntimeException e) {
			System.out.println("Ignorado!");
		}
	}

	private String extractMove(String msg) {
		return msg.split(":")[1];
	}

	private String extractTeam(String move) {
		switch (getParam(move, 1)) {
		case "x":
			return "x";
		case "o":
			return "o";
		default:
			throw new RuntimeException();
		}
	}

	private int extractLine(String move) {
		switch (getParam(move, 2)) {
		case "1":
			return 0;
		case "2":
			return 1;
		case "3":
			return 2;
		default:
			throw new RuntimeException();
		}
	}

	private int extractColumn(String move) {
		switch (getParam(move, 3)) {
		case "a":
			return 0;
		case "b":
			return 1;
		case "c":
			return 2;
		default:
			throw new RuntimeException();
		}
	}

	private String getParam(String msg, int pos) {
		return Arrays.asList(msg.split("\\s")).get(pos);
	}
}