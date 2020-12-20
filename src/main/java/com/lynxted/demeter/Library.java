package com.lynxted.demeter;

class Library {
    ReferenceSec reference;
    LoanSec loan;
    JournalSec journal;

    void refSearch(BookIdentifier book) {
        reference.refSearch(book);
    }
}
