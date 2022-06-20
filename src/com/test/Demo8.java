//记事本界面
package com.test;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Demo8 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Demo8();
	}

	JMenuBar jmb;//菜单条组件
	JMenu menu1,menu2,menu3,menu4,menu5;
	JMenuItem item2,item3,item4,item5,item6,item7;
	JMenu xinjian;//二级菜单
	JMenuItem file,project;
	JTextArea jta;
	//工具条
	JToolBar jtb;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public Demo8() {
		jtb=new JToolBar();
		jb1=new JButton(new ImageIcon("images/new.png"));
		jb1.setToolTipText("新建");
		jb2=new JButton(new ImageIcon("images/notepad.jpg"));
		jb2.setToolTipText("打开");
		jb3=new JButton(new ImageIcon("images/notepad.jpg"));
		jb4=new JButton(new ImageIcon("images/notepad.jpg"));
		jb5=new JButton(new ImageIcon("images/notepad.jpg"));
		jb6=new JButton(new ImageIcon("images/notepad.jpg"));
		
		jmb=new JMenuBar();
		
		menu1=new JMenu("文件（F）");
		menu1.setMnemonic('F');
		menu2=new JMenu("编辑（E）");
		menu2.setMnemonic('E');
		menu3=new JMenu("格式（o）");
		menu3.setMnemonic('o');
		menu4=new JMenu("查看（v)");
		menu4.setMnemonic('V');
		menu5=new JMenu("帮助(H)");
		menu5.setMnemonic('H');
		
		xinjian=new JMenu("新建");
		file=new JMenuItem("文件");
		project=new JMenuItem("工程");
		
		item2=new JMenuItem("打开",new ImageIcon("new.png"));
		item3=new JMenuItem("保存(s)");
		item3.setMnemonic('s');
		item4=new JMenuItem("另存为");
		item5=new JMenuItem("页面设置");
		item6=new JMenuItem("打印");
		item7=new JMenuItem("退出");
		jta=new JTextArea();
		
		jtb.add(jb1);
		jtb.add(jb2);
		jtb.add(jb3);
		jtb.add(jb4);
		jtb.add(jb5);
		jtb.add(jb6);
		
		xinjian.add(file);
		xinjian.add(project);
		
		menu1.add(xinjian);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		menu1.addSeparator();
		menu1.add(item5);
		menu1.add(item6);
		menu1.addSeparator();
		menu1.add(item7);
		
		jmb.add(menu1);
		jmb.add(menu2);
		jmb.add(menu3);
		jmb.add(menu4);
		jmb.add(menu5);
		
		this.setJMenuBar(jmb);
		
		this.add(jtb,BorderLayout.NORTH);
		JScrollPane jsp=new JScrollPane(jta);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(jsp);
		this.setTitle("记事本");
		ImageIcon icon=new ImageIcon("images/notepad.jpg");
		this.setIconImage(icon.getImage());
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
