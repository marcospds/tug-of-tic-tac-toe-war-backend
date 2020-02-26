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

	@POST
	public void setTable(MoveCommand move) {

		table.getLines().get(move.getLine()).move(move.getPos(), move.isX());
	}
}