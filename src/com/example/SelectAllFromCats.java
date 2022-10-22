package com.example;

import java.sql.*;

public class SelectAllFromCats {

  public static void main(String[] args) throws SQLException {
    Connection con = DriverManager.getConnection(
        "jdbc:sqlserver://localhost:1433;database=cats", "CHANGEME", "CHANGEME");
    PreparedStatement stmt = con.prepareStatement("SELECT * FROM [cats].[dbo].[cat]");
    ResultSet rslt = stmt.executeQuery();
    while (rslt.next()) {
      System.out.println(rslt.getString("cat_name"));
    }
  }
}