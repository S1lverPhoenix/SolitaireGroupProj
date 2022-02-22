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
		//cards.add(new Card(1,4));
		for (int x=1; x<=4; x++) {
			for (int i=1; i<=13; i++) {
				cards.add(new Card(x,i));
			}
		}
	} 
		public void shuffle(){
			if(cards.size() < 2){
				return;
			}
			else if(cards.size() == 2){
				if(Math.random() > 0.5){
					Card x = cards.get(0);
					cards.set(0, cards.get(1));
					cards.set(1, x);
					return; 
				}
				else{
					return;
				}
			}
			else{
				int reps = cards.size()*2;
				while (reps >=0){
					int x = (int)(Math.random()*cards.size()-1);
					int y = (int)(Math.random()*cards.size()-1);
					cards.set(x,cards.get(y));
					cards.set(y, cards.get(x));
					reps--;
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
