package com.example.tltdd_baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button login;
    private EditText edtUsername;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        login = (Button) findViewById(R.id.login_login_button);
        edtUsername = (EditText) findViewById(R.id.login_username_et);
        edtPassword = (EditText) findViewById(R.id.login_password_et);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = edtUsername.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if (username.equals("hailong") && password.equals("1234")){
                    Toast.makeText(LoginActivity.this,"Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent listview = new Intent(LoginActivity.this, ListViewActivity.class);
                    listview.putExtra("username", username.toString());
                    LoginActivity.this.startActivity(listview);
                } else {
                    Toast.makeText(LoginActivity.this,"Đăng nhập thất bại!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}