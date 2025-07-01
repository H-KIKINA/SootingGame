import java.util.List;

public class OriginalEnemy extends Enemy{

    public boolean split = false;
	
    
	public OriginalEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=2+GameWorld.stage;
		}
	public OriginalEnemy(double x, double y, double vx, double vy, boolean split) {
        super(x, y, vx, vy);
        life = 2 + GameWorld.stage;
        this.split = split;
    }
	 public void update(Player player, List<Enemy> enemies) {
		 double dx = player.x - this.x;
		    double dy = player.y - this.y;
		    double distance = Math.sqrt(dx * dx + dy * dy);
		  
		    if (!split && distance < 130) {
		        split = true;
		        GameWorld.enemies.add(new OriginalEnemy(this.x - 20, this.y, 0, 2,true));
		        GameWorld.enemies.add(new OriginalEnemy(this.x + 20, this.y, 0, 2,true));
		    }
		    move();
	    }

	    // 描画処理
	    public void draw(MyFrame f) {
	        f.setColor(135, 206, 250); // 胴体
	        f.fillRect((int)x, (int)y, 30, 30);
	        f.setColor(138, 43, 226); // 右目
	        f.fillRect((int)(x + 3), (int)(y + 10), 8, 8);
	        f.setColor(138, 43, 226); // 左目
	        f.fillRect((int)(x + 19), (int)(y + 10), 8, 8);
	        f.fillRect((int)(x + 8), (int)(y + 20), 14, 5); // 口
	    }

	}
