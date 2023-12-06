package com.example.resultintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int requestCode = 1;
    private EditText edtResult;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpVars();
    }

    private void setUpVars() {
        edtResult = findViewById(R.id.edtResult);
        btnResult = findViewById(R.id.btnResult);
    }

    public void btnResultOnClick(View view) {
        startActivityForResult(new Intent(this, MainActivity2.class) , requestCode);
    }

    public void onActivityResult(int requestCode, int resultCode , Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (this.requestCode == requestCode) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this,"Hello 2", Toast.LENGTH_SHORT).show();
                edtResult.setText(intent.getData().toString());
            }
        }
    }
}