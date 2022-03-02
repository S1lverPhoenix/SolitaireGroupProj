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
        if(cards.isEmpty()){
            g.setColor(Color.MAGENTA);
            g.drawRect(xLoc, 150, 50, 100);
        }
        else{
         for(int x = cards.size()-1; x<cards.size()-4; x--){
            if(cards.get(x).isFaceUp()){
                g.drawImage(cards.get(x).getImg(),xLoc, 150+(x*20), null);
            }
            else{
                g.drawImage(cards.get(x).getBackImg(),xLoc, 150+(x*20), null);
            }
        }
        }
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
    
