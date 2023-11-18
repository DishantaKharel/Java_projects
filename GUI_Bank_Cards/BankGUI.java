import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Bank GUI 
 *
 * Dishant kharel
 * @version (a version number or a date)
 */
public class BankGUI implements ActionListener
{
    private JFrame jf;                                                                                                                                                                      //declaring frame name
    private JButton add_d, add_c, b_withdraw, display_c, clear, set_c, cancel_c, display_d;                                                                                                 //declaring button names
    private JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15,jl16,jl17,jl18;                                                                                        //declaring label name
    private JTextField d_cardID, d_bankac, pinnum, d_balanceamt, d_issue, d_client,c_cardID, c_bankac, cvcnum, c_balanceamt, intrate, c_issue, c_client, w_amount, g_period, c_limit;       //declaring text field name
    private JComboBox <String>jc1,jc2,jc3,jc4,jc5,jc6;                                                                                                                                      //declaring combo box name
    private JPanel jp;                                                                                                                                                                      //declaring panel name
    ArrayList<bankCard> arraylist  = new ArrayList<bankCard>();                                                                                                                             // making an array list of class bankCard
    public BankGUI()                                                                //counstructor of BankGUI class
    {
       //setting values for jlabel, jframe, jbutton, jtextfield, jcombobox
       jf = new JFrame("Bank GUI");                                         
       jp = new JPanel();
       
       jl1 = new JLabel("Card ID:");
       d_cardID = new JTextField();
       jl2 = new JLabel("Bank Account:");
       d_bankac = new JTextField();
       jl3 = new JLabel("Pin Number:");
       pinnum = new JTextField();
       jl4 = new JLabel("Balance Amount:");
       d_balanceamt = new JTextField();
       jl5 = new JLabel("Issuer Bank:");
       d_issue = new JTextField();
       jl6 = new JLabel("Client Name:");
       d_client = new JTextField();
       jl7 = new JLabel("Card ID:");
       c_cardID = new JTextField();
       jl8 = new JLabel("Bank Account:");
       c_bankac = new JTextField();
       jl9 = new JLabel("CVC Number:");
       cvcnum = new JTextField();
       jl10 = new JLabel("Balance Amount:");
       c_balanceamt = new JTextField();
       jl11 = new JLabel("Interest Rate:");
       intrate = new JTextField();
       jl12 = new JLabel("Issuer Bank:");
       c_issue = new JTextField();
       jl13 = new JLabel("Client Name:");
       c_client = new JTextField();
       
       jl14 = new JLabel("Withdraw Amount:");
       w_amount = new JTextField();
       jl15 = new JLabel("Grace Period");
       g_period = new JTextField();
       jl16 = new JLabel("Expiration Date");
       jl17 = new JLabel("Credit Limit");
       c_limit = new JTextField();
       jl18 = new JLabel("Withdrawal Date");
       
       add_d = new JButton("Add Debit");
       add_c = new JButton("Add Credit");
       clear = new JButton("Clear");
       display_c = new JButton("Display Credit");
       set_c = new JButton("Set Credit");
       cancel_c = new JButton("Cancel Credit");
       b_withdraw = new JButton("Withdraw amount");
       display_d = new JButton("Display Debit");
       
       String list1[] = {"Year","2012","2013","2014","2015","2016"};
       String list2[] = {"Month","Jan","Feb","March","April","May"};
       String list3[] = {"Day","1","2","3","4","5","10","20","30"};
       String list4[] = {"Year","2012","2013","2014","2015","2016"};
       String list5[] = {"Month","Jan","Feb","March","April","May"};
       String list6[] = {"Day","1","2","3","4","5","10","20","30"};
       
       jc1 = new JComboBox<>(list1);            //adiing list to the comboboc
       jc2 = new JComboBox<>(list2);            //adiing list to the comboboc
       jc3 = new JComboBox<>(list3);            //adiing list to the comboboc
       jc4 = new JComboBox<>(list4);            //adiing list to the comboboc
       jc5 = new JComboBox<>(list5);            //adiing list to the comboboc
       jc6 = new JComboBox<>(list6);            //adiing list to the comboboc
       
       
       //setting bounds in GUI according to the needs
       jl1.setBounds(28,94,52,16);
       d_cardID.setBounds(141,82,138,32);
       jl2.setBounds(349,94,90,20);
       d_bankac.setBounds(457,82,147,32);
       jl3.setBounds(651,94,75,20);
       pinnum.setBounds(796,82,147,32);
       jl6.setBounds(28,139,81,20);
       d_client.setBounds(141,133,138,32);
       jl5.setBounds(349,139,78,20);
       d_issue.setBounds(457,133,147,32);
       jl14.setBounds(643,139,125,20);
       w_amount.setBounds(796,133,147,32);
       jl4.setBounds(28,195,106,20);
       d_balanceamt.setBounds(141,189,138,32);
       jl18.setBounds(640,190,96,20);
       jc1.setBounds(744,184,83,32);
       jc2.setBounds(827,184,83,32);
       jc3.setBounds(911,184,83,32);
       
       clear.setBounds(28,258,120,32);
       add_d.setBounds(409,258,120,32);
       display_d.setBounds(409,202,120,32);
       b_withdraw.setBounds(784,258,159,32);
       
       jl7.setBounds(28,346,52,20);
       c_cardID.setBounds(141,340,138,32);
       jl8.setBounds(343,346,90,20);
       c_bankac.setBounds(469,340,147,32);
       jl9.setBounds(647,346,87,20);
       cvcnum.setBounds(796,340,147,32);
       jl10.setBounds(28,402,106,20);
       c_balanceamt.setBounds(141,396,138,32);
       jl11.setBounds(343,402,86,20);
       intrate.setBounds(469,396,147,32);
       jl13.setBounds(647,402,81,20);
       c_client.setBounds(796,396,147,32);
       jl12.setBounds(28,458,78,20);
       c_issue.setBounds(141,452,138,32);
       jl17.setBounds(343,458,75,20);
       c_limit.setBounds(469,452,147,32);
       jl15.setBounds(647,458,86,20);
       g_period.setBounds(796,442,147,32);
       jl16.setBounds(647,502,100,20);
       jc4.setBounds(754,490,83,32);
       jc5.setBounds(837,490,83,32);
       jc6.setBounds(918,490,83,32);
       
       display_c.setBounds(28,595,120,32);
       add_c.setBounds(409,595,120,32);
       set_c.setBounds(796,558,120,32);
       cancel_c.setBounds(796,614,120,32);
       
       //adding all the components to the panel
       jp.add(jl1);
       jp.add(jl2);
       jp.add(jl3);
       jp.add(jl4);
       jp.add(jl5);
       jp.add(jl6);
       jp.add(jl7);
       jp.add(jl8);
       jp.add(jl9);
       jp.add(jl10);
       jp.add(jl11);
       jp.add(jl12);
       jp.add(jl13);
       jp.add(jl14);
       jp.add(jl15);
       jp.add(jl16);
       jp.add(jl17);
       jp.add(jl18);
       jp.add(d_cardID);
       jp.add(d_bankac);
       jp.add(pinnum);
       jp.add(d_balanceamt);
       jp.add(d_issue);
       jp.add(d_client);
       jp.add(c_cardID);
       jp.add(c_bankac);
       jp.add(cvcnum);
       jp.add(c_balanceamt);
       jp.add(intrate);
       jp.add(c_issue);
       jp.add(c_client);
       jp.add(w_amount);
       jp.add(g_period);
       jp.add(c_limit);
       jp.add(add_d);
       jp.add(add_c);
       jp.add(b_withdraw);
       jp.add(display_c);
       jp.add(clear);
       jp.add(set_c);
       jp.add(cancel_c);
       jp.add(display_d);
       jp.add(jc1);
       jp.add(jc2);
       jp.add(jc3);
       jp.add(jc4);
       jp.add(jc5);
       jp.add(jc6);
       jf.add(jp);                  //adding the jpanel to frame where all the components are added
       
       add_d.addActionListener(this);                   //adding action listener to the button to call the button when it is clicked       
       add_c.addActionListener(this);                   //adding action listener to the button to call the button when it is clicked  
       clear.addActionListener(this);                   //adding action listener to the button to call the button when it is clicked  
       display_c.addActionListener(this);               //adding action listener to the button to call the button when it is clicked  
       set_c.addActionListener(this);                   //adding action listener to the button to call the button when it is clicked  
       cancel_c.addActionListener(this);                //adding action listener to the button to call the button when it is clicked  
       b_withdraw.addActionListener(this);              //adding action listener to the button to call the button when it is clicked  
       display_d.addActionListener(this);               //adding action listener to the button to call the button when it is clicked  
       
       jf.setLayout(null);                                      //setting the layout in frame to null by default layout is set to flow layout
       jp.setLayout(null);                                      //setting the layout in panel to null by default layout is set to flow layout
       jf.setVisible(true);                                     //setting the visibility of frame to true it is set false by default which will not show the gui if false is not set
       jp.setBounds(0,0,1022,700);                              //declaring the size of the panel 
       jf.setSize(1022,700);                                    //giving the frame required size
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //setting default close operation to exit on close by default fraem will not exit on close it will run in the background even if close icon is clicked
       jf.setResizable(false);                                  //default resizable is set to true which will let the frame change its shpae and size by setting it to false the size cannot be changed
       
    }
    
