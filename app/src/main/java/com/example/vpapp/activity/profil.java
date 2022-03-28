package com.example.vpapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vpapp.R;

public class profil extends AppCompatActivity {
    ImageView trx, deposit, profil, history, notice;

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.profile);

        trx = (ImageView) findViewById(R.id.button15);
        deposit = (ImageView) findViewById(R.id.button16);
        profil = (ImageView) findViewById(R.id.button17);
        history = (ImageView) findViewById(R.id.button18);
        notice = (ImageView) findViewById(R.id.button19);

    }

    public void clicktrx(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }

    public void clickdeposit(View view) {
        Intent i = new Intent(this, deposit.class);
        startActivity(i);
    }

    public void clickprofil(View view) {
        Intent i = new Intent(this, profil.class);
        startActivity(i);
    }

    public void clickhistory(View view) {
        Intent i = new Intent(this, history.class);
        startActivity(i);
    }

    public void clicknotice(View view) {
        Intent i = new Intent(this, notice.class);
        startActivity(i);
    }
}
