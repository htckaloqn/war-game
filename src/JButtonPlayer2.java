import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class JButtonPlayer2 extends JButton {
	private static final long serialVersionUID = 1L;
	
	
	
	private JButton player2Button;
	private Color redColor = Color.RED;
	
	
	public JButtonPlayer2() {
		
		player2Button = new JButton("Player 2");
		
		add(player2Button);
		
		player2Button.setBackground(redColor);
		
		player2Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
	}
	

	
	
	
	
	
	

}
