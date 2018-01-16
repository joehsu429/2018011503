package com.example.student.a2018011503;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
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
    public void click1(View v)
    {
        SharedPreferences sp=getSharedPreferences("mydata",MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        EditText ed=findViewById(R.id.editText);
        editor.putString("data1",ed.getText().toString());
        editor.commit();
    }
    public void click2(View v)
    {
        SharedPreferences sp=getSharedPreferences("mydata",MODE_PRIVATE);
        String str=sp.getString("data1","");
        TextView tv=findViewById(R.id.textView);
        tv.setText(str);
    }
    public void click3(View v)//0116m1
    {
        Intent it=new Intent(MainActivity.this,SettingsActivity.class);
        startActivity(it);
    }
}
