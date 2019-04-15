package com.endava.soj3springboot.controllers;

import com.endava.soj3springboot.models.Card;
import com.endava.soj3springboot.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // daca una e cu rest, toate sunt cu rest!! not controller
public class CardController {
    private CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping(path = "/add/card")
    public void addCard(@RequestBody Card card){
        System.out.println(card);
        cardService.addCard(card);
    }

    @GetMapping(path = "/get/card")
    public List<Card> getCardList() {
        return cardService.getCardList();
    }
}
