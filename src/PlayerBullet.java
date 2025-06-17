
public class PlayerBullet extends Character{
	public void draw (MyFrame f) {
		f.setColor(123,104,238);
		f.fillOval(x+5,y-30,5,5);
	}
	public PlayerBullet(double x,double y,double vx,double vy) {
		//Characterコンストラクタの呼び出し
		super(x,y,vx,vy);
	}
}
