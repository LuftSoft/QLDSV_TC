/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JLabel;

/**
 *
 * @author LENOVO
 */
public class TaskItem {
    private String status;
    private JLabel jlb;

    public TaskItem() {
    }

    public TaskItem(String status, JLabel jlb) {
        this.status = status;
        this.jlb = jlb;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JLabel getJlb() {
        return jlb;
    }

    public void setJlb(JLabel jlb) {
        this.jlb = jlb;
    }
    
}
