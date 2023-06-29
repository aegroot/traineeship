package com.alexgroot.deel1.week9.assignments;

interface Queue {
    // voeg een item toe aan de FIFO queue
    void add(int value);

    // verwijder een item uit de FIFO queue
    int remove(int index);

    // geef het eerste item in de FIFO queue terug, maar haal het er niet uit
    int peek();

    // geef aan of de FIFO queue leeg is
    boolean isEmpty();

    // geef de lengte van de FIFO queue terug
    int size();

    // Print de inhoud van de FIFO queue
    void print();

    // verwijder alle items uit de FIFO queue
    void clear();

    // verwijder de eerste n items uit de FIFO queue
    void clear(int n);

    // print de inhoud van de FIFO queue in omgekeerde volgorde
    void printReverse();

    // plaats een element op een bepaalde positie in de FIFO queue
    void jumpTheQueue(int n, int value);

    // Zet de FIFO queue om naar een String
    String toString();

    // Kijk of de FIFO queue gelijk is aan een andere FIFO queue
    boolean equals(Queue q);

    // Bepaal de index van een bepaalde waarde in de FIFO queue
    int indexOf(int value);

    // bepaal de laatste index van een bepaalde waarde in de FIFO queue
    int lastIndexOf(int value);
}