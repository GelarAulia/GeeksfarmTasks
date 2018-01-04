package com.gelaraulia.geeksfarmtasks;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BalanceCalculatorActivity extends AppCompatActivity implements View.OnClickListener{
	EditText et_income, et_outcome;
    TextView tv_balance_value;
    int touch_identifier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_calculator);
    
    et_income = (EditText)findViewById(R.id.et_income);
        et_outcome = (EditText)findViewById(R.id.et_outcome);
        tv_balance_value = (TextView)findViewById(R.id.tv_balance_value);

        et_income.setOnClickListener(this);
        et_outcome.setOnClickListener(this);

        Button btn_1 = (Button)findViewById(R.id.btn_1);
        Button btn_2 = (Button)findViewById(R.id.btn_2);
        Button btn_3 = (Button)findViewById(R.id.btn_3);
        Button btn_4 = (Button)findViewById(R.id.btn_4);
        Button btn_5 = (Button)findViewById(R.id.btn_5);
        Button btn_6 = (Button)findViewById(R.id.btn_6);
        Button btn_7 = (Button)findViewById(R.id.btn_7);
        Button btn_8 = (Button)findViewById(R.id.btn_8);
        Button btn_9 = (Button)findViewById(R.id.btn_9);
        Button btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_0.setOnClickListener(this);

        Button btn_clear = (Button)findViewById(R.id.btn_clear);
        Button btn_delete = (Button)findViewById(R.id.btn_delete);
        //Button btn_count = (Button)findViewById(R.id.btn_count);
        btn_clear.setOnClickListener(this);
        btn_delete.setOnClickListener(this);
        //btn_count.setOnClickListener(this);

        FloatingActionButton fab_cal = (FloatingActionButton) findViewById(R.id.fab_cal);
        fab_cal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.et_income:
                touch_identifier = 1;
                break;

            case R.id.et_outcome:
                touch_identifier = 2;
                break;

            case R.id.btn_1:
                if (touch_identifier==1){
                   et_income.append("1");
                   break;
                }
                else if (touch_identifier==2){
                    et_outcome.append("1");
                    break;
                }
                else {
                    break;
                }
            case R.id.btn_2:
                if (touch_identifier==1){
                    et_income.append("2");
                    break;
                }
                else if (touch_identifier==2){
                    et_outcome.append("2");
                    break;
                }
                else {
                    break;
                }
            case R.id.btn_3:
                if (touch_identifier==1){
                    et_income.append("3");
                    break;
                }
                else if (touch_identifier==2){
                    et_outcome.append("3");
                    break;
                }
                else {
                    break;
                }
            case R.id.btn_4:
                if (touch_identifier==1){
                    et_income.append("4");
                    break;
                }
                else if (touch_identifier==2){
                    et_outcome.append("4");
                    break;
                }
                else {
                    break;
                }
            case R.id.btn_5:
                if (touch_identifier==1){
                    et_income.append("5");
                    break;
                }
                else if (touch_identifier==2){
                    et_outcome.append("5");
                    break;
                }
                else {
                    break;
                }
            case R.id.btn_6:
                if (touch_identifier==1){
                    et_income.append("6");
                    break;
                }
                else if (touch_identifier==2){
                    et_outcome.append("6");
                    break;
                }
                else {
                    break;
                }
            case R.id.btn_7:
                if (touch_identifier==1){
                    et_income.append("7");
                    break;
                }
                else if (touch_identifier==2){
                    et_outcome.append("7");
                    break;
                }
                else {
                    break;
                }
            case R.id.btn_8:
                if (touch_identifier==1){
                    et_income.append("8");
                    break;
                }
                else if (touch_identifier==2){
                    et_outcome.append("8");
                    break;
                }
                else {
                    break;
                }
            case R.id.btn_9:
                if (touch_identifier==1){
                    et_income.append("9");
                    break;
                }
                else if (touch_identifier==2){
                    et_outcome.append("9");
                    break;
                }
                else {
                    break;
                }
            case R.id.btn_0:
                if (touch_identifier==1){
                    et_income.append("0");
                    break;
                }
                else if (touch_identifier==2){
                    et_outcome.append("0");
                    break;
                }
                else {
                    break;
                }


            case R.id.btn_clear:
                et_income.setText("");
                et_outcome.setText("");
                tv_balance_value.setText("0");
                break;

            case R.id.btn_delete:
                if (touch_identifier==1){
                    String str = et_income.getText().toString();
                    if(str.length() > 1){
                        str = str.substring(0, str.length()-1);
                        et_income.setText(str);
                        break;
                    }
                    else if(str.length() >= 1) {
                        et_income.setText("");
                        break;
                    }
                    else {
                        break;
                    }
                }
                else if (touch_identifier==2){
                    String str = et_outcome.getText().toString();
                    if(str.length() > 1){
                        str = str.substring(0, str.length()-1);
                        et_outcome.setText(str);
                        break;
                    }
                    else if(str.length() >= 1) {
                        et_outcome.setText("");
                        break;
                    }
                }
                else {
                    break;
                }

/*            case R.id.btn_count:
                String str = et_income.getText().toString();
                String str2 = et_outcome.getText().toString();
                if (str.length() != 0 && str2.length() != 0) {
                    int int_income = Integer.parseInt(et_income.getText().toString());
                    int int_outcome = Integer.parseInt(et_outcome.getText().toString());
                    int total = int_income - int_outcome;
                    tv_balance_value.setText(String.valueOf(total));
                    break;
                }
                else {
                    Toast.makeText(BalanceCalculatorActivity.this, "Input is not valid", Toast.LENGTH_SHORT).show();
                    break;
                } */

            case R.id.fab_cal:
                String str = et_income.getText().toString();
                String str2 = et_outcome.getText().toString();
                if (str.length() != 0 && str2.length() != 0) {
                    int int_income = Integer.parseInt(et_income.getText().toString());
                    int int_outcome = Integer.parseInt(et_outcome.getText().toString());
                    int total = int_income - int_outcome;
                    tv_balance_value.setText(String.valueOf(total));
                    break;
                }
                else {
                    Toast.makeText(BalanceCalculatorActivity.this, "Input is not valid", Toast.LENGTH_SHORT).show();
                    break;
                }
        }
    }

}

