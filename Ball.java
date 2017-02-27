import java.awt.Color;
import java.awt.Graphics;

public class Ball  {
public Ball b;
	private int x = 40;
	private	int y = 25;
	private int radius = 20;
	private double dx = 10;
	private double dy = 0;
	
	private double gravity = 15;
	private double energyloss = 1;
	private double dt = .2;
	private double xFriction = .9;
	private int agility = 3;
	private int maxSpeed = 20;
	
	
	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Ball(int i, int j) {
		// TODO Auto-generated constructor stub
		x = i;
		y = j;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getDx() {
		return dx;
	}
	public double getDy() {
		return dy;
	}
	public void setDx(double dx) {
		this.dx = dx;
	}
	public void setDy(double dy) {
		this.dy = dy;
	}
	public double getGravity() {
		return gravity;
	}
	public void setGravity(double gravity) {
		this.gravity = gravity;
	}

	public Ball() {
		// TODO Auto-generated constructor stub
	}
	
	public void moveRight() {
		if (dx+ agility < maxSpeed){
			dx += agility;
			
		}
	}
	
	public void moveLeft() {
		if (dx- agility > - maxSpeed){
			dx -= agility;
		}
	}

	public void update(Starthere sp){
		if (x + dx>sp.getWidth()-radius-1){
			x = sp.getWidth()-radius -1;
			dx = -dx;
		}else if(x + dx < 0 + radius){
			x = 0+radius;
			dx = -dx;
		}
		else{
			x += dx;
		}
		
		if(y == sp.getHeight()-radius-1){
			dx*= xFriction;
			if (Math.abs(dx) <.8){
				dx = 0;
			}
		}
		
		if(y > sp.getHeight()-radius-1){
			y = sp.getHeight()-radius-1;
			dy *= energyloss;
			dy = -dy;
			
		}else{
			//velocity formula
			dy = dy + gravity *dt;
			//position formula
			y += dy*dt +.5*gravity*dt*dt;
		}
	}

	public void paint(Graphics g){
	g.setColor(Color.cyan);
	g.fillOval(x-radius, y-radius, radius*2, radius*2);
	
	}

	
}
