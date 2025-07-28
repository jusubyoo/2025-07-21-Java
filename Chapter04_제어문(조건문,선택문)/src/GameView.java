import javax.swing.*; // 경량
import java.awt.*; // Image

public class GameView extends JPanel{

	Image back, cat;
	// 초기화
	int x=150;
	int y=100;
	public GameView()
	{
		// 생성자 => 변수에 대한 초기화
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back2.jpg");
		cat=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\cat1.png");
	}
	public void paint(Graphics g)
	{
		g.drawImage(back, 0,0, getWidth(), getHeight(), this);
		g.drawImage(cat, x,y,150,100 , this);
	}
}
