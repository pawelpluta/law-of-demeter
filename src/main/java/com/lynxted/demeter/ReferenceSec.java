package com.lynxted.demeter;

import java.util.Optional;

class ReferenceSec {

    private BooksSec refBookSec;
    private Archive archive;

    Optional<Book> refSearch(BookIdentifier book) {
        return refBookSec.search(book)
                  .or(() -> archive.getArchMicrofiche().search(book))
                  .or(() -> archive.getArchDocuments().search(book));
    }
}
