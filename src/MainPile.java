import java.awt.Graphics;
import java.awt.event.ActionEvent;
// MainPile is the 7 piles
public class MainPile extends Pile{

    public MainPile(int x) {
        super(x, 150);
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
