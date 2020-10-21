/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Book {
    private String title;
    private int nrPages;
    private int yearPublication;
    
    Book(String title, int nrPages, int yearPublication) {
        this.title = title;
        this.nrPages = nrPages;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public int getNrPages() {
        return nrPages;
    }

    public int getYearPublication() {
        return yearPublication;
    }
    
    @Override
    public String toString() {
        return (title + ", " + nrPages + " pages, " + yearPublication);
    }
}
