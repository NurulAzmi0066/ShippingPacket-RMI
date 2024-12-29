/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShippingServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ASUS
 */
public class Services extends UnicastRemoteObject implements OprationRMI {
    public Services() throws RemoteException {
        super();
    }

    @Override
    public double calculateShippingCost(double berat, double jarakPengiriman, String jenisLayanan) throws RemoteException {
        //double baseCost = berat * jarakPengiriman * 5000; // Tarif dasar
    // Validasi jarak untuk layanan Instan
    if ("Instan".equalsIgnoreCase(jenisLayanan) && jarakPengiriman > 30) {
        throw new IllegalArgumentException("Layanan Instan tidak tersedia untuk jarak lebih dari 30 km.");
    }

    // Tarif dasar
    double tarifPerKg = 2000; // Tarif per kilogram
    double tarifPerKm = 1000; // Tarif per kilometer

        // Hitung biaya dasar pengiriman
        double biayaDasar = (berat * tarifPerKg) + (jarakPengiriman * tarifPerKm);

        // Hitung PPN 11%
        double ppn = biayaDasar * 0.11;

        // Total biaya dengan PPN
        double baseCost = biayaDasar + ppn;

    // Modifikasi biaya berdasarkan jenis layanan
    switch (jenisLayanan) {
        case "Reguler":
            return baseCost;
        case "Express":
            return baseCost * 1.5; // Tambah 50% untuk layanan Express
        case "Instan":
            return baseCost * 2;   // Tambah 100% untuk layanan Instan
        case "Same Day" :
            return baseCost * 5; // Tambah 400% untuk layanan same day
        default: // Reguler
            return baseCost ; // Tidak ada penambahan
    } // Reguler
    }
}
