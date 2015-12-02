/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author NguyenVanDung
 */
public class Main {

    public static void main(String[] args) throws Exception {
        MySqlAccess dao = new MySqlAccess();
        dao.readDataBase();
    }
}