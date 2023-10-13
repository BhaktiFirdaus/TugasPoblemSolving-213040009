import java.util.HashMap;

class RoutingSystem {
    private HashMap<String, Integer> laluLintas;

    public RoutingSystem() {
        laluLintas = new HashMap<>();
    }

    public void tambahKondisiLaluLintas(String rute, int kondisi) {
        laluLintas.put(rute, kondisi);
    }

    public int hitungRuteTercepat(String rute) {
        int kondisiLaluLintas = laluLintas.getOrDefault(rute, 0);

        // Algoritma penghitungan rute tercepat berdasarkan kondisi lalu lintas
        

        // Contoh sederhana: Return waktu perjalanan tergantung pada kondisi lalu lintas
        if (kondisiLaluLintas == 0) {
            return 30; // Waktu perjalanan dalam menit ketika tidak ada kemacetan
        } else if (kondisiLaluLintas == 1) {
            return 45; // Waktu perjalanan dalam menit ketika ada sedikit kemacetan
        } else {
            return 60; // Waktu perjalanan dalam menit ketika ada kemacetan parah
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RoutingSystem routingSystem = new RoutingSystem();

        // Menambahkan data kondisi lalu lintas untuk setiap rute
        routingSystem.tambahKondisiLaluLintas("Rute A", 0);
        routingSystem.tambahKondisiLaluLintas("Rute B", 1);
        routingSystem.tambahKondisiLaluLintas("Rute C", 2);

        // Menentukan rute tercepat berdasarkan kondisi lalu lintas
        System.out.println("Rute tercepat untuk Rute A adalah " + routingSystem.hitungRuteTercepat("Rute A") + " menit.");
        System.out.println("Rute tercepat untuk Rute B adalah " + routingSystem.hitungRuteTercepat("Rute B") + " menit.");
        System.out.println("Rute tercepat untuk Rute C adalah " + routingSystem.hitungRuteTercepat("Rute C") + " menit.");
    }
}
