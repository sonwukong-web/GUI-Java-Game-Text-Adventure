import javax.swing.*;
import java.awt.*;

public class Game {
    JFrame window;
    Container con;
    JPanel GameTitlePanel , startButtonPanel;
    JLabel Gametitle;
    JButton startButton;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,90);
    Font normalFont = new Font("Times New Roman",Font.PLAIN,30);
    public static void main(String[] args) {
        new Game();
    }
    public Game()
    {
      window = new JFrame();
      window.setSize(800,600); //Setting Size of window
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //To close JFrame instance window on clicking close otherwise the window will close but program will keep on running
      window.getContentPane().setBackground(Color.black);
      window.setLayout(null); //Disable default layout of Window
      window.setVisible(true); // To make window appear on screen
      con = window.getContentPane();

      GameTitlePanel = new JPanel();
      Gametitle = new JLabel("ADVENTURE");
      GameTitlePanel.setBounds(100,100,600,150); //creating a container for Title on Jpanel
      GameTitlePanel.setBackground(Color.BLACK);
      Gametitle.setForeground(Color.WHITE);
      Gametitle.setFont(titleFont);

     startButtonPanel = new JPanel();
     startButtonPanel.setBounds(300,400,200,100);
     startButtonPanel.setBackground(Color.BLACK);

     startButton = new JButton("START");
     startButton.setBackground(Color.BLACK);
     //startButton.setBorder(null);
     startButton.setForeground(Color.WHITE);
     startButton.setFont(normalFont);

     GameTitlePanel.add(Gametitle);
     startButtonPanel.add(startButton);
     con.add(GameTitlePanel);  // Window base, then on top of it Container, then on Top of it JPanel
        con.add(startButtonPanel);
    }

}