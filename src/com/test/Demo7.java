package com.test;
import java.awt.*;
import javax.swing.*;
public class Demo7 extends JFrame{

	//����
	JLabel jl1;
	//�ϲ�
	JButton jb1,jb2,jb3;
	JPanel jp1;
	//�в�
	JTabbedPane jtp;//ѡ�����
	JPanel jp2,jp3,jp4;
	
	JLabel jl2,jl3,jl4,jl5;
	//���������
	JTextField jtf;
	JPasswordField jpf;
	JButton jb4;
	JCheckBox jcb1,jcb2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo7 demo7=new Demo7();
	}

	public Demo7() {
		jl2=new JLabel("QQ�˺�",JLabel.CENTER);
		jl3=new JLabel("QQ����",JLabel.CENTER);
		jl4=new JLabel("�����˺�",JLabel.CENTER);
		jl4.setFont(new Font("����",Font.PLAIN,16));
		jl4.setForeground(Color.BLUE);
		jl5=new JLabel("<html><a href='www.qq.com'>�������뱣��</a>");
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		jtf=new JTextField();
		jpf=new JPasswordField();
		jb4=new JButton(new ImageIcon("�������"));
		//��ѡ��
		jcb1=new JCheckBox("�����½");
		jcb2=new JCheckBox("��ס����");
		
		jl1=new JLabel(new ImageIcon("images/picture1.jpg"));
		jl1.setSize(100,100);
		jp1=new JPanel();
		jb1=new JButton("��½");
		jb2=new JButton("ȡ��");
		jb3=new JButton("��");
		
		jtp=new JTabbedPane();
		jp2=new JPanel();
		jp3=new JPanel();
		jp3.setBackground(Color.RED);
		jp4=new JPanel();
		jp4.setBackground(new Color(0,0,225));
		
		jtp.add("qq����",jp2);
		jtp.add("�ֻ�����",jp3);
		jtp.add("��������",jp4);
		
		jp2.setLayout(new GridLayout(3,3));
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jp2.add(jl2);
		jp2.add(jtf);
		jp2.add(jb4);
		jp2.add(jl3);
		jp2.add(jpf);
		jp2.add(jl4);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jl5);
		
		this.add(jp1,BorderLayout.SOUTH);
		this.add(jl1,BorderLayout.NORTH);
		this.add(jtp,BorderLayout.CENTER);
		
		ImageIcon icon=new ImageIcon("images/picture2.jpg");
		this.setIconImage(icon.getImage());
		this.setSize(800,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
