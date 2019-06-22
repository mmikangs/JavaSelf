package Java_20190622_Duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck 
			implements Quackable{

	public RubberDuck(){
		
	
		super();
	}
	
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.ORANGE);
		g.drawString("삑삑",x+Duck.SIZE, y+Duck.SIZE);
	}
	
	
	

};
