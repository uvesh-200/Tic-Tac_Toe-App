package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Game extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9;
    int flag=0;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        init();
    }

    public void init() {
             b1 = findViewById(R.id.btn1);
             b2 = findViewById(R.id.btn2);
             b3 = findViewById(R.id.btn3);
             b4 = findViewById(R.id.btn4);
             b5 = findViewById(R.id.btn5);
             b6 = findViewById(R.id.btn6);
             b7 = findViewById(R.id.btn7);
             b8 = findViewById(R.id.btn8);
             b9 = findViewById(R.id.btn9);
        }

        public void Click(View view ) {
            Button current = (Button) view;
            count++;

            if(current.getText().toString().equals("")) {

                if (flag == 0) {
                    current.setText("X");

                    flag = 1;
                } else {
                    current.setText("O");

                    flag = 0;
                }

                if (count > 4) {
                    s1 = b1.getText().toString();
                    s2 = b2.getText().toString();
                    s3 = b3.getText().toString();
                    s4 = b4.getText().toString();
                    s5 = b5.getText().toString();
                    s6 = b6.getText().toString();
                    s7 = b7.getText().toString();
                    s8 = b8.getText().toString();
                    s9 = b9.getText().toString();

                    if (s1.equals(s2) & s2.equals(s3) & !s1.equals("")) {
                        Toast.makeText(this, "Winner is " + s1, Toast.LENGTH_SHORT).show();
                        b1.setTextColor(getResources().getColor(R.color.win));
                        b2.setTextColor(getResources().getColor(R.color.win));
                        b3.setTextColor(getResources().getColor(R.color.win));
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Restart();
                            }
                        },3000);
                    }

                    else if (s4.equals(s5) & s5.equals(s6) & !s4.equals("")) {
                        Toast.makeText(this, "Winner is " + s5, Toast.LENGTH_SHORT).show();
                        b4.setTextColor(getResources().getColor(R.color.win));
                        b5.setTextColor(getResources().getColor(R.color.win));
                        b6.setTextColor(getResources().getColor(R.color.win));
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Restart();
                            }
                        },3000);

                    }

                    else if (s7.equals(s8) & s8.equals(s9) & !s9.equals("")) {
                        Toast.makeText(this, "Winner is " + s9, Toast.LENGTH_SHORT).show();
                        b7.setTextColor(getResources().getColor(R.color.win));
                        b8.setTextColor(getResources().getColor(R.color.win));
                        b9.setTextColor(getResources().getColor(R.color.win));
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Restart();
                            }
                        },3000);

                    }

                    else if (s1.equals(s4) & s4.equals(s7) & !s7.equals("")) {
                        Toast.makeText(this, "Winner is " + s1, Toast.LENGTH_SHORT).show();
                        b1.setTextColor(getResources().getColor(R.color.win));
                        b4.setTextColor(getResources().getColor(R.color.win));
                        b7.setTextColor(getResources().getColor(R.color.win));
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Restart();
                            }
                        },3000);

                    }

                    else if (s2.equals(s5) & s5.equals(s8) & !s8.equals("")) {
                        Toast.makeText(this, "Winner is " + s2, Toast.LENGTH_SHORT).show();
                        b2.setTextColor(getResources().getColor(R.color.win));
                        b5.setTextColor(getResources().getColor(R.color.win));
                        b8.setTextColor(getResources().getColor(R.color.win));
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Restart();
                            }
                        },3000);

                    }

                    else if (s3.equals(s6) & s6.equals(s9) & !s9.equals("")) {
                        Toast.makeText(this, "Winner is " + s3, Toast.LENGTH_SHORT).show();
                        b3.setTextColor(getResources().getColor(R.color.win));
                        b6.setTextColor(getResources().getColor(R.color.win));
                        b9.setTextColor(getResources().getColor(R.color.win));
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Restart();
                            }
                        },3000);

                    }

                    else if (s1.equals(s5) & s5.equals(s9) & !s9.equals("")) {
                        Toast.makeText(this, "Winner is " + s5, Toast.LENGTH_SHORT).show();
                        b1.setTextColor(getResources().getColor(R.color.win));
                        b5.setTextColor(getResources().getColor(R.color.win));
                        b9.setTextColor(getResources().getColor(R.color.win));
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Restart();
                            }
                        },3000);

                    }

                    else if (s3.equals(s5) & s5.equals(s7) & !s7.equals("")) {
                        Toast.makeText(this, "Winner is " + s7, Toast.LENGTH_SHORT).show();
                        b3.setTextColor(getResources().getColor(R.color.win));
                        b5.setTextColor(getResources().getColor(R.color.win));
                        b7.setTextColor(getResources().getColor(R.color.win));
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Restart();
                            }
                        },3000);

                    }

                    else if (count == 9){
                        Toast.makeText(this, "Drawn", Toast.LENGTH_SHORT).show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Restart();
                            }
                        },3000);
                    }
                    }
                }
            }

        public void Restart() {
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            b1.setTextColor(getResources().getColor(R.color.white));
            b2.setTextColor(getResources().getColor(R.color.white));
            b3.setTextColor(getResources().getColor(R.color.white));
            b4.setTextColor(getResources().getColor(R.color.white));
            b5.setTextColor(getResources().getColor(R.color.white));
            b6.setTextColor(getResources().getColor(R.color.white));
            b7.setTextColor(getResources().getColor(R.color.white));
            b8.setTextColor(getResources().getColor(R.color.white));
            b9.setTextColor(getResources().getColor(R.color.white));
            flag = 0;
            count = 0;
            Toast.makeText(this, "New Game Started", Toast.LENGTH_SHORT).show();
        }
}