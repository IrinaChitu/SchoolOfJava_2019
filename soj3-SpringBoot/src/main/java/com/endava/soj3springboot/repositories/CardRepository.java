package com.endava.soj3springboot.repositories;

import com.endava.soj3springboot.models.Card;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CardRepository {
    private List<Card> cardList = new ArrayList<>();

    public void addCard(Card card) {
        System.out.println("repo");

        cardList.add(card);
        System.out.println("repo2");

    }

    public List<Card> getCardList() {
        return cardList;
    }
}
