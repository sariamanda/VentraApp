package com.example.vpapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vpapp.R;

public class history extends AppCompatActivity {
    ImageView trx, deposit, profil, history, notice;

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.history);

        trx = (ImageView) findViewById(R.id.button20);
        deposit = (ImageView) findViewById(R.id.button21);
        profil = (ImageView) findViewById(R.id.button22);
        history = (ImageView) findViewById(R.id.button23);
        notice = (ImageView) findViewById(R.id.button24);

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
