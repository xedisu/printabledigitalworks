package com.printable.digital.works.model.enums;

public enum Rating {
    ONE_STAR(1),
    TWO_STAR(2),
    THREE_STAR(3),
    FOUR_STAR(4),
    FIVE_STAR(5);

    private final int nrStars;

    Rating(int i) {
        this.nrStars = i;
    }

    public int getNrStars() {
        return this.nrStars;
    }
}
