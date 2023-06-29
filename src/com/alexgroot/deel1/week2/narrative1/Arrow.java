package com.alexgroot.deel1.week2.narrative1;

public class Arrow {

    private int length;
    private arrowHeadType arrowHead;
    private fletchingType fletching;

    public Arrow(int length, arrowHeadType arrowHead, fletchingType fletching) {
        if (length < 60 || length > 100) {
            return;
        }
        this.length = length;
        this.arrowHead = arrowHead;
        this.fletching = fletching;
    }

    public int getPrice() {
        int totalprice = 0;
        switch (arrowHead) {
            case wood:
                totalprice += 3;
                break;
            case steel:
                totalprice += 10;
                break;
            case obsidian:
                totalprice += 5;
                break;
        }
        switch (fletching) {
            case plastic:
                totalprice += 10;
                break;
            case goose_feathers:
                totalprice += 5;
                break;
            case turkey_feathers:
                totalprice += 3;
                break;
        }
        totalprice += length * 0.05f;

        return totalprice;
    }

    public arrowHeadType getArrowHead() {
        return arrowHead;
    }

    public fletchingType getFletching() {
        return fletching;
    }

    public int getLength() {
        return length;
    }

    public static Arrow createEliteArrow() {
        return new Arrow(95, arrowHeadType.steel, fletchingType.plastic);
    }

    public static Arrow createBeginnerArrow() {
        return new Arrow(75, arrowHeadType.wood, fletchingType.goose_feathers);
    }

    public static Arrow createMarksmanArrow() {
        return new Arrow(65, arrowHeadType.steel, fletchingType.goose_feathers);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", length, arrowHead, fletching);
    }
}
