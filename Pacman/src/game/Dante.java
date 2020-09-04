package game;

import java.awt.Color;

import processing.core.PApplet;
import processing.core.PImage;

public class Dante {

	PApplet app;
	PImage dante;
	int x;
	int y;
	int speed;

	public Dante(int x, int y, int s, PApplet app) {
		this.x = x;
		this.y = y;
		this.speed = s;
		this.app=app;
		dante= app.loadImage("./Image/dante.png");
	}

	protected void paint() {
		app.image(dante,x,y);
		//app.fill(255,0,0);
		//app.rect(x, y, 50, 50);		
	}

	protected void moveLeft() {

		x -=speed;
		if(x <= 0){
			x +=speed;
		}
	}
	protected void moveRight() {

		x +=speed;
		if(x >= 375){
			x -=speed;					
		}

	}
	protected void moverUp() {

		y +=speed;
		if(y >= 0){
			y -=speed;					
		}
	}
	protected void moverDown() {

		y +=speed;
		if(y >= 667){
			y -=speed;				
		}
	}
}

