package com.itvdn.jdbcandhibernate.ex001_jpa_crud;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClientRepository cr = new ClientRepository();

        Client client = cr.getById(4);


        client.setPhone("(077)077-77-75");

        cr.add(client);



    }

}
