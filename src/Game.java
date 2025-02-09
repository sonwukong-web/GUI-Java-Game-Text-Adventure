import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    JFrame window;
    Container con;
    JPanel GameTitlePanel , startButtonPanel, mainTextPanel,choiceButtonPanel;
    JLabel Gametitle;
    JButton startButton,choice1,choice2,choice3,choice4;
    JTextArea mainTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,90);
    Font normalFont = new Font("Times New Roman",Font.PLAIN,30);
    TitleScreenHandler tsHandler = new TitleScreenHandler();

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
     startButton.addActionListener(tsHandler);

     GameTitlePanel.add(Gametitle);
     startButtonPanel.add(startButton);
     con.add(GameTitlePanel);  // Window base, then on top of it Container, then on Top of it JPanel
        con.add(startButtonPanel);
    }

    public void createGameScreen()
    {
        startButtonPanel.setVisible(false);
        GameTitlePanel.setVisible(false);
       mainTextPanel = new JPanel();
       mainTextPanel.setBounds(100,100,600,250);
       mainTextPanel.setBackground(Color.BLUE);
       con.add(mainTextPanel);

       mainTextArea = new JTextArea("This is main text area and The game is going to be great!");
       mainTextArea.setBounds(100,100,600,250);
       mainTextArea.setBackground(Color.BLACK);
       mainTextArea.setForeground(Color.WHITE);
       mainTextArea.setFont(normalFont);
       mainTextArea.setLineWrap(true); // If text is too long then it gets wrapped or line breaks automatically
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);

        choice2 = new JButton("Choice 3");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);

        choice2 = new JButton("Choice 4");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);
    }

    public class TitleScreenHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {
           createGameScreen();
        }
    }

}