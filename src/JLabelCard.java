import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class JLabelCard extends JLabel{
	private static final long serialVersionUID = 1L;

	
	private String[] paths =  {"7 ������.png" , "7 ����.png" , "7 ����.png" , "7 ����.png" , 
								"8 ������.png" , "8 ����.png" , "8 ����.png" , "8 ����.png" ,
								"9 ������.png" , "9 ����.png" , "9 ����.png" , "9 ����.png" ,
								"10 ������.png" , "10 ����.png" , "10 ����.png" , "10 ����.png" ,
								"14 ������.png" , "14 ����.png" , "14 ����.png" , "14 ����.png" ,
								"11 ������.png" , "11 ����.png" , "11 ����.png" , "11 ����.png" ,
								"12 ������.png" , "12 ����.png" , "12 ����.png" , "12 ����.png" ,
								"13 ������.png" , "13 ����.png" , "13 ����.png" , "13 ����.png" ,
								"p1 card.png", "p2 card.png"};
	
	private JLabel cardLabel = new JLabel(); 
	private JLabel cardLabel2 = new JLabel();


	
	
	
	
	
	// -----------------------------------------------------Card Back Images-------------------------//
	 public JLabel setCardBackImageToPlayer1() {
	    	
		 	JLabel label = new JLabel(""); 
			Image img = new ImageIcon("D:/JAVA/JavaWarGame/img/p1 card.png").getImage();
			label.setIcon(new ImageIcon(img));
			label.setBounds(0,0,100,100);
			
			return label; 
	 }
	 public JLabel setCardSideBackImageToPlayer1() {
	    	
		 	JLabel label = new JLabel(""); 
	    	Image img = new ImageIcon("img/p1 right card.png").getImage();
	    	label.setIcon(new ImageIcon(img));
	    	label.setBounds(0,0,100,100);
	    	
	    	return label;
	 }
	 
	 public JLabel setCardBackImageToPlayer2() {
	    	
		 	JLabel label = new JLabel(""); 
	    	Image img = new ImageIcon("D:/JAVA/JavaWarGame/img/p2 card.png").getImage();
	    	label.setIcon(new ImageIcon(img));
	    	label.setBounds(0,0,100,100);
	    	
	    	return label; 
	  }
	 public JLabel setCardSideBackImageToPlayer2() {
	        	
		 		JLabel label = new JLabel(""); 
	        	Image img = new ImageIcon("D:/JAVA/JavaWarGame/img/p2 right card.png").getImage();
	        	label.setIcon(new ImageIcon(img));
	        	label.setBounds(0,0,100,100);
	        	
	        	return label;
	   }
	
	
	 
	// ----------------------------------------------------- Card Faces ----------------------------//
	
	
	 public JLabel getCardFaceP1(Player player1) {
		 
	    	String player1Card =  player1.getFirstCardFromPlayer1().toString() + ".png";
	    	
	    	for (int i = 0; i < paths.length; ++i) {
	    		
	    		String path = paths[i].toString();
	    		
	    		if (path.equals(player1Card)) {
	    				
	    				String cardPathString = "D:/JAVA/JavaWarGame/img/" + player1Card;
	    				Image cardImg = new ImageIcon(cardPathString).getImage();
	    		    	cardLabel.setIcon(new ImageIcon(cardImg));
	    		    	cardLabel.setBounds(0,0, 100, 100);
	    		    	
	    		    	break;
	    			}
	    	}
	    	
	    	return cardLabel;
	    }
	 public JLabel getCardFaceP2(Player player2) {
		 
	
		 
	    	String player2Card = player2.getFirstCardFromPlayer2().toString() + ".png";
	    
	    	for (int i = 0; i < paths.length; ++i) {
	    		
	    		String path = paths[i].toString();
	    		
	    		if (path.equals(player2Card)) {
	    			
	    			
	    				String cardPathString = "D:/JAVA/JavaWarGame/img/" + player2Card;
	    				Image cardImg = new ImageIcon(cardPathString).getImage();
	    		    	cardLabel2.setIcon(new ImageIcon(cardImg));
	    		    	cardLabel2.setBounds(0,0, 100, 100);
	    		    	
	    		    	break;
	    			}
	    	}
		 
	    	return cardLabel2;
	    }


	 public JLabel getCardFaceIndex3Player1(Player player1) {
		 
		 String player1Card = player1.getPlayer1Cards().get(3).toString() + ".png";
	    	
	    	for (int i = 0; i < paths.length; ++i) {
	    		
	    		String path = paths[i].toString();
	    		
	    		if (path.equals(player1Card)) {
	    				
	    				String cardPathString = "D:/JAVA/JavaWarGame/img/" + player1Card;
	    				Image cardImg = new ImageIcon(cardPathString).getImage();
	    		    	cardLabel.setIcon(new ImageIcon(cardImg));
	    		    	cardLabel.setBounds(0,0, 100, 100);
	    		    	

	    			}
	    	}
	    	
	    	return cardLabel;
	 }
	 public JLabel getCardFaceIndex3Player2(Player player2) {
		 
		 String player2Card = player2.getPlayer2Cards().get(3).toString() + ".png";
		    
	    	for (int i = 0; i < paths.length; ++i) {
	    		
	    		String path = paths[i].toString();
	    		
	    		if (path.equals(player2Card)) {
	    			
	    			
	    				String cardPathString = "D:/JAVA/JavaWarGame/img/" + player2Card;
	    				Image cardImg = new ImageIcon(cardPathString).getImage();
	    		    	cardLabel2.setIcon(new ImageIcon(cardImg));
	    		    	cardLabel2.setBounds(0,0, 100, 100);

	    			}
	    	}
		 
	    	return cardLabel2;
	 }

	
	 

	 
	

}

