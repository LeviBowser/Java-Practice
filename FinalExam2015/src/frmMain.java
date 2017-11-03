
import static java.awt.EventQueue.invokeLater;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;

import java.util.Arrays;
import java.util.Random;
import java.text.DecimalFormat;


class Team implements Comparable<Team>
{
    String Name;
    int Wins = 0;
    int Losses = 0;
    double WinLossPct = 0;
    
    DecimalFormat dfFormat = new DecimalFormat("#.###");

    Team(){
    }
    
    Team(String Name){
        this.Name = Name;
    }
    
    Team(String Name, int Wins, int Losses){
        this.Name = Name;
        this.Wins = Wins;
        this.Losses = Losses;
    }
    
    public void WinLossPct(){
    
        if(Wins + Losses > 0)
        {
            dfFormat.format(WinLossPct = (Wins / (Wins + Losses)));
        }
        else
        {
            WinLossPct = 0;
        }
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getWins() {
        return Wins;
    }

    public void setWins(int Wins) {
        this.Wins = Wins;
    }

    public int getLosses() {
        return Losses;
    }

    public void setLosses(int Losses) {
        this.Losses = Losses;
    }

    public double getWinLossPct() {
        return WinLossPct;
    }

    public void setWinLossPct(double WinLossPct) {
        this.WinLossPct = WinLossPct;
    }
    
    
// Arrays.sort(array name);
    @Override
    public int compareTo(Team other){
        if(other.Wins < this.Wins){
            return -1;
        }
        else if (other.Wins > this.Wins){
            return 1;
        }

        return this.Name.compareTo(other.Name);
}
}








class Soccer extends Team{
    
    private String Region;
    private int GB;
    
    
    
    Soccer(){
    }

    public Soccer(String Name, int Wins, int Losses, String Region, int GB) {
        super(Name, Wins, Losses);
        this.Region = Region;
        this.GB = GB;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public int getGB() {
        return GB;
    }

    public void setGB(int GB) {
        this.GB = GB;
    }
    
    
    
   

    
}

public class frmMain extends javax.swing.JFrame {   
    public frmMain() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnlSouth = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lboxSouth = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlSouthStandings = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblSouthTeam1 = new javax.swing.JLabel();
        lblSouthTeam2 = new javax.swing.JLabel();
        lblSouthTeam3 = new javax.swing.JLabel();
        lblSouthTeam4 = new javax.swing.JLabel();
        lblSouthTeam5 = new javax.swing.JLabel();
        lblSouthTeam6 = new javax.swing.JLabel();
        lblSouthTeam1Wins = new javax.swing.JLabel();
        lblSouthTeam1Losses = new javax.swing.JLabel();
        lblSouthTeam2Wins = new javax.swing.JLabel();
        lblSouthTeam2Losses = new javax.swing.JLabel();
        lblSouthTeam3Wins = new javax.swing.JLabel();
        lblSouthTeam3Losses = new javax.swing.JLabel();
        lblSouthTeam4Wins = new javax.swing.JLabel();
        lblSouthTeam4Losses = new javax.swing.JLabel();
        lblSouthTeam5Wins = new javax.swing.JLabel();
        lblSouthTeam5Losses = new javax.swing.JLabel();
        lblSouthTeam6Wins = new javax.swing.JLabel();
        lblSouthTeam6Losses = new javax.swing.JLabel();
        lblSouthTeam4GB = new javax.swing.JLabel();
        lblSouthTeam5GB = new javax.swing.JLabel();
        lblSouthTeam3GB = new javax.swing.JLabel();
        lblSouthTeam2GB = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSouthTeam6GB = new javax.swing.JLabel();
        lblSouthTeam1GB = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblSouthWinner = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pnlWest = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lboxWest = new javax.swing.JList();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pnlWestStandings = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblWestTeam1 = new javax.swing.JLabel();
        lblWestTeam2 = new javax.swing.JLabel();
        lblWestTeam3 = new javax.swing.JLabel();
        lblWestTeam4 = new javax.swing.JLabel();
        lblWestTeam5 = new javax.swing.JLabel();
        lblWestTeam6 = new javax.swing.JLabel();
        lblWestTeam1Wins = new javax.swing.JLabel();
        lblWestTeam1Losses = new javax.swing.JLabel();
        lblWestTeam2Wins = new javax.swing.JLabel();
        lblWestTeam2Losses = new javax.swing.JLabel();
        lblWestTeam3Wins = new javax.swing.JLabel();
        lblWestTeam3Losses = new javax.swing.JLabel();
        lblWestTeam4Wins = new javax.swing.JLabel();
        lblWestTeam4Losses = new javax.swing.JLabel();
        lblWestTeam5Wins = new javax.swing.JLabel();
        lblWestTeam5Losses = new javax.swing.JLabel();
        lblWestTeam6Wins = new javax.swing.JLabel();
        lblWestTeam6Losses = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblWestTeam1GB = new javax.swing.JLabel();
        lblWestTeam2GB = new javax.swing.JLabel();
        lblWestTeam3GB = new javax.swing.JLabel();
        lblWestTeam4GB = new javax.swing.JLabel();
        lblWestTeam5GB = new javax.swing.JLabel();
        lblWestTeam6GB = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblWestWinner = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        pnlNorth = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lboxNorth = new javax.swing.JList();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        pnlNorthStandings = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lblNorthTeam1 = new javax.swing.JLabel();
        lblNorthTeam2 = new javax.swing.JLabel();
        lblNorthTeam3 = new javax.swing.JLabel();
        lblNorthTeam4 = new javax.swing.JLabel();
        lblNorthTeam5 = new javax.swing.JLabel();
        lblNorthTeam6 = new javax.swing.JLabel();
        lblNorthTeam1Wins = new javax.swing.JLabel();
        lblNorthTeam1Losses = new javax.swing.JLabel();
        lblNorthTeam2Wins = new javax.swing.JLabel();
        lblNorthTeam2Losses = new javax.swing.JLabel();
        lblNorthTeam3Wins = new javax.swing.JLabel();
        lblNorthTeam3Losses = new javax.swing.JLabel();
        lblNorthTeam4Wins = new javax.swing.JLabel();
        lblNorthTeam4Losses = new javax.swing.JLabel();
        lblNorthTeam5Wins = new javax.swing.JLabel();
        lblNorthTeam5Losses = new javax.swing.JLabel();
        lblNorthTeam6Wins = new javax.swing.JLabel();
        lblNorthTeam6Losses = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNorthTeam1GB = new javax.swing.JLabel();
        lblNorthTeam2GB = new javax.swing.JLabel();
        lblNorthTeam3GB = new javax.swing.JLabel();
        lblNorthTeam4GB = new javax.swing.JLabel();
        lblNorthTeam5GB = new javax.swing.JLabel();
        lblNorthTeam6GB = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblNorthWinner = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        pnlEast = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lboxEast = new javax.swing.JList();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        pnlEastStandings = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        lblEastTeam1 = new javax.swing.JLabel();
        lblEastTeam2 = new javax.swing.JLabel();
        lblEastTeam3 = new javax.swing.JLabel();
        lblEastTeam4 = new javax.swing.JLabel();
        lblEastTeam5 = new javax.swing.JLabel();
        lblEastTeam6 = new javax.swing.JLabel();
        lblEastTeam1Wins = new javax.swing.JLabel();
        lblEastTeam1Losses = new javax.swing.JLabel();
        lblEastTeam2Wins = new javax.swing.JLabel();
        lblEastTeam2Losses = new javax.swing.JLabel();
        lblEastTeam3Wins = new javax.swing.JLabel();
        lblEastTeam3Losses = new javax.swing.JLabel();
        lblEastTeam4Wins = new javax.swing.JLabel();
        lblEastTeam4Losses = new javax.swing.JLabel();
        lblEastTeam5Wins = new javax.swing.JLabel();
        lblEastTeam5Losses = new javax.swing.JLabel();
        lblEastTeam6Wins = new javax.swing.JLabel();
        lblEastTeam6Losses = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblEastTeam1GB = new javax.swing.JLabel();
        lblEastTeam2GB = new javax.swing.JLabel();
        lblEastTeam3GB = new javax.swing.JLabel();
        lblEastTeam4GB = new javax.swing.JLabel();
        lblEastTeam5GB = new javax.swing.JLabel();
        lblEastTeam6GB = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblEastWinner = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        lblSouthWestWinner = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        lblNorthEastWinner = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        lblChampion = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lboxSouth.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Alabama", "Texas A&M", "Texas", "LSU", "Florida", "Florida St" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lboxSouth);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("SOUTH");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("WINNER");

