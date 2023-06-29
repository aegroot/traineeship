package com.alexgroot.deel1.week2.narrative2.card;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private final Rank rank;
    private final Color color;

    public Card(Rank rank, Color color) {
        this.rank = rank;
        this.color = color;
    }

    public static void generateDeck() {
        List<Card> cards = new ArrayList<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Card card = new Card(Rank.values()[j], Color.values()[i]);
                cards.add(card);
                System.out.println(card);

            }

        }

    }

    @Override
    public String toString() {
        return color + " " + rank;
    }
}
