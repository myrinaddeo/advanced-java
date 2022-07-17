package org.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[]args) throws SQLException, ClassNotFoundException {
        int[] ids = {0,1,2};
        String[] names = {"Mary", "Bob", "Charlie"};

        Class.forName("org.sqlite.JDBC");

        String dbUrl = "jdbc:sqlite:people.db";

        var conn = DriverManager.getConnection(dbUrl);

        var stmt = conn.createStatement();
        conn.setAutoCommit(false);

        var sql = "Create table if not exists user (id integer primary key, name text not null)";
        stmt.execute(sql);

        sql ="insert into user (id, name) values (?,?)";
        var insertStmt = conn.prepareStatement(sql);

        for(int i=0; i<ids.length;i++){
            insertStmt.setInt(1,ids[i]);
            insertStmt.setString(2,names[i]);

            //insertStmt.executeUpdate();
        }

        conn.commit();


        insertStmt.close();

        sql = "select id, name from user";
        var rs =stmt.executeQuery(sql);

        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println(id + ": " + name);
        }


        sql = "drop table user";
        //stmt.execute(sql);

        stmt.close();
        conn.close();

    }
}
