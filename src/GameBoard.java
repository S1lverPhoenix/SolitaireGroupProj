import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
//Card Storage / loc Idea: Create 1d array of 7 piles to store all main cards then 5 extra piles for sorted and deck
import javax.imageio.ImageIO;
public class GameBoard implements Drawable, Updateable {
	

	Image testImage, backImage;
	public static final int OFFSET_X = 40, OFFSET_Y = 20;
	
	 
	private int numdraws=0;
	private DrawPile drawPile = new DrawPile();
	private OpenPile openPile = new OpenPile(70);
	private MainPile main1 = new MainPile(80);
	private MainPile main2 = new MainPile(100);;
	private MainPile main3 = new MainPile(120);;
	private MainPile main4 = new MainPile(140);;
	private MainPile main5 = new MainPile(160);;
	private MainPile main6 = new MainPile(180);;
	private MainPile main7 = new MainPile(200);;
	private SortedPile sorted1;
	private SortedPile sorted2;
	private SortedPile sorted3;
	private SortedPile sorted4;
	
	
	
	public GameBoard() {
		try {
			testImage = ImageIO.read(new File("images/cards/dj.png"));
			backImage = ImageIO.read(new File("images/cards/b1fv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/** @param g Graphics context onto which all Objects in the game
	 * draw themselves.  This should NOT change the Objects
	 */
	public void draw(Graphics g) {
		numdraws++;
		g.setColor(new Color(40, 155, 70));
		g.fillRect(0, 0, 3000, 2000);
		Card x = new Card(2, 7);
		drawPile.addCard(x);
		x.draw(g);
		Card a = new Card(2, 7);
		a.switchFace();
		main1.addCard(a);
		a.draw(g);
	}


	/**
	 * This method is called by the game when a click has been made 
	 * on the panel.  Must determine if the click makes sense (is it 
	 * a valid location, If it is the first click, then note it and
	 * the next click will attempt a move (maybe).
	 * @param me
	 */
	public void justClicked(MouseEvent me) {
		Point p = me.getPoint();
		System.out.println("You just clicked "+p);


	}

	@Override
	// this update will be called each time the timer in the KlondikeGame
	// goes off.  This will be convenient for animating.
	public void update(ActionEvent a) {
		
		
	}

}
