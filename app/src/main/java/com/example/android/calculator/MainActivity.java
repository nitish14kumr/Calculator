package com.example.android.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String input1 = "\0", input2 = "\0";
    float x, y;
    float r;
    int i;
    char ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void one(View view) {
        input2 += "1";
        display2(input2);
    }

    public void two(View view) {
        input2 += "2";
        display2(input2);
    }

    public void three(View view) {
        input2 += "3";
        display2(input2);
    }

    public void four(View view) {
        input2 += "4";
        display2(input2);
    }

    public void five(View view) {
        input2 += "5";
        display2(input2);
    }

    public void six(View view) {
        input2 += "6";
        display2(input2);
    }

    public void seven(View view) {
        input2 += "7";
        display2(input2);
    }

    public void eight(View view) {
        input2 += "8";
        display2(input2);
    }

    public void nine(View view) {
        input2 += "9";
        display2(input2);
    }

    public void zero(View view) {
        input2 += "0";
        display2(input2);
    }

    public void add(View view) {
        if (!input2.equals("\0")) {
            i = 1;
            input1 = input2;
            x = Float.parseFloat(input1);
            input2 = "\0";
            ch = '+';
            display1(input1);
            display2(input2);
        }
    }

    public void sub(View view) {
        if (!input2.equals("\0")) {
            i = 2;
            input1 = input2;
            x = Float.parseFloat(input1);
            input2 = "\0";
            ch = '-';
            display1(input1);
            display2(input2);
        }
    }

    public void mul(View view) {
        if (!input2.equals("\0")) {

            i = 3;
            input1 = input2;
            x = Float.parseFloat(input1);
            input2 = "\0";
            ch = '*';
            display1(input1);
            display2(input2);
        }
    }

    public void div(View view) {
        if (!input2.equals("\0")) {

            i = 4;
            input1 = input2;
            x = Float.parseFloat(input1);
            input2 = "\0";
            ch = '/';
            display1(input1);
            display2(input2);
        }
    }

    public void power(View view) {
        if (!input2.equals("\0")) {
            i = 5;
            input1 = input2;
            input2 = "\0";
            x = Float.parseFloat(input1);
            ch = '^';
            display1(input1);
            display2(input2);
        }
    }

    public void root(View view) {
        i = 6;
        ch = '√';
        display2(input2);
    }

    public void equal(View view) {
        if (!input1.equals("\0") && (i == 6 || !input2.equals("\0"))) {
            y = Float.parseFloat(input2);
            switch (i) {
                case 1:
                    r = x + y;
                    break;
                case 2:
                    r = x - y;
                    break;
                case 3:
                    r = x * y;
                    break;
                case 4:
                    r = x / y;
                    break;
                case 5:
                    r = (float) Math.pow(x, y);
                    break;
                case 6:
                    r = (float) Math.sqrt(y);
                    break;
                default:;
            }
            i = 0;
            display1(input1, input2);
            //input2="\0";
            input2 = Float.toString(r);
            //    while(input2.substring(input2.length()-1)=="0")
            //        input2=input2.substring(0,input2.length()-1);
            if ((input2.substring(input2.length() - 1)).equals("0"))
                input2 = input2.substring(0, input2.length() - 2);
            display2(input2);
        }
    }

    public void clear(View view) {
        TextView txt = (TextView) findViewById(R.id.text1);
        txt.setText("");
        txt = (TextView) findViewById(R.id.text2);
        txt.setText("0");
        x = y = r = 0f;
        input1 = input2 = "\0";
    }

    public void del(View view) {
        if (input2 != null && input2.length() > 0)
            input2 = input2.substring(0, input2.length() - 1);
        display2(input2);
    }

    public void dot(View view) {
        input2 += ".";
        display2(input2);
    }

    private void display1(String n1) {
        TextView quantityTextView = (TextView) findViewById(R.id.text1);
        quantityTextView.setText("" + n1 + ch);
    }

    private void display1(String n1, String n2) {
        TextView quantityTextView = (TextView) findViewById(R.id.text1);
        quantityTextView.setText("" + n1 + ch + n2);
    }

    private void display2(String number) {
        TextView quantityTextView = (TextView) findViewById(R.id.text2);
        quantityTextView.setText("" + number);
        if (i == 6)
            quantityTextView.setText("" + ch + number);
    }

/*  public void dot(View view)
    {

    }
*/
}
