# Praktikum Docker - Pengelolaan Database User (CRUD)

Repositori ini berisi implementasi aplikasi web CRUD sederhana yang telah dikemas menggunakan Docker. Proyek ini mencakup proses pembuatan image, pengelolaan container, dan kolaborasi antar pengembang melalui Docker Hub.

## 📋 Deskripsi Praktikum
Dalam praktikum ini, dilakukan beberapa langkah utama:
1.  **Build Image**: Membuat Docker Image dari proyek aplikasi web-database lokal.
2.  **Push & Pull Image**: Mengunggah image ke Docker Hub dan mengambil (pull) image milik rekan (`naufalmuhdaffa/web-database`) untuk pengujian.
3.  **Container Management**: Menjalankan aplikasi di dalam container dengan pemetaan port yang sesuai melalui Docker Desktop.

## Detail Implementasi

### 1. Daftar Image (Docker Desktop)
Menampilkan daftar image yang tersedia secara lokal, termasuk image proyek pribadi dan image hasil pull dari repositori rekan.
* **Image ID:** `fbcd20e5465e` (web-database)
* **Image ID:** `9dfe8a297086` (naufalmuhdaffa/web-database)

### 2. Status Container
Container dijalankan dalam lingkungan terisolasi. Berdasarkan pengujian, container berjalan pada port:
* **Container praktikum7**: Memetakan port internal ke port host `32776`.
* **Container praktikum6**: Memetakan port internal ke port host `15517`.

### 3. Antarmuka Aplikasi
Aplikasi menyediakan fungsionalitas CRUD dasar:
* **Form User**: Input data Nama dan NIM.
* **List User**: Menampilkan data mahasiswa yang tersimpan.
* **Aksi**: Tombol Edit dan Delete untuk manajemen data.

## Cara Menjalankan

Untuk menjalankan container dari image yang tersedia di repositori ini:

```bash
# 1. Pull image dari Docker Hub
docker pull naufalmuhdaffa/web-database:1.0

# 2. Jalankan container dengan mapping port
docker run -d -p 32776:8080 --name praktikum-web-database naufalmuhdaffa/web-database:1.0
