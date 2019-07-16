package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> bAccountList = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount removed = this.bAccountList.get(indexNumber);
        this.bAccountList.remove(removed);
        return removed;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.bAccountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return this.bAccountList.contains(bankAccount);
        //throw new UnsupportedOperationException("Method not yet implemented");
    }
}
