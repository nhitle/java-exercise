package Lab071;

import javafx.util.Builder;

import java.sql.SQLOutput;

public class Book {
    private final String ISBN;
    private final String title;
    private final String author;

    private Book(Builder builder){
        this.ISBN = builder.ISBN;
        this.title = builder.title;
        this.author = builder.author;
    }

    public String getISBN(){
        return this.ISBN;
    }
    public void getBookInfo(){
        System.out.println("=======Book Menu=========");
        System.out.println("Book ISBN: " + this.ISBN);
        System.out.println("Book's title: " + this.title);
        System.out.println("Book's author: " + this.author);
    }

    public static class Builder{
        private String ISBN;
        private String title;
        private String author;

        public String getISBN(){
            return ISBN;
        }
        public Builder ISBN(String ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public Builder name(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}