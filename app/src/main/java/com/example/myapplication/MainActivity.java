package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.playerOne);
        editText2=findViewById(R.id.playerTwo);
        button=findViewById(R.id.startGameButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText1.getText().toString();
                String b=editText2.getText().toString();
                if (a.isEmpty() && b.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please fill the Players Names", Toast.LENGTH_SHORT).show();
                }
                Intent i=new Intent(MainActivity.this, Gamepage.class);
                i.putExtra("A",a);
                i.putExtra("B",b);
                startActivity(i);

            }
        });
    }
}