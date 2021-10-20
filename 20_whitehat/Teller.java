/*
NIWWD: Kevin Xiao + Mr. Swag, Jeffery Tang + Mathias, Kaitlin Ho + Apple 
APCS
HW20 -- External Audit
2021-10-20

1. Removed ; on line 87 after parameters.
2. When entered 999999999 and 9999 for the accountnumber and pin, there was no error message
returned.
3. Withdraw works.
4.
*/

public class Teller{
  
  public static void main(String[] args){
  BankAccount NIWWD = new BankAccount();
    NIWWD.setPin((short)9999);
    NIWWD.setAcctNum(999999999);
    NIWWD.setPasswd("Hello World!");
    NIWWD.setName("Mykolyk");
    NIWWD.setBalance(123214);
    NIWWD.withdraw(1000000000);
    NIWWD.deposit(123123120931203);
    System.out.println(NIWWD.toString());
    }
}

