/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniela.miles311
 */
import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame
{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
	public SimpleWindow()
	{
		setSize(WIDTH,HEIGHT);
		Container contentPane = getContentPane();
		JLabel label = new JLabel("Daniela Miles.");
		contentPane.add(label);
		contentPane.setBackground(Color.CYAN);
		addWindowListener(new WindowDestroyer());
	}

	public static void main(String[] args)
	{
		SimpleWindow window = new SimpleWindow();
		window.setVisible(true);
	}
}
