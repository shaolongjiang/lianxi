//���񲼾�
package com.test;
import java.awt.*;
import javax.swing.*;
public class Demo1 extends JFrame {

	//�������
	JButton jbs[]=new JButton[9];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 demo1=new Demo1();
	}

	public Demo1() {
		for(int i=0;i<9;i++)
		{
			jbs[i]=new JButton(String.valueOf(i));
			
		}
		//�������񲼾�
		this.setLayout(new GridLayout(3,3,10,10));
		//������
		for(int i=0;i<9;i++)
		{
			this.add(jbs[i]);		}
		//���ô�������
		this.setTitle("���񲼾�");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,200);
		this.setVisible(true);
	}
}