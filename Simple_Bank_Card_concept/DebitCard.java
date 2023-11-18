

/**
 * Programming coursework first year first semester
 * Islington college
 * @author (22066708 Dishant kharel N6)
 * @version (1.0)
 */
public class DebitCard extends bankCard    //bank card is parent class of debit card class
{
    private int PIN_Number;
    private int Withdrawal_Amount;
    private String Date_Of_Withdrawal;
    private boolean hasWithdrawn;
    
    public DebitCard (double balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int PIN_Number)    //constructor
    {
        super(balanceAmount, cardID, bankAccount, issuerBank);
        super.setClientName(clientName);
        this.PIN_Number = PIN_Number;
        this.hasWithdrawn = false;
    }
    
    public int getPIN_Number()                             //calls the instance variable
    {
       return this.PIN_Number; 
    }
    
    public int getWithdrawal_Amount()                     //calls the instance variable
    {
        return this.Withdrawal_Amount;
    }
    
    public boolean gethasWithdrawn()                       //calls the instance variable
    {
        return this.hasWithdrawn;
    }
    
    public String getDate_Of_Withdrawal()                   //calls the instance variable
    {
        return this.Date_Of_Withdrawal;
    }
    
    public void setWithdrawal_Amount(int Withdrawal_Amount)  //sets the value in the instance variable
    {
        this.Withdrawal_Amount = Withdrawal_Amount;
    }
    
    public void Withdraw(int Withdrawal_Amount, String Date_Of_Withdrawal, int PIN_Number)
    {
        if(this.PIN_Number == PIN_Number)
        {
            if(Withdrawal_Amount <= super.getbalanceAmount())
            {
                super.setBalanceAmount(super.getbalanceAmount() - Withdrawal_Amount);
                this.hasWithdrawn = true; 
                this.Withdrawal_Amount = Withdrawal_Amount;
                this.Date_Of_Withdrawal = Date_Of_Withdrawal;
            }
            else
            {
                System.out.println("Your balance amount is insufficient.");
            }
        }
        else
        {
            System.out.println( "You have entered the wrong PIN number.");
        }
    }
    
    public void display()
    {
        super.display(); //
        if(this.hasWithdrawn == true)
        {
            System.out.println("The PIN Number is:" + this.PIN_Number);
            System.out.println("The withdrawal amount is:" + this.Withdrawal_Amount);
            System.out.println("The money is withdrawan on:" +this.Date_Of_Withdrawal);
        }
        else
        {
           System.out.println("The balance amount is:" + super.getbalanceAmount()); 
        }
    }
}
