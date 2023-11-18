
/**
 * Programming coursework first year first semester
 * Islington college
 * @author (22066708 Dishant kharel N6)
 * @version (1.0)
 */
public class bankCard
{
    private int cardID;
    private String clientName, issuerBank, bankAccount;
    private double balanceAmount;
    
    public bankCard(double balanceAmount, int cardID, String bankAccount, String issuerBank)  //constructor
    {
        this.balanceAmount = balanceAmount;                           //assigning value in instance variable
        this.cardID = cardID;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName = "";
    }
    
    public String getclientName()                                   //calls the instance variable
    {
        return this.clientName;
    }
    
    public int getcardID()                                           //calls the instance variable
    {
        return this.cardID;
    }
    
    public String getbankAccount()                                    //calls the instance variable
    {
        return this.bankAccount;
    }
    
    public String getissuerBank()                                      //calls the instance variable
    {   
        return this.issuerBank;
    }
    
    public double getbalanceAmount()                                    //calls the instance variable
    {
        return  this.balanceAmount;
    }
    
    public void setClientName(String clientName)                        //assigns the value in the instance variable
    {
        this.clientName =  clientName;
    }
    
    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
    
    public void display()                                             //shows details according to the condition
    {
        System.out.println("Your cardID is: " + cardID);
        System.out.println("Your Issuer bank Name is: " + issuerBank);
        System.out.println("Your Bank account is: " + bankAccount);
        System.out.println("Your Balance amount is: " + balanceAmount);
        if(this.clientName == "")
        {
            System.out.println("Client Name is not mentioned!");
        }
        else
        {
            System.out.println("Your Client name is: " +clientName);
        }
    }
}