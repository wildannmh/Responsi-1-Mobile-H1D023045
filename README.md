<h2>
  Nama: Wildan Munawwar Habib <br>
  NIM: H1D023045 <br>
  Shift Awal: F <br>
  Shift Baru: E <br>
</h2>
<h1> Video Demo Aplikasi </h1>
https://github.com/user-attachments/assets/522c9b91-bf79-4c1b-9381-a7ae29b1f048

<h1> Penjelasan Alur </h1>
<h2> Pemanggilan ke API </h2>
<h3> 
  - Aplikasi memanfaatkan Retrofit untuk melakukan request ke API [https://api.football-data.org/v4/].<br>
  - Token API tidak disimpan di source code, melainkan diletakkan di file local.properties dengan key API_KEY.<br>
  - Token diambil secara aman ke BuildConfig melalui konfigurasi di build.gradle.kts<br>
  - Untuk request ke API, token dikirim via header X-Auth-Token.<br>
</h3>
<h2> Pengolahan Data </h2>
<h3>
  - Response dari API (misal daftar tim/squad) diubah menjadi model data Kotlin (data class).<br>
  - Data diparsing oleh Gson Converter bawaan Retrofit.<br>
</h3>
<h2> Penyajian di Layar </h2>
<h3>
  - Data model di-bind ke RecyclerView Adapter untuk ditampilkan dalam bentuk daftar kartu.<br>
  - Saat user menekan salah satu card, detail pemain/tim muncul melalui BottomSheetDialog.<br>
</h3>
