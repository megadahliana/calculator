package com.megadahliana.kotlinkalkulator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //tambahan
        val txtNumber1 = findViewById<EditText>(R.id.txtNumber1)
        val txtNumber2 = findViewById<EditText>(R.id.txtNumber2)
        val txtHasil = findViewById<EditText>(R.id.txtHasil)

        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val btnKurangi = findViewById<Button>(R.id.btnKurangi)
        val btnBagi = findViewById<Button>(R.id.btnBagi)
        val btnKali = findViewById<Button>(R.id.btnKali)

        btnTambah.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua Harus Di Isi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.tambah(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnKurangi.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semuanya masukkkan Harus Di isi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.kurangi(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnBagi.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber2.setError("Semua Harus Di isi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.bagi(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnKali.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber2.setError("Semua Wajib Di Isi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.kali(a, b)
                txtHasil.setText(c.toString())
            }
        }

    }

    fun tambah(a: Double, b: Double): Double{
        return a + b
    }
    fun kurangi(a: Double, b: Double): Double{
        return  a - b
    }
    fun kali(a: Double, b: Double): Double{
        return a * b
    }
    fun bagi(a: Double, b: Double): Double{
        return a / b
    }
}
