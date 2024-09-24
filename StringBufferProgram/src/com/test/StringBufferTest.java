package com.test;

public class StringBufferTest {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("h");
		//StringBuffer buffer1 = new StringBuffer("h");
		//System.out.println("this is ......"+buffer);
		
		//StringBuffer g=buffer.append("world");
		buffer.append("world");
		System.out.println(buffer.capacity());
		
		StringBuffer buffer2 = new StringBuffer();
		buffer2.insert(1, "komal".length());
		StringBuffer delete = buffer2.delete(1, 1);
		System.out.println("here"+delete);
		
	}

}