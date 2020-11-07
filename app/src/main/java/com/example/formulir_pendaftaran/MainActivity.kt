package com.example.formulir_pendaftaran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.formulir_pendaftaran.databinding.ActivityMainBinding
import kotlinx.android.parcel.Parcelize
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnDaftar.setOnClickListener{
            if (binding.editTextTextPersonName.text.toString() == null || binding.editTextTextPersonName2.text.toString() == null ||
                binding.editTextTextPersonName3.text.toString() == null || binding.editTextTextPersonName4.text.toString() == null ||
                binding.editTextTextPersonName5.text.toString() == null || binding.editTextTextPersonName6.text.toString() == null ||
                binding.editTextTextPersonName7.text.toString() == null || binding.editTextTextPersonName8.text.toString() == null ||
                binding.editTextTextPersonName9.text.toString() == null ||
                binding.editTextTextPersonName.text.toString().trim() == "" || binding.editTextTextPersonName2.text.toString().trim() == "" ||
                binding.editTextTextPersonName5.text.toString().trim() == "" || binding.editTextTextPersonName6.text.toString().trim() == "" ||
                binding.editTextTextPersonName7.text.toString().trim() == "" || binding.editTextTextPersonName8.text.toString().trim() == "" ||
                binding.editTextTextPersonName9.text.toString().trim() == "" ){

                Toast.makeText(this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show()
            }else{
                val formulir = Formulir(nama=binding.editTextTextPersonName.text.toString(), alamat= binding.editTextTextPersonName2.text.toString(), ttl=binding.editTextTextPersonName3.text.toString(), jenis=binding.editTextTextPersonName4.text.toString()
                    ,no = binding.editTextTextPersonName5.text.toString(), motto = binding.editTextTextPersonName6.text.toString(), pengalaman = binding.editTextTextPersonName7.text.toString(), penyakit = binding.editTextTextPersonName8.text.toString(), alasan = binding.editTextTextPersonName9.text.toString())
                startActivity<MainActivityUtama>("Gerbang03" to formulir)
            }
        }

    }
}

@Parcelize
data class Formulir(
    val nama:String,
    val alamat: String,
    val ttl: String,
    val jenis: String,
    val no: String,
    val motto: String,
    val pengalaman: String,
    val penyakit: String,
    val alasan: String
): Parcelable