package ui.activity

import adapter.SourasAdapter
import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.denii.R

import kotlinx.android.synthetic.main.activity_soura_list.*


class SouraListActivity :AppCompatActivity {
    var arsuras= listOf("الفاتحه", "البقرة", "آل عمران", "النساء", "المائدة", "الأنعام", "الأعراف",
        "الأنفال", "التوبة", "یونس", "هود",
        "یوسف", "الرعد", "إبراهیم", "الحجر", "النحل", "الإسراء", "الكهف",
        "مريم", "طه", "الأنبیاء", "الحج", "المؤمنون",
        "النّور", "الفرقان", "الشعراء", "النّمل", "القصص", "العنكبوت" ,
        "الروم", "لقمان", "السجدة", "الأحزاب", "سبأ",
        "فاطر", "یس", "الصافات", "ص", "الزمر", "غافر", "فصلت", "الشورى",
        "الزخرف", "الدخان", "الجاثیة", "الأحقاف",
        "محمد", "الفتح", "الحجرات", "ق", "الذاریات", "الطور", "النجم",
        "القمر", "الرحمن", "الواقعة", "الحدید","المجادله",
        "الحشر", "الممتحنة", "الصف", "الجمعة", "المنافقون", "التغابن",
        "الطلاق", "التحريم", "الملك", "القلم", "الحاقة", "المعارج",
        "نوح", "الجن", "المزّمل", "المدثر", "القیامة", "الإنسان", "المرسلات",
        "النبأ", "النازعات", "عبس", "التكویر", "الإنفطار",
        "المطفّفين", "الإنشقاق", "البروج", "الطارق", "الأعلى", "الغاشیة",
        "الفجر", "البلد", "الشمس", "اللیل", "الضحى", "الشرح",
        "التين", "العلق", "القدر", "البینة", "الزلزلة", "العادیات",
        "القارعة", "التكاثر", "العصر",
        "الهمزة", "الفیل", "قریش", "الماعون", "الكوثر", "الكافرون", "النصر",
        "المسد", "الإخلاص", "الفلق","الناس"

    )
    lateinit var sourasAdapter: SourasAdapter

    constructor() : super()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_soura_list)
        sourasAdapter= SourasAdapter(arsuras)
        recycler_view.adapter=sourasAdapter
        sourasAdapter.onItemClickListener=object : SourasAdapter.OnItemClickListener{
            override fun onItemClick(position: Int, name: String) {
                StartSuraDetailsActivity(position,name)

            }




        }

    }private fun StartSuraDetailsActivity(position:Int,name:String) {
        val filename=""+(position+1)+".txt"
        val intent=Intent(this, SouraActivity::class.java)
        intent.putExtra("souraname",name)
        intent.putExtra("filename",filename)
        startActivity(intent)
    }



}