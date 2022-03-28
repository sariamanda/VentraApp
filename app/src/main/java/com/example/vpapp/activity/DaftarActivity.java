package com.example.vpapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.vpapp.R;

public class DaftarActivity extends AppCompatActivity {
    ImageView send;
    ImageView back;

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.daftar);

        send = (ImageView) findViewById(R.id.button);
        back = (ImageView) findViewById(R.id.button4);
    }

    public void clicksend(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }

    public void clickback(View view) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}
