package main;

import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private Color color;
	private int initialXPosition, initialYPosition;
	
	public int GetxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public void setXPosition(int newX, int panelWidth) {
		if(newX + width > panelWidth) { 
			newX = panelWidth - width;
			}
		else if(newX < 0) {
			newX = 0;
			}
		
			xPosition = newX;
	}
	public int GetyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	public void setYPosition(int newY, int panelHeight) {
		if(newY + height > panelHeight) { 
			newY = panelHeight - height;
			}
		else if(newY < 0) {
			newY = 0;
			}
		
			yPosition = newY;
	}
		
	
	
	
	public int GetxVelocity() {
		return xVelocity;
	}
	
	public void setxVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}
	
	public int GetyVelocity() {
		return yVelocity;
	}
	
	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}
	
	
	public int Getwidth() {
		return width;
	}
	
	public void setwidth(int width) {
		this.width = width;
	}
	
	public int Getheight() {
		return height;
	}
	
	public void setheight(int height) {
		this.height = height;
	}
	
	
	public Color color() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	public void setInitialPosition(int startX,int startY) {
		this.initialXPosition = startX;
		this.initialYPosition = startY;
	}
	
	public void resetToInitialPosition() {
		setxPosition(initialXPosition);
		setyPosition(initialYPosition);
	}
	
	public Rectangle getRectangle() {
		return new Rectangle(GetxPosition(), GetyPosition(), Getwidth(), Getheight());
	}
}
