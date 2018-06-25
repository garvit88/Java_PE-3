package com.stackroute.pe3;

public class MyException extends Exception{
	
	private String msg;
	public MyException(String msg) {
		this.msg = msg;
    } 
	
	public String getMsg() {
		return msg;
	}

	public static void main(String[] args) {
		try {
			throw new MyException("Exception in statement");
		}catch(MyException e) {
			System.out.println(e.getMsg());
		}
		finally {
			System.out.println("finally block");
		}
	}
}
