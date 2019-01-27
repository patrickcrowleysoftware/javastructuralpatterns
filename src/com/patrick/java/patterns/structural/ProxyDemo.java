package com.patrick.java.patterns.structural;

import com.patrick.java.patterns.structural.proxy.Image;
import com.patrick.java.patterns.structural.proxy.ProxyImage;

public class ProxyDemo {
	
	   public static void main(String[] args) {
	      Image image = new ProxyImage("test_10mb.jpg");

	      //image will be loaded from disk
	      image.display(); 
	      System.out.println("");
	      
	      //image will not be loaded from disk
	      image.display(); 	
	   }
	}