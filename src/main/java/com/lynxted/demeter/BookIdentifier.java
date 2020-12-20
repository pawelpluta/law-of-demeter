package com.lynxted.demeter;

class BookIdentifier {

    // BookIdentifier should only keep one of those values, maybe it should be modelled as strategy?
    ISBN isbn;
    LibraryOfCongress libraryOfCongress;
}
