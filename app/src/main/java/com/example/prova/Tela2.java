package com.example.prova;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        TextView tvlpa = findViewById(R.id.tvlpa);
        TextView tvpl =findViewById(R.id.tvpl);
        TextView tvroe =findViewById(R.id.tvroe);
        TextView tvvpa =findViewById(R.id.tvvpa);
        TextView tvpvp =findViewById(R.id.tvpvp);

        Bundle b = getIntent().getExtras();

        if (b != null){
            double lpa = b.getDouble("LPA");
            double pl = b.getDouble("PL");
            double roe = b.getDouble("ROE");
            double vpa = b.getDouble("VPA");
            double pvp = b.getDouble("PVP");

            tvlpa.setText("R$"+ String.valueOf(lpa));
            tvpl.setText("R$" + String.valueOf(pl));
            tvroe.setText("R$"+ String.valueOf(roe));
            tvvpa.setText("R$"+ String.valueOf(vpa));
            tvpvp.setText("R$"+ String.valueOf(pvp));

        }

    }


    }
