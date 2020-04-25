package model;

import java.util.ArrayList;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void deleteBookById(Long id) throws LibraryException {
        if(isBookPresent(id)){
            Book[] newBooksTable = new Book[books.length - 1];

            int offset = 0;
            for (int i = 0; i < books.length; i++) {
                if (!id.equals(books[i].getId())) {
                    newBooksTable[i - offset] = books[i];
                } else {
                    offset++;
                }
            }
            books = newBooksTable;
        }
        else {
            throw new LibraryException("Podana książka nie widniej w bibliotece, wiec nie można jej usunąć");
        }
    }

    private boolean isBookPresent(Long id){
        for(Book book: books){
            if(book.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
