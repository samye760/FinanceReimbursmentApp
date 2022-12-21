package org.personal;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            AuthRepository test = new AuthRepository("samyers@g.clemson.edu", "password");
            System.out.println(test.exists());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
