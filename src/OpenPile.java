import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
// OpenPile is the cards next to the DrawPile
public class OpenPile extends Pile{

    public OpenPile(int y) {
        super(50, y);
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
    
