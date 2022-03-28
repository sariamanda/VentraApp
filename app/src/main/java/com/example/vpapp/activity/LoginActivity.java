package com.example.vpapp.activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.vpapp.R;

public class LoginActivity extends AppCompatActivity {

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login);

    }
            public void clicksignIn(View view) {
                Intent i = new Intent(this, home.class);
                startActivity(i);
            }

    public void clicksignUp(View view) {
        Intent i = new Intent(this, DaftarActivity.class);
        startActivity(i);
    }


    }

