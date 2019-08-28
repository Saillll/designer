package com.zzj.designer.prototype.deep.serialize;

public class ZZZTest {
    public static void main(String[] args) {
        Article article = new Article("Today News","MCJIBA",300);
        Publisher publisher = new Publisher("清华大学出版社","清华大学");
        article.setPublisher(publisher);

        Article copyArticle =  article.clone();
        article.perface();
        copyArticle.perface();


        System.out.println("---------验证序列化深拷贝----------");
        copyArticle.setPages(1000);
        copyArticle.setTitle("Yesterday News");
        //互不影响
        copyArticle.getPublisher().setName("北京大学出版社");
        copyArticle.getPublisher().setLocation("北京大学");
        article.perface();
        copyArticle.perface();

    }
}