        pnlSouthStandings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("TEAM NAME");
        pnlSouthStandings.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("WINS");
        pnlSouthStandings.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("LOSSES");
        pnlSouthStandings.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        lblSouthTeam1.setText(null);
        pnlSouthStandings.add(lblSouthTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblSouthTeam2.setText(null);
        pnlSouthStandings.add(lblSouthTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        lblSouthTeam3.setText(null);
        pnlSouthStandings.add(lblSouthTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        lblSouthTeam4.setText(null);
        pnlSouthStandings.add(lblSouthTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        lblSouthTeam5.setText(null);
        pnlSouthStandings.add(lblSouthTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lblSouthTeam6.setText(null);
        pnlSouthStandings.add(lblSouthTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        lblSouthTeam1Wins.setText(null);
        pnlSouthStandings.add(lblSouthTeam1Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblSouthTeam1Losses.setText(null);
        pnlSouthStandings.add(lblSouthTeam1Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblSouthTeam2Wins.setText(null);
        pnlSouthStandings.add(lblSouthTeam2Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblSouthTeam2Losses.setText(null);
        pnlSouthStandings.add(lblSouthTeam2Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        lblSouthTeam3Wins.setText(null);
        pnlSouthStandings.add(lblSouthTeam3Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblSouthTeam3Losses.setText(null);
        pnlSouthStandings.add(lblSouthTeam3Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        lblSouthTeam4Wins.setText(null);
        pnlSouthStandings.add(lblSouthTeam4Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        lblSouthTeam4Losses.setText(null);
        pnlSouthStandings.add(lblSouthTeam4Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        lblSouthTeam5Wins.setText(null);
        pnlSouthStandings.add(lblSouthTeam5Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblSouthTeam5Losses.setText(null);
        pnlSouthStandings.add(lblSouthTeam5Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        lblSouthTeam6Wins.setText(null);
        pnlSouthStandings.add(lblSouthTeam6Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        lblSouthTeam6Losses.setText(null);
        pnlSouthStandings.add(lblSouthTeam6Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        lblSouthTeam4GB.setText(null);
        pnlSouthStandings.add(lblSouthTeam4GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 20, -1));

        lblSouthTeam5GB.setText(null);
        pnlSouthStandings.add(lblSouthTeam5GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 20, -1));

        lblSouthTeam3GB.setText(null);
        pnlSouthStandings.add(lblSouthTeam3GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 20, -1));

        lblSouthTeam2GB.setText(null);
        pnlSouthStandings.add(lblSouthTeam2GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 20, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("GB");
        pnlSouthStandings.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        lblSouthTeam6GB.setText(null);
        pnlSouthStandings.add(lblSouthTeam6GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, -1));

        lblSouthTeam1GB.setText(null);
        pnlSouthStandings.add(lblSouthTeam1GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 20, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSouthWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSouthWinner.setText(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSouthWinner, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblSouthWinner)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSouthLayout = new javax.swing.GroupLayout(pnlSouth);
        pnlSouth.setLayout(pnlSouthLayout);
        pnlSouthLayout.setHorizontalGroup(
            pnlSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSouthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlSouthLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3))
                    .addGroup(pnlSouthLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlSouthStandings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlSouthLayout.setVerticalGroup(
            pnlSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSouthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSouthLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSouthStandings, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(pnlSouth, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 320));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 320, 340));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lboxWest.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "BYU", "Pepperdine", "UCLA", "Stanford", "California", "USC" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lboxWest);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("WEST");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("WINNER");

        pnlWestStandings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("TEAM NAME");
        pnlWestStandings.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("WINS");
        pnlWestStandings.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("LOSSES");
        pnlWestStandings.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        lblWestTeam1.setText(null);
        pnlWestStandings.add(lblWestTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblWestTeam2.setText(null);
        pnlWestStandings.add(lblWestTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        lblWestTeam3.setText(null);
        pnlWestStandings.add(lblWestTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        lblWestTeam4.setText(null);
        pnlWestStandings.add(lblWestTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        lblWestTeam5.setText(null);
        pnlWestStandings.add(lblWestTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lblWestTeam6.setText(null);
        pnlWestStandings.add(lblWestTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        lblWestTeam1Wins.setText(null);
        pnlWestStandings.add(lblWestTeam1Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblWestTeam1Losses.setText(null);
        pnlWestStandings.add(lblWestTeam1Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblWestTeam2Wins.setText(null);
        pnlWestStandings.add(lblWestTeam2Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblWestTeam2Losses.setText(null);
        pnlWestStandings.add(lblWestTeam2Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        lblWestTeam3Wins.setText(null);
        pnlWestStandings.add(lblWestTeam3Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblWestTeam3Losses.setText(null);
        pnlWestStandings.add(lblWestTeam3Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        lblWestTeam4Wins.setText(null);
        pnlWestStandings.add(lblWestTeam4Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        lblWestTeam4Losses.setText(null);
        pnlWestStandings.add(lblWestTeam4Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        lblWestTeam5Wins.setText(null);
        pnlWestStandings.add(lblWestTeam5Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblWestTeam5Losses.setText(null);
        pnlWestStandings.add(lblWestTeam5Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        lblWestTeam6Wins.setText(null);
        pnlWestStandings.add(lblWestTeam6Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        lblWestTeam6Losses.setText(null);
        pnlWestStandings.add(lblWestTeam6Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("GB");
        pnlWestStandings.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        lblWestTeam1GB.setText(null);
        pnlWestStandings.add(lblWestTeam1GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 20, -1));

        lblWestTeam2GB.setText(null);
        pnlWestStandings.add(lblWestTeam2GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 20, -1));

        lblWestTeam3GB.setText(null);
        pnlWestStandings.add(lblWestTeam3GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 20, -1));

        lblWestTeam4GB.setText(null);
        pnlWestStandings.add(lblWestTeam4GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 20, -1));

        lblWestTeam5GB.setText(null);
        pnlWestStandings.add(lblWestTeam5GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 20, -1));

        lblWestTeam6GB.setText(null);
        pnlWestStandings.add(lblWestTeam6GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblWestWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWestWinner.setText(null);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWestWinner, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblWestWinner)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlWestLayout = new javax.swing.GroupLayout(pnlWest);
        pnlWest.setLayout(pnlWestLayout);
        pnlWestLayout.setHorizontalGroup(
            pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWestLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 236, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWestLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlWestStandings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlWestLayout.setVerticalGroup(
            pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGroup(pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWestLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWestLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlWestStandings, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(pnlWest, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 320));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 320, 340));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lboxNorth.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Washington", "Washington St", "Oregon", "Wisconsin", "DePaul", "Notre Dame" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lboxNorth);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("NORTH");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setText("WINNER");

        pnlNorthStandings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setText("TEAM NAME");
        pnlNorthStandings.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setText("WINS");
        pnlNorthStandings.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, -1, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setText("LOSSES");
        pnlNorthStandings.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));
        pnlNorthStandings.add(lblNorthTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));
        pnlNorthStandings.add(lblNorthTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));
        pnlNorthStandings.add(lblNorthTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));
        pnlNorthStandings.add(lblNorthTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));
        pnlNorthStandings.add(lblNorthTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lblNorthTeam6.setText(null);
        pnlNorthStandings.add(lblNorthTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        lblNorthTeam1Wins.setText(null);
        pnlNorthStandings.add(lblNorthTeam1Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblNorthTeam1Losses.setText(null);
        pnlNorthStandings.add(lblNorthTeam1Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblNorthTeam2Wins.setText(null);
        pnlNorthStandings.add(lblNorthTeam2Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblNorthTeam2Losses.setText(null);
        pnlNorthStandings.add(lblNorthTeam2Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        lblNorthTeam3Wins.setText(null);
        pnlNorthStandings.add(lblNorthTeam3Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblNorthTeam3Losses.setText(null);
        pnlNorthStandings.add(lblNorthTeam3Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        lblNorthTeam4Wins.setText(null);
        pnlNorthStandings.add(lblNorthTeam4Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        lblNorthTeam4Losses.setText(null);
        pnlNorthStandings.add(lblNorthTeam4Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        lblNorthTeam5Wins.setText(null);
        pnlNorthStandings.add(lblNorthTeam5Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblNorthTeam5Losses.setText(null);
        pnlNorthStandings.add(lblNorthTeam5Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        lblNorthTeam6Wins.setText(null);
        pnlNorthStandings.add(lblNorthTeam6Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        lblNorthTeam6Losses.setText(null);
        pnlNorthStandings.add(lblNorthTeam6Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("GB");
        pnlNorthStandings.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        lblNorthTeam1GB.setText(null);
        pnlNorthStandings.add(lblNorthTeam1GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 20, -1));

        lblNorthTeam2GB.setText(null);
        pnlNorthStandings.add(lblNorthTeam2GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 20, -1));

        lblNorthTeam3GB.setText(null);
        pnlNorthStandings.add(lblNorthTeam3GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 20, -1));

        lblNorthTeam4GB.setText(null);
        pnlNorthStandings.add(lblNorthTeam4GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 20, -1));

        lblNorthTeam5GB.setText(null);
        pnlNorthStandings.add(lblNorthTeam5GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 20, -1));

        lblNorthTeam6GB.setText(null);
        pnlNorthStandings.add(lblNorthTeam6GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, -1));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNorthWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNorthWinner.setText(null);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNorthWinner, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblNorthWinner)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlNorthLayout = new javax.swing.GroupLayout(pnlNorth);
        pnlNorth.setLayout(pnlNorthLayout);
        pnlNorthLayout.setHorizontalGroup(
            pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlNorthLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel48))
                    .addGroup(pnlNorthLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlNorthStandings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlNorthLayout.setVerticalGroup(
            pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNorthLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlNorthStandings, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(pnlNorth, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 320));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 340));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lboxEast.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Kentucky", "DePaul", "UConn", "South Carolina", "Virginia", "West Virginia" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lboxEast);

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel70.setText("EAST");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel71.setText("WINNER");

        pnlEastStandings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel72.setText("TEAM NAME");
        pnlEastStandings.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel73.setText("WINS");
        pnlEastStandings.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, -1, -1));

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel74.setText("LOSSES");
        pnlEastStandings.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        lblEastTeam1.setText(null);
        pnlEastStandings.add(lblEastTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblEastTeam2.setText(null);
        pnlEastStandings.add(lblEastTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        lblEastTeam3.setText(null);
        pnlEastStandings.add(lblEastTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        lblEastTeam4.setText(null);
        pnlEastStandings.add(lblEastTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        lblEastTeam5.setText(null);
        pnlEastStandings.add(lblEastTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lblEastTeam6.setText(null);
        pnlEastStandings.add(lblEastTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        lblEastTeam1Wins.setText(null);
        pnlEastStandings.add(lblEastTeam1Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblEastTeam1Losses.setText(null);
        pnlEastStandings.add(lblEastTeam1Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblEastTeam2Wins.setText(null);
        pnlEastStandings.add(lblEastTeam2Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblEastTeam2Losses.setText(null);
        pnlEastStandings.add(lblEastTeam2Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        lblEastTeam3Wins.setText(null);
        pnlEastStandings.add(lblEastTeam3Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblEastTeam3Losses.setText(null);
        pnlEastStandings.add(lblEastTeam3Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        lblEastTeam4Wins.setText(null);
        pnlEastStandings.add(lblEastTeam4Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        lblEastTeam4Losses.setText(null);
        pnlEastStandings.add(lblEastTeam4Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        lblEastTeam5Wins.setText(null);
        pnlEastStandings.add(lblEastTeam5Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblEastTeam5Losses.setText(null);
        pnlEastStandings.add(lblEastTeam5Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        lblEastTeam6Wins.setText(null);
        pnlEastStandings.add(lblEastTeam6Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        lblEastTeam6Losses.setText(null);
        pnlEastStandings.add(lblEastTeam6Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("GB");
        pnlEastStandings.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        lblEastTeam1GB.setText(null);
        pnlEastStandings.add(lblEastTeam1GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 20, -1));

        lblEastTeam2GB.setText(null);
        pnlEastStandings.add(lblEastTeam2GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 20, -1));

        lblEastTeam3GB.setText(null);
        pnlEastStandings.add(lblEastTeam3GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 20, -1));

        lblEastTeam4GB.setText(null);
        pnlEastStandings.add(lblEastTeam4GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 20, -1));

        lblEastTeam5GB.setText(null);
        pnlEastStandings.add(lblEastTeam5GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 20, -1));

        lblEastTeam6GB.setText(null);
        pnlEastStandings.add(lblEastTeam6GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, -1));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEastWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEastWinner.setText(null);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEastWinner, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblEastWinner)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlEastLayout = new javax.swing.GroupLayout(pnlEast);
        pnlEast.setLayout(pnlEastLayout);
        pnlEastLayout.setHorizontalGroup(
            pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEastLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEastLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlEastLayout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlEastStandings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEastLayout.setVerticalGroup(
            pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEastLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71))
                .addGroup(pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEastLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEastLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEastStandings, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.add(pnlEast, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 320));

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 320, 340));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel93.setText("South/West Winner");

        lblSouthWestWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSouthWestWinner.setText(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(lblSouthWestWinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel93)
                .addGap(18, 18, 18)
                .addComponent(lblSouthWestWinner)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 140, 120));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel95.setText("North/East Winner");

        lblNorthEastWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNorthEastWinner.setText(null);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNorthEastWinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel95)
                .addGap(18, 18, 18)
                .addComponent(lblNorthEastWinner)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 140, 120));

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel97.setText("Champion");

        lblChampion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChampion.setText(null);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel97)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChampion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChampion)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        btnPlay.setText("Play");
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 60, -1));

        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        btnQuit.setText("Quit");
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
        });
        getContentPane().add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NCAA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Women's Soccer");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnQuitMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
       
        lblNorthTeam1.setText("");
        lblNorthTeam2.setText("");
        lblNorthTeam3.setText("");
        lblNorthTeam4.setText("");
        lblNorthTeam5.setText("");
        lblNorthTeam6.setText("");
        
        lblNorthTeam1Wins.setText("");
        lblNorthTeam2Wins.setText("");
        lblNorthTeam3Wins.setText("");
        lblNorthTeam4Wins.setText("");
        lblNorthTeam5Wins.setText("");
        lblNorthTeam6Wins.setText("");
        
        lblNorthTeam1Losses.setText("");
        lblNorthTeam2Losses.setText("");
        lblNorthTeam3Losses.setText("");
        lblNorthTeam4Losses.setText("");
        lblNorthTeam5Losses.setText("");
        lblNorthTeam6Losses.setText("");
        
        lblNorthTeam1GB.setText("");
        lblNorthTeam2GB.setText("");
        lblNorthTeam3GB.setText("");
        lblNorthTeam4GB.setText("");
        lblNorthTeam5GB.setText("");
        lblNorthTeam6GB.setText("");
        
        lblNorthWinner.setText("");
        
        
        
        
        lblSouthTeam1.setText("");
        lblSouthTeam2.setText("");
        lblSouthTeam3.setText("");
        lblSouthTeam4.setText("");
        lblSouthTeam5.setText("");
        lblSouthTeam6.setText("");
        
        lblSouthTeam1Wins.setText("");
        lblSouthTeam2Wins.setText("");
        lblSouthTeam3Wins.setText("");
        lblSouthTeam4Wins.setText("");
        lblSouthTeam5Wins.setText("");
        lblSouthTeam6Wins.setText("");
        
        lblSouthTeam1Losses.setText("");
        lblSouthTeam2Losses.setText("");
        lblSouthTeam3Losses.setText("");
        lblSouthTeam4Losses.setText("");
        lblSouthTeam5Losses.setText("");
        lblSouthTeam6Losses.setText("");
        
        lblSouthTeam1GB.setText("");
        lblSouthTeam2GB.setText("");
        lblSouthTeam3GB.setText("");
        lblSouthTeam4GB.setText("");
        lblSouthTeam5GB.setText("");
        lblSouthTeam6GB.setText("");
        
        lblSouthWinner.setText("");
        
        
        
        
        lblEastTeam1.setText("");
        lblEastTeam2.setText("");
        lblEastTeam3.setText("");
        lblEastTeam4.setText("");
        lblEastTeam5.setText("");
        lblEastTeam6.setText("");
        
        lblEastTeam1Wins.setText("");
        lblEastTeam2Wins.setText("");
        lblEastTeam3Wins.setText("");
        lblEastTeam4Wins.setText("");
        lblEastTeam5Wins.setText("");
        lblEastTeam6Wins.setText("");
        
        lblEastTeam1Losses.setText("");
        lblEastTeam2Losses.setText("");
        lblEastTeam3Losses.setText("");
        lblEastTeam4Losses.setText("");
        lblEastTeam5Losses.setText("");
        lblEastTeam6Losses.setText("");
        
        lblEastTeam1GB.setText("");
        lblEastTeam2GB.setText("");
        lblEastTeam3GB.setText("");
        lblEastTeam4GB.setText("");
        lblEastTeam5GB.setText("");
        lblEastTeam6GB.setText("");
        
        lblEastWinner.setText("");
        
        
        
        
        lblWestTeam1.setText("");
        lblWestTeam2.setText("");
        lblWestTeam3.setText("");
        lblWestTeam4.setText("");
        lblWestTeam5.setText("");
        lblWestTeam6.setText("");
        
        lblWestTeam1Wins.setText("");
        lblWestTeam2Wins.setText("");
        lblWestTeam3Wins.setText("");
        lblWestTeam4Wins.setText("");
        lblWestTeam5Wins.setText("");
        lblWestTeam6Wins.setText("");
        
        lblWestTeam1Losses.setText("");
        lblWestTeam2Losses.setText("");
        lblWestTeam3Losses.setText("");
        lblWestTeam4Losses.setText("");
        lblWestTeam5Losses.setText("");
        lblWestTeam6Losses.setText("");
        
        lblWestTeam1GB.setText("");
        lblWestTeam2GB.setText("");
        lblWestTeam3GB.setText("");
        lblWestTeam4GB.setText("");
        lblWestTeam5GB.setText("");
        lblWestTeam6GB.setText("");
        
        lblWestWinner.setText("");
        
        lblSouthWestWinner.setText("");
        lblNorthEastWinner.setText("");
        
        lblChampion.setText("");
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
        
       
       
       
       
         
        
        
        
        Random rndGenerator = new Random();
        
        
        Soccer[] aNorth = new Soccer[lboxNorth.getModel().getSize()];
        Soccer[] aSouth = new Soccer[lboxSouth.getModel().getSize()];
        Soccer[] aEast = new Soccer[lboxEast.getModel().getSize()];
        Soccer[] aWest = new Soccer[lboxWest.getModel().getSize()];
        
        
        
        for( int iCount = 0; iCount < lboxNorth.getModel().getSize(); iCount++) //fills up each array. 4 arrays for 4 conferences
        {
            aNorth[iCount] = new Soccer();
            aNorth[iCount].setName(lboxNorth.getModel().getElementAt(iCount).toString());
        }
        
        for( int iCount = 0; iCount < lboxSouth.getModel().getSize(); iCount++)
        {
            aSouth[iCount] = new Soccer();
            aSouth[iCount].setName(lboxSouth.getModel().getElementAt(iCount).toString());
        }
        
        for( int iCount = 0; iCount < lboxEast.getModel().getSize(); iCount++)
        {
            aEast[iCount] = new Soccer();
            aEast[iCount].setName(lboxEast.getModel().getElementAt(iCount).toString());
        }
        
        for( int iCount = 0; iCount < lboxWest.getModel().getSize(); iCount++)
        {
            aWest[iCount] = new Soccer();
            aWest[iCount].setName(lboxWest.getModel().getElementAt(iCount).toString());
        }
        
        
        
        
        
        
        
        for(int iCount = 0; iCount < lboxNorth.getModel().getSize(); iCount++){
            
            for(int iCount2 = iCount + 1; iCount2 < lboxNorth.getModel().getSize(); iCount2++){
                
                int iHome;
                int iAway;
                
                iHome = rndGenerator.nextInt(100);
                iAway = rndGenerator.nextInt(100);
                
                iHome += 5;
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewWins = aNorth[iCount].getWins() + 1;
                    aNorth[iCount].setWins(NewWins);
                    
                    int NewLosses = aNorth[iCount2].getLosses() + 1;
                    aNorth[iCount2].setLosses(NewLosses);                                       
                }
                else{
                    int NewLosses = aNorth[iCount].getLosses() + 1;
                    aNorth[iCount].setLosses(NewLosses);
                    
                    int NewWins = aNorth[iCount2].getWins() + 1;
                    aNorth[iCount2].setLosses(NewWins);
                }
                
                
                iHome = rndGenerator.nextInt(100);
                iAway = rndGenerator.nextInt(100);
                
                iHome += 5;
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewLosses = aNorth[iCount].getLosses() + 1;
                    aNorth[iCount].setLosses(NewLosses);
                    
                    int NewWins = aNorth[iCount2].getWins() + 1;
                    aNorth[iCount2].setLosses(NewWins);                                       
                }
                else{
                    int NewWins = aNorth[iCount].getWins() + 1;
                    aNorth[iCount].setWins(NewWins);
                    
                    int NewLosses = aNorth[iCount2].getLosses() + 1;
                    aNorth[iCount2].setLosses(NewLosses);
                }
            }
                
                
                for(int iCount3 = 0; iCount3 < lboxEast.getModel().getSize(); iCount3++){
                                
                int iHome = rndGenerator.nextInt(100);
                int iAway = rndGenerator.nextInt(100);
                
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewWins = aNorth[iCount].getWins() + 1;
                    aNorth[iCount].setWins(NewWins);
                    
                    int NewLosses = aEast[iCount3].getLosses() + 1;
                    aEast[iCount3].setLosses(NewLosses);                                       
                }
                else{
                    int NewLosses = aNorth[iCount].getLosses() + 1;
                    aNorth[iCount].setLosses(NewLosses);
                    
                    int NewWins = aEast[iCount3].getWins() + 1;
                    aEast[iCount3].setLosses(NewWins);
                }
                
                }
                
                
                for(int iCount4 = 0; iCount4 < lboxSouth.getModel().getSize(); iCount4++){
                                
                int iHome = rndGenerator.nextInt(100);
                int iAway = rndGenerator.nextInt(100);
                
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewWins = aNorth[iCount].getWins() + 1;
                    aNorth[iCount].setWins(NewWins);
                    
                    int NewLosses = aSouth[iCount4].getLosses() + 1;
                    aSouth[iCount4].setLosses(NewLosses);                                       
                }
                else{
                    int NewLosses = aNorth[iCount].getLosses() + 1;
                    aNorth[iCount].setLosses(NewLosses);
                    
                    int NewWins = aSouth[iCount4].getWins() + 1;
                    aSouth[iCount4].setLosses(NewWins);
                }
                
                }
                
                for(int iCount5 = 0; iCount5 < lboxWest.getModel().getSize(); iCount5++){
                                
                int iHome = rndGenerator.nextInt(100);
                int iAway = rndGenerator.nextInt(100);
                
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewWins = aNorth[iCount].getWins() + 1;
                    aNorth[iCount].setWins(NewWins);
                    
                    int NewLosses = aWest[iCount5].getLosses() + 1;
                    aWest[iCount5].setLosses(NewLosses);                                       
                }
                else{
                    int NewLosses = aNorth[iCount].getLosses() + 1;
                    aNorth[iCount].setLosses(NewLosses);
                    
                    int NewWins = aWest[iCount5].getWins() + 1;
                    aWest[iCount5].setLosses(NewWins);
                }
                
                }   
        }
        
        
        
        
        
        
        
        for(int iCount = 0; iCount < lboxEast.getModel().getSize(); iCount++){
            
            for(int iCount2 = iCount + 1; iCount2 < lboxEast.getModel().getSize(); iCount2++){
                
                int iHome;
                int iAway;
                
                iHome = rndGenerator.nextInt(100);
                iAway = rndGenerator.nextInt(100);
                
                iHome += 5;
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewWins = aEast[iCount].getWins() + 1;
                    aEast[iCount].setWins(NewWins);
                    
                    int NewLosses = aEast[iCount2].getLosses() + 1;
                    aEast[iCount2].setLosses(NewLosses);                                       
                }
                else{
                    int NewLosses = aEast[iCount].getLosses() + 1;
                    aEast[iCount].setLosses(NewLosses);
                    
                    int NewWins = aEast[iCount2].getWins() + 1;
                    aEast[iCount2].setLosses(NewWins);
                }
                
                
                iHome = rndGenerator.nextInt(100);
                iAway = rndGenerator.nextInt(100);
                
                iHome += 5;
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewLosses = aEast[iCount].getLosses() + 1;
                    aEast[iCount].setLosses(NewLosses);
                    
                    int NewWins = aEast[iCount2].getWins() + 1;
                    aEast[iCount2].setLosses(NewWins);                                       
                }
                else{
                    int NewWins = aEast[iCount].getWins() + 1;
                    aEast[iCount].setWins(NewWins);
                    
                    int NewLosses = aEast[iCount2].getLosses() + 1;
                    aEast[iCount2].setLosses(NewLosses);
                }
            }
                
                
                for(int iCount3 = 0; iCount3 < lboxSouth.getModel().getSize(); iCount3++){
                                
                int iHome = rndGenerator.nextInt(100);
                int iAway = rndGenerator.nextInt(100);
                
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewWins = aEast[iCount].getWins() + 1;
                    aEast[iCount].setWins(NewWins);
                    
                    int NewLosses = aSouth[iCount3].getLosses() + 1;
                    aSouth[iCount3].setLosses(NewLosses);                                       
                }
                else{
                    int NewLosses = aEast[iCount].getLosses() + 1;
                    aEast[iCount].setLosses(NewLosses);
                    
                    int NewWins = aSouth[iCount3].getWins() + 1;
                    aSouth[iCount3].setLosses(NewWins);
                }
                
                }
                
                
                for(int iCount4 = 0; iCount4 < lboxWest.getModel().getSize(); iCount4++){
                                
                int iHome = rndGenerator.nextInt(100);
                int iAway = rndGenerator.nextInt(100);
                
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewWins = aEast[iCount].getWins() + 1;
                    aEast[iCount].setWins(NewWins);
                    
                    int NewLosses = aWest[iCount4].getLosses() + 1;
                    aWest[iCount4].setLosses(NewLosses);                                       
                }
                else{
                    int NewLosses = aEast[iCount].getLosses() + 1;
                    aEast[iCount].setLosses(NewLosses);
                    
                    int NewWins = aWest[iCount4].getWins() + 1;
                    aWest[iCount4].setLosses(NewWins);
                }
                
                }
            }
        
        
        
        
        
        
        for(int iCount = 0; iCount < lboxSouth.getModel().getSize(); iCount++){
            
            for(int iCount2 = iCount + 1; iCount2 < lboxSouth.getModel().getSize(); iCount2++){
                
                int iHome;
                int iAway;
                
                iHome = rndGenerator.nextInt(100);
                iAway = rndGenerator.nextInt(100);
                
                iHome += 5;
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewWins = aSouth[iCount].getWins() + 1;
                    aSouth[iCount].setWins(NewWins);
                    
                    int NewLosses = aSouth[iCount2].getLosses() + 1;
                    aSouth[iCount2].setLosses(NewLosses);                                       
                }
                else{
                    int NewLosses = aSouth[iCount].getLosses() + 1;
                    aSouth[iCount].setLosses(NewLosses);
                    
                    int NewWins = aSouth[iCount2].getWins() + 1;
                    aSouth[iCount2].setLosses(NewWins);
                }
                
                
                iHome = rndGenerator.nextInt(100);
                iAway = rndGenerator.nextInt(100);
                
                iHome += 5;
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewLosses = aSouth[iCount].getLosses() + 1;
                    aSouth[iCount].setLosses(NewLosses);
                    
                    int NewWins = aSouth[iCount2].getWins() + 1;
                    aSouth[iCount2].setLosses(NewWins);                                       
                }
                else{
                    int NewWins = aSouth[iCount].getWins() + 1;
                    aSouth[iCount].setWins(NewWins);
                    
                    int NewLosses = aSouth[iCount2].getLosses() + 1;
                    aSouth[iCount2].setLosses(NewLosses);
                }
            }
                
                
                for(int iCount3 = 0; iCount3 < lboxWest.getModel().getSize(); iCount3++){
                                
                int iHome = rndGenerator.nextInt(100);
                int iAway = rndGenerator.nextInt(100);
                
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewWins = aSouth[iCount].getWins() + 1;
                    aSouth[iCount].setWins(NewWins);
                    
                    int NewLosses = aWest[iCount3].getLosses() + 1;
                    aWest[iCount3].setLosses(NewLosses);                                       
                }
                else{
                    int NewLosses = aSouth[iCount].getLosses() + 1;
                    aSouth[iCount].setLosses(NewLosses);
                    
                    int NewWins = aWest[iCount3].getWins() + 1;
                    aWest[iCount3].setLosses(NewWins);
                }
                }
                }
        
        
        
      
        
        
        
        
        
        for(int iCount = 0; iCount < lboxWest.getModel().getSize(); iCount++){
            
            for(int iCount2 = iCount + 1; iCount2 < lboxWest.getModel().getSize(); iCount2++){
                
                int iHome;
                int iAway;
                
                iHome = rndGenerator.nextInt(100);
                iAway = rndGenerator.nextInt(100);
                
                iHome += 5;
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewWins = aWest[iCount].getWins() + 1;
                    aWest[iCount].setWins(NewWins);
                    
                    int NewLosses = aWest[iCount2].getLosses() + 1;
                    aWest[iCount2].setLosses(NewLosses);                                       
                }
                else{
                    int NewLosses = aWest[iCount].getLosses() + 1;
                    aWest[iCount].setLosses(NewLosses);
                    
                    int NewWins = aWest[iCount2].getWins() + 1;
                    aWest[iCount2].setLosses(NewWins);
                }
                
                
                iHome = rndGenerator.nextInt(100);
                iAway = rndGenerator.nextInt(100);
                
                iHome += 5;
                
                while(iHome == iAway){
                    iHome += rndGenerator.nextInt(100);
                    iAway += rndGenerator.nextInt(100);
                }
                
                if(iHome > iAway){
                    
                    int NewLosses = aWest[iCount].getLosses() + 1;
                    aWest[iCount].setLosses(NewLosses);
                    
                    int NewWins = aWest[iCount2].getWins() + 1;
                    aWest[iCount2].setLosses(NewWins);                                       
                }
                else{
                    int NewWins = aWest[iCount].getWins() + 1;
                    aWest[iCount].setWins(NewWins);
                    
                    int NewLosses = aWest[iCount2].getLosses() + 1;
                    aWest[iCount2].setLosses(NewLosses);
                }
            }      
        }
        
        
    Arrays.sort(aNorth);
    Arrays.sort(aEast);
    Arrays.sort(aSouth);
    Arrays.sort(aWest);
    
    
    for(int iCount = 0; iCount < lboxNorth.getModel().getSize(); iCount++)
   // aNorth[iCount].setGB() = (aNorth[0].getWins() - aNorth[iCount].getWins());
    
    lblNorthTeam1.setText(aNorth[0].getName());
    lblNorthTeam2.setText(aNorth[1].getName());
    lblNorthTeam3.setText(aNorth[2].getName());
    lblNorthTeam4.setText(aNorth[3].getName());
    lblNorthTeam5.setText(aNorth[4].getName());
    lblNorthTeam6.setText(aNorth[5].getName());
    
    lblNorthTeam1Wins.setText(String.valueOf(aNorth[0].getWins()));
    lblNorthTeam2Wins.setText(String.valueOf(aNorth[1].getWins()));
    lblNorthTeam3Wins.setText(String.valueOf(aNorth[2].getWins()));
    lblNorthTeam4Wins.setText(String.valueOf(aNorth[3].getWins()));
    lblNorthTeam5Wins.setText(String.valueOf(aNorth[4].getWins()));
    lblNorthTeam6Wins.setText(String.valueOf(aNorth[5].getWins()));
        
    lblNorthTeam1Losses.setText(String.valueOf(aNorth[0].getLosses()));
    lblNorthTeam2Losses.setText(String.valueOf(aNorth[1].getLosses()));
    lblNorthTeam3Losses.setText(String.valueOf(aNorth[2].getLosses()));
    lblNorthTeam4Losses.setText(String.valueOf(aNorth[3].getLosses()));
    lblNorthTeam5Losses.setText(String.valueOf(aNorth[4].getLosses()));
    lblNorthTeam6Losses.setText(String.valueOf(aNorth[5].getLosses()));
    
    lblNorthTeam1GB.setText(String.valueOf(aNorth[0].getGB()));
    lblNorthTeam2GB.setText(String.valueOf(aNorth[1].getGB()));
    lblNorthTeam3GB.setText(String.valueOf(aNorth[2].getGB()));
    lblNorthTeam4GB.setText(String.valueOf(aNorth[3].getGB()));
    lblNorthTeam5GB.setText(String.valueOf(aNorth[4].getGB()));
    lblNorthTeam6GB.setText(String.valueOf(aNorth[5].getGB()));
    
    lblNorthWinner.setText(aNorth[0].getName());
    
    
    
    
    
    lblSouthTeam1.setText(aSouth[0].getName());
    lblSouthTeam2.setText(aSouth[1].getName());
    lblSouthTeam3.setText(aSouth[2].getName());
    lblSouthTeam4.setText(aSouth[3].getName());
    lblSouthTeam5.setText(aSouth[4].getName());
    lblSouthTeam6.setText(aSouth[5].getName());
    
    lblSouthTeam1Wins.setText(String.valueOf(aSouth[0].getWins()));
    lblSouthTeam2Wins.setText(String.valueOf(aSouth[1].getWins()));
    lblSouthTeam3Wins.setText(String.valueOf(aSouth[2].getWins()));
    lblSouthTeam4Wins.setText(String.valueOf(aSouth[3].getWins()));
    lblSouthTeam5Wins.setText(String.valueOf(aSouth[4].getWins()));
    lblSouthTeam6Wins.setText(String.valueOf(aSouth[5].getWins()));
        
    lblSouthTeam1Losses.setText(String.valueOf(aSouth[0].getLosses()));
    lblSouthTeam2Losses.setText(String.valueOf(aSouth[1].getLosses()));
    lblSouthTeam3Losses.setText(String.valueOf(aSouth[2].getLosses()));
    lblSouthTeam4Losses.setText(String.valueOf(aSouth[3].getLosses()));
    lblSouthTeam5Losses.setText(String.valueOf(aSouth[4].getLosses()));
    lblSouthTeam6Losses.setText(String.valueOf(aSouth[5].getLosses()));
    
    lblSouthTeam1GB.setText(String.valueOf(aSouth[0].getGB()));
    lblSouthTeam2GB.setText(String.valueOf(aSouth[1].getGB()));
    lblSouthTeam3GB.setText(String.valueOf(aSouth[2].getGB()));
    lblSouthTeam4GB.setText(String.valueOf(aSouth[3].getGB()));
    lblSouthTeam5GB.setText(String.valueOf(aSouth[4].getGB()));
    lblSouthTeam6GB.setText(String.valueOf(aSouth[5].getGB()));
    
    lblSouthWinner.setText(aSouth[0].getName());
    
    
    
    
    lblEastTeam1.setText(aEast[0].getName());
    lblEastTeam2.setText(aEast[1].getName());
    lblEastTeam3.setText(aEast[2].getName());
    lblEastTeam4.setText(aEast[3].getName());
    lblEastTeam5.setText(aEast[4].getName());
    lblEastTeam6.setText(aEast[5].getName());
    
    lblEastTeam1Wins.setText(String.valueOf(aEast[0].getWins()));
    lblEastTeam2Wins.setText(String.valueOf(aEast[1].getWins()));
    lblEastTeam3Wins.setText(String.valueOf(aEast[2].getWins()));
    lblEastTeam4Wins.setText(String.valueOf(aEast[3].getWins()));
    lblEastTeam5Wins.setText(String.valueOf(aEast[4].getWins()));
    lblEastTeam6Wins.setText(String.valueOf(aEast[5].getWins()));
        
    lblEastTeam1Losses.setText(String.valueOf(aEast[0].getLosses()));
    lblEastTeam2Losses.setText(String.valueOf(aEast[1].getLosses()));
    lblEastTeam3Losses.setText(String.valueOf(aEast[2].getLosses()));
    lblEastTeam4Losses.setText(String.valueOf(aEast[3].getLosses()));
    lblEastTeam5Losses.setText(String.valueOf(aEast[4].getLosses()));
    lblEastTeam6Losses.setText(String.valueOf(aEast[5].getLosses()));
    
    lblEastTeam1GB.setText(String.valueOf(aEast[0].getGB()));
    lblEastTeam2GB.setText(String.valueOf(aEast[1].getGB()));
    lblEastTeam3GB.setText(String.valueOf(aEast[2].getGB()));
    lblEastTeam4GB.setText(String.valueOf(aEast[3].getGB()));
    lblEastTeam5GB.setText(String.valueOf(aEast[4].getGB()));
    lblEastTeam6GB.setText(String.valueOf(aEast[5].getGB()));
    
    lblEastWinner.setText(aEast[0].getName());
    
    
    
    
    
    lblWestTeam1.setText(aWest[0].getName());
    lblWestTeam2.setText(aWest[1].getName());
    lblWestTeam3.setText(aWest[2].getName());
    lblWestTeam4.setText(aWest[3].getName());
    lblWestTeam5.setText(aWest[4].getName());
    lblWestTeam6.setText(aWest[5].getName());
    
    lblWestTeam1Wins.setText(String.valueOf(aWest[0].getWins()));
    lblWestTeam2Wins.setText(String.valueOf(aWest[1].getWins()));
    lblWestTeam3Wins.setText(String.valueOf(aWest[2].getWins()));
    lblWestTeam4Wins.setText(String.valueOf(aWest[3].getWins()));
    lblWestTeam5Wins.setText(String.valueOf(aWest[4].getWins()));
    lblWestTeam6Wins.setText(String.valueOf(aWest[5].getWins()));
        
    lblWestTeam1Losses.setText(String.valueOf(aWest[0].getLosses()));
    lblWestTeam2Losses.setText(String.valueOf(aWest[1].getLosses()));
    lblWestTeam3Losses.setText(String.valueOf(aWest[2].getLosses()));
    lblWestTeam4Losses.setText(String.valueOf(aWest[3].getLosses()));
    lblWestTeam5Losses.setText(String.valueOf(aWest[4].getLosses()));
    lblWestTeam6Losses.setText(String.valueOf(aWest[5].getLosses()));
    
    lblWestTeam1GB.setText(String.valueOf(aWest[0].getGB()));
    lblWestTeam2GB.setText(String.valueOf(aWest[1].getGB()));
    lblWestTeam3GB.setText(String.valueOf(aWest[2].getGB()));
    lblWestTeam4GB.setText(String.valueOf(aWest[3].getGB()));
    lblWestTeam5GB.setText(String.valueOf(aWest[4].getGB()));
    lblWestTeam6GB.setText(String.valueOf(aWest[5].getGB()));
    
    lblWestWinner.setText(aWest[0].getName());
    
    
    int iNorth = rndGenerator.nextInt(100);
    int iEast = rndGenerator.nextInt(100);
    
    while(iNorth == iEast)
    {
        iNorth += rndGenerator.nextInt(100);
        iEast += rndGenerator.nextInt(100);
    }
    
    if(iNorth > iEast)
    {
        lblNorthEastWinner.setText(aNorth[0].getName());
    }
    else{
        lblNorthEastWinner.setText(aEast[0].getName());
    }
    
    
    int iWest = rndGenerator.nextInt(100);
    int iSouth = rndGenerator.nextInt(100);
    
    while(iWest == iSouth)
    {
        iWest += rndGenerator.nextInt(100);
        iSouth += rndGenerator.nextInt(100);
    }
    
    if(iWest > iSouth)
    {
        lblSouthWestWinner.setText(aWest[0].getName());
    }
    else{
        lblSouthWestWinner.setText(aSouth[0].getName());
    }
    
    int iNorthEast = rndGenerator.nextInt(100);
    int iSouthWest = rndGenerator.nextInt(100);
    
    while(iNorthEast == iSouthWest)
    {
        iNorthEast += rndGenerator.nextInt(100);
        iSouthWest += rndGenerator.nextInt(100);
    }
    
    if(iNorthEast > iSouthWest)
    {
        lblChampion.setText(lblNorthEastWinner.getText());
    }
    else{
        lblChampion.setText(lblSouthWestWinner.getText());
    }
   
    
    
    
    
    
        
        
        
    }//GEN-LAST:event_btnPlayMouseClicked

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            //getLogger(class.getName()).log(SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblChampion;
    private javax.swing.JLabel lblEastTeam1;
    private javax.swing.JLabel lblEastTeam1GB;
    private javax.swing.JLabel lblEastTeam1Losses;
    private javax.swing.JLabel lblEastTeam1Wins;
    private javax.swing.JLabel lblEastTeam2;
    private javax.swing.JLabel lblEastTeam2GB;
    private javax.swing.JLabel lblEastTeam2Losses;
    private javax.swing.JLabel lblEastTeam2Wins;
    private javax.swing.JLabel lblEastTeam3;
    private javax.swing.JLabel lblEastTeam3GB;
    private javax.swing.JLabel lblEastTeam3Losses;
    private javax.swing.JLabel lblEastTeam3Wins;
    private javax.swing.JLabel lblEastTeam4;
    private javax.swing.JLabel lblEastTeam4GB;
    private javax.swing.JLabel lblEastTeam4Losses;
    private javax.swing.JLabel lblEastTeam4Wins;
    private javax.swing.JLabel lblEastTeam5;
    private javax.swing.JLabel lblEastTeam5GB;
    private javax.swing.JLabel lblEastTeam5Losses;
    private javax.swing.JLabel lblEastTeam5Wins;
    private javax.swing.JLabel lblEastTeam6;
    private javax.swing.JLabel lblEastTeam6GB;
    private javax.swing.JLabel lblEastTeam6Losses;
    private javax.swing.JLabel lblEastTeam6Wins;
    private javax.swing.JLabel lblEastWinner;
    private javax.swing.JLabel lblNorthEastWinner;
    private javax.swing.JLabel lblNorthTeam1;
    private javax.swing.JLabel lblNorthTeam1GB;
    private javax.swing.JLabel lblNorthTeam1Losses;
    private javax.swing.JLabel lblNorthTeam1Wins;
    private javax.swing.JLabel lblNorthTeam2;
    private javax.swing.JLabel lblNorthTeam2GB;
    private javax.swing.JLabel lblNorthTeam2Losses;
    private javax.swing.JLabel lblNorthTeam2Wins;
    private javax.swing.JLabel lblNorthTeam3;
    private javax.swing.JLabel lblNorthTeam3GB;
    private javax.swing.JLabel lblNorthTeam3Losses;
    private javax.swing.JLabel lblNorthTeam3Wins;
    private javax.swing.JLabel lblNorthTeam4;
    private javax.swing.JLabel lblNorthTeam4GB;
    private javax.swing.JLabel lblNorthTeam4Losses;
    private javax.swing.JLabel lblNorthTeam4Wins;
    private javax.swing.JLabel lblNorthTeam5;
    private javax.swing.JLabel lblNorthTeam5GB;
    private javax.swing.JLabel lblNorthTeam5Losses;
    private javax.swing.JLabel lblNorthTeam5Wins;
    private javax.swing.JLabel lblNorthTeam6;
    private javax.swing.JLabel lblNorthTeam6GB;
    private javax.swing.JLabel lblNorthTeam6Losses;
    private javax.swing.JLabel lblNorthTeam6Wins;
    private javax.swing.JLabel lblNorthWinner;
    private javax.swing.JLabel lblSouthTeam1;
    private javax.swing.JLabel lblSouthTeam1GB;
    private javax.swing.JLabel lblSouthTeam1Losses;
    private javax.swing.JLabel lblSouthTeam1Wins;
    private javax.swing.JLabel lblSouthTeam2;
    private javax.swing.JLabel lblSouthTeam2GB;
    private javax.swing.JLabel lblSouthTeam2Losses;
    private javax.swing.JLabel lblSouthTeam2Wins;
    private javax.swing.JLabel lblSouthTeam3;
    private javax.swing.JLabel lblSouthTeam3GB;
    private javax.swing.JLabel lblSouthTeam3Losses;
    private javax.swing.JLabel lblSouthTeam3Wins;
    private javax.swing.JLabel lblSouthTeam4;
    private javax.swing.JLabel lblSouthTeam4GB;
    private javax.swing.JLabel lblSouthTeam4Losses;
    private javax.swing.JLabel lblSouthTeam4Wins;
    private javax.swing.JLabel lblSouthTeam5;
    private javax.swing.JLabel lblSouthTeam5GB;
    private javax.swing.JLabel lblSouthTeam5Losses;
    private javax.swing.JLabel lblSouthTeam5Wins;
    private javax.swing.JLabel lblSouthTeam6;
    private javax.swing.JLabel lblSouthTeam6GB;
    private javax.swing.JLabel lblSouthTeam6Losses;
    private javax.swing.JLabel lblSouthTeam6Wins;
    private javax.swing.JLabel lblSouthWestWinner;
    private javax.swing.JLabel lblSouthWinner;
    private javax.swing.JLabel lblWestTeam1;
    private javax.swing.JLabel lblWestTeam1GB;
    private javax.swing.JLabel lblWestTeam1Losses;
    private javax.swing.JLabel lblWestTeam1Wins;
    private javax.swing.JLabel lblWestTeam2;
    private javax.swing.JLabel lblWestTeam2GB;
    private javax.swing.JLabel lblWestTeam2Losses;
    private javax.swing.JLabel lblWestTeam2Wins;
    private javax.swing.JLabel lblWestTeam3;
    private javax.swing.JLabel lblWestTeam3GB;
    private javax.swing.JLabel lblWestTeam3Losses;
    private javax.swing.JLabel lblWestTeam3Wins;
    private javax.swing.JLabel lblWestTeam4;
    private javax.swing.JLabel lblWestTeam4GB;
    private javax.swing.JLabel lblWestTeam4Losses;
    private javax.swing.JLabel lblWestTeam4Wins;
    private javax.swing.JLabel lblWestTeam5;
    private javax.swing.JLabel lblWestTeam5GB;
    private javax.swing.JLabel lblWestTeam5Losses;
    private javax.swing.JLabel lblWestTeam5Wins;
    private javax.swing.JLabel lblWestTeam6;
    private javax.swing.JLabel lblWestTeam6GB;
    private javax.swing.JLabel lblWestTeam6Losses;
    private javax.swing.JLabel lblWestTeam6Wins;
    private javax.swing.JLabel lblWestWinner;
    private javax.swing.JList lboxEast;
    private javax.swing.JList lboxNorth;
    private javax.swing.JList lboxSouth;
    private javax.swing.JList lboxWest;
    private javax.swing.JPanel pnlEast;
    private javax.swing.JPanel pnlEastStandings;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JPanel pnlNorthStandings;
    private javax.swing.JPanel pnlSouth;
    private javax.swing.JPanel pnlSouthStandings;
    private javax.swing.JPanel pnlWest;
    private javax.swing.JPanel pnlWestStandings;
    // End of variables declaration//GEN-END:variables
}
