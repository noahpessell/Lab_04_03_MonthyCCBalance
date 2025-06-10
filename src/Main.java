//Start
//	OUTPUT “What is your credit card balance?”
//	INPUT creditBalance
//	INTEREST_RATE = 0.17
//	creditInterest = creditBalance * INTEREST_RATE
//	OUTPUT “The interest accrued on your credit card balance after
//one month is ” + creditInterest
//creditBalance = creditBlanace + creditInterest
//creditInterest = creditInterest + (creditBalance *
//INTEREST_RATE)
//OUTPUT “The interest accrued on your credit card balance after
//two months is “ + creditInterest
//Stop
public class Main
{
    public static void main(String[] args)
    {
        double creditBalance = 5000.00;
        double interestRate = 0.17;
        double creditInterest = creditBalance * interestRate;
        System.out.println("Your " + interestRate + " rate interest on a balance of $" + creditBalance + " due after one month is: $" + creditInterest);
        creditBalance= creditBalance + creditInterest;
        creditInterest = creditBalance * interestRate;
        System.out.println("Your " + interestRate + " rate interest on a balance of $" + creditBalance + " due after two months is: $" + creditInterest);
    }
}