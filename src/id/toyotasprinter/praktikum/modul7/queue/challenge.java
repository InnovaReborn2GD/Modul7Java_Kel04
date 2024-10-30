package id.toyotasprinter.praktikum.modul7.queue;

public class challenge {
    public static void main(String[] args) {
        // Inisialisasi variabel
        int a = 1, b = 2, c = 3;

        // Menampilkan nilai awal
        System.out.println("Nilai Awal: a = " + a + ", b = " + b + ", c = " + c);

        // Membuat queue untuk menyimpan nilai
        Queue dataQueue = new Queue(3);

        // Enqueue nilai ke dalam queue
        dataQueue.enqueue(a);
        dataQueue.enqueue(b);
        dataQueue.enqueue(c);

        // Mengeluarkan nilai dari queue dan menukarnya
        c = (int) dataQueue.dequeue(); // Mengambil nilai 'a'
        b = (int) dataQueue.dequeue(); // Mengambil nilai 'b' (tetap sama)
        a = (int) dataQueue.dequeue(); // Mengambil nilai 'c'

        // Menampilkan nilai setelah ditukar
        System.out.println("Nilai Setelah Ditukar: a = " + a + ", b = " + b + ", c = " + c);
    }
}
