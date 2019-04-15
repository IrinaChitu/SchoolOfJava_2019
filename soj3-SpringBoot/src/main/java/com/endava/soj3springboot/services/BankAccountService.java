package com.endava.soj3springboot.services;

import com.endava.soj3springboot.models.BankAccount;
import com.endava.soj3springboot.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class BankAccountService {

    private BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void addBankAccount(BankAccount bankAccount,  HttpServletResponse response) {
        if(bankAccount.getBalance() > 50 ) {
            bankAccountRepository.addBankAccount(bankAccount);
        } else {
            response.setStatus(403); // BAD_REQUEST
        }
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountRepository.getBankAccountList();
    }
}
