package com.example.formulir_pendaftaran

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_utama.*

class MainActivityUtama : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_utama)

        val getData = intent.getParcelableExtra<Formulir>("Gerbang03")
        textView14.text = "${getData?.nama}\n" + "${getData?.alamat}\n" +"${getData?.ttl}\n" + "${getData?.jenis}\n" + "${getData?.no}\n" + "${getData?.motto}\n" + "${getData?.pengalaman}\n" + "${getData?.penyakit}\n"+ "${getData?.alasan}\n"
    }
}