package org.example.classes;

public class Book {

    private String name;
    private String author;
    private Double score;

    public Book(String name, String author, Double score) {
        this.name = name;
        this.author = author;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", score=" + score +
                '}';
    }
}
