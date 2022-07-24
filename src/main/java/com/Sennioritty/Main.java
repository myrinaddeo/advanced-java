package com.Sennioritty;

import com.Sennioritty.business.Article;
import com.Sennioritty.business.User;
import com.Sennioritty.daos.ArticleDao;
import com.Sennioritty.daos.UserDao;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Maru", "maru@gmail.com");
        User user2 = new User("Alfred", "alfred@gmail.com");
        UserDao userDao = new UserDao();
        Long id1 = userDao.create(user1);
        Long id2 = userDao.create(user2);

        Article article1 =new Article("mesa1", 300);
        Article article2 = new Article("mesa2", 400);
        Article article3 = new Article("silla1", 150);
        Article article4 = new Article("silla2", 200);
        ArticleDao articleDao = new ArticleDao();
        Long artId1 = articleDao.create(article1);
        Long artId2 = articleDao.create(article2);
        Long artId3 = articleDao.create(article3);
        Long artId4 = articleDao.create(article4);

        for (User u : userDao.getAll()) {
            System.out.println(u.toString());
        }
        System.out.println("________________________");

        user1.setEmail("maru1990@gmail.com");

        System.out.println("----------------------------");

        for (User u : userDao.getAll()) {
            System.out.println(u.toString());
        }

        User user3 = new User("indeseable", "indeseable@gmail.com");
        UserDao userdao = new UserDao();
        Long id3 = userDao.create(user3);

        System.out.println("----------------------------");

        for (User u : userDao.getAll()) {
            System.out.println(u.toString());
        }

        userDao.delete(id3);

        System.out.println("----------------------------");

        for (User u : userDao.getAll()) {
            System.out.println(u.toString());
        }

        System.out.println("----------------------------");
        System.out.println(userDao.findById(id3));

        for (User u : userDao.getAll()) {
            System.out.println(u.toString());
        }
        System.out.println("________________________");

        for (Article a : articleDao.getAll()) {
            System.out.println(a.toString());
        }
        System.out.println("----------------------------");

        for (Article a : articleDao.getAll()) {
            System.out.println(a.toString());
        }

        article2.setArtPrice(250);

        System.out.println("----------------------------");

        for (Article a : articleDao.getAll()) {
            System.out.println(a.toString());
        }

        Article article6 = new Article("cuadro", 5000);
        ArticleDao articledao = new ArticleDao();
        Long artId6 = articleDao.create(article6);

        System.out.println("----------------------------");

        for (Article a : articleDao.getAll()) {
            System.out.println(a.toString());
        }

        articleDao.delete(artId3);

        System.out.println("----------------------------");

        for (Article a : articleDao.getAll()) {
            System.out.println(a.toString());
        }

        System.out.println("----------------------------");
        System.out.println(articleDao.findById(artId3));

    }
}