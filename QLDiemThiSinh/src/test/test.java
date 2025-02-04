/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.UIManager;
import view.QLHSView;

/**
 *
 * @author thaii
 */
public class test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new QLHSView();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
