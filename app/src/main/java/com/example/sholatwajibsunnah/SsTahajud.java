package com.example.sholatwajibsunnah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SsTahajud extends AppCompatActivity {

    ActionBar actionBar;
    MediaPlayer mediaPlayer;

    Animation atg, atgtwo, btgone, btgtwo, btgthree;
    android.widget.TextView TextView;
    android.webkit.WebView WebView;

    @Override
    public void onCreate (Bundle savedInstanteState){
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_sunnahtahajud);

        mediaPlayer = MediaPlayer.create(SsTahajud.this, R.raw.hstahajud);
        mediaPlayer.start();

        WebView = findViewById(R.id.webviewshalatsunnahtahajud);
        String text=
                "&emsp; Shalat tahajud merupakan salah satu shalat sunnah yang dikerjakan pada malam hari. Sebagian ulama menyebutkan, syarat shalat tajahud adalah, dikerjakan setelah tertidur, meskipun hanya sebentar. </br> \n" +
                "Hukum shalat tahajud adalah sunnah. Namun, khusus untuk bagi Nabi Muhammad, shalat tahajud merupakan perkara wajib. Terdapat banyak keutamaan dalam shalat tahajud, jika kita mau menjalankannya. </br> \n" +
                        "Salat tahajud adalah salat sunah yang paling istimewa. Nabi Muhammad bersabda, \"Sebaik-baik puasa setelah puasa Ramadan adalah puasa pada bulan Allah (Muharram). Sebaik-baik salat setelah salat wajib adalah salat malam.” (H.R. Muslim) </p> \n" +
                        "Di dalam Surah al-Isra ayat 79, Allah berfirman sebagai berikut. </p>" +
                        " وَمِنَ اللَّيْلِ فَتَهَجَّدْ بِهِ نَافِلَةً لَّكَ عَسَىٰ أَن يَبْعَثَكَ رَبُّكَ مَقَامًا مَّحْمُودًا</p>" +
                        "Artinya : </br> \n" +
                        "&emsp; \"Pada sebagian malam, hendaklah kau bertahajud sebagai tambahan bagimu. Semoga Tuhanmu mengangkatmu ke derajat terpuji.</br> \n" +
                        "<p><b> Niat Salat Tahajud </b></p>" +
                        "&emsp; Niat adalah salah satu rukun salat. Jika seseorang hendak melafalkan niat salat tahajud dalam bahasa Arab, bunyinya adalah sebagai berikut ini. </p>" +
                        " أُصَلِّيْ سُنَّةَ التَهَجُّدِ رَكْعَتَيْنِ لِلهِ تَعَالَى </p> \n" +
                        "Ushalli sunnatat tahajjudi rak‘ataini lillāhi ta‘ālā. </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; \"Aku menyengaja sembahyang sunah tahajud dua rakaat karena Allah.\" </p> \n" +
                        "<p><b> Jumlah Rakaat dan Waktu Shalat Tahajud </b></p>" +
                        "Salat tahajud dikerjakan dengan jumlah rakaat yang genap, minimal dua rakaat. Mengenai jumlah rakaat maksimal, mahzab-mahzab dalam Islam memiliki pendapat berbeda. Menurut mahzab Syafiiyah, jumlah rakaat maksimal salat tahajud tidak terbatas. </br>" +
                        "Salat tahajud dapat dikerjakan kapanpun ketika malam telah tiba. Namun, terdapat waktu yang lebih utama, yaitu pada sepertiga terakhir malam. </br> \n" +
                        "Terdapat riwayat dari Abu Hurairah, Nabi Muhammad bersabda, \"Tuhan kami akan turun setiap malamnya ke langit dunia ketika tersisa sepertiga malam terakhir. Lalu Allah berfirman, “Siapa pun yang memanjatkan doa pada-Ku, maka akan Kukabulkan. Siapapun yang memohon kepada-Ku, maka akan Kuberi. Siapapun yang meminta ampun pada-Ku, akan Kuberikan ampunan untuknya”. (H.R. Bukhari) </p> \n" +
                        "<p><b> Bacaan Doa Shalat Tahajud </b></p> \n" +
                        "&emsp; Usai melaksanakan shalat tahajud, dianjurkan pula untuk membaca doa. Doa salat tahajud berisi pujian, pengakuan, dan sekaligus permohonan ampunan. Berikut ini adalah doa tersebut: </p> \n" +
                        " اَللهُمَّ رَبَّنَا لَكَ الْحَمْدُ اَنْتَ قَيِّمُ السَّمَوَاتِ وَاْلاَرْضِ وَمَنْ فِيْهِنَّ. وَلَكَ الْحَمْدُ اَنْتَ مَلِكُ السَّمَوَاتِ واْلاَرْضِ وَمَنْ فِيْهِنَّ. وَلَكَ الْحَمْدُ اَنْتَ نُوْرُ السَّمَوَاتِ وَاْلاَرْضِ وَمَنْ فِيْهِنَّ. وَلَكَ الْحَمْدُ اَنْتَ الْحَقُّ وَوَعْدُكَ الْحَقُّ وَلِقَاءُكَ حَقٌّ وَقَوْلُكَ حَقٌّ وَالْجَنَّةُ حَقٌّ وَالنَّارُ حَقٌّ وَالنَّبِيُّوْنَ حَقٌّ وَمُحَمَّدٌ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ حَقٌّ وَالسَّاعَةُ حَقٌّ. اَللهُمَّ لَكَ اَسْلَمْتُ وَبِكَ اَمَنْتُ وَعَلَيْكَ تَوَكَّلْتُ وَاِلَيْكَ اَنَبْتُ وَبِكَ خَاصَمْتُ وَاِلَيْكَ حَاكَمْتُ فَاغْفِرْلِيْ مَاقَدَّمْتُ وَمَا اَخَّرْتُ وَمَا اَسْرَرْتُ وَمَا اَعْلَنْتُ وَمَا اَنْتَ اَعْلَمُ بِهِ مِنِّيْ. اَنْتَ الْمُقَدِّمُ وَاَنْتَ الْمُؤَخِّرُ لاَاِلَهَ اِلاَّ اَنْتَ. وَلاَ حَوْلَ وَلاَ قُوَّةَ اِلاَّ بِالله </p> \n" +
                        "Allâhumma rabbana lakal hamdu. Anta qayyimus samâwâti wal ardhi wa man fî hinna. Wa lakal hamdu anta malikus samâwâti wal ardhi wa man fî hinna. Wa lakal hamdu anta nûrus samâwâti wal ardhi wa man fî hinna. Wa lakal hamdu antal haq. Wa wa‘dukal haq. Wa liqâ’uka haq. Wa qauluka haq. Wal jannatu haq. Wan nâru haq. Wan nabiyyûna haq. \n" +
                        "Wa Muhammadun shallallâhu alaihi wasallama haq. Was sâ‘atu haq. Allâhumma laka aslamtu. Wa bika âmantu. Wa alaika tawakkaltu. Wa ilaika anabtu. Wa bika khâshamtu. Wa ilaika hâkamtu. Fagfirlî mâ qaddamtu, wa mâ akhkhartu, wa mâ asrartu, wa mâ a‘lantu, wa mâ anta a‘lamu bihi minnî. Antal muqaddimu wa antal mu’akhkhiru. Lâ ilâha illâ anta. Wa lâ haula, wa lâ quwwata illâ billâh.</p> \n" +
                        "Artinya : </br>" +
                        "&emsp; \"Ya Allah, Tuhan kami, segala puji bagi-Mu, Engkau penegak langit, bumi, dan makhluk di dalamnya. \n" +
                        "Segala puji bagi-Mu, Engkau penguasa langit, bumi, dan makhluk di dalamnya. \n" +
                        "Segala puji bagi-Mu, Engkau cahaya langit, bumi, dan makhluk di dalamnya. Segala puji bagi-Mu, Engkau Maha Benar. Janji-Mu benar. Pertemuan dengan-Mu kelak itu benar. Firman-Mu benar adanya. Surga itu nyata. Neraka pun demikian. Para nabi itu benar. Demikian pula Nabi Muhammad SAW itu benar. Hari Kiamat itu benar. Ya Tuhanku, hanya kepada-Mu aku berserah. Hanya kepada-Mu juga aku beriman. \n" +
                        "Kepada-Mu aku pasrah. Hanya kepada-Mu aku kembali. Karena-Mu aku rela bertikai. Hanya pada-Mu dasar putusanku. Karenanya ampuni dosaku yang telah lalu dan yang terkemudian, dosa yang kusembunyikan dan yang kunyatakan, dan dosa lain yang lebih Kau ketahui ketimbang aku. Engkau Yang Maha Terdahulu dan Engkau Yang Maha Terkemudian. Tiada Tuhan selain Engkau. Tiada daya upaya dan kekuatan selain pertolongan Allah.\" </br> \n" +
                        "Doa tahajud ini diriwayatkan oleh Bukhari dan Muslim. Doa ini juga dicantumkan oleh Imam An-Nawawi dalam karyanya yang berjudul Al-Adzkar. \n" +

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
        TextView = findViewById(R.id.textViewshalatsunnahtahajud);
        WebView = findViewById(R.id.webviewshalatsunnahtahajud);
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
