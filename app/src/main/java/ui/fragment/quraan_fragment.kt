package ui.fragment

import adapter.SourasAdapter
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.denii.R
import kotlinx.android.synthetic.main.activity_soura_list.*
import kotlinx.android.synthetic.main.activity_soura_list.recycler_view
import kotlinx.android.synthetic.main.fragment_quraan_fragment.*
import ui.activity.SouraActivity


class quraan_fragment : Fragment() {
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quraan_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sourasAdapter= SourasAdapter(arsuras)
        recycler_view.adapter=sourasAdapter
        sourasAdapter.onItemClickListener=object : SourasAdapter.OnItemClickListener{
            override fun onItemClick(position: Int, name: String) {
                StartSuraDetailsActivity(position,name)

            }}}
            private fun StartSuraDetailsActivity(position:Int,name:String) {
                val filename=""+(position+1)+".txt"
                val intent= Intent(context, SouraActivity::class.java)
                intent.putExtra("souraname",name)
                intent.putExtra("filename",filename)
                startActivity(intent)
    }

}