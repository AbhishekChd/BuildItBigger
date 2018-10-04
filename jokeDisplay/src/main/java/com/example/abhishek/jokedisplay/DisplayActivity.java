package com.example.abhishek.jokedisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    public static final String INTENT_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Bundle extraBundle = getIntent().getExtras();
        if (extraBundle != null) {
            String joke = extraBundle.getString(INTENT_JOKE);
            if (!TextUtils.isEmpty(joke)) {
                final TextView tvJoke = findViewById(R.id.tv_joke);
                tvJoke.setText(joke);
            }
        }
    }
}
