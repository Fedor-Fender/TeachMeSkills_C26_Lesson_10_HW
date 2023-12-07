package com.techmeskills.homework_10.client;

import com.techmeskills.homework_10.card.BaseCard;

public class Client {

    private String name;
    private BaseCard[] baseCards;

    public Client(String name, BaseCard[] baseCards) {
        this.name = name;
        this.baseCards = baseCards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseCard[] getBaseCards() {
        return baseCards;
    }

    public void setBaseCards(BaseCard[] baseCards) {
        this.baseCards = baseCards;
    }
}
