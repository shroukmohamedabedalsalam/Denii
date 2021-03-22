package ui.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.denii.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*
import ui.fragment.hadeth_fragment

import ui.fragment.quraan_fragment
import ui.fragment.tasbeh_fragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        navigathion.setOnNavigationItemReselectedListener { item->
            if (item.itemId==R.id.quoran_navigation){pushfragment(quraan_fragment())}
            else if (item.itemId==R.id.hadeth_navigathion){pushfragment(hadeth_fragment())}
            else if(item.itemId==R.id.sebha_navigathion){pushfragment(tasbeh_fragment())}



            true }
navigathion.selectedItemId=R.id.quoran_navigation
    }
   fun pushfragment(fragment:Fragment){
       supportFragmentManager
           .beginTransaction()
           .replace(R.id.fragment_container,fragment)
           .commit()
   }
}