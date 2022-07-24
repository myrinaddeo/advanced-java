package com.Sennioritty.daos;

import com.Sennioritty.business.Article;


import java.util.ArrayList;
import java.util.List;

public class ArticleDao implements Dao<Article> {
        private List<Article> articleDB = new ArrayList<>();

    @Override
    public Long create(Article entidad) {
        Long artId = Double.valueOf(Math.random()*1000).longValue();
        entidad.setArtId(artId);
        articleDB.add(entidad);
        return artId;
    }

    @Override
    public Article findById(Long artId) {
        for(Article a: articleDB){
            if(a.getArtName().equals(artId)){
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Article> getAll() {
        return articleDB;
    }

    @Override
    public void update(Article entidad) {
        for(Article a: articleDB) {
            if (a.getArtName().equals(entidad.getArtId())) {
                a.setArtName(entidad.getArtName());
                a.setArtPrice(entidad.getArtPrice());
            }
        }
    }

    @Override
    public void delete(Long artId) {
        Article toDelete = null;
        for (Article a : articleDB){
            if (a.getArtId().equals(artId)){
                toDelete =a;
            }
        }
        articleDB.remove(toDelete);
    }

    }

