import java.awt.Graphics;
import java.awt.event.ActionEvent;
// SortedPile is the 4 piles by the top of the board
public class SortedPile extends Pile{

    public SortedPile(int y) {
        super(200, y);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean canAddCard(Card c) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
