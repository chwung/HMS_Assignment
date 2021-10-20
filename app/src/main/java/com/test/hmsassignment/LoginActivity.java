package com.test.hmsassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//ad kit
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.banner.BannerView;


public class LoginActivity extends AppCompatActivity {

    EditText editTextName;
    Button btnEnter;

    boolean hasName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        editTextName = findViewById(R.id.edit_text_name);
        btnEnter = findViewById(R.id.button_enter);

        //Ad Kit
        // Obtain BannerView.
        BannerView bannerView = findViewById(R.id.hw_banner_view);
        // Set the ad unit ID and ad dimensions. "testw6vs28auh3" is a dedicated test ad unit ID.
        bannerView.setAdId("testw6vs28auh3");
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_360_57);
        // Set the refresh interval to 30 seconds.
        bannerView.setBannerRefresh(30);
        // Create an ad request to load an ad.
        AdParam adParam = new AdParam.Builder().build();
        bannerView.loadAd(adParam);

        editTextName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                hasName = !s.toString().trim().equals("");
                updateBtnEnter();

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent loginActivityIntent = new Intent(LoginActivity.this, GamesActivity.class);
                    startActivity(loginActivityIntent);
            }
        });
    }

    private void updateBtnEnter() {
        btnEnter.setEnabled(hasName);
    }
}