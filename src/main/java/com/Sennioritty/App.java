package com.Sennioritty;

import com.Sennioritty.business.User;
import com.Sennioritty.daos.Dao;
import com.Sennioritty.daos.UserDao;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static Dao<User> userDao;


    public static void main(String[] args) throws NumberFormatException {

        System.out.println("_______________________________");
        System.out.println("Bienvendio a la carga de datos.");
        System.out.println("_______________________________");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de usuarios:");
        int users= Integer.parseInt(entrada.nextLine());
        User[] userDB = new User[users];
        int i=0;

        while(users>i) {
            System.out.print("Ingrese el nombre: ");
            String name = entrada.nextLine();
            System.out.print("Ingrese el email: ");
            String email = entrada.nextLine();
            userDB[i] = new User(name, email);
            i++;
            System.out.println("________________________");
        }
        System.out.println("________________________");
        entrada.close();
        for (int j=0; j<users;j++) {
            System.out.println(userDB[j].toString());
        }

        System.out.println("________________________");

    }
}
