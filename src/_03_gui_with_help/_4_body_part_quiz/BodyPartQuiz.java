package _03_gui_with_help._4_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the recipe java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the recipe package(body_part_quiz), and change the names below.

	String firstImage = "src/_05_body_part_quiz/arnold.jpeg";
	String secondImage = "src/_05_body_part_quiz/leonardo.jpeg";
	String thirdImage = "src/_05_body_part_quiz/morgan.jpeg";
	String fourthImage = "src/_05_body_part_quiz/jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.setSize(500, 500);

		showNextImage();

	}

	private void startQuiz() {
		int score = 0;
		

		// 1. Make an int variable to hold the score.

		// 2. Set the size of the window in the initializeGui() method 

		// 4. Ask the user who this person is and store their answer
		String guess = JOptionPane.showInputDialog("who is this?");
		if(guess.equals("arnold")) {
			JLabel answer = new JLabel();
			answer.setText("You are correct");
			score +=1;
		}else {
			JLabel answer_1 = new JLabel();
			answer_1.setText("Wrong! It is Arnold");
		}
		

		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1

		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is

		// 7. Use the showNextImage() method below to get the next image
		showNextImage();
		if(guess.equals("leonardo")){
			JLabel answer_2 = new JLabel();
			answer_2.setText("You are correct");
			score +=1;
		}else {
			JLabel answer_3 = new JLabel();
			answer_3.setText("You are wrong!It is Leonardo");
		}
		showNextImage();
		if(guess.equals("morgan")){
			JLabel answer_4 = new JLabel();
			answer_4.setText("You are correct");
			score +=1;
		}else {
			JLabel answer_5 = new JLabel();
			answer_5.setText("You are wrong!It is Morgan");
		}
		showNextImage();
		if(guess.equals("jack")){
			JLabel answer_6 = new JLabel();
			answer_6.setText("You are correct");
			score +=1;
		}else {
			JLabel answer_7 = new JLabel();
			answer_7.setText("You are wrong!It is Jack");
		}

		// 8. .... repeat 4-7 for all your images.....

		// 9. Show them their current score

	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();

		return new JLabel("No more images");
	}
}