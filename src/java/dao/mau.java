/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import javax.xml.registry.infomodel.User;
import models.Users;

/**
 *
 * @author dinhh
 */
public class mau {
    public static void main(String[] args) {
        DBContext db = new DBContext();
        DAO da = new DAO(db);
        Users use = da.getAccountByUsername("admin");
        System.out.println(use.getUsername());
    }
}
