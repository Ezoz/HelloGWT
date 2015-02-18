package org.entity;

public class PrArticle implements java.io.Serializable {

    private Integer id;
    private String text;

    public PrArticle() {
    }

    public PrArticle(String text) {
        this.text = text;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
