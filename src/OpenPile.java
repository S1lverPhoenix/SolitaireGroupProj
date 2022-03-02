import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
// OpenPile is the cards next to the DrawPile
public class OpenPile extends Pile{
    int xLoc;
    public OpenPile(int x) {
        super(x, 50);
        xLoc = x;
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        if(cards.isEmpty()){
            g.setColor(Color.MAGENTA);
            g.drawRect(xLoc, 150, 50, 100);
        }
        else{
        int count = 0;
         for(int x = cards.size()-1; x<cards.size()-4; x--){
            if(cards.get(x).isFaceUp()){
                g.drawImage(cards.get(x).getImg(),xLoc + (count*20), 150+(x*20), null);

            }
            else{
                g.drawImage(cards.get(x).getBackImg(),xLoc + (count*20), 150+(x*20), null);
            }
            count++;
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
    
