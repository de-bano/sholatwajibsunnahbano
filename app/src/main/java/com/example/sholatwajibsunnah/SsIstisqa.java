package com.example.sholatwajibsunnah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SsIstisqa extends AppCompatActivity {

    ActionBar actionBar;
    MediaPlayer mediaPlayer;

    Animation atg, atgtwo, btgone, btgtwo, btgthree;
    android.widget.TextView TextView;
    android.webkit.WebView WebView;

    @Override
    public void onCreate (Bundle savedInstanteState){
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_sunnahistisqa);

        mediaPlayer = MediaPlayer.create(SsIstisqa.this, R.raw.hsistisqa);
        mediaPlayer.start();


        WebView = findViewById(R.id.webviewshalatsunnahistisqa);
        String text=
                "&emsp; Mereka yang mengalami kemarau panjang dan menginginkan turun hujan dianjurkan untuk melakukan shalat sunnah istisqa. Mereka dianjurkan untuk melafalkan niat sebelum memulai shalat sunnah minta turun hujan." +
                        "Lafal ini dapat menjadi alternatif untuk dibaca sebelum shalat istisqa dimulai. </p> \n" +
                        " أُصَلِّيْ سُنَّةَ الاِسْتِسْقَاءِ رَكْعَتَيْنِ مَأْمُوْمًا لِلهِ تَعَالَى </p> " +
                        "Ushallī sunnatal istisqā’i rak‘ataini ma’mūman lillāhi ta‘ālā. </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Aku menyengaja shalat sunnah minta hujan dua rakaat sebagai makmum karena Allah SWT.” </p> \n" +
                        "Syekh Abdullah Bafadhal Al-Hadhrami menyebut cara shalat istisqa dua rakaat serupa dengan shalat dua rakaat shalat Id. Hanya saja, cara shalat keduanya berbeda sedikit dalam hal penempatan khutbah, pembacaan takbir, dan arah khatib pada khutbah kedua. Selebihnya kedua shalat ini secara umum sama. </p> \n" +
                        " <p>ويصلون ركعتين كالعيد بتكبيراته ويخطب خطبتين أو واحدة وبعدها أفضل واستغفر الله بدل التكبير ويدعو في الأولى جهرا ويستقبل القبلة بعد ثلث الخطبة الثانية وحول الإمام والناس ثيابهم حينئذ وبالغ فيها في الدعاء سرا وجهرا ثم استقبل الناس</p>" +
                        " Artinya :</br>" +
                        "&emsp; “Mereka shalat istisqa sebanyak dua rakaat seperti shalat Id berikut takbirnya. Seseorang yang menjadi khatib kemudian menyampaikan khutbah dua atau sekali. Khutbah setelah shalat lebih utama. Khatib beristighfar dalam khutbah sebagai pengganti takbir pada khutbah Id. Khatib berdoa dengan jahar (lantang), lalu menghadap kiblat setelah lewat sepertiga pada khutbah kedua. Khatib dan jamaah memutar pakaian (selendang atau sorban) ketika itu. Pada saat itu, khatib meningkatkan kesungguhan berdoa sirr (rahasia) dan jahar (lantang), setelah itu ia kembali menghadap ke arah jamaah,” (Lihat Syekh Abdullah Bafadhal Al-Hadhrami, Al-Muqaddimah Al-Hadhramiyyah pada Hamisy Busyral Karim, Beirut, Darul Fikr, 1433-1434 H/2012 M, juz II, halaman 365-366). </p> \n" +
                        "Berikut ini ringkasan tata cara shalat istisqa: </br> \n" +
                        "1. Shalat dua rakaat. </br> \n" +
                        "2. Rakaat pertama takbir tujuh kali sebelum membaca surat Al-Fatihah. </br> \n" +
                        "3. Rakaat kedua takbir lima kali sebelum membaca surat Al-Fatihah. </br> \n" +
                        "4. Khutbah dua atau sekali sebelum (atau setelah) shalat. Khutbah setelahshalat lebih utama. </br> \n" +
                        "5. Sebelum masuk khutbah pertama khatib membaca istighfar sembilan kali. </br> \n" +
                        "6. Sebelum masuk khutbah kedua khatib membaca istighfar tujuh kali. </br> \n" +
                        "7. Perbanyak doa dalam khutbah kedua. Wallahu a‘lam. (Alhafiz K)\n"
        ;
        WebView.loadData("<p style=\"text-align: justify\">"+ text +"<p>", "text/html", "UTF-8");

        //inisiasi untuk animasi
        TextView = findViewById(R.id.textViewshalatsunnahistisqa);
        WebView = findViewById(R.id.webviewshalatsunnahistisqa);
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
