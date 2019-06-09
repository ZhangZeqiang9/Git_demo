package com.example.l.git_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //text文本
        TextView textView = new TextView(this, null);
        //Edtext
        EditText editText = new EditText(this, null);
        //button
        Button button = new Button(this, null);
    }
}
