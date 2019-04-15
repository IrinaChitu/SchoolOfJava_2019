package com.endava.soj3springboot.repositories;

import com.endava.soj3springboot.models.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankAccountRepository {

    List<BankAccount> bankAccountList = new ArrayList<>();

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }
}
