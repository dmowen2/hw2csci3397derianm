package com.example.comcsci3397derianmmowen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.input);



    }

    private void updateText(String str){
        String old = display.getText().toString();

        String newstr = old+str;
        if (str.equals("")){
            display.setText("");
        } else {
            display.setText(newstr);
        }
    }

    public void zeroBtn(View view){
        updateText("0");
    }
    public void oneBtn(View view){
        updateText("1");
    }
    public void twoBtn(View view){
        updateText("2");
    }
    public void threeBtn(View view){
        updateText("3");
    }
    public void fourBtn(View view){
        updateText("4");
    }
    public void fiveBtn(View view){
        updateText("5");
    }
    public void sixBtn(View view){
        updateText("6");
    }
    public void sevenBtn(View view){
        updateText("7");
    }
    public void eightBtn(View view){
        updateText("8");
    }
    public void nineBtn(View view){
        updateText("9");
    }
    public void clearBtn(View view){
        updateText("");
    }
    public void divBtn(View view){
        updateText("/");
    }
    public void multiplyBtn(View view){
        updateText("*");
    }
    public void plusBtn(View viewstr){
        updateText("+");
    }
    public void minusBtn(View view){
        updateText("-");
    }
    public void equalsBtn(View view){
        String split = display.getText().toString();
        if (split.contains("/")){
            String strs[] = split.split("/");
            String hold = String.valueOf((Float.parseFloat(strs[0])/Float.parseFloat(strs[1])));
            display.setText(hold);

        }else if (split.contains("*")){
            String strs[] = split.split("\\*");
            String hold = String.valueOf((Float.parseFloat(strs[0])*Float.parseFloat(strs[1])));
            display.setText(hold);

        }else if (split.contains("-")){
            String strs[] = split.split("-");
            String hold = String.valueOf((Float.parseFloat(strs[0])-Float.parseFloat(strs[1])));
            display.setText(hold);

        }else if (split.contains("+")){
            String strs[] = split.split("\\+");
            String hold = String.valueOf((Float.parseFloat(strs[0])+Float.parseFloat(strs[1])));
            display.setText(hold);


        }else {
            display.setText("Error");
        }

    }
    public void pointBtn(View view){
        updateText(".");
    }

}