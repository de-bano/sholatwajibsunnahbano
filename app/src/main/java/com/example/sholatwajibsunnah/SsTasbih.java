package com.example.sholatwajibsunnah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SsTasbih extends AppCompatActivity {

    ActionBar actionBar;
    MediaPlayer mediaPlayer;

    Animation atg, atgtwo, btgone, btgtwo, btgthree;
    android.widget.TextView TextView;
    android.webkit.WebView WebView;

    @Override
    public void onCreate (Bundle savedInstanteState){
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_sunnahtasbih);

        mediaPlayer = MediaPlayer.create(SsTasbih.this, R.raw.hstasbih);
        mediaPlayer.start();

        WebView = findViewById(R.id.webviewshalatsunnahtasbih);
        String text =
                        "&emsp; Shalat tasbih adalah shalat empat rakaat yang sepanjang shalat tersebut, seseorang mengucapkan kalimat tasbih 300 kali. Shalat tasbih dapat dikerjakan pada siang atau malam hari. Shalat ini dianjurkan untuk dikerjakan, paling tidak seumur hidup sekali. </br>\n" +
                        "&emsp; Terdapat perbedaan pendapat ulama tentang hukum shalat tasbih. Oleh sebagian ulama penganut Mazhab Syafi'i, shalat tasbih dihukumi sunnah. Dasarnya adalah riwayat dari jalur Ibnu Abbas bahwa Nabi Muhammad saw. mengajarkan shalat tasbih ini kepada paman beliau, Abbas bin Abdul Muthalib. </br>\n" +
                        "&emsp; Riwayat yang dimaksud, berbunyi, \"Wahai Abbas, pamanku, sukakah paman, aku beri, aku ajari 10 macam kebaikan yang dapat menghapus 10 macam dosa? Jika Paman mengerjakan hal tersebut, Allah akan mengampuni dosa-dosa Paman, baik yang awal maupun yang akhir, baik yang sudah lalu maupun yang akan datang, baik yang disengaja maupun tidak, baik yang kecil maupun yang besar, baik yang samar-samar maupun yang terang-terangan. </br>\n" +
                        "\"10 macam kebaikan itu adalah, Paman mengerjakan shalat 4 rakaat, dan setiap rakaat membaca Al Fatihah dan surat, apabila selesai membaca itu, dalam rakaat pertama dan masih (dalam posisi) berdiri, bacalah \"Subhanallah wal hamdulillah walaa ilaaha illallah wallahu akbar\" sebanyak 15 kali, lalu rukuk, dan dalam rukuk membaca bacaan seperti itu sebanyak 10 kali, " +
                                "kemudian mengangkat kepala dari rukuk (iktidal) juga membaca itu 10 kali, lalu sujud juga membaca 10 kali, setelah itu mengangkat kepala dari sujud (duduk di antara dua sujud) juga membaca 10 kali, lalu sujud juga membaca 10 kali, kemudian mengangkat kepala dan membaca 10 kali, jumlahnya ada 75 kali dalam setiap rakaat, paman dapat melakukannya dalam 4 rakaat.\" (H.R. Abu Dawud). </br> \n" +
                        "&emsp; Terkait hukum salat tasbih, selain pendapat bahwa salat ini sunah (jika dikerjakan mendapatkan pahala, jika tidak dikerjakan tidak apa-apa), terdapat pendapat lain, dari mazhab Hambali, bahwa salat ini statusnya boleh dikerjakan, bukan sunah. Dasarnya adalah derajat hadis ucapan Nabi kepada Abbas di atas, yang disebut dhoif. </br>\n" +
                        "&emsp; Pendapat lain, salat tasbih tidak disyariatkan. Ibnu Jauzi berpendapat bahwa hadis tentang salat ini adalah hadis maudlu. Meskipun demikian, banyak ulama yang berpendapat tentang hadis salat tasbih tersebut sebagai hadis shohih, sehingga dalam pendapat umum, salat ini hukumnya sunnah. </br>\n" +

                        "<p><b> Jumlah Rakaat Shalat Tasbih </b></p>" +
                        "&emsp; Shalat tasbih dikerjakan dengan 4 rakaat, dan dapat dilakukan pada siang hari atau malam hari. Imam Nawawi dalam kitab Al-Adzkar membedakan pengerjaan salat tasbih pada siang hari dan malam hari. Dalam hal ini, salat tasbih siang hari dapat dikerjakan dengan dua metode, yaitu 4 rakaat sekali salam atau 4 rakaat 2 kali salam (2 rakaat demi 2 rakaat). Sementara itu, salat tasbih malam hari dikerjakan 2 rakaat demi 2 rakaat. \n" +
                        "Imam Nawawi menyebutkan, \"Bila salat dilakukan pada malam hari maka lebih kusukai bila bersalam dalam dua rakaat. Namun bila (dilakukan) pada siang hari maka bila mau bersalam (daalam dua rakaat) dan bila mau maka tidak bersalam (dalam dua rakaat).” </p> \n" +

                        "Jumlah Tasbih dalam Shalat Tasbih </b></p> \n" +
                        "Seperti yang disebutkan dalam hadis di atas, shalat tasbih yang diajarkan Nabi Muhammad saw. kepada paman beliau, Abbas bin Abdul Muthalib diisi tasbih 300 kali yang dibagi ke dalam empat rakaat. Dengan demikian, setiap rakaat, seseorang akan membaca 75 kali tasbih. \n" +
                        "Jumlah 75 kali tasbih tersebut dibagi-bagi kembali ke dalam setiap gerakan salat. Setelah membaca Surah al-Fatihah dan surah pendek, pelaku salat tasbih membaca tasbih 15 kali. Setelah itu, usai tasbih rukuk, iktidal, tasbih sujud pertama, duduk di antara dua sujud, tasbih sujud kedua, dan duduk istirahat sebelum berdiri melanjutkan rakaat, pelaku salat membaca tasbih 10 kali dalam setiap gerakan tersebut. </br> \n" +
                        "Rincian jumlah rakaat tasbih dalam salat tasbih dalam sebagai berikut: </br> \n" +
                        " Waktu Tasbih (dalam Gerakan Shalat) dan Jumlah Tasbih </br> \n" +
                        "Setelah Surat Al-Fatihah dan surat pendek (masih dalam posisi berdiri) 15 kali </br> \n" +
                        "Setelah tasbih rukuk 10 kali </br> \n" +
                        "Setelah Iktidal 10 kali </br> \n" +
                        "Setelah tasbih sujud pertama 10 kali </br> \n" +
                        "Setelah duduk di antara dua sujud 10 kali </br> \n" +
                        "Setelah tasbih sujud kedua 10 kali </br> \n" +
                        "Setelah duduk istirahat sebelum berdiri (sebelum rakaat baru) 10 kali </br> \n" +
                        "Jumlah tasbih dalam 1 rakaat 75 kali </br> \n" +
                        "Jumlah tasbih dalam 4 rakaat 300 kali </br> \n" +

                        "<p><b> Niat Salat Tasbih </b></p>" +
                        "Jika niat salat tasbih menggunakan bahasa Arab, seseorang mesti terlebih dahulu memastikan, salat tasbihnya dikerjakan dengan 4 rakaat sekali salam atau 4 rakaat 2 kali salam (2 rakaat demi 2 rakaat). </p> \n" +
                        "Niat salat tasbih 4 rakaat sekali salam adalah sebagai berikut." +
                        " أُصَلِّيْ سُنَّةَ التَسْبِيْحِ أَرْبَعَ رَكَعَاتٍ لِلهِ تَعَالَى </p>" +
                        "Ushalli sunnat tasbīhi arba‘a rak‘ātin lillāhi ta‘ālā. </p>\n" +
                        "Artinya : </br>" +
                        "&emsp; “Aku menyengaja salat sunah tasbih empat rakaat karena Allah Ta'ala.” Niat salat tasbih 4 rakaat dua kali salam adalah sebagai berikut" +
                        ". أُصَلِّيْ سُنَّةَ التَسْبِيْحِ رَكْعَتَيْنِ لِلهِ تَعَالَى</p>" +
                        " Ushalli sunnat tasbīhi rak‘ataini lillāhi ta‘ālā </p>. \n" +
                        "Artinya :</br>" +
                        "&emsp; “Aku menyengaja sembahyang sunnah tasbih dua rakaat karena Allah SWT\". </br>\n" +

                        "<b> Tata Cara Salat Tasbih </b></p> " +
                        "Cara mengerjakan shalat tasbih tidak jauh berbeda dengan cara pengerjaan salat lain. Yang membedakan adalah tambahan bacaan tasbih \"Subhanallah wal hamdulillah walaa ilaaha illallah wallahu akbar\" dalam setiap gerakan salat dengan jumlah yang sudah ditetapkan. </br> \n" +
                        "Tata cara pengerjaan shalat tasbih adalah sebagai berikut. </br> \n" +
                        "1. Takbiratul Ihram </br>" +
                        "2. Membaca Surah al-Fatihah </br>" +
                        "3. Membaca Surah pendek </br>" +
                        "4. Membaca tasbih (Subhanallah wal hamdulillah walaa ilaaha illallah wallahu akbar) 15 kali </br>" +
                        "5. Rukuk, membaca tasbih rukuk. </br>" +
                        "6. Sebelum bangun untuk iktidal, membaca tasbih (Subhanallah wal hamdulillah walaa ilaaha illallah wallahu akbar) 10 kali. </br> \n" +
                        "7. Iktidal </br>" +
                        "8. Dalam posisi iktidal sebelum sujud, membaca tasbih (Subhanallah wal hamdulillah walaa ilaaha illallah wallahu akbar) 10 kali. </br> \n" +
                        "9. Sujud. </br>" +
                        "10. Dalam posisi sujud sebelum bangun untuk duduk di antara dua sujud membaca tasbih (Subhanallah wal hamdulillah walaa ilaaha illallah wallahu akbar) 10 kali. </br> \n" +
                        "11. Duduk di antara dua sujud. </br>" +
                        "12. Dalam posisi duduk, sebelum sujud kedua, membaca tasbih (Subhanallah wal hamdulillah walaa ilaaha illallah wallahu akbar) 10 kali. </br> \n" +
                        "13. Sujud kedua. </br>" +
                        "14. Dalam posisi sujud kedua, sebelum bangun, membaca tasbih (Subhanallah wal hamdulillah walaa ilaaha illallah wallahu akbar) 10 kali. </br> \n" +
                        "15. Duduk untuk bangun melanjutkan rakaat kedua. Sebelum bangun dalam posisi duduk membaca tasbih (Subhanallah wal hamdulillah walaa ilaaha illallah wallahu akbar) 10 kali. </br> \n" +
                        "16. Bangun, melakukan rakaat kedua seperti rakaat pertama. </br>" +
                        "17. Untuk rakaat terakhir sebelum salam, baik itu rakaat kedua atau rakaat keempat, sebagai ganti poin 15, sebelum salam membaca tasbih (Subhanallah wal hamdulillah walaa ilaaha illallah wallahu akbar) 10 kali sehingga tetap dalam rakaat tersebut tasbih diucapkan 75 kali.\n"

                                + "<h3>RAKAAT 1</h3>"+
                                "<p><b>Takbiratul Ihram</p></b>"+
                                "&emsp; Melakukan takbiratul ihram, yaitu semua jari-jari dirapatkan dihadapkan kedepan dan mengangkat kedua tangan ujung jarinya sejajar dengan Pundak atau Telinga (Kuping) tetapi jangan terlalu dekat (Beri Jarak atau Dimajukan Sedikit) sampai ruas-ruas tulang tertarik , seraya mengucapkan “Allaahu Akbar”. Pandangan mata melihat kearah tempat sujud. \n"+
                                "Menyedekapkan kedua tangan dengan posisi tangan kanan diatas tangan kiri seraya mengembangkan jari-jari tangan kanan dengan cara menggenggam tulang pergelangan tangan kiri dengan tangan kanan.\n" +
                                "\n" +
                                "Setelah tangan berada pada posisi itu secara sempurna yaitu di Ulu Hati (Dada Awal), hendaklah dibaca Doa Iftitah berikut ini :"+

                                "<p><b>Doa Iftitah</b></p>\n" +
                                "Terdapat banyak hadits mengenai doa Iftitah. Untuk lebih jelas mengenai Doa Iftitah anda bisa langsung menyakan kepada ahli Fiqih agama dan yang sering digunakan masyarakan Indonesia adalah sebagai berikut : </p>"+
                                "للهُ اَكْبَرُ كَبِرًا وَالْحَمْدُ لِلهِ كَشِيْرًا وَسُبْحَانَ اللهِ بُكْرَةً وَاَصِيْلًا . اِنِّى وَجَّهْتُ وَجْهِيَ لِلَّذِيْ فَطَرَالسَّمَاوَاتِ وَالْااَرْضَ حَنِيْفًا مُسْلِمًا وَمَا اَنَا مِنَ الْمُشْرِكِيْنَ . اِنَّ صَلَاتِيْ وَنُسُكِيْ وَمَحْيَايَ وَمَمَاتِيْ لِلهِ رَبِّ الْعَا لَمِيْنَ . لاَ شَرِيْكَ لَهُ وَبِذَ لِكَ اُمِرْتُ وَاَنَ مِنَ الْمُسْلِمِيْنَ </br>\n" +
                                "<p>Allaahu Akbaru kabiiraw-walhamdu lillaahi katsiiran, wa subhaanallaahi bukrataw-wa’ashiila. Wajjahtu wajhiya lilladzii fatharas-samaawaati wal ardha haniifam-muslimaw-wamaa anaa minal musyrikiina. Inna shalaatii wa nusukii wa mahyaaya wa mamaatii lillaahi Rabbil ‘aalamiina. Laa syariikalahu wa bidzaalika umirtu wa anaa minal muslimiin.</p>"+
                                "Artinya :</br>"+
                                "&emsp; Allah Maha Besar dengan sebesar-besarnya. Segala puji yang sebanyak-banyaknya bagi Allah. Maha Suci Allah pada pagi dan petang hari. Aku menghadapkan wajahku kepada Tuhan yang telah menciptakan langit dan bumi dengan segenap kepatuhan dan kepasrahan diri, dan aku bukanlah termasuk orang-orang yang menyekutukan-Nya. Sesungguhnya sholatku, ibadahku, hidup dan matiku hanyalah kepunyaan Allah, Tuhan semesta alam, yang tiada satu pun sekutu bagi-Nya. Dengan semua itulah aku diperintahkan dan aku adalah termasuk orang-orang yang berserah diri (muslim). </br>"+
                                "<p><b>Membaca Surat Al-Fatihah </b> </p> \n" +
                                "Kemudian membaca surat al-Fatihah : </br> \n"+
                                "بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ</br>\n" +
                                "1. Dengan nama Allah Yang Maha Pengasih, Maha Penyayang </br>\n" +
                                "اَلْحَمْدُ لِلّٰهِ رَبِّ الْعٰلَمِيْنَ</p>\n" +
                                "2. Segala puji bagi Allah, Tuhan seluruh alam,</br> \n" +
                                "الرَّحْمٰنِ الرَّحِيْمِ</p>\n" +
                                "3. Yang Maha Pengasih, Maha Penyayang,</br>\n" +
                                "مٰلِكِ يَوْمِ الدِّيْنِ</p>\n" +
                                "4. Pemilik hari pembalasan.</br>\n" +
                                "اِيَّاكَ نَعْبُدُ وَاِيَّاكَ نَسْتَعِيْنُ</p>\n" +
                                "5. Hanya kepada Engkaulah kami menyembah dan hanya kepada Engkaulah kami mohon pertolongan.</br>\n" +
                                "اِھْدِنَا الصِّرَاطَ الْمُسْتَـقِيْمَ</p>\n" +
                                "6. Tunjukilah kami jalan yang lurus</br>\n" +
                                "صِرَاطَ الَّذِيۡنَ اَنۡعَمۡتَ عَلَيۡهِمۡ ۙ غَيۡرِ الۡمَغۡضُوۡبِ عَلَيۡهِمۡ وَلَا الضَّآلِّيۡ</p>\n"+
                                "7. (yaitu) jalan orang-orang yang telah Engkau beri nikmat kepadanya; bukan (jalan) mereka yang dimurkai, dan bukan (pula jalan) mereka yang sesat. " +
                                "<p>Bismillahir-rahmanir-rahim. Al-hamdu lillahi rabbil-alamin. Ar-rahmanir-rahim. Maliki yaumid-din. Iyyaka na’budu wa iyaka nasta’in. Ihdinas-siratal-mustaqim. Siratal lazina an’amta ‘alaihim gairil-magdubi ‘alaihim wa lad-dallin.</p>"+

                                "<p><b>Membaca Surat Atau Ayat-Ayat Dari Al-Qur’an</b> </p> \n" +
                                "Kemudian membaca surat atau ayat-ayat tertentu dari al-Qur’an setelah selesai membaca surat al-Fatihah. Pada kali ini kami contohkan adalah surat al-Ikhlas."+
                                "bismillahirohmanirohim</br>\n" +
                                "قُلۡ هُوَ اللّٰهُ اَحَدٌ</p>\n" +
                                "1. Katakanlah (Muhammad), “Dialah Allah, Yang Maha Esa.</br>\n" +
                                "اَللّٰهُ الصَّمَدُ</p>\n" +
                                "2. Allah tempat meminta segala sesuatu.</br>\n" +
                                "لَمۡ يَلِدۡ ۙ وَلَمۡ يُوۡلَدۡ</p>\n" +
                                "3. (Allah) tidak beranak dan tidak pula diperanakkan.</br>\n" +
                                "وَلَمۡ يَكُنۡ لَّهٗ كُفُوًا اَحَدٌ</p>\n" +
                                "4. Dan tidak ada sesuatu yang setara dengan Dia.” </br>"+
                                "<p>Bismillahir-rahmanir-rahim. Qul huwallahu ahad. Allahus-samad. Lam yalid wa lam yulad. Wa lam yakul lahu kufuwan ahad.</p> \n" +

                                "<b>Ruku</b></p>\n" +
                                "Setelah selesai membaca Surat atau Ayat dalam Al-Quran Kemudian melakukan ruku’. Yakni dengan cara mengangkat kedua tangan setinggi telinga seraya membaca “Allahu Akbar”, Lalu badan membungkuk, kedua tangan menggengam lutut, mata memandang tempat sujud, punggung dan kepala rata, kemudian membaca doa: \n"+
                                "سُبْحَانَ رَبِّىَ الْعَظِيمِ\" 3x </p> \n" +
                                "Artinya :</br>\n" +
                                "\n" +
                                "Maha Suci Tuhanku Yang Maha Agung dan dengan segala puji bagi-Nya. 3x </p>" +

                                "<b>I’tidal</b></p>\n" +
                                "Kemudian melakukan i’tidal, yakni bangun dari ruku’ untuk berdiri tegak, " +
                                "dengan mengangkat kedua tangan sejajar dengan telinga, seraya mengucapkan : </p> \n" +
                                "سَمِعَ اللَّهُ لِمَنْ حَمِدَهُ</p>\n"+ "\n" +
                                "Sami’allaahu liman hamidah</p> \n" +
                                "Artinya : </br>\n" +
                                "&emsp; Allah mendengar orang yang memuji-Nya.\n" +
                                "\n" +
                                "Saat i’tidal, Mata memandang tempat sujud dan membaca doa i’tidal \n" +
                                " \n" +
                                "ربنا لك الحمد ملء السموات وملء الأرض وملء ما شئت من شيء بعد\n" +
                                "\n" +
                                "<p>Rabbanaa lakal hamdu Mil ussamaawaati wamil-ul ardhi wamil-u maasyi’ta min syai-in ba’du. </p></br>" +
                                "Artinya : </br>" +
                                "<p>“Ya Allah ya Tuhan kami, bagi-Mu-lah segala puji, sepenuh langit dan sepenuh bumi, dan sepenuh apa saja yang Engkau kehendaki sesudah itu.” </p>" +

                                "<b>Sujud</b> </p> \n" +
                                "Tata Cara Sujud Yang Benar Kemudian dilanjutkan dengan melakukan gerakan sujud seraya membaca “Allahu Akbar” " +
                                "dengan kedua lutut terlebih dulu, yakni meletakkan Dahi dan Hidung, Kedua Telapak Tangan, kedua lutut dan Kedua Kaki menempel di lantai (Tempat Sholat), seraya membaca doa : </p>\n   " +
                                "سُبْحَانَ رَبِّىَ الْأَعْلَى  </p> " +
                                "<p>Subhaana robbiyal ‘a’la 3x </p></br>   " +
                                "Artinya : </br>" +
                                "&emsp; Mahasuci Tuhanku yang Mahatinggi </p>" +
                                "<b>Iftirasy (Duduk Diantara Dua Sujud)</b></p> \n" +
                                "&emsp; Kemudian bangun dari sujud dengan mengucapkan “Allaahu Akbar”, untuk kemudian melakukan duduk di antara dua sujud. Pada saat sudah duduk dengan sempurna [menduduki kaki kiri, dengan telapak kaki kanan berdiri dan jarinya terletak di alas (lantai/tanah) menghadap kiblat]\n" +
                                "\n" +
                                "Tata Cara Iftirasy (Duduk Diantara Dua Sujud)Hendaklah dibaca doa berikut ini : </p>" +
                                "<p> رَبِّ اغْفِرْ لِى وَارْحَمْنِى وَاجْبُرْنِى وَارْزُقْنِى وَارْفَعْنِى </p>\n" +
                                "<p>Rabbighfirlii warhamnii wajburnii warfa’nii warzuqnii wahdinii wa ‘aafinii wa’fu ‘annii. </p>" +
                                "Artinya :</br>\n" +
                                "\n" +
                                "&emsp; Ya Allah, ampunilah aku, kasihanilah aku, cukupilah aku, angkatlah derajatku, berikanlah rejeki kepadaku, berikanlah petunjuk kepadaku, berilah kesehatan kepadaku dan ampunilah aku.\n" +
                                "\n" +

                                "<p><b>Sujud</b></p>\n" +
                                "Tata Cara Sujud Yang BenarDari posisi duduk lalu kembali melakukan sujud yang kedua kali seraya mengucapkan “Allahuakbar”. " +
                                "yakni meletakkan Dahi, Hidung, Kedua Telapak Tangan dan Kedua Kaki menempel di lantai (Tempat Sholat), seraya membaca doa : </p>" +
                                "سُبْحَانَ رَبِّىَ الْأَعْلَى وَبِحَمْدِهِ</p>\n" +
                                "\n" +
                                "Subhaana robbiyal ‘a’la wabihamdih 3x </p>" +
                                "Artinya :\n" +
                                "\n" +
                                "&emsp; Maha Suci Tuhanku Yang Maha Tinggi, dan dengan segala puji bagi-Nya. 3x\n" +
                                "\n" +
                                "Dianjurkan untuk duduk terlebih dulu Iftirasy tenang [HR. Bukhari 798, Abu Dawud 844] dan boleh mengepalkan tangan atau membuka tangan dengan jari menghadap arah kiblat dan menekan lantai [HR. Bukhari]/ Dipaha[HR. Abu Dawud] untuk mendorong tubuh berdiri tegak (bangkit dari sujud). </br>" +

                                "<h3>Rakaat 2</h3>\n" +
                                "Lakukan sebagaimana gerakan dan bacaan di Rokaat Pertama (1) tetapi dilakukan tanpa Doa Iftitah. </br>" +
                                "<b> Tasyahhud Awal </b></p> \n" +
                                "Setelah sujud yang ke dua kemudian melakukan Doa Tahiyat Awal dengan cara duduk posisi Iftirasy (Duduk Diantara Dua Sujud/Duduk di atas kaki kiri, sementara kaki kanan dalam posisi tegak) Jari sejajar dengan ujung paha.\n" +
                                "\n" +
                                "Tata Cara Tasyahhud Awal Yang BenarHendaklah tangan kiri diletakkan di atas paha kiri dengan posisi jari-jari tangan yang terkembang, dan banyak muslim di Indonesia yang menegakkan jari telunjuk ketika saat mulai membaca bagian kalimat asyhadu an laa ilaaha illallah, terdapat pendapat lain yang menerangkan menegakkan jari telunjuk dimulai dari awal tasyahhud (Atahiyat) [Referensi lebih jelas : Muslim.or.id]\n" +
                                "\n" +
                                "Dengan membaca bacaan Atahiyat Awal (Pertama) yaitu : </br>" +
                                "<p> التَّحِيَّاتُ لِلَّهِ وَالصَّلَوَاتُ وَالطَّيِّبَاتُ ، السَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِىُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ ، السَّلاَمُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ ، أَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ </p>\n" +
                                "\n" +
                                "(Attahiyyatu lillaah wash sholawaatu wath thoyyibaat. Assalaamu ‘alaika ayyuhan nabiyyu wa rohmatulloohi wa barokaatuh. Assalaaamu’alainaa wa ‘alaa ‘ibaadillaahish shoolihiin. Asyhadu allaa ilaaha illallooh wa asyhadu anna ‘abduhu warosuuluh)</p> \n" +
                                "\n" +
                                "Artinya :</br>" +
                                "&emsp; Segala penghormatan, shalawat dan kebaikan-kebaikan hanya bagi Allah. Semoga salam sejahtera selalu tercurahkan kepadamu wahai Nabi, demikian pula rahmat Allah dan berkahNya dan semoga salam sejahtera selalu tercurah kepada kami dan hamba-hamba Allah yang shalih. Aku bersaksi bahwa tiada ilah kecuali Allah dan aku bersaksi bahwa Muhammad adalah hamba dan rasulNya. (HR. Bukhari dan Muslim) </br>" +
                                "Kemudian berdiri tegap dan membaca “Allahuakbar” sambil dilanjutkan dengan bersedekap.\n" +
                                "\n" +

                                "<h3> Rokaat 3 </h3> \n" +
                                "Lakukan sebagaimana gerakan dan bacaan di Rokaat Pertama (1) tetapi dilakukan Tanpa Doa Iftitah dan langsung Menuju gerakan Ruku’ setelah mebaca Al-Fatihah.\n" +
                                "\n" +

                                "<h3> Rokaat 4 </h3> \n" +
                                "Lakukan sebagaimana gerakan dan bacaan di Rokaat Pertama (1) tetapi dilakukan Tanpa Doa Iftitah dan langsung Menuju gerakan Ruku’ setelah mebaca Al-Fatihah.\n" +
                                "\n" +
                                "<p> <b> Tasyahhud Akhir </b> </p> \n" +
                                "Setelah sujud yang ke dua kemudian melakukan Doa Tahiyat Akhir dengan cara duduk tasyahhud (tahiyat) akhir. Adapun tata cara duduk pada Tasyahhud Akhir ini hendaknya orang yang sholat duduk pada pangkal pahanya yang kiri dengan posisi kaki kiri yang keluar dari bagian bawahnya, sementara telapak kaki kanan dalam posisi tegak.\n" +
                                "\n" +
                                "Tata Cara Duduk Tasyahhud Akhir Yang BnarHendaklah tangan kiri diletakkan di atas paha kiri dengan posisi jari-jari tangan yang terkembang, dan banyak muslim di Indonesia yang menegakkan jari telunjuk ketika saat mulai membaca bagian kalimat asyhadu an laa ilaaha illallah, terdapat pendapat lain yang menerangkan menegakkan jari telunjuk dimulai dari awal tasyahhud (Atahiyat) [Referensi lebih jelas : Muslim.or.id] </br>" +
                                "<p> التَّحِيَّاتُ لِلَّهِ وَالصَّلَوَاتُ وَالطَّيِّبَاتُ ، السَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِىُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ ، السَّلاَمُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ ، أَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ </p>\n" +
                                "\n" +
                                "<p> (Attahiyyatu lillaah wash sholawaatu wath thoyyibaat. Assalaamu ‘alaika ayyuhan nabiyyu wa rohmatulloohi wa barokaatuh. Assalaaamu’alainaa wa ‘alaa ‘ibaadillaahish shoolihiin. Asyhadu allaa ilaaha illallooh wa asyhadu anna ‘abduhu warosuuluh) </p> \n" +
                                "\n" +
                                "اَللَّهُمَّ صَلِّ عَلىَ مُحَمَّدٍ وَعَلىَ آلِ مُحَمَّدٍ كَماَ صَلَّيْتَ عَلىَ إِبْرَاهِيْمَ وَعَلىَ آلِ إِبْرَاهِيْمَ إِنـَّكَ حَمِيْدٌ مَجِيْدٌ اَللَّهُمَّ باَرِكْ عَلىَ مُحَمَّدٍ وَعَلىَ آلِ مُحَمَّدٍ كَماَ باَرَكْتَ عَلىَ إِبْرَاهِيْمَ وَعَلىَ آلِ إِبْرَاهِيْمَ إِنـَّكَ حَمِيْدٌ مَجِيْدٌ\n" +
                                "\n" +
                                "<p> (Alloohumma sholli ‘alaa Muhammad wa ‘alaa aali Muhammad kamaa shollaita ‘alaa Ibroohim wa ‘alaa aali Ibroohimm innaka hamiidum majiid. Alloohumma baarik ‘alaa Muhammad wa ‘alaa aali Muhammad kamaa baarokta ‘alaa Ibroohim wa ‘alaa aali Ibroohimm innaka hamiidum majiid.) </p>\n" +
                                "\n" +
                                "Artinya: </br>\n" +
                                "\n" +
                                "&emsp; Segala penghormatan, shalawat dan kebaikan-kebaikan hanya bagi Allah. Semoga salam sejahtera selalu tercurahkan kepadamu wahai Nabi, demikian pula rahmat Allah dan berkahNya dan semoga salam sejahtera selalu tercurah kepada kami dan hamba-hamba Allah yang shalih. Aku bersaksi bahwa tiada ilah kecuali Allah dan aku bersaksi bahwa Muhammad adalah hamba dan rasulNya. (HR. Bukhari dan Muslim). Ya Allah, berilah rahmat kepada Nabi Muhammad dan keluarga Nabi Muhammad sebagaimana Engkau telah memberikan rahmat kepada Nabi Ibrahim dan keluarga Nabi Ibrahim. Sesungguhnya Engkau Maha Terpuji lagi Maha Mulia. Ya Allah, berilah keberkahan kepada Nabi Muhammad dan keluarga Nabi Muhammad sebagaimana Engkau telah memberikan keberkahan kepada Nabi Ibrahim dan keluarga Nabi Ibrahim. Sesungguhnya Engkau Maha Terpuji lagi Maha Mulia. (HR. Bukhari)\n" +
                                "\n" +
                                "<p> <b> Bacaan Salam </b></p> \n" +
                                "Terakhir adalah bacaan salam, yakni usai tasyahud akhir. Ketika menoleh ke kanan, Rasulullah terkadang mengucapkan salam: </br> \n" +
                                "<p> السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللَّهِ </p> \n" +
                                "\n" +
                                "(Assalaamu’alaikum warohmatullooh) </p> \n" +
                                "\n" +
                                "Artinya : </br>"+
                                "&emsp; Semoga keselamatan dan rahmat Allah limpahkan kepada kalian (HR. Muslim)";
                ;
                WebView.loadData("<p style=\"text-align: justify\">"+ text +"<p>", "text/html", "UTF-8");

        //inisiasi untuk animasi
        TextView = findViewById(R.id.textViewshalatsunnahtasbih);
        WebView = findViewById(R.id.webviewshalatsunnahtasbih);
        //load animasi
        btgone = AnimationUtils.loadAnimation(this, R.anim.btgone);
        btgtwo = AnimationUtils.loadAnimation(this, R.anim.btgtwo);
        btgthree = AnimationUtils.loadAnimation(this, R.anim.btgthree);
        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        atgtwo = AnimationUtils.loadAnimation(this, R.anim.atgtwo);


        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onPause() {
        super.onPause();
        mediaPlayer.release();
        finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}
