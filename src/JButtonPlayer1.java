import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class JButtonPlayer1 extends JButton {
	private static final long serialVersionUID = 1L;

	private JButton player1Button;
	
	private Color blueColor = Color.BLUE;
	
	Deck deck = new Deck();
	JLabelCard JCard = new JLabelCard();
	
	Player player1 = new Player();
	Player player2 = new Player();
	
	
	public JButtonPlayer1() {
		
		player1Button = new JButton("Player 1");
		
		add(player1Button);
		
		player1Button.setBackground(blueColor);
		
		player1Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
								
				deck.mainLogic(player1, player2);
				JCard.getCardFaceP1(player1);
				
				
			}
		});
		
		
	}
	




	
	
	
	
	public static void main(String[] args) {
		

	}

}
