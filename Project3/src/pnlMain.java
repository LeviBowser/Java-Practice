
import java.util.Arrays;
import java.util.Random;
import java.text.DecimalFormat;

//Levi Bowser
//Project 3
//Season generator
//The program uses specific teams who play each other twice, with the possibility of home field advantage
//the teams then play another set of teams outside the regular set, but only play those teams once. There
//is no homefield advantage for those games. The program creates objects of BasketballTeam and counts up the wins and the losses, and calculates
//the win/loss percentage while playing and stores everything in a BasketBallTeam object in an array to be used later.
//With the comparable<Team> implemented, it allows everything under that main class (with comparable values)
// to be sorted according to a specified attribute. In this case they are sorted according to wins. high 
//wins being the best. Then as its sorting, if it ever finds two teams that have a same win, it will 
//compare each teams name, as a string, and alphabitize them. When a team as a certain number of wins
//they are put in a status of march madness, NIT, or tell them see you next year.
//After the sort completes, the program references individual attributes to labels to be displayed in the order 
//the objects were put into. The exit button exits, the reset button clears all labels and the checkbox
//allows the user to decide if home field advantage is wanted for that current "season."


class Team implements Comparable<Team>{ //Here is the main class that uses the structure of Comparable<"Class">
    protected String sTeamName;
    protected int iWins = 0;
    protected int iLosses = 0; //attributes given protected statues to be used by the BasketballTeam class later.
    protected double dWinLossPct = 0; //i set attributes to 0 to avoid a "divide by 0" or "divide by null" error
    
    @Override //has to overide the initial method used in the comparable structure to be used non abstractly.
    public int compareTo(Team other) { //this moves the "other team" around and compares it to the current object
        if(other.iWins < this.iWins){ //compares using the wins as the variable
            return -1; //causes other team to be after this current "team." no switching needed.
        }
        else if(other.iWins > this.iWins){
            return 1; //causes other team to be before. switching needed.
        }
        
        return this.sTeamName.compareTo(other.sTeamName); //if the teams have equal wins, they are then compares using their team names
    }
    

    public String getsTeamName() { //a series of setters and getters for the attributes to be used later for display
        return sTeamName;
    }

    public void setsTeamName(String sTeamName) {
        this.sTeamName = sTeamName;
    }

    public int getiWins() {
        return iWins;
    }

    public void setiWins(int iWins) { //everytime the setiWins method is called it also calls the winloss method.
        this.iWins = iWins;
        setdWinLossPct(); //updates the winloss pct after each game.
    }

    public int getiLosses() {
        return iLosses;
    }

    public void setiLosses(int iLosses) { //same as above, except this time if they lose instead it affects the winloss
        this.iLosses = iLosses;
        setdWinLossPct();
    }

    public double getdWinLossPct() { //not used in this program, but availible nonetheless.
          return dWinLossPct; 
    }   
    
    public void setdWinLossPct(){ //this is the winloss method to be used.
        double iGamesPlayed = iLosses + iWins;
        if(iGamesPlayed == 0)
        {
            dWinLossPct = 0; //i use this if statement to make sure that 0 is displayed instead of an exception.
        }
        else{
        dWinLossPct = (iWins / iGamesPlayed);//if there are games, great, the percentage is then calculated.
    }
    }
    
}








class BasketballTeam extends Team{ //this calls extends Team, therefore it is able to have the attributes and access them.

    public BasketballTeam() {
    }
    
    String sStatus;   

    public String getsStatus() { //the only one added is the seperate status specific to this class. 
        return sStatus;//so if i made a football team, i could still extend team with other specific attributes.
    }

    public void setsStatus(String sStatus) { //getters and setters
        this.sStatus = sStatus;
    }
}









