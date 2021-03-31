package BTVN_1;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class NguyenVietAnh_19504781_BoderDemo extends JFrame  {
	  private JPanel p;
	  private Border right,color,etche;
	  private JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8;
	public NguyenVietAnh_19504781_BoderDemo() {
		
		setTitle("Border Demo");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p= new JPanel();
	
		lbl1 =new JLabel("Line Border");
		lbl1.setBorder (BorderFactory.createLineBorder(Color.red,2));
		lbl2 =new JLabel("Etched Border");
		lbl2.setBorder( etche=BorderFactory.createEtchedBorder());
		lbl3 =new JLabel("Raised Bevel Border");
		lbl3.setBorder(BorderFactory.createRaisedBevelBorder());
		lbl4 =new JLabel("Lowered Bevel Border");
		lbl4.setBorder(BorderFactory.createLoweredBevelBorder());
		lbl5 =new JLabel("Title Border");
		lbl5.setBorder( BorderFactory.createTitledBorder("Title"));
		lbl6 =new JLabel("TiltleBorder(right)");
		lbl6.setBorder(right= BorderFactory.createTitledBorder("Title"));
		 ((TitledBorder) right).setTitleJustification(TitledBorder.RIGHT);
		lbl7 =new JLabel("Compoud Border");
		color = BorderFactory.createLineBorder(Color.BLUE,2);
		lbl7.setBorder(color= BorderFactory.createCompoundBorder( color,etche));
		lbl8 =new JLabel("MatterBorder ");
		lbl8.setBorder( BorderFactory.createMatteBorder(2, 6, 2, 2, Color.red));
		
	   p.add(lbl1);
	   p.add(lbl2);
	   p.add(lbl3);
	   p.add(lbl4);
	   p.add(lbl5);
	   p.add(lbl6);
	   p.add(lbl7);
	   p.add(lbl8);
	   p.setLayout(new GridLayout(4,2));
	   
		
		this.add(p);
		}
	
	public  static  void main(String [] args) {
	 new NguyenVietAnh_19504781_BoderDemo().setVisible(true);
	}
	
	
}
