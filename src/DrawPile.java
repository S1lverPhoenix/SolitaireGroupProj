import java.awt.Graphics;
import java.awt.event.ActionEvent;
// DrawPile is the pile where all cards come from in the top-left corner
public class DrawPile extends Pile{

   

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
<<<<<<< Updated upstream


=======
    for(int i=0; i<3; i++){
        getTopCard();
    }
>>>>>>> Stashed changes
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
