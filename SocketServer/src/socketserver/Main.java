/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketserver;

/**
 *
 * @author Nelissa
 */
import java.io.IOException;

public class Main {
//establish server connection
    public static void main(String[] args) {
        try {
            //use zero to have a random port generated
            Thread t = new Server(5000);
            t.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
