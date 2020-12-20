package com.lynxted.demeter;

class ReferenceSec {
    BooksSec refBookSec;
    Archive archive;

    Book refSearch(BookIdentifier book) {
        Book bookFromBookSection = refBookSec.search(book);
        if (bookFromBookSection != null) {
            return bookFromBookSection;
        }
        Book microficheArchBook = archive.getArchMicrofiche().search(book);
        if (microficheArchBook != null) {
            return microficheArchBook;
        }
        return archive.getArchDocuments().search(book);
    }
}
