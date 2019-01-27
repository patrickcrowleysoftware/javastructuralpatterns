package com.patrick.java.patterns.structural;

import com.patrick.java.patterns.structural.bridge.Circle;
import com.patrick.java.patterns.structural.bridge.GreenCircle;
import com.patrick.java.patterns.structural.bridge.RedCircle;
import com.patrick.java.patterns.structural.bridge.Shape;

public class BridgeDemo {
	
	   public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	   }
	}