package com.example.resultintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText = (EditText) findViewById(R.id.edtResult);
        button = (Button) findViewById(R.id.btnResult);
    }


    public void btnResultOnClick(View view) {
        Intent intent = new Intent();
        intent.setData(Uri.parse(editText.getText().toString()));
        setResult(RESULT_OK, intent);
        finish();
    }
}