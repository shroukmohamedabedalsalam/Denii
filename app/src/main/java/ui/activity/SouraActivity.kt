package ui.activity

import adapter.AyaAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.denii.R

import kotlinx.android.synthetic.main.activity_soura.*

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader


class SouraActivity : AppCompatActivity() {
    lateinit var ayaAdapter: AyaAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soura)
        var  souraname:String=intent.getStringExtra("souraname")?:""
        var filename:String=intent.getStringExtra("filename")?:""


        suratitle.setText(souraname)
        val ayat= readsouracontent(filename)
        ayaAdapter= AyaAdapter(ayat)
        rys2.adapter=ayaAdapter

    }

    private fun readsouracontent(filename: String):List<String> {
        val souraline = mutableListOf<String>()

        val reader: BufferedReader

        try {
            val file: InputStream = assets.open(filename)
            reader = BufferedReader(InputStreamReader(file))
            var line: String ?= reader.readLine()
            while (line != null) {
                souraline.add(line)
                line = reader.readLine()
            }
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }

        return souraline
    }}