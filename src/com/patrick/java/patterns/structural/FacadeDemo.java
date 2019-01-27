package com.patrick.java.patterns.structural;

import com.patrick.java.patterns.structural.facade.ShapeMakerFacade;

public class FacadeDemo {
	   public static void main(String[] args) {
	      ShapeMakerFacade shapeMaker = new ShapeMakerFacade();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }
	}