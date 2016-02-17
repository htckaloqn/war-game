import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI {

	public static void main(String[] args) {
		
		
		JLabelCard JCardPlayer1 = new JLabelCard();
		JLabelCard JCardPlayer2 = new JLabelCard();
			
		SoundClass sound = new SoundClass();
		
		Deck deck = new Deck();
		
		Player player1 = new Player("Az");
		Player player2 = new Player("Toi");
		
		Color grayColor = Color.GRAY;
		Color lightGrayColor = Color.lightGray;
		
		
	
		
		// ---------------------------------- G A M E ------------------------------------------//
		
		
		Player.get16cards(player1, player2);
		
		
		
		
		JButton Player1Button = new JButton("Player 1");
		JButton Player2Button = new JButton("Player 2");
		
		// -------------------------------------------------------Frame--------------------------/
		JFrame frame = new JFrame("War Game");
		frame.setSize(1024	, 768);
		frame.setMinimumSize(new Dimension(1024, 768));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		// --------------------------------------------------Main Panel --------------------------/
		JPanel panel = new JPanel(new GridLayout(6, 3));
		
		
		
		
		// --------------------------------------------------- TOP PANEL -------------------------/
		// --------------------------------------------------- Player 1  -------------------------/
		
		
		JPanelPlayer1 mainTopPanel = new JPanelPlayer1(player1);
		mainTopPanel.setLayout(new GridLayout(1, 4));
		
						//--------------------------------------SCORE
		JTextField player1ScoreField = new JTextField();
		player1ScoreField.setText("Score : " + player1.getScore());
		player1ScoreField.setPreferredSize(new Dimension(60, 20));
		player1ScoreField.setEnabled(false);

		JPanel textPanel = new JPanel(new FlowLayout());
		textPanel.setBackground(grayColor);
		textPanel.add(player1ScoreField, FlowLayout.LEFT);
		
		
						//---------------------------------------ADD COMPONENTS
		mainTopPanel.add(textPanel, FlowLayout.LEFT);
		

		
		
						//---------------------------------------BUTTON
		JPanel player1ButtonPanel = new JPanel(new BorderLayout());
		player1ButtonPanel.setBackground(grayColor);
		Player1Button.setPreferredSize(new Dimension(900, 30));
		Player1Button.setBackground(lightGrayColor);
		Player1Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {					
				
				sound.buttonClickSound();
				
				JCardPlayer1.getCardFaceP1(player1).setVisible(true);
				
				Player2Button.setEnabled(true);
				Player1Button.setEnabled(false);
				
			
			}
		});
		
		
						 //---------------------------------------ADD COMPONENTS
		player1ButtonPanel.add(Player1Button, BorderLayout.NORTH);

		
		
		// ------------------------------------------------- CENTER ------------------------------/
		// ------------------------------------------------- Player 1  ---------------------------/
		
		
		
						  //--------------------------------------CARD FACE
		JPanel mainCenterTopPanel = new JPanel();
		mainCenterTopPanel.setLayout(new GridLayout(1,5));
		mainCenterTopPanel.setBackground(grayColor);
		mainCenterTopPanel.add(JCardPlayer1.getCardFaceP1(player1)).setVisible(false);


						  //---------------------------------------RESET BUTTON
		JPanel resetPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		resetPanel.setBackground(grayColor);
		JButton resetButton = new JButton("Reset");
		resetButton.setBackground(lightGrayColor);
		resetButton.setPreferredSize(new Dimension(70, 30));
		resetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sound.buttonClickSound();
				
				player1.getPlayer1Cards().clear();
				player2.getPlayer2Cards().clear();
				
				player1.setScore(0);
				player2.setScore(0);
				
				Player.get16cards(player1, player2);
				
				JOptionPane.showMessageDialog(null, "New Game !");
				
				return;
			}
		});
		
		resetPanel.add(resetButton);
		mainCenterTopPanel.add(resetPanel);
		

		
		
		// -------------------------------------------------- CENTER -----------------------------/
		// ------------------------------------------------- Player 2  ---------------------------/
		
		
							//-------------------------------------CARD FACE
		JPanel mainCenterBottomPanel = new JPanel();
		mainCenterBottomPanel.setLayout(new GridLayout(1,5));
		mainCenterBottomPanel.setBackground(grayColor);
		mainCenterBottomPanel.add(JCardPlayer2.getCardFaceP2(player2)).setVisible(false);
		
	
		
							//-------------------------------------EXIT BUTTON
		JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		exitPanel.setBackground(grayColor);
		JButton exitButton = new JButton("Exit");
		exitButton.setBackground(lightGrayColor);
		exitButton.setPreferredSize(new Dimension(70, 30));
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sound.buttonClickSound();
			
				frame.setVisible(false);
				
				System.exit(0);
				
				
				
			}
		});
		
		exitPanel.add(exitButton);
		mainCenterBottomPanel.add(exitPanel);
		
		
		
		
		
		// ---------------------------------------------- BOTTOM PANEL -------------------------/
		// ------------------------------------------------ Player 2  -------------------------/
		
		JPanelPlayer2 mainBottomPanel = new JPanelPlayer2(player2);
		mainBottomPanel.setLayout(new GridLayout(1, 3));
		
								//-------------------------------SCORE
		JTextField player2ScoreField = new JTextField();
		player2ScoreField.setText("Score : " + player2.getScore());
		player2ScoreField.setPreferredSize(new Dimension(60, 20));
		player2ScoreField.setEnabled(false);
		JPanel player2textPanel = new JPanel(new FlowLayout());
		player2textPanel.setBackground(grayColor);
		player2textPanel.add(player2ScoreField, FlowLayout.LEFT);
		

								//-------------------------------BUTTON
		JPanel player2ButtonPanel = new JPanel(new BorderLayout());
		player2ButtonPanel.setBackground(grayColor);
		Player2Button.setPreferredSize(new Dimension(900, 30));
		Player2Button.setBackground(lightGrayColor);
		Player2Button.setEnabled(false);
		Player2Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if (player1.checkSizePlayer1() == 0 || player2.checkSizePlayer2() == 0) {
					
					sound.winSound();
					
					deck.mesageDialog("Player 1 cards : " + player1.getPlayer1Cards().size() + 
							"\n Player 2 cards : " + player2.getPlayer2Cards().size(), grayColor);
					return;
				}
					
				
				
				sound.buttonClickSound();
				
				JCardPlayer2.getCardFaceP2(player2).setVisible(true);
				
				deck.mainLogic(player1, player2);

				player1ScoreField.setText("Score : " + player1.getScore());
				player2ScoreField.setText("Score : " + player2.getScore());
				
				System.out.println(player1.getPlayer1Cards().toString());
				System.out.println(player2.getPlayer2Cards().toString());
				
				JCardPlayer1.getCardFaceP1(player1).setVisible(false);
				JCardPlayer2.getCardFaceP2(player2).setVisible(false);
				
				Player1Button.setEnabled(true);
				Player2Button.setEnabled(false);

				return;
			}
		});
		
		
								//-------------------------------ADD COMPONENTS
		player2ButtonPanel.add(Player2Button, BorderLayout.SOUTH);
		mainBottomPanel.add(player2textPanel, FlowLayout.LEFT);

		
		
		
		//-----------------------------------------------INFO PANEL---------------------------//
		
		
		
		System.out.println(player1.getPlayer1Cards().toString());
		System.out.println(player2.getPlayer2Cards().toString());
		
								
		panel.add(mainTopPanel);
		panel.add(player1ButtonPanel);
		panel.add(mainCenterTopPanel);
	
		panel.add(mainCenterBottomPanel);
		panel.add(player2ButtonPanel);
		panel.add(mainBottomPanel);
	
		
		frame.add(panel);
		frame.setVisible(true);
		
		sound.startSound();

	}

}
