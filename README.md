###SISTEM TERDISTRIBUSI
##KELOMPOK 1 
#ANGGOTA KELOMPOK
1. Nurul Azmi / 13020210066
2. Putri Elsa Musati M. / 13020210190

###Konsep Sistem Perhitungan Ongkos Kirim Barang

Sistem perhitungan ongkos kirim barang adalah suatu mekanisme yang digunakan untuk menentukan biaya pengiriman berdasarkan berbagai parameter seperti berat barang, jarak pengiriman, jenis layanan, serta tambahan lainnya seperti pajak atau diskon. Berikut adalah penjelasan konsep dasarnya:
________________________________________
1. Komponen Utama dalam Sistem
a. Berat Barang
	Berat barang biasanya dihitung dalam kilogram (kg) atau gram.
	Semakin berat barang, biaya pengiriman semakin tinggi.
	Tarif dasar dapat berupa: 
	Biaya tetap per kilogram.
	Biaya yang meningkat berdasarkan kategori berat tertentu (misalnya, >5 kg memiliki tarif lebih tinggi).
b. Jarak Pengiriman
	Jarak pengiriman biasanya dihitung dalam kilometer (km).
	Biaya per km dihitung berdasarkan: 
	Jarak pendek (misalnya <50 km) mungkin memiliki tarif lebih murah.
	Jarak jauh akan meningkatkan total biaya pengiriman.
c. Jenis Layanan
	Jenis layanan memberikan fleksibilitas waktu pengiriman dan biaya tambahan: 
	Reguler: Pengiriman standar tanpa biaya tambahan.
	Express: Pengiriman lebih cepat dengan biaya tambahan (misalnya 50% lebih mahal).
	Instan: Pengiriman dalam hari yang sama dengan tarif tertinggi.
	Same Day: Kombinasi dari instan dan cepat, biasanya lebih mahal dari express.
d. Pajak (PPN)
	Pajak pertambahan nilai (PPN) sering ditambahkan ke biaya pengiriman.
	Contoh: Tarif dasar ditambah 11% dari biaya sebagai pajak.
e. Diskon
	Sistem dapat menyediakan kode diskon yang mengurangi biaya pengiriman.
	Diskon dihitung dalam persentase (misalnya 10%, 20%, atau 30%) dari total biaya sebelum pajak.
________________________________________
2. Rumus Dasar Perhitungan Ongkos Kirim
Rumus dasar perhitungan ongkos kirim dapat dirancang sebagai berikut:
Biaya Total∶(Berat Barang per Kg+Tarif per Kg+Jarak ×Tarif per Km)×(1+Pajak)-Diskon

Penjelasan:
	Berat Barang: Berat total barang yang dikirimkan.
	Tarif per kg: Biaya per kilogram barang.
	Jarak: Jarak pengiriman barang (dalam km).
	Tarif per km: Biaya per kilometer pengiriman.
	Pajak: Nilai persentase pajak (misalnya 11%).
	Diskon: Pengurangan biaya total dalam bentuk persentase.
3. Validasi dan Batasan
a. Validasi Input
	Berat barang tidak boleh negatif.
	Jarak pengiriman harus lebih dari 0.
	Token diskon harus sesuai dengan daftar yang tersedia.
b. Batasan Pengiriman
	Misalnya, layanan Instan hanya tersedia untuk jarak ≤30 km.
	Berat maksimum barang yang dapat dikirimkan melalui layanan tertentu.
________________________________________
4. Implementasi dalam Sistem
a. Backend (Java RMI)
	Menyediakan layanan perhitungan ongkos kirim.
	Menggunakan validasi logis untuk memastikan aturan dan batasan terpenuhi.
b. Frontend (GUI)
	Mengambil input pengguna (berat, jarak, jenis layanan, dan token diskon).
	Menampilkan hasil perhitungan kepada pengguna.
c. User Experience
	Pastikan pesan error jelas saat input salah.
	Sistem harus responsif dan mudah digunakan.
Dengan konsep ini, sistem perhitungan ongkos kirim barang akan bekerja secara akurat, fleksibel, dan sesuai kebutuhan pengguna.
	
