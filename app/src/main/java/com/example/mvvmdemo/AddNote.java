package com.example.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

public class AddNote extends AppCompatActivity {
    private EditText title,desc;
    NumberPicker priority;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        title=findViewById(R.id.newtitle);
        desc=findViewById(R.id.newdesc);
        priority=findViewById(R.id.numberpicker);
        priority.setMaxValue(10);
        priority.setMinValue(0);
    }
    public void save(View view){
        Intent intent=new Intent();
        intent.putExtra("title",title.getText().toString());
        intent.putExtra("desc",desc.getText().toString());
        intent.putExtra("priority",priority.getValue());
        setResult(RESULT_OK,intent);
        finish();
    }
}