package com.Sennioritty.daos;

//C  CREATE mtd guardar entidad nueva
//R  READ mtd buscar entidad por Id
//R  READ mtd obtener todas las entidades
//U  UPDATE mtd actualizar una entidad
//DE DELETE mtd borrar entidad

import com.Sennioritty.business.Article;

import java.util.List;

public interface Dao<T> {

    //CREATE
    public Long create(T entidad);

    // READ ONE
    public T findById(Long id);

    //READ ALL
    public List<T> getAll();

    //UPDATE
    public void update(T entidad);

    public void delete(Long id);

}

