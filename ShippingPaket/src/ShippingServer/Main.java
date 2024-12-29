/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShippingServer;

import ShippingServer.Services;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ASUS
 */
public class Main {
     public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        // TODO code application logic here
        
        Services serv = new Services();
        try {
        Registry register = LocateRegistry.createRegistry(2000);
        register.bind("services", serv);
        System.out.println("Server is connected and ready for operation");
        }
        catch(Exception e){
            e.printStackTrace();
            } 
    }
    
}
