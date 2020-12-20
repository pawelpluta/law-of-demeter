package com.lynxted.demeter;

import java.util.Optional;

class Library {

    private ReferenceSec reference;
    private LoanSec loan;
    private JournalSec journal;

    Optional<Book> refSearch(BookIdentifier book) {
        return reference.refSearch(book);
    }
}
