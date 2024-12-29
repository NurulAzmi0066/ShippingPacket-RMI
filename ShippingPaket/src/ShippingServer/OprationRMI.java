package ShippingServer;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OprationRMI extends Remote {
    double calculateShippingCost(double berat, double jarakPengiriman, String jenisLayanan) throws RemoteException;
}

