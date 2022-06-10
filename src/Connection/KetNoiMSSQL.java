/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class KetNoiMSSQL {
    public static Connection getKetNoi(String loginName, String password) {
        Connection kn = null;
        String url = "jdbc:sqlserver://;databaseName=QLDSV_TC";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            kn = DriverManager.getConnection(url,loginName,password);
            System.out.println("Ket noi thanh cong");
        }
        catch(SQLException | ClassNotFoundException e) {
            System.out.print(e);
            System.out.println("Ket noi khong thanh cong");
        }
        return kn;
    } 
   
}
