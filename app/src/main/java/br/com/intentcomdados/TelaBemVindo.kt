package br.com.intentcomdados

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela_bem_vindo.*

class TelaBemVindo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_bem_vindo)

        val nomeCapturado = intent.getStringExtra("DadoNome")
        txvNome.text = nomeCapturado

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
