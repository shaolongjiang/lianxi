//网格布局
package com.test;
import java.awt.*;
import javax.swing.*;
public class Demo1 extends JFrame {

	//定义组件
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
		//设置网格布局
		this.setLayout(new GridLayout(3,3,10,10));
		//添加组件
		for(int i=0;i<9;i++)
		{
			this.add(jbs[i]);		}
		//设置窗体属性
		this.setTitle("网格布局");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,200);
		this.setVisible(true);
	}
}