package bankmanagement.Database;

import java.util.ArrayList;
import java.util.List;

import bankmanagement.Model.Transaction;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDB {
    private List<Transaction> transactions;

    public TransactionDB() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t){
        transactions.add(t);
    }
    
    public Transaction searchTransaction(String transactionId){
        for (var t: transactions){
            if (t.transactionId().equals(transactionId)){
                return t;
            }
        }
        return null;
        
    } 
}
