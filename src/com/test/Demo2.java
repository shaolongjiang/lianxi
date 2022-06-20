package com.test;

import java.awt.*;
import javax.swing.*;
public class Demo2 extends JFrame{

	//定义组件
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	JTextField jtf1;
	JPasswordField jpf1;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo2 demo2=new Demo2();
		
	}
	//构造函数
	public Demo2() {
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jlb1=new JLabel("用户名");
		jlb2=new JLabel("密 码");
		jb1=new JButton("登陆");
		jb2=new JButton("重置");
		
		jtf1=new JTextField(10);
		jpf1=new JPasswordField(10);
		
		//设置布局管理
		this.setLayout(new GridLayout(3,1));
		//加入组件
		jp1.add(jlb1);
		jp1.add(jtf1);
		jp2.add(jlb2);
		jp2.add(jpf1);
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
