class Book extends Item {
    private int isbn_number;
    private String author;

    public int getIsbn_number() {
        return this.isbn_number;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setIsbn_number(int isbn_number) {
        this.isbn_number = isbn_number;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    Book() {
    }

    Book(String title, int isbn_number, String author) {
        super(title);
        this.isbn_number = isbn_number;
        this.author = author;
    }

    @Override
    public String getListing() {
        return ("Book Name - " + getTitle() + "\nAuthor - " + getAuthor() + "\nISBN# - " + getIsbn_number());
    }
}
