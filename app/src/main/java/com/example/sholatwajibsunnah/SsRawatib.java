package com.example.sholatwajibsunnah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SsRawatib extends AppCompatActivity {

    ActionBar actionBar;
    MediaPlayer mediaPlayer;

    Animation atg, atgtwo, btgone, btgtwo, btgthree;
    android.widget.TextView TextView;
    android.webkit.WebView WebView;


    @Override
    public void onCreate (Bundle savedInstanteState){
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_sunnahrawatib);

        mediaPlayer = MediaPlayer.create(SsRawatib.this, R.raw.hsrawatib);
        mediaPlayer.start();

        WebView = findViewById(R.id.webviewshalatsunnahrawatib);
        String text =
                "&emsp; Shalat sunnah rawatib adalah shalat sunnah yang mengiringi shalat fardu. Shalat sunnah rawatib yang dikerjakan sebelum shalat wajib disebut shalat qobliyah, sedangkan shalat sunnah rawatib yang dilakukan setelah sahlat wajib disebut shalat bakdiyah. </br> \n" +
                "&emsp; Shalat sunnah rawatib berfungsi sebagai penyempurna jika terjadi kekurangan dalam shalat fardu seseorang. " +
                "Shalat fardu sendiri hukumnya wajib bagi muslim. " +
                "Shalat fardu ini pula yang menjadi amalan pertama yang dihisab dalam Hari Perhitungan. " +
                "Oleh karenanya, menunaikan shalat sunnah rawatib sangat dianjurkan. </br> \n" +
                "&emsp; Diriwayatkan, Nabi Muhammad saw. bersabda, Sesungguhnya amal hamba yang pertama kali dihisab pada hari Kiamat adalah shalat fardu. Itu pun jika sang hamba menyempurnakannya. " +
                "Jika tidak, maka disampaikan, “Lihatlah oleh kalian, apakah hamba itu memiliki amalan (shalat) sunnah?” Jika memiliki amalan salat sunah, sempurnakan amalan salat fardu dengan amal shalat sunnahnya. " +
                "Kemudian, perlakukanlah amal-amal fardu lainnya seperti (dalam kasus shalat) tadi. (H.R. Ibnu Majah). </br> \n" +
                "<p> <b> Jumlah Rakaat Shalat Sunnah </b> </p>" +
                "&emsp; Rawatib Salat sunnah rawatib dalam sehari semalam total terdiri dari 22 rakaat, yang terbagi ke dalam lima waktu shalat fardu. </br> \n" +
                "&emsp; Syekh Zainuddin Al-Malibary dalam Fathul Muin Syarh Qurrotil ‘Ain bi Muhimmatid-Din (hlm. 158--159) menyebutkan, " +
                "Disunahkan shalat sunnah 4 rakaat sebelum shalat ashar, 4 rakaat sebelum dzuhur dan setelahnya, 2 rakaat setelah magrib dan disunnahkan menyambung 2 rakaat ba’diyah magrib dengan shalat fardu, dan tidak hilang keutamaan menyambung 2 rakaat ba’diyah magrib sebab melakukan zikir ma’tsur setelah shalat fardu. </br> \n" +
                "&emsp; Kemudian setelah isya 2 rakaat yang ringan, begitu juga 2 rakaat sebelum shalat isya jika tidak sibuk menjawab adzan. " +
                "Apabila di antara adzan dan iqamat ada waktu luang untuk mengerjakan 2 rakaat sebelum isya, maka dapat dikerjakan. Jika tidak, maka diakhirkan (setelah shalat isya), dan dua rakaat setelah subuh. </br> \n" +

                "<p><b> Niat Shalat Rawatib </b></p>" +
                   "&emsp; Berikut ini adalah daftar bacaan niat shalat sunnah rawatib dua rakaat berdasarkan salat fardu yang diiringinya." +
                        "Niat Shalat Rawatib Sebelum Shalat Subuh </b></p> \n " +
                        "اُصَلِّى سُنَّةَ الصُّبْحِ رَكْعَتَيْنِ قَبْلِيَّةً مُسْتَقْبِلَ الْقِبْلَةِ ِللهِ تَعَالَى </p>"  +
                        "Usholli Sunnatash Subhi Rok’ataini Qobliyatan Mustaqbilal Qiblati Lillahi Ta’ala </p>" +
                        "Artinya : </br>" +
                        "&emsp; Saya (berniat) mengerjakan shalat sunnah sebelum subuh 2 rakaat, menghadap kiblat karena Allah Ta’ala" +
                        "Niat Shalat Rawatib Sebelum Dzuhur </b></p> " +
                        "اُصَلِّى سُنَّةً الظُّهْرِرَكْعَتَيْنِ قَبْلِيَّةً مُسْتَقْبِلَ الْقِبْلَةِ ِللهِ تَعَالَى </p>" +
                        "Ushalli Sunnatadh Dhuhri Rok’ataini Qobliyatan Mustaqbilal Qiblati Lillahi Ta’ala </p>" +
                        "Artinya : </br>" +
                        "&emsp; Saya (berniat) mengerjakan shalat sunnah sebelum dzuhur 2 rakaat, menghadap kiblat karena Allah Ta’ala. </br>" +
                        "Niat Shalat Rawatib Sesudah Dzuhur </b></p>" +
                        "اُصَلِّى سُنَّةً الظُّهْرِرَكْعَتَيْنِ بَعْدِيَّةً مُسْتَقْبِلَ الْقِبْلَةِ ِللهِ تَعَالَى</p>" +
                        "Ushalli Sunnatadh Dhuhri Rok’ataini Ba’diyah Mustaqbilal Qiblati Lillahi Ta’ala </p>" +
                        "Artinya : </br>" +
                        "&emsp; Saya (berniat) mengerjakan shalat sunnah sesudah dzuhur 2 rakaat, menghadap kiblat karena Allah Ta’ala. </br>" +
                        "Niat Shalat Rawatib Sesudah Magrib </b></p>" +
                        " اُصَلِّى سُنَّةً الْمَغْرِبِ رَكْعَتَيْنِ بَعْدِيَّةً مُسْتَقْبِلَ الْقِبْلَةِ ِللهِ تَعَالَى</p>" +
                        "Usholli Sunnatal Maghribi Rok’ataini Ba’diyah Mustaqbilal Qiblati Lillahi Ta’ala </p>" +
                        "Artinya : </br>" +
                        "&emsp; Saya (berniat) mengerjakan shalat sunnah sesudah magrib 2 rakaat, menghadap kiblat karena Allah Ta’ala.</br>" +
                        "Niat Shalat Rawatib Sesudah Isya </b></p>" +
                        "' اُصَلِّى سُنَّةً الْعِشَاءِ رَكْعَتَيْنِ بَعْدِيَّةً مُسْتَقْبِلَ الْقِبْلَةِ ِللهِ تَعَالَى</p>" +
                        "Usholi Sunnatal Isyaa’i Rok’ataini Ba’diyatta Mustaqbilal Qiblati Lillahi Ta’ala </p>" +
                        "Artinya :</br>" +
                        "&emsp; Saya (berniat) mengerjakan shalat sunnah sesudah Isya 2 rakaat, menghadap Kiblat karena Allah Ta’ala." +


                        "<h3>RAKAAT 1</h3>"+
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
                        "&emsp; Maha Suci Tuhanku Yang Maha Agung dan dengan segala puji bagi-Nya. 3x </p>" +

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
                        "Artinya : </br> " +
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



        WebView.loadData("<p style=\"text-align: justify\">"+ text +"<p>", "text/html", "UTF-8");

        //inisiasi untuk animasi
        TextView = findViewById(R.id.textViewshalatsunnahrawatib);
        WebView = findViewById(R.id.webviewshalatsunnahrawatib);
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