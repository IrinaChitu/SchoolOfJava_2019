package service;

import model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.BankAccountRepository;

import java.util.Objects;

@Service
public class BankAccountService {   // numele ob procesat + service

    @Autowired  // <=> ca si cum am fi facut BankAccountRepository singleton si am luat o instanta in BankAccountService
    private BankAccountRepository bankAccountRepository;    // evitam duplicarea obiectului

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountRepository.insertBankAccount(bankAccount);
    }

    public void transferMoney(String fromIban, String toIban, double amount) {
//        BankAccount fromBankAccount = bankAccountRepository.getBankAccount(fromIban);
//        BankAccount toBankAccount = bankAccountRepository.getBankAccount(toIban);
//        if (fromBankAccount != null && toBankAccount != null) {
//            fromBankAccount.setBalance(fromBankAccount.getBalance()-amount);
//            toBankAccount.setBalance(toBankAccount.getBalance()+amount);
//        }

        BankAccount fromBankAccount = Objects.requireNonNull(bankAccountRepository.getBankAccount(fromIban));
        BankAccount toBankAccount = Objects.requireNonNull(bankAccountRepository.getBankAccount(toIban));

        fromBankAccount.setBalance(fromBankAccount.getBalance()-amount);
        toBankAccount.setBalance(toBankAccount.getBalance()+amount);

    }
}
