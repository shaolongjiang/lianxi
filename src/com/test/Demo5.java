
package com.test;
import java.awt.*;
import javax.swing.*;
public class Demo5 extends JFrame{

	JSplitPane jsp;
	JList jlist;
	JLabel jl1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo5 demo5=new Demo5();
	}

	public Demo5() {
		String []words={"ab","cd","ef","de"};
		jlist=new JList(words);
		jl1=new JLabel(new ImageIcon("images/picture1.jpg"));
		//拆分窗格
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlist,jl1);
		//可以变化
		jsp.setOneTouchExpandable(true);
		//设置布局
		this.add(jsp);
		this.setSize(300,400);
		this.setLocation(300,300);
		this.setVisible(true);
		
	}
}
