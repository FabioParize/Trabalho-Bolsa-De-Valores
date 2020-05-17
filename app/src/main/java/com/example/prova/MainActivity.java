package com.example.prova;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editativo;
    private EditText editlucro;
    private EditText editliquido;
    private EditText editacao;
    private EditText editpreco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editativo = findViewById(R.id.editativo);
        editlucro = findViewById(R.id.editlucro);
        editliquido = findViewById(R.id.editliquido);
        editacao = findViewById(R.id.editacao);
        editpreco = findViewById(R.id.editpreco);

    }

    public void Calculo (View v) {

        double lucro= Double.parseDouble( editlucro.getText().toString());
        double liquido= Double.parseDouble( editliquido.getText().toString());
        double acao= Double.parseDouble( editacao.getText().toString());
        double preco= Double.parseDouble( editpreco.getText().toString());
        double LPA = lucro/acao;
        double PL = preco/LPA;
        double ROE = (lucro / liquido) * 100 ;
        double VPA  = liquido * acao;
        double PVP = preco / VPA;

        Intent i = new Intent(this,Tela2.class);
        Bundle params = new Bundle();
        params.putDouble("LPA",LPA);
        params.putDouble("PL",PL);
        params.putDouble("ROE",ROE);
        params.putDouble("VPA",VPA);
        params.putDouble("PVP",PVP);

        i.putExtras(params);

        startActivity(i);
    }


    public void LimparCampos(View view)
    {

        editativo.setText("");
        editlucro.setText("");
        editliquido.setText("");
        editacao.setText("");
        editpreco.setText("");
        }
    }

