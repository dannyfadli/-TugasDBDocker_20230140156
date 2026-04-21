# Praktikum Docker - Pengelolaan Database User (CRUD)

Repositori ini berisi implementasi aplikasi web CRUD sederhana yang telah dikemas menggunakan Docker. Proyek ini mencakup proses pembuatan image, pengelolaan container, dan kolaborasi antar pengembang melalui Docker Hub.

## Deskripsi Praktikum
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

## Dokumentasi Screenshot

### 1. Daftar Image Docker

![Docker Images]<img width="1918" height="1022" alt="Cuplikan layar 2026-04-21 145501" src="https://github.com/user-attachments/assets/20b168e0-4d2d-470b-8efb-afed476cbc19" />

### 2. Daftar Container Running

![Docker Containers]<img width="1606" height="885" alt="Cuplikan layar 2026-04-21 145530" src="https://github.com/user-attachments/assets/b20ddafc-ed0c-40c6-a798-817c40d6e08c" />

### 3. Tampilan Web (Lokal)


![Web Lokal]<img width="1918" height="1071" alt="Cuplikan layar 2026-04-21 145955" src="https://github.com/user-attachments/assets/f98cd0a9-b6cf-437f-a128-c4f2ce46aa62" />

### 4. Tampilan Web (Image Teman)

![Web Teman]<img width="1917" height="1078" alt="Cuplikan layar 2026-04-21 145735" src="https://github.com/user-attachments/assets/c28b2881-ce49-4987-ade9-92f8d45f1521" />

## Cara Menjalankan

Untuk menjalankan container dari image yang tersedia di repositori ini:

```bash
# 1. Pull image dari Docker Hub
docker pull naufalmuhdaffa/web-database:1.0

# 2. Jalankan container dengan mapping port
docker run -d -p 32776:8080 --name praktikum-web-database naufalmuhdaffa/web-database:1.0


