import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game {
    JFrame window;
    Container con;
    JPanel GameTitlePanel , startButtonPanel, mainTextPanel,choiceButtonPanel,playerPanel,imagePanel;
    JLabel Gametitle,hpLabel, hpLabelNumber,weaponLabel,weaponLabelName,imageLabel;
    JButton startButton,choice1,choice2,choice3,choice4;
    JTextArea mainTextArea;
    int playerHp,monsterHp;
    String weapon,position;
    boolean silverRing=false;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,90);
    Font normalFont = new Font("Times New Roman",Font.PLAIN,28);
    ImageIcon image;
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();


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
     startButton.setFocusPainted(false);

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
       mainTextPanel.setBounds(50,350,430,250);
       mainTextPanel.setBackground(Color.BLACK);
       con.add(mainTextPanel);

       mainTextArea = new JTextArea();
       mainTextArea.setBounds(50,350,430,250);
       mainTextArea.setBackground(Color.BLACK);
       mainTextArea.setForeground(Color.WHITE);
       mainTextArea.setFont(normalFont);
       mainTextArea.setLineWrap(true); // If text is too long then it gets wrapped or line breaks automatically
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(500,350,250,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);


        choice1 = new JButton("Talk to Guard.");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choiceButtonPanel.add(choice1);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");


        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");

        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choiceButtonPanel.add(choice3);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");

        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.BLACK);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choiceButtonPanel.add(choice4);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");

        playerPanel = new JPanel();
        playerPanel.setBounds(500,100,270,50);
        playerPanel.setBackground(Color.BLACK);
        playerPanel.setLayout(new GridLayout(2,2));
        con.add(playerPanel);
        hpLabel = new JLabel("HP:");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.WHITE);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.WHITE);
        playerPanel.add(hpLabelNumber);
        weaponLabel = new JLabel("Weapon:");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(Color.WHITE);
        playerPanel.add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(normalFont);
        weaponLabelName.setForeground(Color.WHITE);
        playerPanel.add(weaponLabelName);

        imagePanel = new JPanel();
        imagePanel.setBounds(50,50,400,300);
        imagePanel.setBackground(Color.BLACK);

        imageLabel = new JLabel();

        image = new ImageIcon("C://Users//AMIT//IdeaProjects//Adventure//res//towngate.jpg");

        imageLabel.setIcon(image);
        imagePanel.add(imageLabel);
        con.add(imagePanel);
        playerSetup();


    }

    public void playerSetup()
    {
        playerHp =15;
        monsterHp = 20;
        weapon="Knife";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText(""+playerHp);
        townGate();
    }

    public void townGate()
    {
        image = new ImageIcon("C://Users//AMIT//IdeaProjects//Adventure//res//towngate.jpg");

        imageLabel.setIcon(image);
        position="townGate";
        mainTextArea.setText("You are at the Gate of the TOWN.\nA guard is standing at front of you. \nWhat do you do?");
        choice1.setText("Talk To Guard");
        choice2.setText("Attack The Guard");
        choice3.setText("Leave");
        choice4.setText("");
    }

    public void talkGuard()
    {
        image = new ImageIcon("C://Users//AMIT//IdeaProjects//Adventure//res//townguard.jpg");

        imageLabel.setIcon(image);
        position = "talkGuard";
        mainTextArea.setText("Guard: Hello Stranger! I have never seen you around.\nSorry I cannot let a stranger enter the town.");
        choice1.setText("Leave");
        choice2.setText("");
        choice3.setText("");
    }

    public void attackGuard()
    {
        image = new ImageIcon("C://Users//AMIT//IdeaProjects//Adventure//res//guardat.png");
        imageLabel.setIcon(image);

        position = "attackGuard";
        mainTextArea.setText("Guard: Hey! Don't be stupid!\n\nThe Guard fought back and hit you hard.\n(You recieved 3 damage)");
        playerHp-=3;
        hpLabelNumber.setText(""+playerHp);
        choice1.setText("Leave");
        choice2.setText("");
        choice3.setText("");
    }

    public void crossRoad()
    {
        image = new ImageIcon("C://Users//AMIT//IdeaProjects//Adventure//res//crossroads.jpg");
        imageLabel.setIcon(image);


        position = "crossRoad";
        mainTextArea.setText("You are at a cross road.\nIf you go South you can reach back Town.");
        choice1.setText("NORTH");
        choice2.setText("SOUTH");
        choice3.setText("EAST");
        choice4.setText("WEST");
    }
    public void north()
    {
        image = new ImageIcon("C://Users//AMIT//IdeaProjects//Adventure//res//heal.jpg");
        imageLabel.setIcon(image);

     position = "north";
     mainTextArea.setText("There is a river.\n You drink the water and rest at riverside.\n(Your HP is healed)");
     playerHp+=3;
     hpLabelNumber.setText(""+playerHp);
     choice1.setText("SOUTH");
     choice2.setText("");;
     choice3.setText("");
     choice4.setText("");
    }
    public void east()
    {
        image = new ImageIcon("C://Users//AMIT//IdeaProjects//Adventure//res//longswords.jpg");
        imageLabel.setIcon(image);

        position = "east";
        mainTextArea.setText("You walked into a Forest and Found a Long Sword.\n\n (You Obtaine A LONG SWORD!!");
        weapon = "Long Sword";
        weaponLabelName.setText(weapon);
        choice1.setText("CROSS ROAD");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void west()
    {
        image = new ImageIcon("C://Users//AMIT//IdeaProjects//Adventure//res//Goblin.jpg");
        imageLabel.setIcon(image);

     position = "west";
     mainTextArea.setText("You Encounter a Goblin!");
     choice1.setText("FIGHT!!");
     choice2.setText("RUN");
     choice3.setText("");
     choice4.setText("");
    }
    public void fight()
    {
        position = "fight";
        mainTextArea.setText("MONSTER HP: "+monsterHp+ "\n\n What Do you do?");
        choice1.setText("ATTACK");
        choice2.setText("RUN");
        choice3.setText("");
        choice4.setText("");
    }
    public void playerAttack()
    {
        position = "playerAttack";
        int playerDamage = 0;
        if(weapon.equalsIgnoreCase("Knife")) {
            playerDamage = new java.util.Random().nextInt(3);//damage between 0,1,2
        }
        else if(weapon.equalsIgnoreCase("Long Sword"))
        {
            playerDamage = new java.util.Random().nextInt(5);//damage between 0,1,2,3,4
        }

        mainTextArea.setText("You attacked the Monster and gave "+playerDamage + "damage!");

        monsterHp-=playerDamage;
        choice1.setText("<");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }
    public void monsterAttack()
    {
        position = "monsterAttack";
        int monsterDamage = 0;

        monsterDamage = new java.util.Random().nextInt(4);

        mainTextArea.setText("Monster Attacked You and gave you "+monsterDamage+" damage!");

        playerHp-=monsterDamage;
        hpLabelNumber.setText(""+playerHp);
        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }
    public void win()
    {
        position="win";
        mainTextArea.setText("You Defeated the Monster!\n\n The Monster dropped a ring.\n\n(You Obtained a SILVER RING!");
        silverRing=true;

        choice1.setText("EAST");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void lose()
    {
        position = "lose";
        mainTextArea.setText("YOU ARE DEAD!!!!!!\n\nGAME OVER!");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }
    public void ending(){
        position= "end";
        mainTextArea.setText("Guard: Oh! You killed the Goblin. You are a true warrior.\n\n WELCOME TO OUR TOWN!\n\n THE END>>>>>>>");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);

    }




    public class TitleScreenHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
           createGameScreen();

        }

    }

    public class ChoiceHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String yourChoice = event.getActionCommand();
            switch(position)
            {
                case "townGate":
                    switch(yourChoice){
                        case "c1":
                            if(silverRing)
                            {
                                ending();
                            }else {
                                talkGuard();
                            }
                            break;
                        case "c2": attackGuard();break;
                        case "c3": crossRoad();break;
                    }
                    break;
                case "talkGuard":
                    switch(yourChoice){
                        case "c1": townGate(); break;
                    }
                    break;
                case "attackGuard":
                    switch(yourChoice){
                        case "c1" : townGate();break;
                    }
                    break;
                case "crossRoad":
                    switch(yourChoice){
                        case "c1" : north();break;
                        case "c2" : townGate();break;
                        case "c3" : east();break;
                        case "c4" : west();break;
                    }
                    break;
                case "north":
                    switch(yourChoice){
                        case "c1" : crossRoad();break;
                        //case "c2" : townGate();break;
                        //case "c3" : east();break;
                    }
                    break;
                case "east":
                    switch(yourChoice){
                        case "c1" : crossRoad();break;

                    }
                    break;
                case "west":
                    switch(yourChoice){
                        case "c1" : fight();break;
                        case "c2" : crossRoad();break;
                    }
                    break;
                case "fight":
                    switch(yourChoice){
                        case "c1" : playerAttack();break;
                        case "c2" : crossRoad();break;
                    }
                    break;
                case "playerAttack":
                    switch(yourChoice){
                        case "c1" :
                            if(monsterHp<1)
                            {
                                win();
                            }
                            else {
                                monsterAttack();
                            }
                    }
                    break;
                case "monsterAttack":
                    switch(yourChoice){
                        case "c1" :
                            if(playerHp<1)
                            {
                                lose();
                            }
                            else{
                                fight();
                            }break;
                    }
                    break;
                case "win":
                    switch(yourChoice){
                        case "c1" : crossRoad();break;
                    }
                    break;


            }

        }
    }




}