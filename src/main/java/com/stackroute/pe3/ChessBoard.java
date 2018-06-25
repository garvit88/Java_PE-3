package com.stackroute.pe3;

public class ChessBoard {

	public String generatePattern(String pattern1, String pattern2, int rows, int cols) {
        String chessPattern="";
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                if(i % 2 == j % 2) {
                	chessPattern += pattern1;
                }else {
                	chessPattern += pattern2;
                }
                chessPattern += "|";
            }
            chessPattern += "\n";
        }
        return chessPattern;
        
    }
	
}
