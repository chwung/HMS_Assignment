package com.test.hmsassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText editTextName;
    Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextName = findViewById(R.id.edit_text_name);
        btnEnter = findViewById(R.id.button_enter);

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editTextName.getText().toString().equals("")){
                    btnEnter.setEnabled(true);
                    Intent loginActivityIntent = new Intent(LoginActivity.this, GamesActivity.class);
                    startActivity(loginActivityIntent);
                }
            }
        });
    }
}