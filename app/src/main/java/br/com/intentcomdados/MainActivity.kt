package br.com.intentcomdados

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEntrar.setOnClickListener {

            if (edtNome.text.isNotEmpty()){
                val nomeCapturado = edtNome.text.toString()
                val intentTelaBemVindo = Intent(this, TelaBemVindo::class.java)

                intentTelaBemVindo.putExtra("DadoNome", nomeCapturado)

                startActivity(intentTelaBemVindo)

            } else {
                val alertaToast = Toast.makeText(this, "Preencha o campo corretamente.", Toast.LENGTH_LONG)
                alertaToast.show()
            }

        }
    }
}
