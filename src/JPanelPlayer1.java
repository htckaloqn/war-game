import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;



public class JPanelPlayer1  extends JPanel{
	private static final long serialVersionUID = 1L;
	
	
	private JPanel mainTopPanel;
	private JPanel topImagePanel = new JPanel();

	private Color grayColor = Color.GRAY;
	
	private JLabelCard JCard = new JLabelCard();
	

	
	public JPanelPlayer1(Player player1) {
			
		
				// ------------------------------ TOP PANEL --------------------------/
				// ------------------------------- Player 1  -------------------------/
		
		mainTopPanel = new JPanel();
		mainTopPanel.setLayout(new BorderLayout());
		add(mainTopPanel);
		
		
		
				//---------------------------Player 1 BackCardImage-------------------/
		
		
		
		topImagePanel = new JPanel();
		topImagePanel.setBackground(grayColor);
		topImagePanel.add(JCard.setCardBackImageToPlayer1());	
		topImagePanel.add(JCard.setCardSideBackImageToPlayer1());
		topImagePanel.add(JCard.setCardSideBackImageToPlayer1());
		
		
		
		
		
		
				//------------------------Add components to mainTopPanel--------------/
		mainTopPanel.add(topImagePanel, BorderLayout.EAST);
		mainTopPanel.setBackground(grayColor);

	}
	
	
	

	


}
