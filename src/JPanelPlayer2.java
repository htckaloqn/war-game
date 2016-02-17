import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;


public class JPanelPlayer2 extends JPanel {
	private static final long serialVersionUID = 1L;
	

	private JPanel mainBottomPanel;
	private JPanel bottomImagePanel;
	
	private Color grayColor = Color.GRAY;
	
	private JLabelCard JCard = new JLabelCard();

	
	
	public JPanelPlayer2(Player player2) {
			
		
				// ------------------------------ BOTTOM PANEL --------------------------/
				// ------------------------------- Player 2  -------------------------/
		
		mainBottomPanel = new JPanel();
		mainBottomPanel.setLayout(new BorderLayout());
		add(mainBottomPanel);
		
		
		
		
				//---------------------------Player 2 BackCardImage-------------------/
		
		
		
		bottomImagePanel = new JPanel();
		bottomImagePanel.setBackground(grayColor);
		bottomImagePanel.add(JCard.setCardBackImageToPlayer2());	
		bottomImagePanel.add(JCard.setCardSideBackImageToPlayer2());
		bottomImagePanel.add(JCard.setCardSideBackImageToPlayer2());
		

		
		
		
		
				//------------------------Add components to mainTopPanel--------------/
		mainBottomPanel.add(bottomImagePanel, BorderLayout.EAST);
		mainBottomPanel.setBackground(grayColor);

	}
	
	
	
	
}
