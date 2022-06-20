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
		//创建组件
		jb1=new JButton("中部");
		jb2=new JButton("北部");
		jb3=new JButton("南部");
		jb4=new JButton("西部");
		jb5=new JButton("东部");
		//添加组件
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.SOUTH);
		this.add(jb4,BorderLayout.WEST);
		this.add(jb5,BorderLayout.EAST);
		//设置窗体属性
		this.setTitle("边界布局");
		this.setSize(300,200);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//显示窗体
		this.setVisible(true);
	}
}
