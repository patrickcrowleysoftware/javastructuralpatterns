package com.patrick.java.patterns.structural.bridge;

public abstract class Shape {

	protected DrawAPI drawAPI;
	   
	   protected Shape(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();	
	}