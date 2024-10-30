package id.toyotasprinter.praktikum.modul7.queue;

public class Main {
    public static void main(String[] args) {
        // instansiasi queue dengan kapasitas 4
        Queue dataQueue = new Queue(3);

        // Simulasi data yang akan dikirim melalui jaringan
        String[] dataToSend = {"Packet1", "Packet2", "Packet3", "Packet4", "Packet5", "Packet6", "Packet7"};

        // Proses enqueue, memasukkan data ke dalam antrian (queue)
        System.out.println("\n--------Simulasi-Pengiriman-Data--------");
        for (String data : dataToSend) {
            // Memasukkan paket data ke dalam antrian
            dataQueue.enqueue(data);
            // Menampilkan isi antrian setelah setiap paket dimasukkan
            dataQueue.printQueue();

            // Setelah setiap pengiriman, cek apakah antrian penuh
            if (dataQueue.isFull()) {
                System.out.println("Antrian penuh, menunggu buffer kosong...\n");

                System.out.println("\n--------Simulasi-Pengambilan-Data--------");
                // Proses dequeue, mengeluarkan data dari antrian (simulasi penerimaan data)
                while (!dataQueue.isEmpty()) {
                    dataQueue.dequeue();
                    // Menampilkan isi antrian setelah setiap paket dikeluarkan
                    dataQueue.printQueue();
                }
                System.out.println("\nBuffer kosong, melanjutkan pengiriman...\n");
            }
        }

        // Mengeluarkan sisa data yang masih ada di queue setelah semua data dikirim
        if (!dataQueue.isEmpty()) {
            System.out.println("\n---------Mengeluarkan-Sisa-Data--------");
            while (!dataQueue.isEmpty()) {
                dataQueue.dequeue();
                dataQueue.printQueue();
            }
        }
    }
}