import java.util.ArrayList;

import java.util.Random;

public class Card {

	private int value;
	private String suite;
	
	
	
	//Default Constructor
	public Card() {
	}
		
	//Constructor with Value and Suite 
	public Card(int value, String suite) {
			
			if ( value >= 7 && value <= 14 ) {
				
				this.value = value;
			}
			
			if (suite != null) {
				this.suite = suite;
			}
		}
	
	// Array with all cards - default Empty
	private Card[] cards = new Card[32];
	
	//List with mixed cards - default Empty
	private ArrayList<Card> mixedCards = new ArrayList<Card>();	
	
	
	
	
	// -----------------------------------------------Private Methods-----------------------------------//
	


	/***
	 * Create 32 cards
	 * @return cards array
	 */
	private Card[] cardsToArray() {
		
		cards[0] = new Card(7, "Спатия");
		cards[1] = new Card(7, "Каро");
		cards[2] = new Card(7, "Купа");
		cards[3] = new Card(7, "Пика");
		cards[4] = new Card(8, "Спатия");
		cards[5] = new Card(8, "Каро");
		cards[6] = new Card(8, "Купа");
		cards[7] = new Card(8, "Пика");
		cards[8] = new Card(9, "Спатия");
		cards[9] = new Card(9, "Каро");
		cards[10] = new Card(9, "Купа");
		cards[11] = new Card(9, "Пика");
		cards[12] = new Card(10, "Спатия");
		cards[13] = new Card(10, "Каро");
		cards[14] = new Card(10, "Купа");
		cards[15] = new Card(10, "Пика");
		cards[16] = new Card(11, "Спатия");
		cards[17] = new Card(11, "Каро");
		cards[18] = new Card(11, "Купа");
		cards[19] = new Card(11, "Пика");
		cards[20] = new Card(12, "Спатия");
		cards[21] = new Card(12, "Каро");
		cards[22] = new Card(12, "Купа");
		cards[23] = new Card(12, "Пика");
		cards[24] = new Card(13, "Спатия");
		cards[25] = new Card(13, "Каро");
		cards[26] = new Card(13, "Купа");
		cards[27] = new Card(13, "Пика");
		cards[28] = new Card(14, "Спатия");
		cards[29] = new Card(14, "Каро");
		cards[30] = new Card(14, "Купа");
		cards[31] = new Card(14, "Пика");
		
		
			return cards;
		}
	
	//Mixer with random position
	private void mixer(Card[] array){
					
				if (mixedCards.size() == 0) {
					
					Random randomGenerator = new Random();		
			 
					for (int i=0; i < array.length; i++) {
					  
						int randomPosition = randomGenerator.nextInt(array.length);
					    Card temp = array[i];
					    array[i] = array[randomPosition];
					    array[randomPosition] = temp;
					}
				}
		}
	
	/**
	 * This use the private mixer(Card[] array) to mix the cards.
	 */
	private void mixCards() {
				
			if (mixedCards.size() == 0) {
					mixer(cards);

				for (int i = 0; i < cards.length ; ++i) {
					mixedCards.add(cards[i]);
					
				}
			}
		}


	
	
	// ---------------------------------------------Getters and Setters---------------------------------//
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		
		if (value >= 7 && value <= 14 ) {
			
			this.value = value;
		}
		
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		
		if (suite != null) {
			
			this.suite = suite;
		}
	}

	public ArrayList<Card> getMixedCards() {
		return mixedCards;
	}
	
	
	
	// ---------------------------------------------Public Methods--------------------------------------//

	public void createAndMixCards() {
		cardsToArray();
		mixCards();
	}
	
	
	
	public String getCardName() {
		
		String name =  getValue() + " " + getSuite();
	
		return name;
	}
	

	
	//Override toString for Card
	@Override
	public String toString() {
		return value + " " +  suite;
	}


}
