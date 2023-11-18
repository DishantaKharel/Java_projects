
/**
 * Programming coursework first year first semester
 * Islington college
 * @author (22066708 Dishant kharel N6)
 * @version (1.0)
 */
public class CreditCard extends bankCard       //bank card is the parent class of credit card class
{
    private int cvcNumber;
    private double creditLimit;
    private double intrestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    public CreditCard(int cardID, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNumber, double intrestRate, String expirationDate)     //constructor
    {
        super(balanceAmount, cardID ,bankAccount, issuerBank);     //calls the variable from the parent class
        super.setClientName(clientName);                           //calls the method from the parent class
        this.cvcNumber = cvcNumber;
        this.intrestRate = intrestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    public int getcvcNumber()
    {
        return this.cvcNumber;
    }
    
    public double getcreditLimit()
    {
        return this.creditLimit;
    }
    
    public boolean getisGranted()
    {
        return this.isGranted;
    }
    
    public double getintrestRate()
    {
        return this.intrestRate;
    }
    
    public String getexpirationDate()
    {
        return this.expirationDate;
    }
    
    public int getgracePeriod()
    {
        return this.gracePeriod;
    }
    
    public void setcreditLimit(double newCreditLimit, int newGracePeriod)
    {
        if(this.creditLimit <= super.getbalanceAmount() * 2.5 )
        {
            this.creditLimit = newCreditLimit;
            this.gracePeriod = newGracePeriod;
            this.isGranted = true;
        }
        if(this.isGranted == false)
        {
            if(this.creditLimit >= super.getbalanceAmount() * 2.5 )
            {
                System.out.println("Sorry! Your credit cannot be issued. ");
            }
        }
    }
    
    public void cancelCreditCard()
    {
        this.cvcNumber = 0 ;
        this.creditLimit = 0;
        this.gracePeriod =0;
        this.isGranted = false;
    }
    
    public void display()
    {
        super.display();
        if(this.isGranted == true)
        {
            System.out.println("The credit limit is: "+ this.creditLimit);
            System.out.println("The grace period is: "+ this.gracePeriod);
        }
        else
        {
            System.out.println("The cvc number is: "+this.cvcNumber);
            System.out.println("The intrest rate is: "+this.intrestRate);
            System.out.println("The expiration date is: "+this.expirationDate);
            System.out.println("The credit limit and grace period cannot be displayed");
        }
    }
}
