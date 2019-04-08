package jrJava.brickBuster;

import java.awt.Color;
import java.awt.Graphics;
import resources.*;


public class Ball {

	private int x, y; // center coordinates
	private int xSpeed, ySpeed;
	private int radius;
	private Color color;
	//private Deflector d;


	public Ball(int _x, int _y, int _xSpeed, int _ySpeed, int _radius, Color _color){
		x = _x;
		y = _y;
		xSpeed = _xSpeed;
		ySpeed = _ySpeed;
		radius = _radius;
		color = _color;
	}


	public int getX(){ return x; }
	public int getY(){ return y; }
	public int getXSpeed(){ return xSpeed; }
	public int getYSpeed(){ return ySpeed; }
	public int getRadius(){ return radius; }

	public void setX(int _x){ x = _x; }
	public void setY(int _y){ y = _y; }
	public void setXSpeed(int _xSpeed){ xSpeed = _xSpeed; }
	public void setYSpeed(int _ySpeed){ ySpeed = _ySpeed; }


	public void move(){

		x = x + xSpeed;
		y = y + ySpeed;

		// check collision with wall. If detected, keep the ball at bay, make it bounce.
		if(x<=Wall.getLeft()+radius){
			x = Wall.getLeft()+radius;
			xSpeed = -xSpeed;
		}
		if(x>=Wall.getRight()-radius){
			x = Wall.getRight()-radius;
			xSpeed = -xSpeed;
		}
		if(y<=Wall.getTop()+radius){
			y = Wall.getTop()+radius;
			ySpeed = -ySpeed;
		}
		/*if(y==d.getY()){
			y = d.getY();
			ySpeed = -ySpeed;*/
		}

	



	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.fillOval(x-radius, y-radius, 2*radius, 2*radius);
	}
}