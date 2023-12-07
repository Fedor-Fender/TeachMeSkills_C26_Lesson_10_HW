package com.techmeskills.homework_10;

import com.techmeskills.homework_10.card.BaseCard;
import com.techmeskills.homework_10.client.Client;

public class Runner {
    public static void main(String[] args) {

        // to create variable counter equals card
        int count = 0;

        BaseCard card1 = new BaseCard(123, "90190111", 1000.1);
        BaseCard card2 = new BaseCard(123, "90190111", 1000.1);
        BaseCard card3 = new BaseCard(456, "90190115", 1000.10);
        BaseCard card4 = new BaseCard(456, "90190115", 1000.20);
        BaseCard card5 = new BaseCard(456, "90190115", 1000.350);

        // to create array of cards client
        BaseCard[]cards=new BaseCard[]{card1,card2,card3,card4,card5};

        Client client = new Client("Fedor", cards);

        if (client.getBaseCards().length!=0) {
            for (int i = 0; i < client.getBaseCards().length-1; i++) {
                if (client.getBaseCards()[i].equals(client.getBaseCards()[i+1])) {
                    count++;
                } else if (count == 0) {
                    System.out.println("There aren't any kind of equal card");
                    break;
                }
            }
        }
        System.out.println("Person has count of card: "+count);
    }
}
