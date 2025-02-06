import javax.swing.*;
import java.awt.*;

public class Game {
    JFrame window;
    Container con;
    JPanel GameTitlePanel;
    JLabel Gametitle;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,90);
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
      GameTitlePanel.setBackground(Color.BLUE);
      Gametitle.setForeground(Color.WHITE);
      Gametitle.setFont(titleFont);
      GameTitlePanel.add(Gametitle);
      con.add(GameTitlePanel);  // Window base, then on top of it Container, then on Top of it JPanelGameTitlePanel.add(Gametitle);


    }

}