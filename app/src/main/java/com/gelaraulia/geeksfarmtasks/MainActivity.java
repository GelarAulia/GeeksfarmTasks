package com.gelaraulia.geeksfarmtasks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_toBalanceCal = (Button)findViewById(R.id.btn_toBalanceCal);
        Button btn_toNavigation = (Button)findViewById(R.id.btn_toNavigation);
        Button btn_toLogin = (Button)findViewById(R.id.btn_toLogin);
        Button btn_toAdvApp = (Button)findViewById(R.id.btn_toAdvApp);
        btn_toBalanceCal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_toBalanceCal:
                intent = new Intent(MainActivity.this,BalanceCalculatorActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_toNavigation:
                intent = new Intent(MainActivity.this,NavigationActivity.class);
                startActivity(intent);
                break;
//
//            case R.id.btn_toLogin:
//                intent = new Intent(MainActivity.this,BalanceCalculatorActivity.class);
//                startActivity(intent);
//                break;
//
//            case R.id.btn_toAdvApp:
//                intent = new Intent(MainActivity.this,BalanceCalculatorActivity.class);
//                startActivity(intent);
//                break;
        }
    }
}
