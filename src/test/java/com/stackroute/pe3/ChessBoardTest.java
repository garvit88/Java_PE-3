package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChessBoardTest {

static ChessBoard chessboard;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		chessboard = new ChessBoard();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		chessboard = null;

	}
	
	@Test
	public void testChessBoardPattern() {
		assertEquals(
				"testChessBoardPattern(): testChessBoardPattern function failed, the value returned by the function is not as expected",
				"BB|WW|BB|WW|BB|WW|BB|WW|\n" + 
				"WW|BB|WW|BB|WW|BB|WW|BB|\n" + 
				"BB|WW|BB|WW|BB|WW|BB|WW|\n" + 
				"WW|BB|WW|BB|WW|BB|WW|BB|\n" + 
				"BB|WW|BB|WW|BB|WW|BB|WW|\n" + 
				"WW|BB|WW|BB|WW|BB|WW|BB|\n" + 
				"BB|WW|BB|WW|BB|WW|BB|WW|\n" + 
				"WW|BB|WW|BB|WW|BB|WW|BB|\n" + 
				"",chessboard.generatePattern("BB", "WW", 8, 8));
	}
	
}
