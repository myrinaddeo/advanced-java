package com.Sennioritty.daos;

import com.Sennioritty.business.Article;
import com.Sennioritty.business.User;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements Dao<User>{

    private List<User> userDB = new ArrayList<>();

    @Override
    public Long create(User entidad) {
        Long id = Double.valueOf(Math.random()*1000).longValue();
        entidad.setId(id);
        userDB.add(entidad);
        return id;
    }

    @Override
    public User findById(Long id) {
        for(User u: userDB){
            if(u.getEmail().equals(id)){
                return u;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {

        return userDB;
    }


    @Override
    public void update(User entidad) {
        for(User u: userDB) {
            if (u.getEmail().equals(entidad.getId())) {
                u.setName(entidad.getName());
                u.setEmail(entidad.getEmail());
            }
        }
    }

    @Override
    public void delete(Long id) {
        User toDelete = null;
        for (User u : userDB){
            if (u.getId().equals(id)){
                toDelete =u;
            }
        }
        userDB.remove(toDelete);
    }
}
