//qq�������
package com.test;
import java.awt.*;
import javax.swing.*;
public class Demo6 extends JFrame{

	JTextArea jta=null;
	JScrollPane jsp=null;
	JPanel jp1=null;
	JComboBox jcb=null;
	JTextField jtf=null;
	JButton jb=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo6 demo6=new Demo6();
		
	}

	public Demo6() {
		jta=new JTextArea();
		jsp=new JScrollPane(jta);
		jp1=new JPanel();
		String []chatter= {"С��","С��"};
		jcb=new JComboBox(chatter);
		jtf=new JTextField(10);
		jb=new JButton("����");
		//���ò���
		//������
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);
		
		this.add(jsp);
		this.add(jp1,BorderLayout.SOUTH);
		this.setSize(300,300);
		this.setTitle("qq�������");
		this.setIconImage((new ImageIcon("images/picture2.jpg")).getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
