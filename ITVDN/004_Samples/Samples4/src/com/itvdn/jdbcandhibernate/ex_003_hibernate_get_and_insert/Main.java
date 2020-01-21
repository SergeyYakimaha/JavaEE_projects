package com.itvdn.jdbcandhibernate.ex_003_hibernate_get_and_insert;

import com.itvdn.jdbcandhibernate.ex_003_hibernate_get_and_insert.entity.Author;

import java.util.List;

/**
 * Created by Asus on 01.11.2017.
 */
public class Main {

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

        Author author = new Author();
        author.setName("Lermontov");

        ah.addAuthor(author);

        List<Author> authors = ah.getAuthorList();

        for (Author a : authors) {
            System.out.println(a.getId() + " " + a.getName());
        }

    }

}
