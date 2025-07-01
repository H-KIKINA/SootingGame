
public class DropEnemy extends Enemy{
	public DropEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=1+GameWorld.stage;
	}
	public void draw (MyFrame f) {
		f.setColor(237,26,61);
		f.fillRect(x,y,30,10);
		f.setColor(237,26,61);
		f.fillRect(x+10,y+10,10,20);
	}
	public void move() {
		super.move();
		vy=vy+0.1;
	}
}
