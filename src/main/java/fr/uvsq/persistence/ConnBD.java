/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class ConnBD {

    public ConnBD() {
    }
    
  public Connection connect() {
  Connection conn = null;
  String url = "jdbc:derby://localhost:1527/";
  String dbName = "Forme";
  String driver = "org.apache.derby.jdbc.ClientDriver";
  String userName = "root"; 
  String password = "";
  try {
  Class.forName(driver).newInstance();
  conn = DriverManager.getConnection(url+dbName,userName,password);
  System.out.println("Connected to the database");
  //conn.close();
  System.out.println("Disconnected from database");
  } catch (Exception e) {
  e.printStackTrace();
  }
  return conn;
  }
  
    
}
