import java.util.ArrayList;


public class Player {
	
	
	private String name;	
	private int score;
	
	private ArrayList<Card> player1Cards = new ArrayList<Card>();
	private ArrayList<Card> player2Cards = new ArrayList<Card>();
	
	
	public Player () {
		
	}
	
	public Player (String name) {
		
		if (name != null) {
			this.name = name;
		}
		
		this.score = 0;
	}
	

	// --------------------------------------------------Getters and Setters----------------------------//
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		if (name != null) {
			this.name = name;
		}
		
	}

	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		if (score >= 0) {
			this.score = score;
		}
		
	}

	public ArrayList<Card> getPlayer1Cards() {
		return player1Cards;
	}
	
	public void setPlayer1Cards(ArrayList<Card> player1Cards) {
		
		if ((player1Cards != null) && (player1Cards.size() > 0)) {
			this.player1Cards = player1Cards;
		}
		
	}

	public ArrayList<Card> getPlayer2Cards() {
		return player2Cards;
	}
	
	public void setPlayer2Cards(ArrayList<Card> player2Cards) {
		
		if ((player2Cards != null) && (player2Cards.size() > 0)) {
			
			this.player2Cards = player2Cards;
		}
	}
	
	
	// ----------------------------------------------Public Methods---------------------------------------//

	
	/***
	 * Calls "Card.createAndMixCards()"...
	 * @param player1 receive 16 mixedCards
	 * @param player2 receive 16 mixedCards
	 */
	public static void get16cards(Player player1, Player player2) {
		
		Card nullCard = new Card();
		
		nullCard.createAndMixCards();
		
		for (int i = 0; i <= 15; ++i) {
				
			player1.player1Cards.add(nullCard.getMixedCards().get(i)) ;
			nullCard.getMixedCards().remove(i);
		}
		
		for (int i = 0; i <= 15; ++i) {
			
			player2.player2Cards.add(nullCard.getMixedCards().get(i)) ;
			
			
		}
	
	}
	
	
	/**
	 * 
	 * @return Value of the first card in Player1Card. Else return -1. 
	 */
	public int getFirstCardValueOfPlayer1CardList() {
		
		if (player1Cards.size() > 0) {
			int value = player1Cards.get(0).getValue();
			return value;
		}
		
		return -1;
	}
	/**
	 * 
	 * @return Value of the first card in Player2Card. Else return -1. 
	 */
	public int getFirstCardValueOfPlayer2CardList() {
		
		if (player2Cards.size() > 0) {
			int value = player2Cards.get(0).getValue();
			return value;
		}
	
		return -1;
	}
	
	
	
	/**
	 * @return null if player1Cards is empty.
	 */
	public Card getFirstCardFromPlayer1() {
		
		if (player1Cards.size() > 0) {
			return player1Cards.get(0);
		}

		return null;
	}
	/**
	 * @return null if player2Cards is empty.
	 */
	public Card getFirstCardFromPlayer2() {
		
		if (player2Cards.size() > 0) {
			return player2Cards.get(0);
		}
		System.out.println(player2Cards.size());
		return null;
	}
	
	
	
	public void removeFirstCardFromPlayer1() {
		 player1Cards.remove(0);
	}
	public void removeFirstCardFromPlayer2() {
		 player2Cards.remove(0);
	}
	
	
	
	public void addCardToPlayer1CardsList(ArrayList<Card> cards) {
		player1Cards.addAll(cards);
	}
	public void addCardToPlayer2CardsList(ArrayList<Card> cards) {
		player2Cards.addAll(cards);
	}


	
	public int checkSizePlayer1() {
		
		if (player1Cards.size() == 0) {
			
			return 0;
		}
		
		return 1;
	}
	public int checkSizePlayer2() {
		
		if (player2Cards.size() == 0) {
			
			return 0;
		}
		
		return 1;
	}
	
	
	
	
}
