/*
NIWWD: Kevin Xiao + Mr. Swag, Jeffery Tang + Mathias, Kaitlin Ho + Apple 
APCS
HW20 -- External Audit
2021-10-20

1. Removed ; on line 87 after parameters (all of the below statements only apply after this revision)
2. When entered 999999999 and 9999 for the accountnumber and pin, there was no error message
returned.
3. Withdraw works.
4. Authenticate has full functionality
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
    NIWWD.deposit(123123103);
    //Overloading
    NIWWD.setPin((short)1234);
    // Testing good password + good account number
    System.out.println(NIWWD.authenticate(999999999, "Hello World!"));
    // Testing good password + bad account number
    System.out.println(NIWWD.authenticate(999999989, "Hello World!"));
    // Testing bad password + good account number
    System.out.println(NIWWD.authenticate(999999999, "Hello Wrld!"));
    // Testing bad password + bad account number
    System.out.println(NIWWD.authenticate(999988999, "Hello Word!"));
    System.out.println(NIWWD.toString());
    //New objects but with bad arguments
    BankAccount Thinkeren = new BankAccount();
    Thinkeren.setPin((short)123);
    Thinkeren.setAcctNum(21345);
    Thinkeren.setPasswd("213");
    Thinkeren.setName("001");
    Thinkeren.setBalance(004);
    System.out.println(Thinkeren.toString());
    }

    
}

