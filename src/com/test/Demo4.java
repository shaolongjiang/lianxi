package com.test;

import javax.swing.*;
import java.awt.*;

public class Demo4 extends JFrame{

	JPanel jp1,jp2;
	JLabel jlb1,jlb2;
	JComboBox jcb1;
	JList jlist;
	JScrollPane jsp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo4 demo4=new Demo4();
	}
	public Demo4() {
		jp1=new JPanel();
		jp2=new JPanel();
		jlb1=new JLabel("��ļ��᣺");
		jlb2=new JLabel("��ϲ�����εĵط�:");
		String []jg= {"����","���","����","ͭ��"};
		jcb1=new JComboBox(jg);
		String []dd= {"�ʹ�","��˹ų�","�żҽ�"};
		jlist=new JList(dd);
		//ϣ����ʾ����ѡ��
		jlist.setVisibleRowCount(2);
		jsp=new JScrollPane(jlist);
	
		
		this.setLayout(new GridLayout(3,1));
		jp1.add(jlb1);
		jp1.add(jcb1);
		jp2.add(jlb2);
		jp2.add(jsp);
		this.add(jp1);
		this.add(jp2);
		this.setSize(200,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
