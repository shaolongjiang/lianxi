package com.test;

import java.awt.*;
import javax.swing.*;
public class Demo extends JFrame{

	JButton jb1,jb2,jb3,jb4,jb5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo=new Demo();
	}

	public Demo()
	{
		//�������
		jb1=new JButton("�в�");
		jb2=new JButton("����");
		jb3=new JButton("�ϲ�");
		jb4=new JButton("����");
		jb5=new JButton("����");
		//������
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.SOUTH);
		this.add(jb4,BorderLayout.WEST);
		this.add(jb5,BorderLayout.EAST);
		//���ô�������
		this.setTitle("�߽粼��");
		this.setSize(300,200);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ʾ����
		this.setVisible(true);
	}
}
