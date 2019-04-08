package jrJava.brickBuster;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Deflector {

	private int x, y;  // x, y are top-left corner coordinates
	private int width = 100;
	private int height = 10;
	private Color color = Color.black;

	public Deflector(int _x, int _y){
		x = _x;
		y = _y;
		
	}

	public int getX(){ return x; }
	public int getY(){ return y; }
	public int getWidth(){ return width; }
	public int getHeight(){ return height; }
	
	public void setX(int r)
	{
		this.x = r;
	}
	
	public void setY(int j)
	{
		this.y = j;
	}
	
	


	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.fillRect(x, y, width, height);
	}
	 

}