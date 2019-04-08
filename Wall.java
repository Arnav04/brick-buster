package jrJava.brickBuster;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import resources.DrawingBoard;


public class Wall {

	private static int xLeft = 20;
	private static int xRight = 520;
	private static int yTop = 20;
	private static int yBottom = 650;
	private static Color color = Color.gray;


	public static int getLeft(){ return xLeft; }
	public static int getRight(){ return xRight; }
	public static int getTop(){ return yTop; }
	public static int getBottom(){ return yBottom; }


	public static void draw(Graphics canvas){
		// draw lines, left, right, and top. But, not bottom.
		canvas.setColor(color);
		canvas.drawLine(xLeft,  yTop, xLeft,  yBottom);
		canvas.drawLine(xLeft,  yTop, xRight, yTop);
		canvas.drawLine(xRight, yTop, xRight, yBottom);
	}

}