import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
// MainPile is the 7 piles
public class MainPile extends Pile{
    int xLoc;
    public MainPile(int x) {
        super(x, 150);
        xLoc = x;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void draw(Graphics g) {
        if(!cards.isEmpty()){
            cards.get(cards.size()-1).draw(g);
            for(int x = 0; x<cards.size()-1; x++){
                if(cards.get(x).isFaceUp()){
                    g.drawImage(cards.get(x).getImg(),xLoc, 150+(x*20), null);
                }
                else{
                    g.drawImage(cards.get(x).getBackImg(),xLoc, 150+(x*20), null);
                }
            }
        }
        else{
           g.setColor(Color.MAGENTA); 
           g.drawRect(xLoc, 150, 50, 100);
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
