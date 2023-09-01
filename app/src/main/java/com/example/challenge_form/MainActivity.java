package com.example.challenge_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRegister(View view){
        TextView edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        TextView edtTxtLastName = findViewById(R.id.edtTxtLastName);
        TextView edtTxtMail = findViewById(R.id.edtTxtMail);
        EditText txtFirstName = findViewById(R.id.txtFirstName);
        EditText txtLastName = findViewById(R.id.txtLastName);
        EditText txtMail = findViewById(R.id.txtMail);
        edtTxtFirstName.setText(" " + txtFirstName.getText().toString());
        edtTxtLastName.setText(" " + txtLastName.getText().toString());
        edtTxtMail.setText(" "+ txtMail.getText().toString());


    }

}