import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.*;


/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{
    private int locX; //location for x-coordinate
    private int locY; //location for y-coordinate
    private int suit;
    private boolean faceUp;
    private int value;
    private boolean isRed;
    private Image backImg;
    private Image img;

    public String setLoc(int x, int y){
        locX = x;
        locY = y;
        return "("+x+" , "+y+")";
    }

    public void switchFace(){
        faceUp = !faceUp;
    }

    String[] suits = {"s","h","d","c"};
    String[] nums = {"1","2","3","4","5","6","7","8","9","10","j","q","k"};

    public Card(int s, int n){
        suit = s;
        value = n;
        try {
            backImg = ImageIO.read(new File("images/cards/b1fv.png"));
            img = ImageIO.read(new File("images/cards/"+suits[s]+nums[n-1]+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void update(ActionEvent a) {        
    }

    @Override
    public void draw(Graphics g) {
        if(!faceUp)
            g.drawImage(backImg, locX, locY, null);
        else
            g.drawImage(img, locX, locY, null);
    }
}
//array of string to represent each suite
//array of string representing thr value
//back is static image(back of card) shared with all cards (private static image back;) 
// ->one image all back of cards share
//String s = "images/cards/"