public class pnlMain extends javax.swing.JFrame {
    public pnlMain() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listConferenceTeams = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listNonConferenceTeams = new javax.swing.JList();
        btnQuit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        xboxHomeTeamAdvantage = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTenth = new javax.swing.JLabel();
        lblFirst = new javax.swing.JLabel();
        lblSecond = new javax.swing.JLabel();
        lblThird = new javax.swing.JLabel();
        lblFourth = new javax.swing.JLabel();
        lblFifth = new javax.swing.JLabel();
        lblSixth = new javax.swing.JLabel();
        lblSeventh = new javax.swing.JLabel();
        lblEighth = new javax.swing.JLabel();
        lblNinth = new javax.swing.JLabel();
        lblWinsFirst = new javax.swing.JLabel();
        lblWinsSecond = new javax.swing.JLabel();
        lblWinsThird = new javax.swing.JLabel();
        lblWinsFourth = new javax.swing.JLabel();
        lblWinsFifth = new javax.swing.JLabel();
        lblWinsSixth = new javax.swing.JLabel();
        lblWinsSeventh = new javax.swing.JLabel();
        lblWinsEighth = new javax.swing.JLabel();
        lblWinsNinth = new javax.swing.JLabel();
        lblWinsTenth = new javax.swing.JLabel();
        lblLossesFirst = new javax.swing.JLabel();
        lblLossesSecond = new javax.swing.JLabel();
        lblLossesThird = new javax.swing.JLabel();
        lblLossesFourth = new javax.swing.JLabel();
        lblLossesFifth = new javax.swing.JLabel();
        lblLossesSixth = new javax.swing.JLabel();
        lblLossesSeventh = new javax.swing.JLabel();
        lblLossesEighth = new javax.swing.JLabel();
        lblLossesNinth = new javax.swing.JLabel();
        lblLossesTenth = new javax.swing.JLabel();
        lblStatusFirst = new javax.swing.JLabel();
        lblStatusSecond = new javax.swing.JLabel();
        lblStatusThird = new javax.swing.JLabel();
        lblStatusFourth = new javax.swing.JLabel();
        lblStatusFifth = new javax.swing.JLabel();
        lblStatusSixth = new javax.swing.JLabel();
        lblStatusSeventh = new javax.swing.JLabel();
        lblStatusEighth = new javax.swing.JLabel();
        lblStatusNinth = new javax.swing.JLabel();
        lblStatusTenth = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listConferenceTeams.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "BYU", "Gonzaga", "Loyola", "St. Marys", "Pepperdine", "San Francisco", "San Diego", "Portland", "Pacific", "Santa Clara" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listConferenceTeams);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 120, 210));

        listNonConferenceTeams.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Arizona", "Florida", "Memphis", "Stanford", "Dayton", "Texas" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listNonConferenceTeams);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 120, 130));

        btnQuit.setText("Quit");
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
        });
        jPanel1.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        btnPlay.setText("Play");
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
        });
        jPanel1.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        xboxHomeTeamAdvantage.setText("Home Team +5");
        jPanel1.add(xboxHomeTeamAdvantage, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Conference Teams");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 270));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Non-Conference Teams");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, 190));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Record");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setText("Status");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setText("Wins");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("Losses");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));
        jPanel4.add(lblTenth, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));
        jPanel4.add(lblFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));
        jPanel4.add(lblSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        jPanel4.add(lblThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        jPanel4.add(lblFourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        jPanel4.add(lblFifth, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));
        jPanel4.add(lblSixth, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));
        jPanel4.add(lblSeventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));
        jPanel4.add(lblEighth, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));
        jPanel4.add(lblNinth, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));
        jPanel4.add(lblWinsFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));
        jPanel4.add(lblWinsSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));
        jPanel4.add(lblWinsThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));
        jPanel4.add(lblWinsFourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));
        jPanel4.add(lblWinsFifth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));
        jPanel4.add(lblWinsSixth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));
        jPanel4.add(lblWinsSeventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));
        jPanel4.add(lblWinsEighth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));
        jPanel4.add(lblWinsNinth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));
        jPanel4.add(lblWinsTenth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));
        jPanel4.add(lblLossesFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));
        jPanel4.add(lblLossesSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));
        jPanel4.add(lblLossesThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));
        jPanel4.add(lblLossesFourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));
        jPanel4.add(lblLossesFifth, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));
        jPanel4.add(lblLossesSixth, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));
        jPanel4.add(lblLossesSeventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));
        jPanel4.add(lblLossesEighth, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));
        jPanel4.add(lblLossesNinth, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));
        jPanel4.add(lblLossesTenth, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));
        jPanel4.add(lblStatusFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));
        jPanel4.add(lblStatusSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));
        jPanel4.add(lblStatusThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));
        jPanel4.add(lblStatusFourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));
        jPanel4.add(lblStatusFifth, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));
        jPanel4.add(lblStatusSixth, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));
        jPanel4.add(lblStatusSeventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));
        jPanel4.add(lblStatusEighth, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));
        jPanel4.add(lblStatusNinth, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));
        jPanel4.add(lblStatusTenth, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 450, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
   //this is setting all of the lbls to be empty whn you click the reset button.
          lblFirst.setText("");   lblWinsFirst.setText("");    lblLossesFirst.setText("");  lblStatusFirst.setText("");
          lblSecond.setText("");  lblWinsSecond.setText("");   lblLossesSecond.setText(""); lblStatusSecond.setText("");
          lblThird.setText("");   lblWinsThird.setText("");    lblLossesThird.setText("");  lblStatusThird.setText("");
          lblFourth.setText("");  lblWinsFourth.setText("");   lblLossesFourth.setText(""); lblStatusFourth.setText("");
          lblFifth.setText("");   lblWinsFifth.setText("");    lblLossesFifth.setText("");  lblStatusFifth.setText("");
          lblSixth.setText("");   lblWinsSixth.setText("");    lblLossesSixth.setText("");  lblStatusSixth.setText("");
          lblSeventh.setText(""); lblWinsSeventh.setText("");  lblLossesSeventh.setText("");lblStatusSeventh.setText("");
          lblEighth.setText("");  lblWinsEighth.setText("");   lblLossesEighth.setText(""); lblStatusEighth.setText("");
          lblNinth.setText("");   lblWinsNinth.setText("");    lblLossesNinth.setText("");  lblStatusNinth.setText("");
          lblTenth.setText("");   lblWinsTenth.setText("");    lblLossesTenth.setText("");  lblStatusTenth.setText("");
          
          
      
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        System.exit(0); //when you click the quit button, this is exits the program
    }//GEN-LAST:event_btnQuitMouseClicked

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
  
        
    DecimalFormat format = new DecimalFormat("##.##");
    
    double number = 234.234234;
    
    format.format(number);
    
    
    Random rndGenerator = new Random();//this is where the magic happens. Random generator for the scores.
    BasketballTeam[] aTeams = new BasketballTeam[listConferenceTeams.getModel().getSize()]; //creating the array according to the size of the conference list box
    
    for(int iCount = 0; iCount < aTeams.length; iCount++) //this cycles through the array and makes a basketball team object
        {
        aTeams[iCount] =  new BasketballTeam();
        aTeams[iCount].setsTeamName(listConferenceTeams.getModel().getElementAt(iCount).toString());//then it assigns its repsective name for the attribute
        }   
    
    
    for(int iCount = 0; iCount < aTeams.length; iCount++){        
    //a double loop. the first for loop goes through all the teams  
       for (int iCount2 = (iCount + 1); iCount2 < aTeams.length; iCount2++)
       {//the second for loop goes through the teams the first loop team is going to be playing against.
            int iHomeScore = rndGenerator.nextInt(100);//generating scores.
            int iAwayScore = rndGenerator.nextInt(100);

                if(xboxHomeTeamAdvantage.isSelected()){

                    iHomeScore = iHomeScore + 5;} //if the checkbox for homefield advantage is selected, +5 points to homescore

                while(iHomeScore == iAwayScore){ //no ties. so while they are the same, keep getting new scores.
                        iHomeScore += rndGenerator.nextInt(100);
                        iAwayScore += rndGenerator.nextInt(100);
                    }

                if(iHomeScore > iAwayScore) //if the home team has higher points they get a win
                    {
                    int iNewWins = aTeams[iCount].getiWins() + 1; //grabs the value from the current spot in the array for wins and adds a one
                    int iNewLosses = aTeams[iCount2].getiLosses() + 1; //grabs the opponents value for losses in the array spot and adds a one t losses
                        aTeams[iCount].setiWins(iNewWins);
                        aTeams[iCount2].setiLosses(iNewLosses);
                    }
                else
                    {
                    int iNewWins = aTeams[iCount2].getiWins() + 1; //if the hometeam losses, they get a loss increase instead of a win
                    int iNewLosses = aTeams[iCount].getiLosses() + 1;//and the away team gets the point for their wins.
                        aTeams[iCount2].setiWins(iNewWins);
                        aTeams[iCount].setiLosses(iNewLosses);
                    }

            iHomeScore = rndGenerator.nextInt(100); //this next loop reverses the home team and away team.
            iAwayScore = rndGenerator.nextInt(100); //becuase each team plays each other twice.

                if(xboxHomeTeamAdvantage.isSelected())
                {
                    iHomeScore = iHomeScore + 5; //homefield advantage if selected.
                }

                while(iHomeScore == iAwayScore){ //no ties allowed.
                        iHomeScore += rndGenerator.nextInt(100);
                        iAwayScore += rndGenerator.nextInt(100);
                    }

                if(iHomeScore > iAwayScore){ //this time if the homescore is higher, the opponent team gets a win instead of the first team.
                        int iNewWins = aTeams[iCount2].getiWins() + 1; //the first team gets a loss.
                        int iNewLosses = aTeams[iCount].getiLosses() + 1;
                            aTeams[iCount2].setiWins(iNewWins);//wins and losses set for each team.
                            aTeams[iCount].setiLosses(iNewLosses);
                    }
                else{
                        int iNewWins = aTeams[iCount].getiWins() + 1;//if the homescore is less, then the opponent team gets a loss
                        int iNewLosses = aTeams[iCount2].getiLosses() + 1;//since the first team is away this time., they get a win
                            aTeams[iCount].setiWins(iNewWins); //wins and losses set
                            aTeams[iCount2].setiLosses(iNewLosses);
                    }
       }
       
       
        for(int iCount3 = 0; iCount3 < listNonConferenceTeams.getModel().getSize(); iCount3++){ //this is the for loop that gets each conference team to play the nonconference teams once.

        int iHomeScore = rndGenerator.nextInt(100);
        int iAwayScore = rndGenerator.nextInt(100); //scores. no homefield advantage either way.
       
            while(iHomeScore == iAwayScore){
                    iHomeScore += rndGenerator.nextInt(100); //no ties
                    iAwayScore += rndGenerator.nextInt(100);
                }
            
            if(iHomeScore > iAwayScore) //it was just easier to keep track and make sure it was consistant that the first team is going through the other teams and not the opponent team.
                {
                     int iNewWins = aTeams[iCount].getiWins() + 1; //wins are gathered from the last time it was called and added a 1 for another win.
                     aTeams[iCount].setiWins(iNewWins); //the new value for the wins is then set.
                }
            else
                {
                    int iNewLosses = aTeams[iCount].getiLosses() + 1; //losses are called for the specific team and then added a loss
                    aTeams[iCount].setiLosses(iNewLosses); //value is then set for the losses
                }
        }  
    }
    
    for(int iCount = 0; iCount < aTeams.length; iCount++){ //this loops through each team and determines their
        if(aTeams[iCount].getiWins() >= 20){                //status according to their wins.
            aTeams[iCount].setsStatus("March Madness"); //only march madness if they have 20 wins or above.
            }
        else if(aTeams[iCount].getiWins() >= 15){ //if the number of wins are 15 through 19, NIt
            aTeams[iCount].setsStatus("NIT");
            }
        else
            {
            aTeams[iCount].setsStatus("See You Next Year"); //the team didnt do so well if they got less than 15 wins.
            }
    }
    
    
    Arrays.sort(aTeams); //this is sorting the array into order according to the wins and the method in the parent class.
    
        lblFirst.setText(aTeams[0].getsTeamName()); //this sets the labels to be the value in the specific location in the array
        lblSecond.setText(aTeams[1].getsTeamName());// this one gets the second value in place 1 because
        lblThird.setText(aTeams[2].getsTeamName());//it all starts at 0. the array has already been sorted
        lblFourth.setText(aTeams[3].getsTeamName());//so it can just pull and reference the values
        lblFifth.setText(aTeams[4].getsTeamName());//and go down the line.
        lblSixth.setText(aTeams[5].getsTeamName());
        lblSeventh.setText(aTeams[6].getsTeamName());
        lblEighth.setText(aTeams[7].getsTeamName());
        lblNinth.setText(aTeams[8].getsTeamName());
        lblTenth.setText(aTeams[9].getsTeamName());
        
        lblWinsFirst.setText(String.valueOf(aTeams[0].getiWins())); //this is just publishing the wins
        lblWinsSecond.setText(String.valueOf(aTeams[1].getiWins()));//in the same way as above to label the 
        lblWinsThird.setText(String.valueOf(aTeams[2].getiWins()));//values. except this time i had to
        lblWinsFourth.setText(String.valueOf(aTeams[3].getiWins()));//make the integer into a string to be
        lblWinsFifth.setText(String.valueOf(aTeams[4].getiWins()));//able to display it effeciently in the
        lblWinsSixth.setText(String.valueOf(aTeams[5].getiWins()));//label.
        lblWinsSeventh.setText(String.valueOf(aTeams[6].getiWins()));
        lblWinsEighth.setText(String.valueOf(aTeams[7].getiWins()));
        lblWinsNinth.setText(String.valueOf(aTeams[8].getiWins()));
        lblWinsTenth.setText(String.valueOf(aTeams[9].getiWins()));
           
        lblLossesFirst.setText(String.valueOf(aTeams[0].getiLosses()));//these are exactly the same as the
        lblLossesSecond.setText(String.valueOf(aTeams[1].getiLosses()));//wins except they are the losses
        lblLossesThird.setText(String.valueOf(aTeams[2].getiLosses()));//and put into the losses column
        lblLossesFourth.setText(String.valueOf(aTeams[3].getiLosses()));//each win and loss is still referenced
        lblLossesFifth.setText(String.valueOf(aTeams[4].getiLosses()));//to according to the order in the array
        lblLossesSixth.setText(String.valueOf(aTeams[5].getiLosses()));//making the program display them in 
        lblLossesSeventh.setText(String.valueOf(aTeams[6].getiLosses()));//order.
        lblLossesEighth.setText(String.valueOf(aTeams[7].getiLosses()));
        lblLossesNinth.setText(String.valueOf(aTeams[8].getiLosses()));
        lblLossesTenth.setText(String.valueOf(aTeams[9].getiLosses()));
        
        lblStatusFirst.setText(aTeams[0].getsStatus());//this gets the status. whether they made it to march
        lblStatusSecond.setText(aTeams[1].getsStatus());//madness or NIT or neither. This uses a getter
        lblStatusThird.setText(aTeams[2].getsStatus());//made in the subclass that gets the values from the
        lblStatusFourth.setText(aTeams[3].getsStatus());//parent class and compares the amounts of wins.
        lblStatusFifth.setText(aTeams[4].getsStatus());//if the amount of wins pass the certain value (20,15)
        lblStatusSixth.setText(aTeams[5].getsStatus());//the label are displayed as such.
        lblStatusSeventh.setText(aTeams[6].getsStatus());
        lblStatusEighth.setText(aTeams[7].getsStatus());
        lblStatusNinth.setText(aTeams[8].getsStatus());
        lblStatusTenth.setText(aTeams[9].getsStatus());
    }//GEN-LAST:event_btnPlayMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pnlMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pnlMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pnlMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pnlMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pnlMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEighth;
    private javax.swing.JLabel lblFifth;
    private javax.swing.JLabel lblFirst;
    private javax.swing.JLabel lblFourth;
    private javax.swing.JLabel lblLossesEighth;
    private javax.swing.JLabel lblLossesFifth;
    private javax.swing.JLabel lblLossesFirst;
    private javax.swing.JLabel lblLossesFourth;
    private javax.swing.JLabel lblLossesNinth;
    private javax.swing.JLabel lblLossesSecond;
    private javax.swing.JLabel lblLossesSeventh;
    private javax.swing.JLabel lblLossesSixth;
    private javax.swing.JLabel lblLossesTenth;
    private javax.swing.JLabel lblLossesThird;
    private javax.swing.JLabel lblNinth;
    private javax.swing.JLabel lblSecond;
    private javax.swing.JLabel lblSeventh;
    private javax.swing.JLabel lblSixth;
    private javax.swing.JLabel lblStatusEighth;
    private javax.swing.JLabel lblStatusFifth;
    private javax.swing.JLabel lblStatusFirst;
    private javax.swing.JLabel lblStatusFourth;
    private javax.swing.JLabel lblStatusNinth;
    private javax.swing.JLabel lblStatusSecond;
    private javax.swing.JLabel lblStatusSeventh;
    private javax.swing.JLabel lblStatusSixth;
    private javax.swing.JLabel lblStatusTenth;
    private javax.swing.JLabel lblStatusThird;
    private javax.swing.JLabel lblTenth;
    private javax.swing.JLabel lblThird;
    private javax.swing.JLabel lblWinsEighth;
    private javax.swing.JLabel lblWinsFifth;
    private javax.swing.JLabel lblWinsFirst;
    private javax.swing.JLabel lblWinsFourth;
    private javax.swing.JLabel lblWinsNinth;
    private javax.swing.JLabel lblWinsSecond;
    private javax.swing.JLabel lblWinsSeventh;
    private javax.swing.JLabel lblWinsSixth;
    private javax.swing.JLabel lblWinsTenth;
    private javax.swing.JLabel lblWinsThird;
    private javax.swing.JList listConferenceTeams;
    private javax.swing.JList listNonConferenceTeams;
    private javax.swing.JCheckBox xboxHomeTeamAdvantage;
    // End of variables declaration//GEN-END:variables
}
