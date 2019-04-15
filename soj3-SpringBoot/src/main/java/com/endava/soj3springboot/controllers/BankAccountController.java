package com.endava.soj3springboot.controllers;

import com.endava.soj3springboot.models.BankAccount;
import com.endava.soj3springboot.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController // <=> Controller pe steroizi si mai easy peasy
public class BankAccountController {

    private BankAccountService bankAccountService;

    @Autowired      // injectare prin constructor
    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }


    @PostMapping(path = "/add/account")
    public void addBankAccount(@RequestBody BankAccount bankAccount,HttpServletResponse response){
        bankAccountService.addBankAccount(bankAccount, response);
    }

    @GetMapping(path = "/get/account")
    public List<BankAccount> getBankAccounts() {
        return bankAccountService.getBankAccountList();
    }
}
