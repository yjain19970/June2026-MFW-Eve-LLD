package org.yourcompany.scaler.mfweveningjune26.oops.lms;

class NovelBook extends Book {
    private final String genre;

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("NovelBook | Title: " + getTitle()
            + " | Author: " + getAuthor()
            + " | Genre: " + genre);
    }

    @Override
    public boolean isLendable() {
        return true;
    }
}