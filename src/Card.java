import java.awt.Graphics;
import java.awt.event.ActionEvent;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{
    private int locX; //location for x-coordinate
    private int locY; //location for y-coordinate
    private String suit;
    private boolean faceUp;
    private int value;
    private boolean isRed;

    public Card(String s, int v){
        suit = s;
        value = v;
    }



    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }

}
