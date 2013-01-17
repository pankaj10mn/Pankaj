/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Map extends javax.swing.JFrame {
	
    int counter=0;
    String source,destination;
    String[][] arr;
    public Map() {
        initComponents();
        this.setLocation(300, 150);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	arr=new String[counter+1][counter+1];
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new MyPanel();
        landmarkRadioButton = new javax.swing.JRadioButton();
        roadRadioButton = new javax.swing.JRadioButton();
        finalButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        landmarkTextField = new javax.swing.JTextField();
        landmarkLabel = new javax.swing.JLabel();
        fromTextField = new javax.swing.JTextField();
        fromLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        toTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        sdRadioButton = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Map");
        setResizable(false);
        

        jPanel1.setBackground(new java.awt.Color(204, 185, 164));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 51), new java.awt.Color(51, 255, 51), new java.awt.Color(255, 51, 0), new java.awt.Color(255, 153, 51)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        buttonGroup2.add(landmarkRadioButton);
        landmarkRadioButton.setText("LandMark");
        landmarkRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                landmarkRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(roadRadioButton);
        roadRadioButton.setText("Roads");
        roadRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roadRadioButtonActionPerformed(evt);
            }
        });

        finalButton.setText("Final");
        finalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalButtonMouseClicked(evt);
            }
        });
        finalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //finalButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });

        landmarkLabel.setText("Name of LandMark");

        fromLabel.setText("From");

        toLabel.setText("to");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\welcome.jpg")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\10483200-taxi-cab.jpg")); // NOI18N

        doneButton.setText("Done");
        doneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneButtonMouseClicked(evt);
            }
        });
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //doneButtonActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        buttonGroup2.add(sdRadioButton);
        sdRadioButton.setText("Source & Dest.");
        sdRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdRadioButtonActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        exitMenuItem.setText("Exit");
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        jMenu2.setText("Map");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(landmarkRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(landmarkLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(landmarkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roadRadioButton)
                        .addGap(34, 34, 34)
                        .addComponent(fromLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toTextField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sdRadioButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(landmarkRadioButton)
                            .addComponent(landmarkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(landmarkLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roadRadioButton)
                            .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromLabel)
                            .addComponent(toLabel)
                            .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(finalButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sdRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doneButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                                                          

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
       Graphics2D g=(Graphics2D) this.jPanel1.getGraphics();
       
        if(this.landmarkRadioButton.isSelected()){
            try{
		FileInputStream fstream = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\"
                                                              +"Cab Resevation\\src\\Reservation\\LandMark.txt");
		DataInputStream in;
                in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
                int abc =0;
                while ((strLine = br.readLine()) != null) {
                    String [] LM = strLine.split(" ");
                    if(LM[0].equals(landmarkTextField.getText())){
                        JOptionPane.showMessageDialog(this,"You have entered same landmark name again!!!.\n"+
                                                "Please Enter another one!!","Error",JOptionPane.ERROR_MESSAGE);
                        abc++;
                    }
		}
                if(abc==0){
                	this.jPanel1.landmark_Draw(evt.getX(), evt.getY(), landmarkTextField.getText()); 
                   System.out.println("Graphics created");
                    FileWriter fw;
                    try {
                        fw = new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\LandMark.txt",true);
                
                        fw.write(landmarkTextField.getText()+" "+evt.getX()+" "+evt.getY()+"\n");
                        counter++;
                        System.out.println("LandMark name and it's cordinate has been written in file.");
                        fw.close();
                    } catch (IOException ex) {
                            Logger.getLogger(abc.Map.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
		in.close();
		}catch (IOException | HeadlessException e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
            
        }
        if(this.roadRadioButton.isSelected()){
           String from= fromTextField.getText();
           String to = toTextField.getText();
           int x1=0,x2 = 0,y1=0,y2=0;
           try{
		FileInputStream fstream = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\src\\Reservation\\LandMark.txt");
		DataInputStream in;
                in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine,l1=null,l2=null;
                while ((strLine = br.readLine())!= null) 
		{	
                    
                    String [] check = strLine.split(" ");
                    if(check[0].equals(from)){
                        x1=Integer.parseInt(check[1]);
                        y1=Integer.parseInt(check[2]);
                        l1=check[0];
                        
                    }
                    if(check[0].equals(to)){
                        x2=Integer.parseInt(check[1]);
                        y2=Integer.parseInt(check[2]);
                        l2=check[0];
                    }
		}
               //-------------------------------------------------------
                try {
                        FileWriter fww = new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\Road.txt",true);
                
                        fww.write((x1+6)+" "+(y1+6)+" "+(x2+6)+" "+(y2+6)+" "+l1+" "+l2+" "+this.setDistance(x1, y1, x2, y2)+"\n");
                        fww.close();
                
                        } catch (IOException ex) {
                        Logger.getLogger(abc.Map.class.getName()).log(Level.SEVERE, null, ex);
                        }
                
                //------------------------------------------
                
                
                
		in.close();
		}catch (IOException | NumberFormatException e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
           this.jPanel1.inLineDraw(x1+6,y1+6,x2+6,y2+6);
           //g.drawLine(x1+6,y1+6,x2+6,y2+6);
           System.out.println("Road created!!!");
           
        }
    }                                    

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
         try {
                FileWriter fw = new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\LandMark.txt",false);
                FileWriter fw1 = new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\Final\\LandMark.txt",false);
                FileWriter fw2 = new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\Road.txt",false);
                FileWriter fw3 = new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\Final\\Road.txt",false);
                FileWriter fw4 = new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\Final\\graph.txt",false);
                FileWriter fw5 = new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\Final\\path.txt",false);
                
                fw.write("");
                fw1.write("");
                fw2.write("");
                fw3.write("");
                fw4.write("");
                fw5.write("");
                fw.close();
                fw1.close();
                fw2.close();
                fw3.close();
                fw4.close();
                fw5.close();
            } catch (IOException ex) {
                Logger.getLogger(abc.Map.class.getName()).log(Level.SEVERE, null, ex);
            }
         jPanel1.repaint();
         landmarkTextField.setText("");
         fromTextField.setText("");
         toTextField.setText("");
    }                                                                               

    private void finalButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        FileInputStream fstream;
        try {
            fstream = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\"
                                                  +"Cab Resevation\\src\\Reservation\\LandMark.txt");
            DataInputStream in;
            in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null){	
		FileWriter fw;
            try {
                fw = new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\Final\\LandMark.txt",true);
                
                fw.write(strLine+"\n");
                System.out.println("Final LandMark File has been updated..");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(abc.Map.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(abc.Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        FileInputStream fstream1;
        try {
            fstream1 = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\"
                                                  +"Cab Resevation\\src\\Reservation\\Road.txt");
            DataInputStream in;
            in = new DataInputStream(fstream1);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null){	
		FileWriter fw;
            try {
                fw = new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\Final\\Road.txt",true);
                
                fw.write(strLine+"\n");
                System.out.println("Final Road File has been updated..");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(abc.Map.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(abc.Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.setArray();
        for(int i=0;i<counter+1;i++){
            for(int j=0;j<counter+1;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
    }                                                                                   

    private void sdRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        this.finalButton.setEnabled(false);
        this.resetButton.setEnabled(false);
        this.doneButton.setEnabled(true);
        JOptionPane.showMessageDialog(this,"Please,  Enter  name of  'Source'  and  'Destination'\n in  Front  of  'From'  and  'to'  Labels!!\n"+
                                                "Thanks !!","Warning",JOptionPane.WARNING_MESSAGE);
        
    }                                             
    private int setDistance(int x,int y, int x1, int y1 ){
        return (int)(Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2)));
    }
    //------------------------------------------------
    
    public void setArray(){
        arr=new String[counter+1][counter+1];
        jPanel1.counter=counter;
        int i=1;
        try{
		FileInputStream fstream = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\src\\Reservation\\Final\\LandMark.txt");
		DataInputStream in;
                in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
                while ((strLine = br.readLine())!= null) 
		{			
                  String[] s=strLine.split(" ");
                  
                  arr[0][i]=s[0];
                  arr[i][0]=s[0];
                  i++;  
		}
                
                in.close();
	}catch (IOException | NumberFormatException e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
	}
        //**************
        try{
                //i=2;
		FileInputStream fstream1 = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\src\\Reservation\\Final\\Road.txt");
		DataInputStream in;
                in = new DataInputStream(fstream1);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine1;
                while (((strLine1 = br.readLine())!= null))
		{	
                  String[] s=strLine1.split(" ");
                  for(i=2;i<counter+1;i++){
                      for(int j=1;j<i;j++){
                            if((arr[i][0].equals(s[4])&&arr[0][j].equals(s[5]))||(arr[0][j].equals(s[4])&&arr[i][0].equals(s[5]))){
                                System.out.print(arr[i][0]+"\t"+arr[0][j]+"\tand\t"+s[4]+" "+s[5]+"\n");
                                arr[i][j]=s[6];
                                arr[j][i]=s[6];
                            }
                       } 
                  }
                }
                in.close();
	}catch (IOException | NumberFormatException e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
	}
        
        for(i=0;i<counter+1;i++){
            for(int j=0;j<counter+1;j++){
                if(arr[i][j]==null){
                    arr[i][j]="0";
                }
                
            }
                   
        }
    }
    //------------------------------------------------------
                                             

    private void doneButtonMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        double[][] cost=new double[counter][counter];
        jPanel1.counter=counter;
        int sIndex=0, dIndex=0;
        source=fromTextField.getText();
        destination=toTextField.getText();
        for(int i=0;i<counter+1;i++){
            if(arr[i][0].equals(source)){
                sIndex=i-1;
            }
            if(arr[0][i].equals(destination)){
                dIndex=i-1;
            }
        }
        try {
                        FileWriter fw = new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\Final\\graph.txt",true);
                        fw.write(counter+"\n");
                        for(int i=1;i<counter+1;i++){
                                for(int j=1;j<counter+1;j++){
                                       cost[i-1][j-1]=Double.parseDouble(arr[i][j]);
                                       fw.write(arr[i][j]+" ");
                                }
                                fw.write("\n");
                        }
                        
                        System.out.println("graph file created.");
                        fw.close();
                    } catch (IOException ex) {
                            Logger.getLogger(abc.Map.class.getName()).log(Level.SEVERE, null, ex);
                    }
        try {        
            graph G = new graph("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\Final\\graph.txt");
            dijkstra.dijkstra_function(G, sIndex);
        } catch (IOException ex) {
            Logger.getLogger(abc.Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        //--------Checking destination-------------
        FileInputStream fstream;
        try {
            fstream = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Cab Resevation\\"
                                                     + "src\\Reservation\\Final\\path.txt");
            DataInputStream in;
            in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            try {
                while ((strLine = br.readLine())!= null){
                    String[] ss=strLine.split(" ");
                    if(dIndex==Integer.parseInt(ss[ss.length-1])){
                    	jPanel1.path=strLine;
                        System.out.println("\n"+strLine);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(abc.Map.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(abc.Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        //-Initialized the cab objects****----------------------------------
        for(int i=0;i<10;i++){
        	jPanel1.cab[i]=new Cab();
            jPanel1.cab[i].isRunning=false;
            jPanel1.cab[i].cabNo="PM22"+i;
            jPanel1.cab[i].distance=0;
            if(i==0||i==1){jPanel1.cab[i].totalSeats=1;}
            if(i>=2&&i<=6){jPanel1.cab[i].totalSeats=3;}
            if(i>=7&&i<=9){jPanel1.cab[i].totalSeats=8;}
        }// done initialize
        
        for(int i=0;i<10;i++){
        	if(jPanel1.cab[i].isRunning==false){jPanel1.avCab++;}
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CabSelect().setVisible(true);
               
            }
        });
		 
        
        
    }                                       
    //==============================================================================================================
    
    
    
    private void landmarkRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
        this.finalButton.setEnabled(true);
        this.resetButton.setEnabled(true);
        this.doneButton.setEnabled(false);
    }                                                   

    private void roadRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        this.finalButton.setEnabled(true);
        this.resetButton.setEnabled(true);
        this.doneButton.setEnabled(false);
    }                                               

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(abc.Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abc.Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abc.Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abc.Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abc.Map().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton doneButton;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton finalButton;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    static MyPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel landmarkLabel;
    private javax.swing.JRadioButton landmarkRadioButton;
    private javax.swing.JTextField landmarkTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JRadioButton roadRadioButton;
    private javax.swing.JRadioButton sdRadioButton;
    private javax.swing.JLabel toLabel;
    private javax.swing.JTextField toTextField;
    // End of variables declaration                   
}


class MyPanel extends javax.swing.JPanel {
	
	int counter;
	int blink=0;
	String path;
	boolean isOK=false;
	int avCab=0,n;
	int x=0,y=0,x1=1,y1=1;
	int a,b,c,d,i=0,l=0;
	Point current=new Point();
	Point dest=new Point();
	Point[] point;
	double[] slope;
	Cab[] cab = new Cab[10];
	String[] arr1;
	int[] loop;
	//For initial draw
	int Y=0,Z=0;
	int[] A=new int[20]; int[] B=new int[20];
	int[] C=new int[20];int[] D=new int[20];int[] E=new int[20];int[] F=new int[20];
	String[] landmark=new String[20];
	int p=0,q=0;
	String[] node;
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
            Graphics2D g1=(Graphics2D) g;
            FileInputStream fstream;
            try {
                fstream = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\"
                                                  +"Cab Resevation\\src\\Reservation\\Final\\LandMark.txt");
                DataInputStream in;
                in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String strLine;
                while ((strLine = br.readLine()) != null){
                    String [] s=strLine.split(" ");
                    x=Integer.parseInt(s[1]);
                    y=Integer.parseInt(s[2]);
                    g1.setColor(Color.GREEN);
                    g1.fillOval(x,y, 12, 12);
                    g1.setColor(Color.BLACK); 
                    g1.drawChars(s[0].toCharArray(),0, s[0].length(), x-10, y-10);
                   
                }
                in.close();
            } catch (IOException ex) {
            
            }
            FileInputStream fstream1;
            try {
                fstream1 = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\"
                                                  +"Cab Resevation\\src\\Reservation\\Final\\Road.txt");
                DataInputStream in;
                in = new DataInputStream(fstream1);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String strLine;
                while ((strLine = br.readLine()) != null){
                    String [] s=strLine.split(" ");
                    x=Integer.parseInt(s[0]);
                    y=Integer.parseInt(s[1]);
                    x1=Integer.parseInt(s[2]);
                    y1=Integer.parseInt(s[3]);
                    g1.drawLine(x, y, x1, y1);
                    
                }
                in.close();
            } catch (IOException ex) {
            
            }
            if(this.isOK==true){
            	
            	if(l==0){
            		//*********************Getting Point*************************//
            		
            		
            		String[] f=path.split(" ");
                    n=f.length;
                	node= new String[n-1];
                	for(int mm=0;mm<n-1;mm++){
                		node[mm]=new String();
                	}
                	slope=new double[n-2];
                	loop=new int[n-2];
                	for(int nn=0;nn<n-2;nn++){loop[nn]=0;}
                	loop[0]=1;
                	this.getArr1();
                	for(int i=0;i<n-1;i++){
                		
                		node[i]=arr1[Integer.parseInt(f[i+1])];
                		System.out.println("Node\t"+node[i]);
                	}
                	point=new Point[n-1];
                	System.out.println("Out from point loop");
                	for(int i=0;i<n-1;i++){
                		point[i]=new Point();
                		System.out.println("Entered in loop for point");
                		FileInputStream fstream11;
                        try {
                            fstream11 = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\"
                                                              +"Cab Resevation\\src\\Reservation\\Final\\LandMark.txt");
                            DataInputStream in;
                            in = new DataInputStream(fstream11);
                            BufferedReader br = new BufferedReader(new InputStreamReader(in));
                            String strLine;
                            while ((strLine = br.readLine()) != null){
                            	System.out.println("Reading line by line");
                                String[] s=strLine.split(" ");
                                if(s[0].equals(node[i])){
                                	point[i].x=Integer.parseInt(s[1]);
                                	point[i].y=Integer.parseInt(s[2]);
                                	System.out.println("X Y : "+point[i].x+" "+point[i].y );
                                }
                               
                            }
                            in.close();
                        } catch (IOException ex) {
                        
                        }
                		
                	}System.out.println("Out again from loop for point");
            		
            		
            		
            		
            		//this.getPoint();
            		//*******************end Getting Point***********************//
                	for(int i=0;i<n-2;i++){
                			System.out.println("Dividing to "+(point[i+1].y-point[i].y));
                			System.out.println("Dividing by "+(point[i+1].x-point[i].x));
                			slope[i]=((point[i+1].y-point[i].y)/(point[i+1].x-point[i].x));
                			System.out.println("slope"+"["+i+"] : "+slope[i]);
                		
                		                	}
                	l=1;
                	current.x=point[0].x; current.y=point[0].y;
                	System.out.println("red point : "+current.x+" "+current.y);
            	}
            	//loop[0]=1;
            	
            	for(int ab=0;ab<n-2;ab++){
            		if(loop[ab]==1){
            			//current.x=point[ab].x; current.y=point[ab].y;
            			dest.x=point[ab+1].x;  dest.y=point[ab+1].y;
            			blink++;
            			if(blink%10==0){
            			
            				if(current.x<=dest.x){
            					current.x+=1;
            				}
            				else{
            					current.x-=1;
            				}
            				if(current.y<dest.y){
            					current.y+=(Math.abs(slope[ab]))*1;
            				}
            				else{
            					current.y-=(Math.abs(slope[ab]))*1;
            				}
            				if(current.x==dest.x||current.y==dest.y){
            					loop[ab]=0;
            					loop[ab+1]=1;
            					current.x=dest.x; current.y=dest.y;
            					
            				}
            				
            				g1.setColor(Color.RED);
                       	 	g1.fillOval((int)current.x, (int)current.y, 10, 10);
            			}
            			
            		}
            	}
            	
            	
            	
            	 
            }
           
            
            
            
            
            if(p==1){
            	for(int kk=0;kk<Y;kk++){
            		g1.setColor(Color.green);
                    g1.fillOval(A[kk],B[kk], 12, 12);
                    g1.setColor(Color.BLACK); 
                    g1.drawChars(landmark[kk].toCharArray(),0, landmark[kk].length(), A[kk]-10, B[kk]-10);
                }
            }
            if(q==1){
            	for(int kk=0;kk<Z;kk++){
            		g1.drawLine(C[kk], D[kk], E[kk], F[kk]);
                }
            }
            this.repaint();
            
        }
    public void getArr1(){
    	 arr1=new String[counter];
    	for(int j=0;j<counter;j++){
    		 arr1[j]=new String();
    	}
    	FileInputStream fstream11;
        try {
            fstream11 = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\"
                                              +"Cab Resevation\\src\\Reservation\\Final\\LandMark.txt");
            int i=0;
            System.out.println("jPanel1.counter is : "+this.counter+" "+i);
            DataInputStream in;
            in = new DataInputStream(fstream11);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null){
            	System.out.println("Reading line by line");
                String[] s=strLine.split(" ");
                System.out.println(i+" and "+s[0]);
                arr1[i]=s[0];
                System.out.println(arr1[i]+" and "+s[0]);
               i++;
            }
            in.close();
        } catch (IOException ex) {
        
        }
	
	}
    public void inLineDraw(int w, int x, int y, int z){
    	C[Z]=w;D[Z]=x;
    	E[Z]=y;F[Z]=z;
    	Z++;
    	q=1;
    }
    public void landmark_Draw(int x, int y, String a){
    	
    	A[Y]=x;B[Y]=y;landmark[Y]=a;
    	Y++;
    	p=1;
    }
}

class Point{
	double x,y;
}

