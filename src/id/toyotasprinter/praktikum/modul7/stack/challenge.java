package id.toyotasprinter.praktikum.modul7.stack;

public class challenge {
        public static void main(String[] args) {
            // Inisialisasi variabel
            int a = 1, b = 2, c = 3;

            // Menampilkan nilai awal
            System.out.println("Nilai Awal: a = " + a + ", b = " + b + ", c = " + c);

            // Membuat stack untuk menyimpan nilai
            Stack stack = new Stack(3);

            // Push nilai ke dalam stack
            stack.push(a);
            stack.push(b);
            stack.push(c);

            // Mengeluarkan nilai dari stack dan menukarnya
            c = (int) stack.pop(); // Mengambil nilai 'c'
            b = (int) stack.pop(); // Mengambil nilai 'b' (tetap sama)
            a = (int) stack.pop(); // Mengambil nilai 'a'

            // Menampilkan nilai setelah ditukar
            System.out.println("Nilai Setelah Ditukar: a = " + a + ", b = " + b + ", c = " + c);
        }
    }
