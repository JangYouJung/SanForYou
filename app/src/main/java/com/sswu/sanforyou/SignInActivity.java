package com.sswu.sanforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity {

    //로그인 버튼 : Map Fragment로 이동
    private Button btn_sign_in;
    //회원가입 버튼 : 회원가입 액티비티로 이동
    private Button btn_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, MapFragment.class);
                startActivity(intent);
            }
        });

        btn_sign_up = findViewById(R.id.btn_sign_up);
        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent2); //액티비티 이동
            }
        });


    }
}