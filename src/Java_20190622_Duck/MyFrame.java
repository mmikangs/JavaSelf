package Java_20190622_Duck;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends Frame {

	public static final int FRAME_WIDTH=800;
	public static final int FRAME_HEIGHT=600;
	
	
	DuckManager mgr=new DuckManager();
	
	public MyFrame(){
		//super(); //new Frame()
	
		this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	

	@Override
	public void paint(Graphics g) {
	
		if(mgr!=null) {
		  mgr.displayAllDucks(g);
		  mgr.flyAllDucks(g);
		  mgr.swimAllDucks(g);
		  mgr.quackAllDucks(g);
		
		  
		
	}
	
	}
	
};
