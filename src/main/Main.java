package main;

import Connection.KetNoiMSSQL;
import java.sql.Connection;
import view.frmDangNhap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
public class Main {

    public static Connection kn = null;
    public static String loginName;
    public static String password;
    public static String role;
    public static String user;
    public static String khoa;

    public static void main(String[] args) {
        new frmDangNhap().setVisible(true);
    }
    
   
}
