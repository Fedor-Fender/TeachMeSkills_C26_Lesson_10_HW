package com.techmeskills.homework_10.card;

import java.util.Objects;

public class BaseCard {
    private int cvv;
    private String numCard;
    private double cardAmount;

    public BaseCard(int cvv, String numCard, double cardAmount) {
        this.cvv = cvv;
        this.numCard = numCard;
        this.cardAmount = cardAmount;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getNumCard() {
        return numCard;
    }

    public void setNumCard(String numCard) {
        this.numCard = numCard;
    }

    public double getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(double cardAmount) {
        this.cardAmount = cardAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCard baseCard = (BaseCard) o;
        return cvv == baseCard.cvv && Objects.equals(numCard, baseCard.numCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, numCard);
    }
}
