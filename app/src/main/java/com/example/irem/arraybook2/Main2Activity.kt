package com.example.irem.arraybook2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var sayfa = 1
        var sayfalar = arrayOf(R.drawable.corba1, R.drawable.corba2, R.drawable.sebze1, R.drawable.sebze2, R.drawable.hamur1,R.drawable.hamur2,R.drawable.kura1,R.drawable.kura2)
        var metinler = arrayOf("ÇORBALAR \n \n YEŞİL MERCİMEKLİ ERİŞTELİ ÇORBA \n" +
                "MALZEMELER \n \n 1 büyük soğan\n" +
                "3 yemek kaşığı sıvı yağ\n" +
                "1 su bardağı yeşil mercimek\n" +
                "Yarım su bardağı erişte\n" +
                "1 yemek kaşığı tereyağı\n" +
                "2 yemek kaşığı salça\n" +
                "2 su bardağı tavuk suyu (varsa)\n" +
                "4 su bardağı su\n" +
                "Tavuk suyu yoksa 6 su bardağı su\n" +
                "Tuz\n \n YAPILIŞI \nÖncelikle sıvı yağ ve ince kıyılmış soğanımızı tenceremize alıyoruz, kavuruyoruz."+
                " . Yıkanmış mercimekleri ve erişteleri de ekleyip kavurmaya devam ediyoruz. "+ ". 3 dk kavurduktan sonra tereyağını ekliyoruz. Tereyağı eriyince salçayı da ekleyip 1 dk daha karıştırıyoruz. "+
                "Üstüne suyumuzu ekliyoruz mercimekler pişene kadar kaynatıyoruz. Yemeğimiz hazır afiyet şifa olsun.",
                "SÜTLÜ MANTAR ÇORBASI \n \n MALZEMELER\n\n500 gr mantar\n" +
                        "2 Yemek kaşığı tereyağı\n" +
                        "2 Yemek kaşığı un\n" +
                        "1 Su bardağı süt\n" +
                        "4 Bardak su veya tavuk suyu \n" +
                        "2 Diş sarımsak\n" +
                        "Tuz\n" +
                        "Karabiber\n\n  YAPILIŞI \n\n Tereyağı ve sarımsakları tencereye alıp, kavuralım. Küçük doğranmış mantarları ekleyip ve suyunu salıp, çekene kadar onları da kavuralım" +
                        "Üzerine unu ekleyelim. Kavuralım ardından 4 bardak suyu ekleyip sürekli karıştıralım. Kaynamaya başlayınca ateşi kısalım ve karıştırmaya devam edelim"+
                        " Tavuk suyunu ekleyip 15dk kaynattıktan sonra sütü de ekleyip kaynatmaya devam edelim. En son baharatları da ekleyip altını kapatalım. Çorbamız hazır. Afiyet olsun.",
                "SEBZE YEMEKLERİ \n\nFIRINDA KIYMALI KARIŞIK SEBZE \n\nMALZEMELER\n\n 2 adet patates\n" +
                        "1 adet patlıcan\n" +
                        "4 adet yeşil biber\n" +
                        "1 adet soğan\n" +
                        "4-5 diş sarımsak\n" +
                        "1 adet domates\n" +
                        "150-200 gr kıyma\n\n  YAPILIŞI \n\n Patatesleri kızartmalık, patlıcanları ortasından kesip, yeşil biberleri dörde bölüp, soğanı da piyazlık doğruyoruz"+
                        ". Domatesi de dilimleyerek içine ekliyoruz. Sonra bu karışımı yağ ve tuzla birlikte fırına sürüyoruz."+ "Kıyma çabuk piştiği için, sebzelerin pişmesine yakın onu ekliyoruz.1 Kaşık salçayı suda eritip yemeğin pişmesine 10dk kala ekliyoruz."+
                        "Yemeğimiz hazır, afiyet olsun." , "MÜCVER \n\n MALZEMELER \n \n3 tane yumurta\n" +
                "3 tane kabak\n" +
                "Yarım su bardağı un\n" +
                "2-3 dal yeşil soğan\n" +
                "Yarım demet maydanoz\n" +
                "1 tutam dereotu\n" +
                "Tuz\n" +
                "Karabiber\n" +
                "Pul biber\n" +
                "Sıvıyağ\n\n YAPILIŞI\n\n Malzemelerin hepsini karıştırıyoruz. Yağlı kâğıt koyduğumuz tepsiye karışımı döküp eşit olacak şekilde tepsiye yayıyoruz."+
                "Önceden ısıtılmış fırında 180 derecede pişiriyoruz.\n" +
                "\n", "HAMUR İŞİ TARİFLERİ\n\n PATATESLİ GÜL BÖREĞİ\n\n MALZEMELER\n6 adet hazır yufka\n" +
                "6 tane haşlanmış patates\n" +
                "Maydanoz\n" +
                "Pul biber\n" +
                "Tuz\n" +
                "Üzeri için;\n" +
                "Bir yumurta\n" +
                "3 yemek kaşığı yoğurt\n" +
                "Yağ\n" +
                "Tuz\n \n YAPILIŞI\nÖncelikle iç harcını hazırlayalım. Patatesleri ezelim. Maydanoz ve baharatları ekleyelim."+
                "Yufkaları dörde bölelim. İç kısmına biraz yağ sürelim"+
                "Sonra harcını koyalım. Yuvarlayıp gül şeklini verelim.Üzeri için yumurta, yoğurt, tuz ve biraz yağ bunları karıştıralım."+
                "Önceden ısıtılmış 180 derecelik fırına üzeri kızarana kadar pişirelim. Afiyet olsun.", "MARGARİTA PİZZA\n\n MALZEMELER\n\n5 Su bardağı un \n" +
                "Yarım paket maya\n" +
                "1 Tatlı kaşığı tuz\n" +
                "2 Su bardağı kaşar\n" +
                "2 Adet domates\n" +
                "Üzeri için:\n" +
                "2 Kaşık domates salçası\n" +
                "Kekik\n\n YAPILIŞI\n\n Hamuru mayalayıp bekletiyoruz, mayalandıktan sonra bezi haline getiriyoruz."+
                "Daha sonra yuvarlak olacak şekilde açıyoruz. Sosu için, iki kaşık domates salçasının içine tuz, kekik ve nane attıktan sonra tencerede karıştırıyoruz." +
                "Hamurun üzerine sürüp, kaşar peynirini ve domatesleri koyuyoruz. Afiyet olsun. " ,"KURABİYELER\n\nLEBLEBİLİ KURABİYE\n\nMALZEMELER\n\n"+
                "1 su bardağı leblebi tozu\n" +
                "1 su bardağı pudra şekeri\n" +
                "1 su bardağı sıvı yağ\n" +
                "Aldığı kadar un\n" +
                "Üzeri İçin;\n" +
                "Yeteri kadar leblebi\n\nYAPILIŞI\n\nLeblebiyi robottan geçirip toz haline getiriyoruz. Un hariç tüm malzemeleri harmanlıyoruz."+
                "Unu yavaş yavaş ekliyoruz. Fazla un eklemiyoruz. Küçük parçalar koparıp yuvarlıyoruz ortasına leblebi koyuyoruz."+
                "Önceden ısıtılmış 170 derece fırında yaklaşık 10 dakika pişiriyoruz. Afiyet olsun. \n", "PORTAKAL VE DAMLA ÇİKOLATALI KURABİYE \n\nMALZEMELER\n\n1/2 (yarım) paket margarin (oda sıcaklığında)\n" +
                "1 Çay bardağı sıvı yağ\n" +
                "1 Yumurta\n" +
                "1 Su bardağı pudra şekeri\n" +
                "2 Yemek kaşığı damla çikolata\n" +
                "1 Portakal kabuğu rendesi\n" +
                "1 Paket kabartma tozu\n" +
                "3 Su bardağı un\n\nYAPILIŞI\n\n Malzemeler karıştırılıp yoğurulur. Hamur rulo haline getirilerek streç filme sarılı buzdolabında 30 dk. Kadar bekletilir ve çok kalın olmayacak şekilde dilimlenir."+
                "Önceden ısıtılmış fırında 170 derecede 15 dk. Pişirilir. Afiyet olsun.")






        metinTutucu.setText(metinler[0])



        ileriButon.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                if(sayfa < sayfalar.size) {
                    sayfa++
                    Log.d("Dizi", sayfalar[sayfa-1].toString())
                    sayfaTutucu.setImageResource(sayfalar[sayfa-1])
                    metinTutucu.setText(metinler[sayfa-1])
                } else {
                    Toast.makeText(this@Main2Activity, "Son sayfadasınız..!",
                            Toast.LENGTH_LONG).show()
                }
            }
        })

        geriButon.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                if(sayfa > 1) {
                    sayfa--
                    Log.d("Dizi", sayfalar[sayfa-1].toString())
                    sayfaTutucu.setImageResource(sayfalar[sayfa-1])
                    metinTutucu.setText(metinler[sayfa-1])
                } else {
                    Toast.makeText(this@Main2Activity, "İlk sayfadasınız..!",
                            Toast.LENGTH_LONG).show()
                }
            }
        })

    }

}
