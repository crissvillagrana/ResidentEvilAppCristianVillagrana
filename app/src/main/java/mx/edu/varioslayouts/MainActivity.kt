package mx.edu.varioslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnMains)
        val btn2 = findViewById<Button>(R.id.btnSecs)
        btn.setOnClickListener{
            llamarsegunda()
        }

        btn2.setOnClickListener {
            llamartercera()
        }
    }

    fun llamarsegunda(){
        val otraVentana = Intent(this, MainActivity2::class.java)
        startActivity(otraVentana)
    }


    fun llamartercera(){
        val otraVentana = Intent(this, ScrollingActivity::class.java)
        startActivity(otraVentana)
    }

}