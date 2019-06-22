package Java_20190622_Duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck 
			implements Quackable, Flyable{

	public MallardDuck(){
		
		super();
	}
	
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("꽥꽥",x+Duck.SIZE, y+Duck.SIZE);
	}
	@Override
	public void fly(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("날다",x+Duck.SIZE, y);
	}
	


};
