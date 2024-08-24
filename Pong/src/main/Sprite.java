package main;

import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private Color color;
	private int initialXPosition, initialYPosition;
	
	public int getXPosition() {
		return xPosition;
	}
	public void setXPosition(int xPosition) {
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
	public int getYPosition() {
		return yPosition;
	}
	public void setYPosition(int yPosition) {
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
		
	
	
	
	public int getXVelocity() {
		return xVelocity;
	}
	
	public void setXVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}
	
	public int getYVelocity() {
		return yVelocity;
	}
	
	public void setYVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}
	
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public Color getColor() {
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
		setXPosition(initialXPosition);
		setYPosition(initialYPosition);
	}
	
	public Rectangle getRectangle() {
		return new Rectangle(getXPosition(), getYPosition(), getWidth(), getHeight());
	}
}
