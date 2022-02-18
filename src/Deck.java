import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.*;

public class Deck extends Pile{
/** A Deck is a special kind of Pile that essentially is Initialized to be 
    a complete standard deck of cards with 52 cards.  13 of each suit*/

  public Deck(){
		initDeck();
	}

	/* Initializes the Cards in this deck, constructing them all and
	 *  placing them into the data structure holding them.*/			
	private void initDeck() {
		//list.add(new Card(1,4));
		for (int x=1; x<=4; x++) {
			for (int i=1; i<=13; i++) {
				cards.add(new Card(x,i));
			}
		}
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

}
