package BTVN_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class NguyenVietAnh_19504781_PushCounter extends JFrame implements ActionListener {
	private JPanel p;
	private JButton btnPush;
	private JLabel lblPush;
	private int n;
	public  NguyenVietAnh_19504781_PushCounter() {
	
	setTitle("Push Counter");
	setSize(400,300);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	n=0;
	p= new JPanel();
	lblPush= new JLabel("Pushes:"+ n);
	btnPush =new JButton("Push me");
	btnPush.addActionListener(this);
	
	p.add(btnPush);
	p.add(lblPush);
	this.add(p);
	
	
	
	
	
	}
	public  static  void main(String [] args) {
		 new NguyenVietAnh_19504781_PushCounter().setVisible(true);
	 }
	@Override
	public void actionPerformed(ActionEvent e) {

//		Object obj= e.getSource();
//		if(obj.equals(btnPush)) {
		    n++;
			lblPush.setText("Pushes: " +n);
			
		
		
	}
	

}