    public void actionPerformed(ActionEvent a)                          //This method is typically used to handle events when a user interacts with a graphical user interface (GUI) component, such as a button or a menu item.
    {
        if(a.getSource() == add_d)                                     // checks whether the source of the ActionEvent object a is the same as the object add_d
        {
            if(d_client.getText().isEmpty() || d_issue.getText().isEmpty() || d_cardID.getText().isEmpty() || d_balanceamt.getText().isEmpty() || pinnum.getText().isEmpty() || d_bankac.getText().isEmpty())       //checks whether the required text field are empty or not
            {
                JOptionPane.showMessageDialog(jf,"Please fill up all the required boxes","Error",JOptionPane.ERROR_MESSAGE);                //dialog box displays message according to the condition
            }
            else
            {
                try                             //numberformatexception exception handling
                {
                    String client = d_client.getText();                                                 //storing value of respective text field in the variable
                    String issue = d_issue.getText();                                                   //storing value of respective text field in the variable
                    int id = Integer.parseInt(d_cardID.getText());                                      //storing value of respective text field in the variable
                    double balance = Double.parseDouble(d_balanceamt.getText());                        //storing value of respective text field in the variable
                    int pin = Integer.parseInt(pinnum.getText());                                       //storing value of respective text field in the variable
                    String bankacc = d_bankac.getText();                                                //storing value of respective text field in the variable
                    
                    boolean flag = true;
                    
                    for(bankCard i : arraylist)                             //loop that iterates over a collection of bankCard objects stored in an ArrayList named arraylist and stores it in variable i
                    {
                        if(i instanceof DebitCard)              //checks whether an object i is an instance of the DebitCard class
                        {
                            DebitCard obj = (DebitCard) i;          //type casting that converts an object i of the bankCard class to an object of the DebitCard class.
                            if( id == obj.getcardID())                  //compares the value of a variable id to the value returned by a method call
                            {
                                flag = false;
                            }
                        }
                    }
                    if(flag == true)
                    {
                        DebitCard newobj = new DebitCard(balance,id,bankacc,issue,client,pin);              //creates a new object of the DebitCard class and initializes its properties using the values passed as arguments to the constructor
                        arraylist.add(newobj);                                                              //adds the object to the array list
                        JOptionPane.showMessageDialog(jf, "Succesfully Added Debit\nClient: " + client +"\nIssuer bank: " + issue + "\nBank account: " + bankacc + "\nCard ID: "+ id + "\nBalance: " + balance + "\nPin: " + pin , "Information", JOptionPane.INFORMATION_MESSAGE);      //dialog box displays message according to the condition
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(jf," Card already exist","Error",JOptionPane.ERROR_MESSAGE);               //dialog box displays message according to the condition
                    }
                }catch(NumberFormatException num)
                {
                    JOptionPane.showMessageDialog(jf,"Invalid input!!","Error",JOptionPane.ERROR_MESSAGE);                        //dialog box displays message according to the condition
                }
            }
        }
        
        else if(a.getSource() == add_c )     //checks whether the source of the ActionEvent object a is the same as the object add_c
        {
            if(c_client.getText().isEmpty() || c_issue.getText().isEmpty() || c_balanceamt.getText().isEmpty() || c_cardID.getText().isEmpty() || c_bankac.getText().isEmpty() || cvcnum.getText().isEmpty() || intrate.getText().isEmpty() || jc4.getSelectedItem() == "Year" || jc5.getSelectedItem() == "Month" || jc6.getSelectedItem() == "Day" )  //checks whether the required text field are empty or not
            {
                JOptionPane.showMessageDialog(jf,"Please fill up all the required boxes","Error",JOptionPane.ERROR_MESSAGE);         //dialog box displays message according to the condition
            }
            else
            {
                 try
                 {
                     String client = c_client.getText();                                    //storing value of respective text field in the variable
                     String issue = c_issue.getText();                                      //storing value of respective text field in the variable
                     double balance = Double.parseDouble(c_balanceamt.getText());           //storing value of respective text field in the variable
                     int id = Integer.parseInt(c_cardID.getText());                         //storing value of respective text field in the variable
                     String bankacc = c_bankac.getText();                                   //storing value of respective text field in the variable
                     int cvcnumber = Integer.parseInt(cvcnum.getText());                    //storing value of respective text field in the variable
                     int intrest = Integer.parseInt(intrate.getText());                     //storing value of respective text field in the variable
                     String year = (String) jc4.getSelectedItem();                          //storing value of respective combobox in the variable
                     String month = (String) jc5.getSelectedItem();                         //storing value of respective combobox in the variable
                     String day = (String) jc6.getSelectedItem();                           //storing value of respective combobox in the variable
                     String time = year + "-" + month + "-" + day;                          
                     boolean flag = true;
                     
                     for(bankCard i : arraylist)                                       //loop that iterates over a collection of bankCard objects stored in an ArrayList named arraylist and stores it in variable i
                     {
                        if(i instanceof CreditCard)                 //checks whether an object i is an instance of the CreditCard class
                        {
                            CreditCard obj = (CreditCard) i;        //type casting that converts an object i of the bankCard class to an object of the CreditCard class.
                            if( id == obj.getcardID())              //compares the value of a variable id to the value returned by a method call
                            {
                                flag = false;
                            }
                        }
                     }
                     if(flag == true)
                     {
                         CreditCard newobj = new CreditCard(id,client,issue,bankacc,balance,cvcnumber,intrest,time);        //creates a new object of the CreditCard class and initializes its properties using the values passed as arguments to the constructor
                         arraylist.add(newobj);                                                                             //adds the object to the array list
                         JOptionPane.showMessageDialog(jf, "Succesfully Added Credit\nCardID: "+ id + "\nClient: " + client + "\nIssuer bank: " + issue + "\nBank account" + bankacc + "\nBalance: " + balance + "\nCVC num:" + cvcnumber + "\nInterest: " + intrest + "\nTime: " + time, "Information", JOptionPane.INFORMATION_MESSAGE);       //dialog box displays message according to the condition
                     }
                     else
                     {
                        JOptionPane.showMessageDialog(jf," Card already exist","Error",JOptionPane.ERROR_MESSAGE);       //dialog box displays message according to the condition
                     }   
                 }catch(NumberFormatException er)
                 {
                     JOptionPane.showMessageDialog(jf,"Invalid input!!","Error",JOptionPane.ERROR_MESSAGE);                  //dialog box displays message according to the condition
                 }
            }
        }
        
        else if(a.getSource() == b_withdraw)                    // checks whether the source of the ActionEvent object a is the same as the object b_withdraw
        {
            if(d_cardID.getText().isEmpty() || w_amount.getText().isEmpty() || pinnum.getText().isEmpty() || jc1.getSelectedItem() == "Year" || jc2.getSelectedItem() == "Month" || jc3.getSelectedItem() == "Day")     //checks whether the required text field are empty or not
            {
                JOptionPane.showMessageDialog(jf,"Please fill up all the required boxes","Error",JOptionPane.ERROR_MESSAGE);                 //dialog box displays message according to the condition
            }
            else
            {
                try
                {
                   int id = Integer.parseInt(d_cardID.getText());                   //storing value of respective text field in the variable
                   int withdraw = Integer.parseInt(w_amount.getText());             //storing value of respective text field in the variable
                   int pin = Integer.parseInt(pinnum.getText());                    //storing value of respective text field in the variable
                   String year = (String) jc1.getSelectedItem();                    //storing value of respective combobox in the variable
                   String month = (String) jc2.getSelectedItem();                   //storing value of respective combobox in the variable
                   String day = (String) jc3.getSelectedItem();                     //storing value of respective combobox in the variable
                   String time = year + "-" + month + "-" + day;
                   boolean flag = false;
                   
                   for(bankCard i : arraylist)                                  //loop that iterates over a collection of bankCard objects stored in an ArrayList named arraylist and stores it in variable i
                   {
                        if(i instanceof DebitCard)                  //checks whether an object i is an instance of the DebitCard class
                        {
                            DebitCard obj = (DebitCard) i;          //type casting that converts an object i of the bankCard class to an object of the DebitCard class.
                            if(id == obj.getcardID())               //compares the value of a variable id to the value returned by a method call
                            {
                                flag = true;
                                if(pin == obj.getPIN_Number() )        //compares the value of a variable pin to the value returned by a method call
                                {
                                    if(withdraw <= obj.getbalanceAmount())              //compares the value of a variable withdraw to the value returned by a method call
                                    {
                                        obj.Withdraw(withdraw, time, pin);                      //calls the method and passes the values as parameter
                                        JOptionPane.showMessageDialog(jf, "Succesfully Withdrawn\n Card Id: "+ id + "\n Withdrawal Amount: " + withdraw + "\n Time: " + time + "\n Remaining Balance: " + obj.getbalanceAmount(),"Information",JOptionPane.INFORMATION_MESSAGE);         //dialog box displays message according to the condition
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(jf,"Insufficient Balance!!","Error",JOptionPane.ERROR_MESSAGE);        //dialog box displays message according to the condition
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(jf,"Incorrect PIN Number!!","Error",JOptionPane.ERROR_MESSAGE);            //dialog box displays message according to the condition
                                }
                                break;
                            }
                            else
                            {
                                flag = false;
                            }
                        }
                   }
                   if( flag == false)
                   {
                       JOptionPane.showMessageDialog(jf,"Card ID doesnot exist!!","Error",JOptionPane.ERROR_MESSAGE);                    //dialog box displays message according to the condition
                   }
                }catch(NumberFormatException er)
                {
                     JOptionPane.showMessageDialog(jf,"Invalid input!!","Error",JOptionPane.ERROR_MESSAGE);                              //dialog box displays message according to the condition
                }
            }
        }
        
        else if(a.getSource() == display_c)             // checks whether the source of the ActionEvent object a is the same as the object display_c
        {
            for(bankCard i : arraylist)                 //loop that iterates over a collection of bankCard objects stored in an ArrayList named arraylist and stores it in variable i
            {
                if(i instanceof CreditCard)                 //checks whether an object i is an instance of the CreditCard class
                {
                    CreditCard obj = (CreditCard) i ;       //type casting that converts an object i of the bankCard class to an object of the CreditCard class.
                    obj.display();                          //calls the method and passes the values as parameter
                }
            }
        }
        
        else if(a.getSource() == display_d)            // checks whether the source of the ActionEvent object a is the same as the object display_d 
        {
            for(bankCard i : arraylist)                 //loop that iterates over a collection of bankCard objects stored in an ArrayList named arraylist and stores it in variable i
            {
                if(i instanceof DebitCard)              //checks whether an object i is an instance of the DebitCard class
                {
                    DebitCard obj = (DebitCard) i ;             //type casting that converts an object i of the bankCard class to an object of the DebitCard class.
                    obj.display();                              //calls the method and passes the values as parameter
                }
            }
        }
        
        else if (a.getSource() == set_c)                // checks whether the source of the ActionEvent object a is the same as the object set_c
        {
            if(c_cardID.getText().isEmpty() || g_period.getText().isEmpty() || c_limit.getText().isEmpty())             //checks whether the required text field are empty or not
            {
                JOptionPane.showMessageDialog(jf,"Please fill up all the required boxes","Error",JOptionPane.ERROR_MESSAGE);         //dialog box displays message according to the condition
            }
            else
            {
                try
                {
                    double credit = Double.parseDouble(c_limit.getText());              //storing value of respective text field in the variable
                    int grace = Integer.parseInt(g_period.getText());                   //storing value of respective text field in the variable
                    int id = Integer.parseInt(c_cardID.getText());                      //storing value of respective text field in the variable
                    boolean flag = false;
                    
                    for(bankCard i : arraylist)             //loop that iterates over a collection of bankCard objects stored in an ArrayList named arraylist and stores it in variable i
                    {
                        if (i instanceof CreditCard)            //checks whether an object i is an instance of the CreditCard class
                        {
                            CreditCard obj = (CreditCard) i;        //type casting that converts an object i of the bankCard class to an object of the CreditCard class.
                            if(id == obj.getcardID())
                            {
                                flag = true;
                                if(credit <= 2.5 * obj.getbalanceAmount())
                                {
                                    obj.setcreditLimit(credit, grace);                  //calls the method and passes the values as parameter
                                    JOptionPane.showMessageDialog(jf, "Succesfully Added Credit Limit\n Card id: "+ id + "\n Grace Period " + grace + "\n Credit Limit "+ credit,"Information Message", JOptionPane.INFORMATION_MESSAGE);        //dialog box displays message according to the condition
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(jf,"Credit limit to high!!","Error",JOptionPane.ERROR_MESSAGE);                //dialog box displays message according to the condition
                                }   
                                break;
                            }
                            else
                            {
                                flag = false;
                            }
                        }
                    } 
                    if(flag == false)
                    {
                        JOptionPane.showMessageDialog(jf,"Card not found","Error",JOptionPane.ERROR_MESSAGE);            //dialog box displays message according to the condition
                    }
                }catch(NumberFormatException er)
                {
                    JOptionPane.showMessageDialog(jf,"Invalid input!!","Error",JOptionPane.ERROR_MESSAGE);               //dialog box displays message according to the condition
                }
            }
        }
        
        else if (a.getSource() == cancel_c)                 // checks whether the source of the ActionEvent object a is the same as the object cancel_c
        {
            if(c_cardID.getText().isEmpty())                //checks whether the required text field are empty or not
            {
                JOptionPane.showMessageDialog(jf,"Please fill up all the required boxes","Error",JOptionPane.ERROR_MESSAGE);         //dialog box displays message according to the condition
            }
            else
            {
                try
                {
                    int id = Integer.parseInt(c_cardID.getText());              //storing value of respective text field in the variable
                    boolean flag = false;
                    for(bankCard i : arraylist)             //loop that iterates over a collection of bankCard objects stored in an ArrayList named arraylist and stores it in variable i
                    {
                        if (i instanceof CreditCard)                //checks whether an object i is an instance of the CreditCard class
                        {
                            CreditCard obj = (CreditCard) i;        //type casting that converts an object i of the bankCard class to an object of the CreditCard class.
                            if(id == obj.getcardID())
                            {
                                obj.cancelCreditCard();                 //calls the method and passes the values as parameter
                                flag = true;
                                break;
                            }
                            else
                            {
                                flag = false;
                            }
                        }
                    }
                    if(flag == true)
                    {
                        JOptionPane.showMessageDialog(jf, "Succesfully Canceled Credit Limit of\n Card id: "+ id ,"Information Message", JOptionPane.INFORMATION_MESSAGE);        //dialog box displays message according to the condition
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(jf,"Card ID not found","Error",JOptionPane.ERROR_MESSAGE);             //dialog box displays message according to the condition
                    }
                }catch(NumberFormatException er)
                {
                    JOptionPane.showMessageDialog(jf,"Invalid input!!","Error",JOptionPane.ERROR_MESSAGE);                  //dialog box displays message according to the condition
                }
            }
        }
        
        else if(a.getSource() == clear)                 // checks whether the source of the ActionEvent object a is the same as the object clear
        {
            d_client.setText("");                       //sets the text field component to empty
            d_issue.setText("");                       //sets the text field component to empty
            d_cardID.setText("");                       //sets the text field component to empty
            d_balanceamt.setText("");                       //sets the text field component to empty
            pinnum.setText("");                       //sets the text field component to empty
            d_bankac.setText("");                       //sets the text field component to empty
            c_client.setText("");                       //sets the text field component to empty
            c_issue.setText("");                       //sets the text field component to empty
            c_balanceamt.setText("");                       //sets the text field component to empty
            c_cardID.setText("");                       //sets the text field component to empty
            c_bankac.setText("");                       //sets the text field component to empty
            cvcnum.setText("");                       //sets the text field component to empty
            intrate.setText("");                       //sets the text field component to empty
            jc4.setSelectedIndex(0);                    //selects the first item in combobox
            jc5.setSelectedIndex(0);                    //selects the first item in combobox
            jc6.setSelectedIndex(0);                    //selects the first item in combobox
            w_amount.setText("");                       //sets the text field component to empty
            pinnum.setText("");                       //sets the text field component to empty
            jc1.setSelectedIndex(0);                    //selects the first item in combobox
            jc2.setSelectedIndex(0);                    //selects the first item in combobox
            jc3.setSelectedIndex(0);                    //selects the first item in combobox
            c_limit.setText("");                       //sets the text field component to empty
            g_period.setText("");                       //sets the text field component to empty
        }
    }
    
    public static void main(String args[])                  //main method        
    {
        new BankGUI();                                      //calls the counstructor method from above
       
    }
    
}
