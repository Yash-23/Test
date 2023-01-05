public class FactoryPatternDemo {
    public static void main(String args[]){
        AccountFactory bankAcc = new AccountFactory();
        b acc1 = AccountFactory.createAccount("Personal");
        acc1.createAccount();

    }
}
