//package calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CalculatorFrame extends JFrame {
	
	/**
	 * Ritish Bajaj
	 * calculator program
	 */
	private static final long serialVersionUID = 1L;
	
	//declaring and initializing string variables
	String firstValue = "";
	String secondValue = "";
	String[] values;
	String equation;
	String second;
	
	//declaring and intializing double variables which are used for calculations 
	double firstNumber = 0;
	double secondNumber = 0;
	double totalNumber = 0;
	
	//declaring and initializing string variable
	String total = "";
	
	//declaring private variable for initial width of the frame
	private static final int FRAME_WIDTH = 250;
	
	//creating new class to devlop and create the actual virtual calculator
	public CalculatorFrame() {
		
		//creating a button panel of 2 rows and 1 column 
		JPanel buttonPanel2 = new JPanel();
		buttonPanel2.setLayout(new GridLayout(1, 2));
		//setting size of the panel
		buttonPanel2.setPreferredSize(new Dimension(FRAME_WIDTH,50));
		//initializing/creating buttons on the panel and labeling them
	    JButton clearLast = new JButton("Clear Last");
	    JButton clearAll = new JButton("Clear All");
	    //adding the button panel to the frame
	    buttonPanel2.add(clearLast);
        buttonPanel2.add(clearAll);

		//creaitng a text area with fixed dimensions
        JTextArea display = new JTextArea(FRAME_WIDTH,200);
        
        //creating a scrollpane and wrapping it with the display
        JScrollPane scrollPane = new JScrollPane(display);
        
        //creating a new panel
        JPanel txtPanel = new JPanel();


        //giving the txtpanel a new layout and adding the scrollpane and text area
        txtPanel.setLayout(new BorderLayout());
        txtPanel.setPreferredSize(new Dimension(FRAME_WIDTH, 300));
        txtPanel.add(scrollPane);
		
		
		
		//Making another button panel for numbers and operators
		JPanel buttonPanel = new JPanel();
		//creating a 4 by 4 grid layout
		buttonPanel.setLayout(new GridLayout(4, 4));
		buttonPanel.setPreferredSize(new Dimension(FRAME_WIDTH,300));

		//declaring and labeling the buttons
		JButton button0 = new JButton("0");
	    JButton button1 = new JButton("1");
	    JButton button2 = new JButton("2");
	    JButton button3 = new JButton("3");
	    JButton button4 = new JButton("4");
	    JButton button5 = new JButton("5");
	    JButton button6 = new JButton("6");
	    JButton button7 = new JButton("7");
	    JButton button8 = new JButton("8");
	    JButton button9 = new JButton("9");
	    JButton buttonEqual = new JButton("=");
	    JButton buttonDecimal = new JButton(".");
	    JButton buttonDivide = new JButton("/");
	    JButton buttonMultply = new JButton("*");
	    JButton buttonMinus = new JButton("-");
	    JButton buttonAdd = new JButton("+");

	    //adding buttons to frame
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonAdd);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonMultply);
        buttonPanel.add(button0);
        buttonPanel.add(buttonDecimal);
        buttonPanel.add(buttonEqual);
        buttonPanel.add(buttonDivide);
		
        //adding the button panels, txtpanel to the frame
		add(buttonPanel2, BorderLayout.NORTH);
		add(txtPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		//setting frame size
		setSize(FRAME_WIDTH*2, 700);
		
		//creating buttons to function and display
		//Corresponding numbers according to buttons
		button0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				//adds the string to the text area/display
				display.append("0");
			}
		});	
		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("1");
			}
		});	
		
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("2");
			}
		});	
		
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("3");
			}
		});	
		
		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("4");
			}
		});	
		
		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("5");
			}
		});	
		
		button6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("6");
			}
		});	
		
		button7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("7");
			}
		});	
		
		button8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("8");
			}
		});	
		
		button9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("9");
			}
		});	
		
		buttonAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				//appends a operator sign into text box
				display.append("+");
				
				//goes to next line when operator is used
				display.append("\n");
			}
		});	
		
		buttonDecimal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append(".");
			}
		});	
		
		buttonDivide.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("/");
				display.append("\n");
			}
		});	
		
		buttonMinus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("-");
				display.append("\n");
			}
		});	
		
		buttonMultply.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("*");
				display.append("\n");
			}
		});	
		
		buttonEqual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.append("=");
                
				
			 if(display.getText().contains("+")){
				 
                 //splitting when an operator is used
				 values = display.getText().split("\\+");
                
				 //assigning array element values to string variables
                 firstValue = values[0];
                 second = values[1];
                 
                 //checking for how many decimals are used, if too many an error will be sent
                 int counter = 0;
                 for( int i=0; i<firstValue.length(); i++ ) {
                     if( firstValue.charAt(i) == '.' ) {
                         counter++;
                         if(counter>1) {
                         	display.setText("Too many decimals, please run program again");
                         }
                     } 
                 }
                 for( int i=0; i<second.length(); i++ ) {
                     if( second.charAt(i) == '.' ) {
                         counter++;
                         if(counter>1) {
                         	display.setText("Too many decimals, please run program again");
                         }
                     } 
                 }
                
                 //takes out the equals sign in the getText string
                 secondValue = second.replace("=", "");
                 
                 //parses strings into double
                 firstNumber = Double.parseDouble(firstValue);
                 secondNumber = Double.parseDouble(secondValue);
                 
                 //does calculation using double variables 
                 totalNumber = firstNumber + secondNumber;
                 
                 //parses double into string variable
                 total = Double.toString(totalNumber);
                
                 //displays total in textarea
                 display.setText(total);
                 
             	}
			 
			 else if(display.getText().contains("-")){
		            values = display.getText().split("\\-");
		           
		            firstValue = values[0];
		            second = values[1];
		            
		            int counter = 0;
	                 for( int i=0; i<firstValue.length(); i++ ) {
	                     if( firstValue.charAt(i) == '.' ) {
	                         counter++;
	                         if(counter>1) {
	                         	display.setText("Too many decimals, please run program again");
	                         }
	                     } 
	                 }
	                 for( int i=0; i<second.length(); i++ ) {
	                     if( second.charAt(i) == '.' ) {
	                         counter++;
	                         if(counter>1) {
	                         	display.setText("Too many decimals, please run program again");
	                         }
	                     } 
	                 }
		            
		            secondValue = second.replace("=", "");
		            
		            firstNumber = Double.parseDouble(firstValue);
		            secondNumber = Double.parseDouble(secondValue);
		           
		            totalNumber = firstNumber - secondNumber;
		           
		            total = Double.toString(totalNumber);
		           
		            display.setText(total);
				}
			 
			 else if(display.getText().contains("*")){
		            values = display.getText().split("\\*");
		           
		            firstValue = values[0];
		            second = values[1];
		            
		            int counter = 0;
		            
	                 for( int i=0; i<firstValue.length(); i++ ) {
	                     if( firstValue.charAt(i) == '.' ) {
	                         counter++;
	                         if(counter>1) {
	                         	display.setText("Too many decimals, please run program again");
	                         }
	                     } 
	                 }
	                 
	                 for( int i=0; i<second.length(); i++ ) {
	                     if( second.charAt(i) == '.' ) {
	                         counter++;
	                         if(counter>1) {
	                         	display.setText("Too many decimals, please run program again");
	                         }
	                     } 
	                 }
		            
		            secondValue = second.replace("=", "");
		            
		            firstNumber = Double.parseDouble(firstValue);
		            secondNumber = Double.parseDouble(secondValue);
		           
		            totalNumber = firstNumber * secondNumber;
		           
		            total = Double.toString(totalNumber);
		           
		            display.setText(total);
				}
			 
			 else if(display.getText().contains("/")){
		            values = display.getText().split("\\/");
		           
		            firstValue = values[0];
		            second = values[1];
		            
		            int counter = 0;
	                 for( int i=0; i<firstValue.length(); i++ ) {
	                     if( firstValue.charAt(i) == '.' ) {
	                         counter++;
	                         if(counter>1) {
	                         	display.setText("Too many decimals, please run program again");
	                         }
	                     } 
	                 }
	                 for( int i=0; i<second.length(); i++ ) {
	                     if( second.charAt(i) == '.' ) {
	                         counter++;
	                         if(counter>1) {
	                         	display.setText("Too many decimals, please run program again");
	                         }
	                     } 
	                 }
		            
		            secondValue = second.replace("=", "");
		            
		            firstNumber = Double.parseDouble(firstValue);
		            secondNumber = Double.parseDouble(secondValue);
		           
		            //checking for 0 as divisor
		            if(secondNumber == 0) {
		            	display.setText("WARNING: division by zero is not possible");
		            }
		            
		            else {
		            totalNumber = firstNumber / secondNumber;
		           
		            total = Double.toString(totalNumber);
		           
		            display.setText(total);
		            }
				}
			}		
		});
		
		clearAll.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				display.setText("");
			}
		});	
		
		clearLast.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				//declaring int variable given the value of how many character are needed to clear
				int numberOfCharsToRemove = 1;
				
				//declaring string variable which is given the value of the text area
				String current = display.getText();
				
				//deleting the last character's of the string retrieved from text area
				String currentMinus = current.substring(0,current.length()-numberOfCharsToRemove);
				
				//sets the new updated text area without last character
				display.setText(currentMinus);
			}
		});
	}
}


