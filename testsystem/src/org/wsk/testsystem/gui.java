package org.wsk.testsystem;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class gui extends JFrame{
	public void createfarm(){
		JFrame jf = new JFrame("考试系统");
		Container con = jf.getContentPane();
		JButton jb = new JButton("开始");
		con.add(jb);
		jb.setHorizontalAlignment(SwingConstants.CENTER);
		con.setBackground(Color.white);
		jf.setSize(300, 250);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		class event implements ActionListener{
			public void actionPerformed(ActionEvent arg0){
				
			}
			
		}
			
		
	}

}
