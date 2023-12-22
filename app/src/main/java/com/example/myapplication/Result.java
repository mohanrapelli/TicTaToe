package com.example.myapplication;

import static com.example.myapplication.Gamepage.b1;
import static com.example.myapplication.Gamepage.b2;
import static com.example.myapplication.Gamepage.b3;
import static com.example.myapplication.Gamepage.b4;
import static com.example.myapplication.Gamepage.b5;
import static com.example.myapplication.Gamepage.b6;
import static com.example.myapplication.Gamepage.b7;
import static com.example.myapplication.Gamepage.b8;
import static com.example.myapplication.Gamepage.b9;
import static com.example.myapplication.Gamepage.button1;
import static com.example.myapplication.Gamepage.button2;
import static com.example.myapplication.Gamepage.button3;
import static com.example.myapplication.Gamepage.button4;
import static com.example.myapplication.Gamepage.button5;
import static com.example.myapplication.Gamepage.button6;
import static com.example.myapplication.Gamepage.button7;
import static com.example.myapplication.Gamepage.button8;
import static com.example.myapplication.Gamepage.button9;
import static com.example.myapplication.Gamepage.i;
import static com.example.myapplication.Gamepage.startGame;

import androidx.annotation.NonNull;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class Result extends Dialog {

    private final String message;
    private final Gamepage mainActivity;
    GifImageView gifImageView ;


    public Result(@NonNull Context context, String message, Gamepage mainActivity) {
        super(context);
        this.message = message;
        this.mainActivity = mainActivity;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        gifImageView=findViewById(R.id.gif);

        TextView messageText = findViewById(R.id.messageText);
messageText.setText(message);
if(((b1 == 1) && (b2 == 1) && (b3 == 1)) || (b4 == 1) && (b5 == 1) && (b6 == 1)||(b7 == 1) && (b8 == 1) && (b9 == 1) ||(b1 == 1)
        && (b4 == 1) && (b7 == 1) || (b2 == 1) && (b5 == 1) && (b8 == 1)||(b3 == 1) && (b6 == 1) && (b9 == 1) ||(b1 == 1)
        && (b5 == 1) && (b9 == 1) ||(b3 == 1) && (b5 == 1) && (b7 == 1)){

    gifImageView.setImageResource(R.drawable.fight);
} else if (((b1 == 0) && (b2 == 0) && (b3 == 0)) || (b4 == 0) && (b5 == 0) && (b6 == 0)||(b7 == 0) && (b8 == 0) && (b9 == 0) ||(b1 == 0)
        && (b4 == 0) && (b7 == 0) || (b2 == 0) && (b5 == 0) && (b8 == 0)||(b3 == 0) && (b6 == 0) && (b9 == 0) ||(b1 == 0)
        && (b5 == 0) && (b9 == 0) ||(b3 == 0) && (b5 == 0) && (b7 == 0)) {
    gifImageView.setImageResource(R.drawable.ironfight);

}
else{
    if (i == 9){
        gifImageView.setImageResource(R.drawable.shake);

    }
}
        Button startAgainButton = findViewById(R.id.startAgainButton);
startAgainButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        button1.setImageDrawable(null);
        button2.setImageDrawable(null);
        button3.setImageDrawable(null);
        button4.setImageDrawable(null);
        button5.setImageDrawable(null);
        button6.setImageDrawable(null);
        button7.setImageDrawable(null);
        button8.setImageDrawable(null);
        button9.setImageDrawable(null);
       mainActivity.resetValues();
       startGame="X";
       dismiss();

    }
});

    }

}