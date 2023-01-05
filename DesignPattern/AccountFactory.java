public class AccountFactory {

    public static bankAccount createAccount(String AccountType){
        if(AccountType == null){
            return null;
         }		
         if(AccountType.equalsIgnoreCase("Personal")){
            return new PersonalAccount();
            
         } else if(AccountType.equalsIgnoreCase("Cooperate")){
            return new CooperateAccount();
        }
        else if(AccountType.equalsIgnoreCase("Buisness")) {
            return new BuisnessAccount();
        } 
        return null; 
    }
}
