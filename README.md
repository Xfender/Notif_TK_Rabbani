
# Peraturan Repositori Ini
Website khusus untuk bagian pegawai

Ada 4 branch pada repositori ini
- master
- Rizki
- Ilyas
- Ana

branch master adalah template awal disitu sudah inisialisasi template admin jadi
tinggal ngoding aja.
branch Rizki, Ragil, Tio adalah tempat kita masing masing kembangin aplikasi
jadi masing masing dari kita punya branch dan tidak push ke branch lain atau master.
ketika kita selesai mengerjakan branch maka pada akhir pekan atau ketika apa yang
kita kerjakan selesai maka semua branch akan disatukan menjadi branch master,
lalu jika ada fitur baru buat branch lagi setelah selesai satukan ke master, begitu seterusnya.

> __Warning__ : JANGAN PUSH KE BRANCH MASTER

- Download dan instal dulu gitbush https://git-scm.com/downloads
- kalau udah buka git Bash (jangan git Gui, Git cmd)
- masuk ke folder project kita dengan perintah (cd /linkfolderkita   exc -> cd /D/projecttk )

> __Warning__ : ini cara pakek git nya

## Cara Inisialisasi Repositori Ke Folder (Dilakukan saat pertama kali)
- git init
- git remote add origin https://github.com/Xfender/Notif_TK_Rabbani
- git pull origin nama_branch
> __Contoh__ : git pull origin Rizki

## Cara push ke branch masing masing
- git checkout nama_branch
> __Contoh__ : git checkout Rizki (digunakan untuk berganti branch)
- git add .
- git commit -m "Pesan anda kepada tim"
- git push origin nama_branch
> __Contoh__ : git push -u origin Rizki

> __Warning__ : JANGAN PUSH KE BRANCH MASTER


## Catatan Project.
- Fokus pada tujuan kita

=======
# Notif_TK_Rabbani
>>>>>>> e5d17da7fae5de7a826d345c01d9f58562a8b7a4
