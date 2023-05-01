package com.feri.latihan_pertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class KalkulatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        val input1 = findViewById<EditText>(R.id.input1);
        val input2 = findViewById<EditText>(R.id.input2);
        val button = findViewById<Button>(R.id.button);
        val hasil = findViewById<TextView>(R.id.hasil);

        button.setOnClickListener {
            var num1 = input1.text.toString()
            var num2 = input2.text.toString()

            if(num1.isEmpty()) {
                input1.error = "Wajib diisi"
                input1.requestFocus()
                return@setOnClickListener
            } else if(num2.isEmpty()) {
                input2.error = "Wajib diisi"
                input2.requestFocus()
                return@setOnClickListener
            } else {
                var penjumlahan = num1.toInt() + num2.toInt()
                hasil.text = penjumlahan.toString()

                Toast.makeText(this,penjumlahan.toString(),Toast.LENGTH_SHORT).show()
            }
        }
    }
}