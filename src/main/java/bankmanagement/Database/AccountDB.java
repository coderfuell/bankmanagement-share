package bankmanagement.Database;

import java.util.ArrayList;
import java.util.List;

import bankmanagement.Model.Account;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AccountDB {
    private List<Account> accounts;

    public AccountDB(){
        accounts = new ArrayList<>();
    }

    public void addAccount(Account a){
        accounts.add(a);
    }

    public Account seachAccount(String accountId){
        for (var a: accounts){
            if (a.isDeleted()){
                continue;
            }
            if (a.getAccountId().equals(accountId)){
                return a;
            }
        }
        return null;
    }

    public int deleteAccount(String accountId){
        for (var a: accounts){
            if (a.getAccountId().equals(accountId)){
                a.setDeleted(true);
                return 0;
            }
        }
        return 1;
    }
}
