package com.zzj.designer.prototype.shallow;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Article implements Cloneable {

    private String title;
    private String writer;
    private int pages;
    private Publisher publisher;

    @Override
    protected Article clone()   {
        Article article = null;
        try {
            article = (Article) super.clone();
        }catch (CloneNotSupportedException c){
            c.printStackTrace();
        }
        return article;
    }

    public Article(String title, String writer,int pages) {
        this.title = title;
        this.writer = writer;
        this.pages = pages;
    }

    public void perface(){
        System.out.println("This article is " + this.title + ",writer is " + this.writer + ",the pages is " + pages + ",The publisher's name is " + this.publisher.getName() + ",location is " + this.publisher.getLocation());
    }
}
