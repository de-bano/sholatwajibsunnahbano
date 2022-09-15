package com.example.sholatwajibsunnah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SsHajat extends AppCompatActivity {

    Animation atg, atgtwo, btgone, btgtwo, btgthree;
    android.widget.TextView TextView;
    android.webkit.WebView WebView;

    MediaPlayer mediaPlayer;
    ActionBar actionBar;

    @Override
    public void onCreate (Bundle savedInstanteState){
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_sunnahhajat);

        mediaPlayer = MediaPlayer.create(SsHajat.this, R.raw.hshajat);
        mediaPlayer.start();

        WebView = findViewById(R.id.webviewshalatsunnahhajat);
        String text=
                "&emsp; Setiap orang pasti mempunyai hajatnya masing-masing. Entah dalam berupa harapan, kebutuhan, keinginan dalam kehidupannya.\n" +
                        "Dalam agama Islam, diajarkan ketika seorang hamba mempunyai hajat dalam hidupnya. Maka, ia berhak memohon dan meminta kepada Tuhannya untuk mengabulkannya.\n" +
                        "Memohon dan meminta kepada Tuhan banyak bentuknya. Bahkan dalam ajaran Islam, ibadah kepada Tuhan hendaknya diucapkan dengan permohonan. \n" +

                "<b> Bacaan Niat Shalat Hajat </b></p> \n" +
                        "niat shalat hajat </p>\n" +
                        "اُصَلِّى سُنَّةَ الْحَاجَةِ رَكْعَتَيْنِ لِلهِ تَعَالَى</p>\n" +
                        "“Usholli sunnatal-haajati rok’atayni lillahi ta’aala”.\n" +
                        "Artinya : </br>" +
                        "&emsp; “Saya berniat shalat sunnah hajat dua roka’at karena Allah Ta’aala” </p> \n" +

                        "<b> Tata Cara Sholat Hajat </b></p> \n" +
                        "&emsp; Syarat dan tata cara melakukan sholat sunnah hajat sama dengan melaksanakan sholat pada umumnya. Syarat sholat hajat diantaranya yaitu suci dari hadast kecil maupun besar, menutup aurat, suci badan, pakaian dan tempat sholat dari najis serta menghadap kiblat.\n" +
                        "Adapun untuk penjelasan tata cara sholat hajat dijelaskan berikut: </p>\n" +
                        "<b> Tata Cara Sholat Hajat pada Rakaat Pertama: </b> \n" +
                        "1. Niat melakukan sholat hajat </br> \n" +
                        "2. Takbirotul ihram (berdiri bagi yang mampu) </br>\n" +
                        "3. Doa iftitah </br> \n" +
                        "4. Membaca surat Al-Fatihah </br> \n" +
                        "5. Setelah alfatihah, dilanjutkan dengan membaca salah satu surat dalam Al Quran.Surat yang dibaca bebas. Diutamakan membaca surat al-Kaafirun sebanyak 3 kali.\n" +
                        "6. Ruku secara tuma’ninah </br> \n" +
                        "7. I’tidal (bangun dari ruku) secara tuma’ninah </br> \n" +
                        "8. Sujud secara tuma’ninah </br> \n" +
                        "9. Duduk diantara dua sujud secara tuma’ninah </br> \n" +
                        "10. Sujud kedua secara tuma’ninah </p> \n" +
                        "<b> Tata Cara Sholat Hajat pada Rakaat Kedua: </b></p> \n" +
                        "1. Berdiri untuk raka’at kedua </br> \n" +
                        "2. Membaca surat Al-Fatihah </br> \n" +
                        "3. Setelah alfatihah, dilanjutkan membaca Surat dalam Al-Quran. </br>\n" +
                        "Diutamakan membaca surat al-ikhlas sebanyak 3 kali </br> \n" +
                        "4. Ruku’ secara tuma’ninah </br> \n" +
                        "5. I’tidal (bangun dari ruku) secara tuma’ninah </br> \n" +
                        "6. Sujud secara tuma’ninah </br> \n" +
                        "7. Duduk diantara dua sujud secara tuma’ninah </br> \n" +
                        "8. Sujud kedua secara tuma’ninah </br> \n" +
                        "9. Duduk tasyahud akhir secara tuma’ninah </br> \n" +
                        "10. Mengucapkan salam </p> \n" +
                        "Begitulah tata cara melakukan shlat hajat. Lebih bagus lagi jika ditambah dengan sujud setelah mengucap salam dengan maksud merendahkan diri kepada Allah ta’ala. </br> \n" +
                        "Berikut urutan bacaan yang dibaca ketika sujud setelah salam pada sholat hajat.\n" +
                        "<b> 1. Saat melakukan sujud ini kita membaca </b></p> \n" +
                        "سُبْحَانَ اللهِ وَالْحَمْدُ للهِ، وَلاَ إِلَهَ إِلاَّ الله، وَاللهُ أَكْبَرُ</p>\n" +
                        "Subhahanallah walhamdulillah walaailaaha illallah waallahu akbar walaa haula wa quwwata illaa billahil ‘aliiyil ‘adzim \n" +
                        "Artinya : </br>" +
                        "&emsp; Maha suci bagi Allah, segala puji bagi Allah, tidak ada satu Tuhan pun yang disembah kecuali Allah, dan Allah maha besar </br>\n" +
                        "Dibaca sebanyak 10 kali. </p> \n" +
                        "<b> 2. Setelah itu kita membaca </b></p>\n" +
                        "اللَّهُمَّ صَلِّ عَلَى سَيِّدِنَا مُحَمَّدٍ وَعَلَى آلِ سَيِّدِنَا مُحَمَّد</p>\n" +
                        "Allahumma sholli ‘alaa sayyidina Muhammad wa ‘alaa ali sayyidina Muhammad \n" +
                        "Artinya : </br>" +
                        "&emspl “Yaa Allah, beri karunia kesejahteraan atas junjungan kami Nabi Muhammad, kesejahteraan yang diridhoi dan ridhoilah dari pada sahabat sahabat sekalian”\n" +
                        "Dibaca sebanyak 10 kali.\n" +
                        "<b> 3. Dan yang terakhir membaca doa </b>\n" +
                "رَبَّنَا آتِنَا فِي الدُّنْيَا حَسَنَةً وَفِي الآخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ</p>\n" +
                        "Rabbanaa aatinaa fidunyaa hasanah wa fil’akhirati hasanah wa qinaa ‘adzaaban nar </p>\n" +
                        "Artinya : </br>" +
                        "&emsp; “Ya Allah, berikanlah kepada Kami kebaikan di dunia, berikan pula kebaikan di akhirat dan lindungilah Kami dari siksa neraka.” (QS. al-Baqarah : 201).\n" +
                        "Waktu Pelaksanaan dan Jumlah Rakaat </br>\n" +
                        "Shalat hajat utama ditunaikan di malam hari seperti shalat tahajud. Namun, sholat hajat merupakan shalat sunnah yang bisa dikerjakan sepanjang waktu kecuali pada waktu terlarang dilakukan sholat. Waktu terlarang tersebut diantaranya sebagai berikut: </br>\n" +
                        "- Dari sholat Shubuh hingga terbit matahari terbit. </br> \n" +
                        "- Dari matahari terbit hingga matahari meninggi (kira-kira 15 menit setelah matahari terbit). </br> \n" +
                        "- Ketika matahari di atas kepala tidak condong ke timur atau ke barat hingga matahari tergelincir ke barat.</br> \n" +
                        "- Dari sholat Ashar hingga mulai tenggelam. </br> \n" +
                        "- Dari matahari mulai tenggelam hingga tenggelam sempurna. (Lihat Minhah Al-‘Allamfii Syarh Bulugh Al-Maram, 2: 205) </br> \n" +
                        "Mengenai jumlah rakaat dalam sholat hajat, dijelaskan melalui kitab Ihya Ulumuddin karya Al-Gazhalli. Imam Gazhali menyatakan bahwa sholat hajat bisa dikerjakan sebanyak 2 rakaat hingga 12 rakaat. </br> \n" +

                        "<p><b> Doa Shalat Hajat </b></p> \n" +
                        "&emsp; Baiknya setelah melakukan sholat maka dilanjutkan dengan berdoa meminta dan memohon kepada Allah SWT. Doa bisa berupa dzikir, maupun bacaan ayat-ayat Al-Qur’an. Berikut beberapa doa dan dzikir yang dapat diamalkan ketika menunaikan sholat hajat. </p> \n" +
                        "1. Membaca Istighfar </p> \n" +
                        "Dalam kitab Tajul jamil-lil-ushul dianjurkan membaca istighfar sebanya 100 kali, yaitu : </p> \n" +
                        "اَسْتَغْفِرُاللهَ الْعَظِيمِ</p>\n" +
                        "“Astaghfirullahal-‘adzhiim” </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Aku memohon ampunan kepada Allah yang Maha Besar/Maha Agung” </p> \n" +
                        "Atau yang lebih lengkap lagi seperti ini : </p> \n" +
                        "اَسْتَغْفِرُاللهَ رَبِّي مِنْ كُلِّ ذَنْبٍ وَاَتُوبُ اِلَيْهِ</p>\n" +
                        "“Astaghfirullaha Robbii min kulli dzanbin wa atuubu ilayhi” </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Aku Memohon ampunan kepada Allah Tuhanku, dari dosa-dosa dan aku bertaubat kepada-Mu”\n" +
                        "2. Membaca Sholawat Nabi </p>\n" +
                        "Selesai membaca istighfar dilanjutkan kembali dengan mambaca sholawat keatas Nabi Muhammad Shollallahu ‘alayhi wasallam sebanyak 100 kali, adapun bacaannya adalah : </p> \n" +
                        "اَللَّهُمَّ صَلِّى عَلَى سَيِّدِنَا مُحَمَّدٍ صَلَاةَ الرِّضَا وَارْضَ عَنْ اَصْحَابِ الرِّضَاالرِّضَا</p>\n" +
                        "“Allahumma sholli ‘alaa muhammadin sholaatar-ridhoo wardho ‘an ashaabir-ridhor-ridhoo” </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Yaa Allah, beri karunia kesejahteraan atas junjungan kami Nabi Muhammad, kesejahteraan yang diridhoi dan ridhoilah dari pada sahabat sahabat sekalian” </p>\n" +
                        "3. Membaca Doa Sholat Hajat </p>\n" +
                        "Setelah membaca sholawat keatas Nabi Muhammad Shollallahu ‘alayhi wasallam sebanyak 100 kali, barulah membaca doa sholat hajat. </br> \n" +
                        "Adapun doanya sebagaimana berikut: </p> \n" +
                        "لَاِلَهَ اِلَّااللهُ الْحَكِيمُ الْكَرِيمُ سُبْحَانَ اللهِ رَبِّ الْعَرْشِ الْعَظِيمِ. الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ اَسْأَلُكَ مُوْجِبَاتِ رَحْمَتِكَ وَعَزَائِمَ مَغْفِرَتِكَ وَالْغَنِيمَةَ مِنْ كُلِّ بِرٍّوَالسَّلَامَةَ مِنْ كُلِّ اِثْمٍ لَا تَدَعْ لِى ذَنْبًا اِلَّا غَفَرْتَهُ وَلَا هَمًّا اِلَّافَرَّجْتَهُ وَلَاحَاجَةً اِلَّا هِيَ لَكَ رِضًااِلَّاقَضَيْتَهَا يَااَرْحَمَ الرَّحِمِينَ</p>\n" +
                        "“Laa ilaaha illallahul hakiimul kariimu subhaanallahi rabbil ‘arsyil ‘adzhiim. Alhamdulillahi rabbil ‘aalamiin asaluka muujibaati rahmatika wa ‘azaaima maghfirotika wal ghoniimata min kulli birrin was-salaamata min kulli itsmin laa tada’ lii dzanban illa ghafartahu wa laa hamman illaa farrajtahu wa laa haajatan illaa hiya laka ridhon illaa qadhaytahaa yaa arhamar raahimiin”. </p>\n" +
                        "Artinya : </br>" +
                        "&emsp; “Tiada ada Tuhan selain Allah yang Maha Penyantun dan Pemurah. Maha Suci Allah Tuhan pemelihara arsy yang Maha Agung. Segala puji bagi Allah Tuhan seru sekalian alam. KepadaMu-lah aku memohon sesuatu yang mewajibkan rahmatMu, dan sesuatu yang“Laa ilaaha illallahul hakiimul kariimu subhaanallahi rabbil ‘arsyil ‘adzhiim. </p> \n" +
                        "Alhamdulillahi rabbil ‘aalamiin asaluka muujibaati rahmatika wa ‘azaaima maghfirotika wal ghoniimata min kulli birrin was-salaamata min kulli itsmin laa tada’ lii dzanban illa ghafartahu wa laa hamman illaa farrajtahu wa laa haajatan illaa hiya laka ridhon illaa qadhaytahaa yaa arhamar raahimiin”.";

        WebView.loadData("<p style=\"text-align: justify\">"+ text +"<p>", "text/html", "UTF-8");

        //inisiasi untuk animasi
        TextView = findViewById(R.id.textViewshalatsunnahhajat);
        WebView = findViewById(R.id.webviewshalatsunnahhajat);
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
