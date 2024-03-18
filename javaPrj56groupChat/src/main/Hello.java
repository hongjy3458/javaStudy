package main;

import java.net.InetAddress;

public class Hello {
	
	public static void main(String[] args) throws Exception {
		
		String x = InetAddress.getLocalHost().getHostAddress();
		System.out.println(x);
		
	}

}


