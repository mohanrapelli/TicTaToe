package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Gamepage extends AppCompatActivity {
    private TextView textView1,textView2;
   static ImageView button1,button2,button3,button4,button5,button6,button7,button8,button9;
    static String startGame="X";
   static int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5,i=0;
   static int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamepage);
        textView1=findViewById(R.id.playerOneName);
        textView2=findViewById(R.id.playerTwoName);
        String one=getIntent().getStringExtra("A");
        String two=getIntent().getStringExtra("B");
        textView1.setText(one);
        textView2.setText(two);
        button1=findViewById(R.id.image1);
        button2=findViewById(R.id.image2);
        button3=findViewById(R.id.image3);
        button4=findViewById(R.id.image4);
        button5=findViewById(R.id.image5);
        button6=findViewById(R.id.image6);
        button7=findViewById(R.id.image7);
        button8=findViewById(R.id.image8);
        button9=findViewById(R.id.image9);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(c1==0) {



                    if (startGame.equals("X")) {
                        button1.setImageResource(R.drawable.marv);
                        b1 = 1;
                        i++;
                        c1=1;
                    } else {
                        button1.setImageResource(R.drawable.mar);
                        b1 = 0;
                        i++;
                        c1=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Gamepage.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c2==0)
                {


                    if(startGame.equals("X"))
                    {
                        button2.setImageResource(R.drawable.marv);
                        b2=1;
                        i++;
                        c2=1;
                    }
                    else
                    {
                        button2.setImageResource(R.drawable.mar);
                        b2=0;
                        i++;
                        c2=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Gamepage.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c3==0)
                {


                    if(startGame.equals("X"))
                    {
                        button3.setImageResource(R.drawable.marv);
                        b3=1;
                        i++;
                        c3=1;
                    }
                    else
                    {
                        button3.setImageResource(R.drawable.mar);
                        b3=0;
                        i++;
                        c3=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Gamepage.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }


            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(c4==0)
                {

                    if(startGame.equals("X"))
                    {
                        button4.setImageResource(R.drawable.marv);
                        b4=1;
                        i++;
                        c4=1;
                    }
                    else
                    {
                        button4.setImageResource(R.drawable.mar);
                        b4=0;
                        i++;
                        c4=1;
                    }
                    choosePlayer();
                    winningGame();


                }
                else
                {
                    Toast.makeText(Gamepage.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c5==0)
                {

                    if(startGame.equals("X"))
                    {
                        button5.setImageResource(R.drawable.marv);
                        b5=1;
                        i++;
                        c5=1;
                    }
                    else
                    {
                        button5.setImageResource(R.drawable.mar);
                        b5=0;
                        i++;
                        c5=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Gamepage.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c6==0)
                {

                    if(startGame.equals("X"))
                    {
                        button6.setImageResource(R.drawable.marv);
                        b6=1;
                        i++;
                        c6=1;
                    }
                    else
                    {
                        button6.setImageResource(R.drawable.mar);
                        b6=0;
                        i++;
                        c6=1;
                    }
                    choosePlayer();
                    winningGame();


                }
                else
                {
                    Toast.makeText(Gamepage.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(c7==0)
                {

                    if(startGame.equals("X"))
                    {
                        button7.setImageResource(R.drawable.marv);
                        b7=1;
                        i++;
                        c7=1;
                    }
                    else
                    {
                        button7.setImageResource(R.drawable.mar);
                        b7=0;
                        i++;
                        c7=1;
                    }
                    choosePlayer();
                    winningGame();


                }
                else
                {
                    Toast.makeText(Gamepage.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c8==0)
                {

                    if(startGame.equals("X"))
                    {
                        button8.setImageResource(R.drawable.marv);
                        b8=1;
                        i++;
                        c8=1;
                    }
                    else
                    {
                        button8.setImageResource(R.drawable.mar);
                        b8=0;
                        i++;
                        c8=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Gamepage.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c9==0)
                {

                    if(startGame.equals("X"))
                    {
                        button9.setImageResource(R.drawable.marv);
                        b9=1;
                        i++;
                        c9=1;
                    }
                    else
                    {
                        button9.setImageResource(R.drawable.mar);
                        b9=0;
                        i++;
                        c9=1;
                    }
                    choosePlayer();
                    winningGame();

                }
                else
                {
                    Toast.makeText(Gamepage.this,"Button Already Pressed",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }





    private void winningGame() {
        String one = textView1.getText().toString();
        String two = textView2.getText().toString();


        if ((b1 == 1) && (b2 == 1) && (b3 == 1)) {
            Result resultDialog = new Result(Gamepage.this, one
                    + " Defeated"+ two, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();



        } else if ((b4 == 1) && (b5 == 1) && (b6 == 1)) {

            Result resultDialog = new Result(Gamepage.this, one
                    + " Defeated"+ two, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();


        } else if ((b7 == 1) && (b8 == 1) && (b9 == 1)) {

            Result resultDialog = new Result(Gamepage.this, one
                    + " Defeated"+ two, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();


        } else if ((b1 == 1) && (b4 == 1) && (b7 == 1)) {

            Result resultDialog = new Result(Gamepage.this, one
                    + " Defeated"+ two, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();


        } else if ((b2 == 1) && (b5 == 1) && (b8 == 1)) {

            Result resultDialog = new Result(Gamepage.this, one
                    + " Defeated"+ two, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();


        } else if ((b3 == 1) && (b6 == 1) && (b9 == 1)) {

            Result resultDialog = new Result(Gamepage.this, one
                    + " Defeated"+ two, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();


        } else if ((b1 == 1) && (b5 == 1) && (b9 == 1)) {

            Result resultDialog = new Result(Gamepage.this, one
                    + " Defeated"+ two, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();


        } else if ((b3 == 1) && (b5 == 1) && (b7 == 1)) {

            Result resultDialog = new Result(Gamepage.this, one
                    + " Defeated"+ two, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();

        } else if ((b1 == 0) && (b2 == 0) && (b3 == 0)) {

            Result resultDialog = new Result(Gamepage.this, two
                    + " Defeated"+ one, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();

        } else if ((b4 == 0) && (b5 == 0) && (b6 == 0)) {

            Result resultDialog = new Result(Gamepage.this, two
                    + " Defeated"+ one, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();


        } else if ((b7 == 0) && (b8 == 0) && (b9 == 0)) {

            Result resultDialog = new Result(Gamepage.this, two
                    + " Defeated "+ one, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();

        } else if ((b1 == 0) && (b4 == 0) && (b7 == 0)) {

            Result resultDialog = new Result(Gamepage.this, two
                    + " Defeated" + one, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();


        } else if ((b2 == 0) && (b5 == 0) && (b8 == 0)) {

            Result resultDialog = new Result(Gamepage.this, two
                    + " Defeated"+ one, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();


        } else if ((b3 == 0) && (b6 == 0) && (b9 == 0)) {

            Result resultDialog = new Result(Gamepage.this, two
                    + " Defeated"+ one, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();


        } else if ((b1 == 0) && (b5 == 0) && (b9 == 0)) {

            Result resultDialog = new Result(Gamepage.this, two
                    + " Defeated "+ one, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();

        } else if ((b3 == 0) && (b5 == 0) && (b7 == 0)) {

            Result resultDialog = new Result(Gamepage.this, two
                    + " Defeated " + one, Gamepage.this);
            resultDialog.setCancelable(false);
            resultDialog.show();

        } else {
            if (i == 9) {
                Result resultDialog = new Result(Gamepage.this,
                         " It is a Draw", Gamepage.this);
                resultDialog.setCancelable(false);
                resultDialog.show();

            }

        }
    }


    private void choosePlayer()
    {
        if(startGame.equals("X"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";
        }
    }



    void resetValues() {

        b1=5;
        b2=5;;
        b3=5;
        b4=5;
        b5=5;
        b6=5;
        b7=5;
        b8=5;
        b9=5;
        c1=0;
        c2=0;

        c3=0;
        c4=0;
        c5=0;
        c6=0;
        c7=0;
        c8=0;
        c9=0;

i=0;


    }
}



