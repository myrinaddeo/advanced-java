package com.Sennioritty.business;

public class Article {

    Long artId;
    String artName;
    Integer artPrice;

    public Article(String artName, Integer artPrice) {
        this.artId = artId;
        this.artName = artName;
        this.artPrice = artPrice;
    }

    public Long getArtId() {
        return artId;
    }

    public void setArtId(Long artId) {
        this.artId = artId;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public Integer getArtPrice() {
        return artPrice;
    }

    public void setArtPrice(Integer artPrice) {
        this.artPrice = artPrice;
    }

    public String toString(){
        return this.artId + "Articulo= "+this.artName + " costo= "+this.artPrice;
    }

}
