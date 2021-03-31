package BTVN_1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Eruka.NguyenVietAnh_1950481_Demo2;

public class NguyenVietAnh_19504781_ChuyenDoi extends JFrame implements KeyListener{
	private JLabel lblDoF;
	private JTextField txtDoF;
	private JLabel lblDoC;
	private JButton btnEx;
	private double f,c;
	
	public  NguyenVietAnh_19504781_ChuyenDoi() {
		setTitle("Fahrenheit");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Box b,b1,b2;
		
		b = Box.createVerticalBox();
		b1 =Box.createHorizontalBox();
		b2 =Box.createHorizontalBox();

		
		lblDoF =new JLabel("Enter Fahrenheit temperature ");
		txtDoF =new JTextField(20);
		txtDoF.addKeyListener(this);
		lblDoC =new JLabel("Temperature in Celsius:");
//		btnEx =new JButton("Exchange");
//		btnEx.addActionListener(this);
		b1.add(lblDoF);
		b1.add(txtDoF);
		b2.add(lblDoC);
	
		b.add(b1);
		b.add(b2);
	
		
		this.add(b,BorderLayout.NORTH);
		}

public  static  void main(String [] args) {
		 new NguyenVietAnh_19504781_ChuyenDoi().setVisible(true);
	 }

	@Override
	public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
//		Object obj =e.getSource();
			f = Double.parseDouble(txtDoF.getText());
			c = (f-32)*5/9;
			lblDoC.setText("Temperature in Celsius:" +c);
			
		}
		
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}	


