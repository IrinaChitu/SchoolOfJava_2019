package com.endava.soj3springboot.models;

public class Card {
    String number;
    String ownerName;

    public String getNumber() {
        return number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}


// TO DO:
// Service, repository, controller = Card
// matode: post, get -- addCard, getCards

//TO DO 2:
// List<Tranzactii>
//Tranzactii: int suma, String magazin | repo: list<> si endpoint de update(put sau patch) si delete, service, controller
//in card Service, repository, controller sa avem urm metode: getTranzactii, addTranzactie

//4 endpoints: get post put si delete