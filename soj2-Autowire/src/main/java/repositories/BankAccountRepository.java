package repositories;

import model.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankAccountRepository {    // simuleaza persistenta datelor
    private List<BankAccount> bankAccountList = new ArrayList<>();  // simulam o baza de date pt a conecta beanurile la ea

    public void insertBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public ArrayList<BankAccount> getAllBankAccounts() {
        return (ArrayList<BankAccount>) bankAccountList;
    }

    public BankAccount getBankAccount(String iban) {    // doar pe metodele de tip get se returneaza null, altfel trebuie sa se arunce o exceptie
        for(BankAccount bankAccount : bankAccountList) {
            if(bankAccount.getIban().compareTo(iban) == 0) {    // pt stringuri e mai bine ecat equals (immutable!)
                return bankAccount;
            }
        }
        return null;
    }
}
