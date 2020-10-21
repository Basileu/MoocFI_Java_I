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
//    author, title, and page count.
    private String author;
    private String title;
    private int pageCnt;

    public Book(String author, String title, int pageCnt) {
        this.author = author;
        this.title = title;
        this.pageCnt = pageCnt;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return title;
    }

    public int getPages() {
        return pageCnt;
    }
    
    @Override
    public String toString() {
        return (author + ", " + title + ", " + pageCnt + " pages");
    }
    
    
}
