public  class AccountHold{
    String accountNumber;
    String name;
    String address;
    float balance;
    float amount;
    static String accountType="Savings Account";
    
    public  static void getAccountType()
    {
    System.out.println("Account Type is "+accountType);
    }
    public void getAmount(float amount)
    {
        
        balance=balance+amount;
        System.out.println("Available balance is "+balance);

    }

    public void withdraw(float withdrawAmount)
    {
        amount=balance-withdrawAmount;
        System.out.println("After withdrawing balance is "+amount);
    }


}