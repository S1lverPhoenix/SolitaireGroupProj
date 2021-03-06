import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList; 

/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {
    
    public abstract boolean canAddCard(Card c);
    private int locationX;
    private int locationY;
    private int numCards;
    public ArrayList<Card> cards = new ArrayList<>();

public void draw(Graphics g){
    if(cards.isEmpty()){
        cards.get(cards.size()-1).draw(g);
    } else {
        g.setColor(Color.MAGENTA);
    }
    g.fillRect(locationX,locationY,50,100);
}

public Card getTopCard(){
        Card c = cards.get(cards.size()-1);
        cards.remove(cards.get(cards.size()-1));
        return c;
 }

 public ArrayList<Card> get3(){
     ArrayList<Card> temp = new ArrayList<Card>();
     for(int x = 0; x<3; x++){
         temp.add(getTopCard());
     }
     return temp;
 }
public Pile(int x, int y){
    locationX = x;
    locationY = y;
}

public Pile(){
    
}

public void addCard(Card c){
    cards.add(c);
    c.setLoc(locationX, locationY);
}
 

    
}
//location(for each pile) -> changes when added to a new pile
//arraylist(easier to add)
//amount in pile,
//x-coordinate in index 0, and y-coordinate in index 1 -> or build a string
//if u know type of pile then return the x
//abstract so we make atleast 4 subclasses(types of piles)