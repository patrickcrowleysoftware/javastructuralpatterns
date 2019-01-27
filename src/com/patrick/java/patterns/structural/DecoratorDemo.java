package com.patrick.java.patterns.structural;

import com.patrick.java.patterns.structural.decorator.Circle;
import com.patrick.java.patterns.structural.decorator.Rectangle;
import com.patrick.java.patterns.structural.decorator.RedShapeDecorator;
import com.patrick.java.patterns.structural.decorator.Shape;

public class DecoratorDemo {
	
	   public static void main(String[] args) {

	      Shape circle = new Circle();

	      Shape redCircle = new RedShapeDecorator(new Circle());

	      Shape redRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of red border");
	      redCircle.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	   }
	}