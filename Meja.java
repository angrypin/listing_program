/**
* Tugas 5 - Membuat listing program dengan class tertentu
* https://github.com/angrypin/listing_program
* @author angrypin
* @version 1.0.0
* @since 2021-09-13
*/

/* M. Arifin Ilham - XII RPL 1 - 13/09/2021 */

// kelas Meja
public class Meja {
  // fungsi utama
  public static void main(String[] args) {
    // variable untuk Meja
    int kaki = 4;
    String
      bahan = "Kayu",
      warna = "Coklat",
      bentuk = "Persegi Panjang";

    // menampilkan 4 ciri dari kelas Meja
    System.out.print(
      "Ciri - ciri Meja" +
      "\n- Jumlah kaki\t: " + kaki +
      "\n- Warna\t\t: " + warna +
      "\n- Bahan\t\t: " + bahan +
      "\n- bentuk meja\t: " + bentuk + "\n"
    );
  }
}