package pong;

import java.awt.Color;
import java.awt.Graphics;


public class Enemy_1 {
	
public boolean right,left;
	
	public int x,y;
	
	public int width,height;

	
	public Enemy_1(int x,int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
	}
	
	public void tick() {
		x+= (Game.ball.x - x - 4) * 0.09;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x,y,width,height);
	}
	
}