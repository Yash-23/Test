public class AccountFactory {
    public bankAccount createAccount(String AccountType){
        if(AccountType == null){
            return null;
         }		
         if(AccountType.equalsIgnoreCase("Personal")){
            return new PersonalAccount();
            
         } else if(AccountType.equalsIgnoreCase("Cooperate")){
            return new CooperateAccount();
        }
        else {
            return new BuisnessAccount();
        }  
    }
}
