package com.example.vpapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.vpapp.R;

public class deposit extends AppCompatActivity {
    ImageView trx, deposit, profil, history, notice;

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.deposit);

        trx = (ImageView) findViewById(R.id.button10);
        deposit = (ImageView) findViewById(R.id.button11);
        profil = (ImageView) findViewById(R.id.button12);
        history = (ImageView) findViewById(R.id.button13);
        notice = (ImageView) findViewById(R.id.button14);

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
