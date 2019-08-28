package com.zzj.designer.prototype.deep.serialize;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
/**
 * 序列化方式进行深拷贝，需要注意的是此种方法不会序列化对象种的静态属性，静态属性会被设置成默认值。
 */
@Setter
@Getter
public class Article implements Serializable {

    private String title;
    private String writer;
    private int pages;
    private Publisher publisher;

    protected Article clone()   {
        Article article = null;
        try {
            // 序列化
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 反序列化
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            article =  (Article) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
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
