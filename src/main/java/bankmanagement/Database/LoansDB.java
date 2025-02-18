package bankmanagement.Database;

import java.util.ArrayList;
import java.util.List;

import bankmanagement.Model.Loan;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoansDB {
    private List<Loan> loans;

    public LoansDB() {
        loans = new ArrayList<>();
    }

    public void addLoan(Loan l){
        loans.add(l);
    }

    public Loan searchLoan(String loanId){
        for (var l: loans){
            if (l.isDeleted()) continue;
            if (l.getLoanId().equals(loanId)){
                return l;
            }
        }
        return null;
    }

    public int deleteLoan(String loanId){
        for (var l: loans){
            if (l.getLoanId().equals(loanId)){
                l.setDeleted(true);
                return 0;
            }
        }
        return 1;
    }



    
}
