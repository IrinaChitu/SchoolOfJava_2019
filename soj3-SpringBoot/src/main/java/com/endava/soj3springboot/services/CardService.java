package com.endava.soj3springboot.services;

import com.endava.soj3springboot.models.Card;
import com.endava.soj3springboot.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void addCard(Card card) {
        System.out.println("serv");
        cardRepository.addCard(card);
    }

    public List<Card> getCardList() {
        return cardRepository.getCardList();
    }
}
