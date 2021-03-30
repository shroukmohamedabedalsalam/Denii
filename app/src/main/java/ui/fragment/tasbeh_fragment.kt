package ui.fragment

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.denii.R
import kotlinx.android.synthetic.main.fragment_tasbeh_fragment.*

class tasbeh_fragment() : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_tasbeh_fragment, container, false)
    }
    var count = 0



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tsbeha .setOnClickListener(View.OnClickListener {
            count++
            tasb7nmber.setText("" + count).toString()
            val totalcount = count
            totalNumber.setText("" + totalcount).toString()

})
    refrach.setOnClickListener(View.OnClickListener {
        tasb7nmber.setText("")

    })



    }
}
