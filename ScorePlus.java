import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class ScorePlus extends Item {
	private Starthere appletInfo;
	public ScorePlus(int x, Starthere appletInfo) {
		super(x);
		// TODO Auto-generated constructor stub
		this.appletInfo = appletInfo;
	}
	
	public void performAAction(Ball b) {
		super.performAction(b);
		Random r = new Random();
		appletInfo.setScore(appletInfo.getScore() + 500 + r.nextInt(2000));
	
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		super.paint(g);
	}

}
