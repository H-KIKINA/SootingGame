//プレイヤーや敵の登録
import java.util.Vector;

public class GameWorld {
	static Vector<Enemy> enemies = new Vector<>();
	static Player player;
	static Vector<PlayerBullet> playerBullets;
	//static Vector<Enemy> enemies;
	static boolean enterPressed;
	static int stage;
	static int score;
}
