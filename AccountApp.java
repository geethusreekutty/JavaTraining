public class AccountApp{
    public static void main(String[] args)
    {
    AccountHold acc=new AccountHold();
    AccountHold.getAccountType();
    acc.getAmount(200.09f);
    acc.withdraw(100.00f);

}
}