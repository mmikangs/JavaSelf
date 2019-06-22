package Java_20190622_Duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck implements Quackable, Flyable{

	public RedDuck(){
		super();
	}
	

	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("꽥꽥",x+Duck.SIZE, y+Duck.SIZE);
	}
	@Override
	public void fly(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("날다 ",x+Duck.SIZE, y);
	}
	


};
