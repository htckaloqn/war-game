import java.awt.Color;

import java.util.ArrayList;


import javax.swing.JOptionPane;






public class Deck {

	private String name;
	
	private ArrayList<Card> cardsOnDeckList = new ArrayList<Card>();

	private JOptionPane optionPane;
//	private JOptionPane cardPane;

	private SoundClass sound = new SoundClass();
	
	JLabelCard jCard = new JLabelCard();
	JLabelCard jCard2 = new JLabelCard();
	
	
	
	private Color redColor = Color.RED;
	private Color blueColor = Color.BLUE;
	
	//Default Constructor
	public Deck() {
	}
	
	//Constructor with name
	public Deck (String name) {
			
		
		
			if (name != null) {
				this.name = name;
			}
	}
	
	
	// ------------------------------------------------Getters and Setters-----------------------------//
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		
		if (name != null) {
			this.name = name;
		}
	}

	
	public ArrayList<Card> getCardsOnDeckList() {
		return cardsOnDeckList;
	}

	
	public void setCardsOnDeckList(ArrayList<Card> cardsOnDeckList) {
		
		if ((cardsOnDeckList != null) && (cardsOnDeckList.size() > 0)) {
			this.cardsOnDeckList = cardsOnDeckList;
		}
	}

	
	
	// --------------------------------------------------Private Methods-------------------------------//


		/**
	 * @return return 1 - if Player1 card value is bigger than Player2 card value. 
		 * 		   return 2 - if Player1 card value is smaller than Player2 card value.
		 * 		   return 3 - if Player1 card value is the same as Player2 card value.
		 * 		   return 0 - îtherwise.
		 */
	private int compareValueOfCards (Player player1, Player player2) {
		
		//Player 1 get Card value
		int player1Value = player1.getFirstCardValueOfPlayer1CardList();
		
		//Player 2 get Card value
		int player2Value = player2.getFirstCardValueOfPlayer2CardList();

		//Compare values of Player 1 and Player 2 cards
		if (player1Value > player2Value) {
			return 1;
		} else if (player1Value < player2Value) {
			return 2;
		} else if (player1Value == player2Value) {
			return 3;
		}

		return 0;
	}
	
	private JOptionPane war(Player player1, Player player2) {
		
	
		
		int firstValue = player1.getPlayer1Cards().get(3).getValue();
		int secondValue = player2.getPlayer2Cards().get(3).getValue();
		
			if (firstValue > secondValue) {
				
				cardsOnDeckList.add(player1.getPlayer1Cards().get(1));
				cardsOnDeckList.add(player2.getPlayer2Cards().get(1));
				cardsOnDeckList.add(player1.getPlayer1Cards().get(2));
				cardsOnDeckList.add(player2.getPlayer2Cards().get(2));
				cardsOnDeckList.add(player1.getPlayer1Cards().get(3));
				cardsOnDeckList.add(player2.getPlayer2Cards().get(3));
				
				player1.addCardToPlayer1CardsList(cardsOnDeckList);
				
				int size = cardsOnDeckList.size();
				
				cardsOnDeckList.clear();
				
				player1.getPlayer1Cards().remove(0);
				player1.getPlayer1Cards().remove(0);
				player1.getPlayer1Cards().remove(0);
				player1.getPlayer1Cards().remove(0);
				
				player2.getPlayer2Cards().remove(0);
				player2.getPlayer2Cards().remove(0);
				player2.getPlayer2Cards().remove(0);
				player2.getPlayer2Cards().remove(0);
				
				player1.setScore(player1.getScore() + 1);
				
				return mesageDialog("Player 1 win " + size/2 + " cards after war.", blueColor);
				
			} else if (firstValue < secondValue) {
				
				cardsOnDeckList.add(player1.getPlayer1Cards().get(1));
				cardsOnDeckList.add(player2.getPlayer2Cards().get(1));
				cardsOnDeckList.add(player1.getPlayer1Cards().get(2));
				cardsOnDeckList.add(player2.getPlayer2Cards().get(2));
				cardsOnDeckList.add(player1.getPlayer1Cards().get(3));
				cardsOnDeckList.add(player2.getPlayer2Cards().get(3));
				
				player2.addCardToPlayer2CardsList(cardsOnDeckList);
				
				int size = cardsOnDeckList.size();
				
				cardsOnDeckList.clear();
				
				player1.getPlayer1Cards().remove(0);
				player1.getPlayer1Cards().remove(0);
				player1.getPlayer1Cards().remove(0);
				player1.getPlayer1Cards().remove(0);
				
				player2.getPlayer2Cards().remove(0);
				player2.getPlayer2Cards().remove(0);
				player2.getPlayer2Cards().remove(0);
				player2.getPlayer2Cards().remove(0);
				
				player2.setScore(player2.getScore() + 1);
				
				
				return mesageDialog("Player 2 win " + size/2 + " cards after war.", redColor);
				
			} else if (firstValue == secondValue) {
				
				
				war(player1, player2);
				
				return mesageDialog("Second War", null);
				
			}

			return mesageDialog("Neshto se schupi ;( ", null);
	}
	
	// --------------------------------------------------Public Methods--------------------------------//
	
	
	public JOptionPane mainLogic(Player player1, Player player2) {
		
		if (player1.checkSizePlayer1() == 0 || player2.checkSizePlayer2() == 0) {
			
			sound.winSound();
			
			return mesageDialog("Player 1 cards : " + player1.getPlayer1Cards().size() + 
					"\n Player 2 cards : " + player2.getPlayer2Cards().size(), blueColor);
		}
		
		
		int compareValue = compareValueOfCards(player1, player2);
	
		cardsOnDeckList.add(player1.getFirstCardFromPlayer1());
		cardsOnDeckList.add(player2.getFirstCardFromPlayer2());
		
		
									//---------------------------Player 1 WIN
		if (compareValue == 1) {
			
//			warCardDialog();
			
			player1.addCardToPlayer1CardsList(getCardsOnDeckList());
			
			player1.removeFirstCardFromPlayer1();
			player2.removeFirstCardFromPlayer2();
			
			int size = cardsOnDeckList.size();
			
			cardsOnDeckList.clear();
			
			player1.setScore(player1.getScore() + 1);
			
			return mesageDialog("Player 1 win " + size/2 + " cards.", blueColor);
		}
		
									//----------------------------Player 2 WIN
		if (compareValue == 2) {
			
			player2.addCardToPlayer2CardsList(getCardsOnDeckList());
			
			player1.removeFirstCardFromPlayer1();
			player2.removeFirstCardFromPlayer2();
			
			int size = cardsOnDeckList.size();
			
			cardsOnDeckList.clear();
			
			
			player2.setScore(player2.getScore() + 1);
			
			return mesageDialog("Player 2 win " + size/2 + " cards.", redColor);
		}
		
									 //--------------------------- WAR
		if (compareValue == 3) {
			
			
			sound.warSound();
			
			mesageDialog("WAR : ", null);
			
			
			war(player1, player2);
			
			
			return null;
				
		}
		
		return mesageDialog("Neshto se schupi :( ", null);

	}
	
	
	
	
	
	public JOptionPane mesageDialog(String message, Color color) {
			
			optionPane = new JOptionPane();
			optionPane.setBackground(color);
			
			JOptionPane.showMessageDialog(null, message);
			
		
			
			return optionPane;
		}
	
	
//	public JOptionPane warCardDialog() {
//		
//		cardPane = new JOptionPane();
//		
//
//		JOptionPane.showMessageDialog(null, "msg", "title", 2, jCard.getCardFaceIndex3Player1(player1) );
//		
//		return cardPane;
//		
//	}
	
	
	
	
}
