package com.example.sholatwajibsunnah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class WudhuInformasi extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    ActionBar actionBar;
    Animation atg, atgtwo, btgone, btgtwo, btgthree;
    android.widget.TextView TextView;
    android.webkit.WebView WebView;

    @Override
    public void onCreate (Bundle savedInstanteState){
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_wudhuinformasi);

        mediaPlayer = MediaPlayer.create(WudhuInformasi.this, R.raw.halamanwudhu);
        mediaPlayer.start();


        WebView = findViewById(R.id.webviewwudhu);
        String text=
                "&emsp; Wudhu merupakan satu di antara bentuk bersuci yang disyariatkan dalam Islam. Pada saat berwudhu, kita diperintahkan untuk membersihkan beberapa anggota tubuh kita, baik dengan cara mencuci maupun mengusapnya. </p> \n" +
                        "&emsp; Jika kita perhatikan, sebenarnya gerakan wudhu tidaklah jauh berbeda dengan tindakan mencuci muka dan lainnya yang bukan ibadah. Bedanya adalah wudhu merupakan bentuk ketaatan kita terhadap perintah Allah. \n" +
                        "Dengan demikian, agar wudhu yang kita lakukan semakin bertambah kualitas ketaatannyya, berikut ini akan kami paparkan beberapa doa yang menyertai gerakan wudhu, sebagaimana telah kami sarikan dari kitab karya Syekh Muhyiddin Abu Zakaria Yahya bin Syaraf al-Nawawi al-Dimasyqi, \n" +
                        " Al-Adzkar al-Muntakhabah min Kalâmi Sayyidil Abrâr, (Surabaya: Kharisma, 1998). </p> \n" +
                        "Dengan menyertakan doa dalam setiap gerakan wudhu, diharapkan wudhu yang kita lakukan bisa bertambah kualitas makna ibadahnya. Doa-doa tersebut ialah: </p> \n" +

                        "<b> 1. Saat membasuh telapak tangan sebanyak 3 kali, berdoa: </b> </p> \n" +
                        "اللَّهُمَّ احْفَظْ يَدِيْ مِنْ مَعَاصِيْكَ كُلِّهَا</p>" +
                        "Allâhumma ihfadh yadi min ma’âshîka kullahâ </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Ya Allah, jagalah kedua tanganku dari semua perbuatan maksiat.”   </p> \n" +

                        "<b> 2. Saat berkumur, disunnahkan berdoa di dalam hati : </b> </p>" +
                        " اللَّهُمَّ أَعِنِّيْ عَلَى ذِكْرِكَ وَشُكْرِكَ اللَّهُمَّ اسْقِنِي مِنْ حَوْضِ نَبِيِّكَ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ كَأْسًا لَا أَظْمَأُ بَعْدَهُ أَبَدًا</p>" +
                        "Allâhumma a’inni ‘alâ dzikrika wa syukrika, Allâhumma asqini min haudli nabiyyika shallallâhu ‘alaihi wa sallam ka’san lâ adzma’a ba’dahu Abadan </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Ya Allah, tolonglah aku (untuk selalu) mengingat dan bersyukur pada-Mu. Ya Allah, beri aku minuman dari telaga Kautsar Nabi Muhammad, yang begitu menyegarkan hingga aku tidak merasa haus selamanya.” </p> \n" +

                        "<b> 3. Ketika membersihkan lubang hidung, pada saat menghirup air, dalam hati berdoa </b></p>" +
                        ": اللَّهُمَّ أَرِحْنِي رَائِحَةَ الْجَنَّةِ اللَّهُمَّ لَا تَحْرِمْنِيْ رَائِحَةَ نِعَمِكَ وَجَنَّاتِك </p>" +
                        "Allâhumma Arihni Raaihatal jannah. Allâhumma lâ tahrimni râihata ni’amika wa jannatika </p> \n" +
                        "Artinya : </br>" +
                        "&emsp;“Ya Allah, (izinkan) aku mencium wewangian surga. Ya Allah, jangan halangi aku mencium wanginya nikmat-nikmatmu dan wanginya surga.” Sedangkan ketika mengeluarkan air dari lubang hidung, berdoa: </p> \n" +
                        "اَلَّلهُمَّ إِنِّيْ أَعُوْذُ بِكَ مِنْ رَوَائِحِ النَّارِ وَسُوْءِ الدَّارِ</p>" +
                        "Allâhumma innî a’ûdzu bika min rawâihin nâr wa sû`i dâr </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Ya Allah, aku berlindung pada-Mu dari busuknya aroma neraka, dan dari buruknya tempat kembali.” </p> \n" +

                        "<b> 4. Saat membasuh wajah, berdoa </b> </p> \n" +
                        ": اللَّهُمَّ بَيِّضْ وَجْهِيْ يَوْمَ تَبْيَضُّ وُجُوهٌ وَتَسْوَدُّ وُجُوهٌ</p> " +
                        "Allâhumma bayyidl wajhi yauma tabyadldlu wujûhun wa taswaddu wujûh </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Ya Allah, putihkanlah wajahku di hari ketika wajah-wajah memutih dan menghitam.” </p> \n" +
                        "Doa ini dipanjatkan agar di akhirat kelak Allah menggolongkan kita sebagai orang baik, dimana saat berkumpul di padang mahsyar, orang baik dicirikan dengan berwajah putih, dan sebaliknya orang jelek dicirikan dengan berwajah hitam kusam. </p> \n" +

                        "<b> 5. Saat membasuh tangan kanan, berdoa: </b></p> \n" +
                        " اللَّهُمَّ أَعْطِنِيْ كِتَابِيْ بِيَمِينِيْ وَحَاسِبْنِيْ حِسَابًا يَسِيرًا </p>" +
                        "Allâhumma a’thinî kitâbi biyamîni, wa hâsibnî hisâban yasîran </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Ya Allah, berikanlah kitab amalku (kelak di akhirat) pada tangan kananku, dan hisablah aku dengan hisab yang ringan.” </p> \n" +
                        "<b> Sedangkan saat membasuh tangan kiri, berdoa: </b></p> \n" +
                        " اللَّهُمَّ لَا تُعْطِنِيْ كِتَابِيْ بِشِمَالِيْ وَلَا مِنْ وَرَاءِ ظَهْرِيْ </p> \n" +
                        "Allâhumma laa tu’thini bi syimaali, wa laa min waraa`i dzahri </p>" +
                        "&emsp; “Ya Allah, jangan Kau berikan kitab amalku (kelak di akhirat) pada tangan kiriku, dan jangan pula diberikan dari balik punggungku.” </p> \n" +
                        "Tentang doa diatas, kelak di akhirat nanti, Allah akan memberikan pada semua manusia, catatan amal mereka masing-masing. \n" +
                        "Apabila manusia tersebut amalnya baik, maka ia akan menerima kitab amalnya dengan tangan kanan dan berhadapan muka, namun apabila amalnya jelek, maka ia akan menerima kitab amalnya dengan tangan kiri dan diberikan dari balik punggung. </p> \n" +

                        "<b> 6. Saat mengusap kepala, berdoa: </b></p> \n" +
                        "اللَّهُمَّ حَرِّمْ شَعْرِيْ وَبَشَرِيْ عَلَى النَّارِ وَأَظِلَّنِيْ تَحْتَ عَرْشِكَ يَوْمَ لَا ظِلَّ إلَّا ظِلُّك</p>" +
                        "Allâhumma harrim sya’ri wa basyari ‘ala an-nâri wa adzilni tahta ‘arsyika yauma lâ dzilla illa dzilluka. </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Ya Allah, halangi rambut dan kulitku dari sentuhan api neraka, dan naungi aku dengan naungan singgasana-Mu, pada hari ketika tak ada naungan selain naungan dari-Mu.” </p> \n" +

                        "<b> 7. Saat mengusap telinga, berdoa </b></p> \n" +
                        ": اللَّهُمَّ اجْعَلْنِي مِنْ الَّذِينَ يَسْتَمِعُونَ الْقَوْلَ فَيَتَّبِعُونَ أَحْسَنَهُ </p>" +
                        "Allâhumma ij’alni minalladzîna yastami’ûnal qaula fayattabi’ûna ahsanahu. </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Ya Allah, jadikanlah aku orang-orang yang mampu mendengar ucapan dan mampu mengikuti apa yang baik dari ucapan tersebut.” </p> \n" +

                        "<b> 8. Saat membasuh kaki kanan berdoa: </b></p>" +
                        "اللهم اجْعَلْهُ سَعْيًا مَشْكُوْرًا وَذَنْبًا مَغْفُوْرًا وَعَمَلًا مُتَقَبَّلًا. اللَّهُمَّ ثَبِّتْ قَدَمِيْ عَلَى الصِّرَاطِ يَوْمَ تَزِلُّ فِيْهِ الْأَقْدَامُ </p>" +
                        "Allâhumma ij’alhu sa’yan masykûran wa dzamban maghfûran wa ‘amalan mutaqabbalan. Allâhumma tsabbit qadami ‘ala shirâthi yauma tazila fîhi al-aqdâm. </p>" +
                        "Artinya : </br>" +
                        "&emsp; “Ya Allah, jadikanlah (segenap langkahku) sebagai usaha yang disyukuri, sebagai penyebab terampuninya dosa dan sebagai amal yang diterima. Ya Allah, \n" +
                        "mantapkanlah telapak kakiku saat melintasi jembatan shirathal mustaqim, kelak di hari ketika banyak telapak kaki yang tergelincir.” </p> \n" +
                        "<b> Dan saat membasuh kaki kiri berdoa: </b></p>" +
                        "اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ أَنْ تَنْزِلَ قَدَمِيْ عَنِ الصِّرَاطِ يَوْمَ تَنْزِلُ فِيْهِ أَقْدَامُ الْمُنَافِقِيْنَ</p>" +
                        "Allâhumma innî a’ûdzu bika an tanzila qadamî ‘anish-shirâthi yauma tanzilu fîhi aqdâmul munâfiqîn </p> \n" +
                        "Artinya : </br>" +
                        "&emsp; “Ya Allah, aku berlindung pada-Mu, dari tergelincir saat melintasi jembatan shirathal mustaqim, kelak di hari ketika banyak telapak kaki orang munafik yang tergelincir.” </p> \n" +
                        "Terkait doa di atas, kelak di akhirat, semua manusia akan melewati jembatan shirathal mustaqim, yakni jembatan yang dibawahnya terdapat jurang menuju neraka, dan di ujung jembatan terdapat surga. \n" +
                        "Orang yang beriman niscaya akan mampu melewati jembatan tersebut dan menuju surga, sementara orang munafik, banyak yang tergelincir dan masuk ke jurang neraka. \n"
                ;
        WebView.loadData("<p style=\"text-align: justify\">"+ text +"<p>", "text/html", "UTF-8");

        //inisiasi untuk animasi
        TextView = findViewById(R.id.textViewwudhu);
        WebView = findViewById(R.id.webviewwudhu);
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
