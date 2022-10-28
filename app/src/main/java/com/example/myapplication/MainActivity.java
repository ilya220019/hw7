package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int firstPeremennaya;
    private int secondPeremennaya;
    private int result;
    private String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
    }

    public void onLogicClick(View view) {

        switch (view.getId()) {
            case R.id.btn_zero:
                number("0");
                break;

            case R.id.btn_one:
                number("1");
                break;

            case R.id.btn_two:
                number("2");
                break;

            case R.id.btn_three:
                number("3");
                break;

            case R.id.btn_four:
                number("4");
                break;
            case R.id.btn_five:
                number("5");
                break;
            case R.id.btn_six:
                number("6");
                break;
            case R.id.btn_seven:
                number("7");
                break;
            case R.id.btn_eight:
                number("8");
                break;
            case R.id.btn_nine:
                number("9");
                break;

            case R.id.tw_ac:
                textView.setText("0");
                firstPeremennaya = 0;
                secondPeremennaya = 0;
                break;

            case R.id.tw_delete:
                String numberNow = textView.getText().toString();
                textView.setText(null);
                if (numberNow.length() == 1) {
                    textView.setText("0");
                } else {
                    numberNow = numberNow.substring(0, numberNow.length() - 1);
                    textView.setText(numberNow);
                    break;
                }
        }
    }

    private void number(String number) {
        if (textView.getText().toString().equals("0")) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
    }

    public void creat(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
                operation = "+";
                break;

            case R.id.btn_minus:
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
                operation = "-";
                break;
            case R.id.tw_del:
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
                operation = "/";
                break;
            case R.id.btn_tiple:
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
                operation = "*";
                break;


            case R.id.btn_equal:
                switch (operation) {

                    case "+":
                        secondPeremennaya = Integer.parseInt(textView.getText().toString());
                        result = firstPeremennaya + secondPeremennaya;
                        textView.setText(result + "");
                        break;
                    case "-":
                        secondPeremennaya = Integer.parseInt(textView.getText().toString());
                        result = firstPeremennaya - secondPeremennaya;
                        textView.setText(result + "");
                        break;
                    case "/":
                        secondPeremennaya = Integer.parseInt(textView.getText().toString());
                        result = firstPeremennaya / secondPeremennaya;
                        textView.setText(result + "");
                        break;
                    case "*":
                        secondPeremennaya = Integer.parseInt(textView.getText().toString());
                        result = firstPeremennaya * secondPeremennaya;
                        textView.setText(result + "");
                        break;
                }
        }
    }
}