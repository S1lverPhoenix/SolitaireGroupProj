
import java.util.ArrayList; 

// <<<<<<< HEAD
// >>>>>>> 71d4ba834df6d8b4c0aa218973691034ab399789
// =======
// >>>>>>> 71d4ba834df6d8b4c0aa218973691034ab399789
/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {
    
    public abstract boolean canAddCard(Card c);
    private int locX;
    private int locY;
    private int numCards;
// <<<<<<< HEAD
// <<<<<<< HEAD

// =======
    public ArrayList<Card> cards = new ArrayList<>();

    
}
//location(for each pile) -> changes when added to a new pile
//arraylist(easier to add)
//amount in pile,
//x-coordinate in index 0, and y-coordinate in index 1 -> or build a string
//if u know type of pile then return the x
//abstract so we make atleast 4 subclasses(types of piles)