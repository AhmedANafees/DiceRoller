
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author nafea8846
 */
public class DiceRoller  implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
  JLabel label;
  JTextField result;
  JButton d4;
  JButton d6;
  JButton d8;
  JButton d10;
  JButton d12;
  JButton d20;

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Dice Roller");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(400, 380);
    // shows the window
    frame.setVisible(true);

    mainPanel = new JPanel();
    mainPanel.setLayout(null);
    
    label = new JLabel("Roll: ");
    label.setBounds(175, 150, 100, 50);
    
    result = new JTextField();
    result.setBounds(225, 150, 100, 50);
    
    d4 = new JButton("4 Sides");
    d4.setBounds(50, 25, 100, 50);
    d4.addActionListener(this);
    d4.setActionCommand("d4");
    
    d6 = new JButton("6 Sides");
    d6.setBounds(50, 75, 100, 50);
    d6.addActionListener(this);
    d6.setActionCommand("d6");    
    
    d8 = new JButton("8 Sides");
    d8.setBounds(50, 125, 100, 50);
    d8.addActionListener(this);
    d8.setActionCommand("d8");
    
    d10 = new JButton("10 Sides");
    d10.setBounds(50, 175, 100, 50);
    d10.addActionListener(this);
    d10.setActionCommand("d10");
    
    d12 = new JButton("12 Sides");
    d12.setBounds(50, 225, 100, 50);
    d12.addActionListener(this);
    d12.setActionCommand("d12");    
    
    d20 = new JButton("20 Sides");
    d20.setBounds(50, 275, 100, 50);
    d20.addActionListener(this);
    d20.setActionCommand("d20");
    
    mainPanel.add(d20);
    mainPanel.add(d12);
    mainPanel.add(d10);
    mainPanel.add(d8);
    mainPanel.add(d6);
    mainPanel.add(d4);
    mainPanel.add(result);
    mainPanel.add(label);
    frame.add(mainPanel);
  }
  
  public static int roller (int num1, int num2)
  {
  int lowest = num1;
    int highest = num2;
    int randomNumber = (int)(Math.random( )*(highest-lowest+1) + lowest);

  return randomNumber;
  }
  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
    if (command.equals("d4"))
    {
    int roll = roller(1,4);
    result.setText(" " + roll);
    }
    if (command.equals("d6"))
    {
    int roll = roller(1,6);
    result.setText(" " + roll);
    }
    if (command.equals("d8"))
    {
    int roll = roller(1,8);
    result.setText(" " + roll);
    }
    if (command.equals("d10"))
    {
    int roll = roller(1,10);
    result.setText(" " + roll);
    }
    if (command.equals("d12"))
    {
    int roll = roller(1,12);
    result.setText(" " + roll);
    }
    
    if (command.equals("d20"))
    {
    int roll = roller(1,20);
    result.setText(" " + roll);
    }
        }
  

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    DiceRoller  gui = new DiceRoller ();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}

