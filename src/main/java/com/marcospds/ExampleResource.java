package com.marcospds;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/lines")
public class ExampleResource {

	private static TicTacToeTable table = new TicTacToeTable();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<TicTacToeLine> getTable() {

		return table.getLines();
	}
/*
	@POST
	public void setTable(MoveCommand move) {

		table.getLines().get(move.getLine()).move(move.getPos(), move.isX());
	}
*/	
	
	@POST
	public void setTable(String msg) {

		System.out.println(msg);
		
		String move = msg.split(":")[1];
		
		int line = move.contains("1") ? 0 : move.contains("2") ? 1 : 2;
		int pos = move.contains("a") ? 1 : move.contains("b") ? 2 : 3;
		boolean x = move.contains("x") ? true : false;
		
		System.out.println(line + " " + pos + " " + x);
		
		table.getLines().get(line).move(pos, x);	
	}
}