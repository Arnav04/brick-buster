package jrJava.brickBuster;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import resources.DrawingBoard;

public class Coordinator {
	
	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(100, 0, 540, 700);
		Graphics canvas = board.getCanvas();

		Deflector deflector = new Deflector(200, 600);
		Ball ball =  new Ball(200, 400, 3, 3, 4, Color.red);
		

		while(true){
			board.clear();

			ball.move();
			ball.draw(canvas);
			Wall.draw(canvas);
			deflector.draw(canvas);
			KeyListener k = new KeyListener() {

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_RIGHT)
					{
						deflector.setX(deflector.getX() + 1);
					}
					if(e.getKeyCode() == KeyEvent.VK_LEFT)
					{
						deflector.setX(deflector.getX() - 1);
					}
					
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			};
			
			board.repaint();
			board.addKeyListener(k);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) { }
		}
	}


	}


