//复选框和单选框
package com.test;
import java.awt.*;
import javax.swing.*;
public class Demo3 extends JFrame{

	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	JCheckBox jcb1,jcb2,jcb3;
	JRadioButton jrb1,jrb2;
	ButtonGroup gb;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo3 demo3=new Demo3();
	}

	public Demo3() {
		//创建组件
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jlb1=new JLabel("你喜欢的运动：");
		jlb2=new JLabel("你的性别：");
		jb1=new JButton("注册");
		jb2=new JButton("取消注册");
		jcb1=new JCheckBox("足球");
		jcb2=new JCheckBox("蓝球");
		jcb3=new JCheckBox("羽毛球");
		jrb1=new JRadioButton("男");
		jrb2=new JRadioButton("女");
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		
		this.setLayout(new GridLayout(3,1));
		jp1.add(jlb1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp2.add(jlb2);
		jp2.add(jrb1);
		jp2.add(jrb2);
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
