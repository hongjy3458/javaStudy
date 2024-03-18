package main;

import car.CarAction;
import car.CarActionElec;
import car.CarActionGasoline;
import car.Tesla;

public class Main {

	public static void main(String[] args) {
		
		CarAction x = new Tesla();
		
		((Object)x).toString();	// type casting
		
//		if( tesla instanceof CarActionGasoline ) {
//			System.out.println("통과");
//		}else {
//			System.out.println("실패");
//		}
		
		
	}

}
