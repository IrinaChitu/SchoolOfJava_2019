package com.endava.soj3springboot.controllers;

import com.endava.soj3springboot.models.BankAccount;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller  // binul principal care coontroleaza requesturile - ish
public class MainController {

//    @RequestMapping(path = "/myresource/{name}", method = RequestMethod.GET)    // {} = path var
    @GetMapping(path = "/myresource/{name}") // similar ^, insa permite doar requesturi de tip get
    public ResponseEntity<String> firstGet(@PathVariable String name) {  // le am numit la fel ca sa nu mai scriu aici name2 = name
        String value = "Heyoo, " + name +"! " + "This is my first web service";

        ResponseEntity<String> responseEntity = new ResponseEntity<>(value, HttpStatus.OK);
        return responseEntity;
    }

    @PostMapping(path = "/mypost")
    public ResponseEntity<BankAccount> myPost(@RequestBody BankAccount bankAccount) {
//        bankAccount.setBalance(bankAccount.getBalance() + 50);
        ResponseEntity<BankAccount> responseEntity = new ResponseEntity<>(bankAccount, HttpStatus.OK);
        return responseEntity;
    }
}
