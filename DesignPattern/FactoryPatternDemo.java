public class FactoryPatternDemo {
    public static void main(String args[]){
        
        AccountFactory bankAcc = new AccountFactory();
        
        bankAccount acc1 = AccountFactory.createAccount("Personal");

        acc1.create();

        bankAccount acc2 = AccountFactory.createAccount("Cooperate");
        
        acc2.create();
        
        bankAccount acc3 = AccountFactory.createAccount("Buisness");
        
        acc3.create();
    }
}