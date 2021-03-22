package ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.denii.R


@SuppressLint("Registered")
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler()
                .postDelayed(
                        {
                            startHomeActivity()
                        },2000)

    }
    private fun startHomeActivity(){
        val intent= Intent(this@SplashActivity, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
