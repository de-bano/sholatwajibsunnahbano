package com.example.sholatwajibsunnah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SsTaubat extends AppCompatActivity {

    ActionBar actionBar;
    MediaPlayer mediaPlayer;

    Animation atg, atgtwo, btgone, btgtwo, btgthree;
    android.widget.TextView TextView;
    android.webkit.WebView WebView;

    @Override
    public void onCreate (Bundle savedInstanteState){
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_sunnahtaubat);

        mediaPlayer = MediaPlayer.create(SsTaubat.this, R.raw.hstaubat);
        mediaPlayer.start();

        WebView = findViewById(R.id.webviewshalatsunnahtaubat);
        String text=
                "&emsp; Tidak dipungkiri bahwa setiap hamba Allah pastilah pernah melakukan perbuatan salah dan dosa. \n" +
                        "Dan ketika ini terjadi pada seseorang Islam memerintahkan untuk segera bertobat dengan meminta ampunan kepada Allah, menyesali perbuatan salahnya, dan bertekad kuat untuk tidak akan lagi mengulangi dosa kesalahan yang sama. </p> \n" +
                        "Karena taubat merupakan suatu kewajiban bagi orang yang bersalah maka menunda bertobat dari satu kesalahan merupakan sebuah dosa yang juga mesti ditobati. \n" +
                        "Demikian Syekh Nawawi Banten menyampaikan dalam kitabnya Nihâyatuz Zain (Bandung: Syirkah Al-Ma’arif, tt, hal. 106). </br> \n" +
                        "Masih menurut beliau bahwa bila tobat yang dilakukan seseorang itu benar maka secara pasti ia akan melebur dosa yang telah dilakukan meskipun itu dosa besar seperti kufur dan lainnya. </p> \n" +
                        "Rasulullah shallallâhu ‘alaihi wa sallam pernah bersabda: </p> \n" +
                        " كُلُّ بَنِي آدَمَ خَطَّاءٌ، وَخَيْرُ الْخَطَّائِينَ التَّوَّابُونَ </p> \n " +
                        "Artinya : </br>" +
                        "&emsp; “Setiap anak keturunan Adam adalah orang yang berbuat kesalahan, dan sebaik-baik orang yang berbuat kesalahan adalah orang yang bertobat.” (HR. Ibnu Majah; lihat Ibnu Hajar Al-Asqalani, Bulûghul Marâm, [Semarang: Usaha Keluarga], tt., hal. 302) </p> \n" +
                        "Para ulama mengajarkan agar ketika seseorang hendak bertobat atas sebuah dosa dan kesalahan yang ia perbuat terlebih dahulu melakukan shalat sunnah dua rakaat yang disebut dengan shalat tobat. </p> \n" +
                        "Ajaran para ulama ini didasarkan pada sebuah hadits Nabi—di antaranya diriwayatkan oleh Imam Tirmidzi—dari sahabat Ali bin Abi Thalib, dari sahabat Abu Bakar As-Shidiq bahwa Rasulullah bersabda: </p> \n" +
                        " مَا مِنْ رَجُلٍ يُذْنِبُ ذَنْبًا ثُمَّ يَقُومُ فَيَتَطَهَّرُ، ثُمَّ يُصَلِّي ثُمَّ يَسْتَغْفِرُ اللَّهَ إِلَّا غَفَرَ لَهُ </p> \n " +
                        "Artinya : </br>" +
                        "&emsp; “Tidaklah seseorang berbuat dosa lalu ia beranjak bersuci, melakukan shalat kemudian beristighfar meminta ampun kepada Allah kecuali Allah mengampuninya.” Syekh Nawawi Banten dalam kitab Nihâyatuz Zain menuturkan perihal shalat tobat sebagai berikut:" +
                        " وَمِنْه صَلَاة التَّوْبَة وَهِي رَكْعَتَانِ قبل التَّوْبَة يَنْوِي بهما سنة التَّوْبَة </p>" +
                        "Artinya : </br>" +
                        "&emsp; “Termasuk shalat sunah adalah shalat tobat, yakni shalat dua rakaat sebelum bertobat dengan niat shalat sunnah tobat.” </p> \n" +
                        "Dari penjelasan Syekh Nawawi di atas dapat disimpulkan bahwa shalat tobat merupakan shalat sunnah yang terdiri dari dua rakaat dan dilakukan sebelum seseorang bertobat kepada Allah atas dosa yang telah dilakukan.  </p> \n" +
                        "Pelaksanaan shalat tobat tidak berbeda dengan pelaksanaan shalat pada umumnya. Adapun niat shalat tobat adalah:" +
                        " أُصَلِّي سُنَّةَ التَّوْبَةِ</p>" +
                        "“Ushallî sunnatat taubati (saya berniat shalat sunnah tobat). </p> \n" +
                        "” Setelah selesai shalat dua rakaat kemudian dilanjutkan bertobat dengan membaca istighfar yang disertai dengan penyesalan, tekad kuat untuk menjauhkan diri dari perilaku dosa dan tidak akan mengulanginya lagi. </p> \n" +
                        "Namun demikian Syekh Nawawi juga menganggap sah shalat tobat yang dilakukan setelah orang yang bersangkutan bertobat, bukan sebelumnya. Wallâhu a’lam. (Yazid Muttaqin)\n"
            ;
        WebView.loadData("<p style=\"text-align: justify\">"+ text +"<p>", "text/html", "UTF-8");

        //inisiasi untuk animasi
        TextView = findViewById(R.id.textViewshalatsunnahtaubat);
        WebView = findViewById(R.id.webviewshalatsunnahtaubat);
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
