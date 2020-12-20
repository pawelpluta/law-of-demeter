package com.lynxted.demeter;

class BookIdentifier {

    // BookIdentifier should only keep one of those values, maybe it should be modelled as strategy?
    private ISBN isbn;
    private LibraryOfCongress libraryOfCongress;
}
