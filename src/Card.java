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
    public String setLoc(int x, int y){
        locX = x;
        locY = y;
        return "("+x+" , "+y+")";
    }

    String[] suits = {"s","h","d","c"};
    String[] nums = {"1","2","3","4","5","6","7","8","9","10","j","q","k"};

    public Card(int s, int n){
        String c = "images/cards/";
        if(!faceUp)
            c+="b1fv.png";
        else{
            c+=suits[s]+nums[n]+".png";
        }
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
//array of string to represent each suite
//array of string representing thr value
//back is static image(back of card) shared with all cards (private static image back;) 
// ->one image all back of cards share
//String s = "images/cards/"