package com.example.jinboy.codertodeveloperbytcler.java_demo.appdemo.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.jinboy.codertodeveloperbytcler.java_demo.appdemo.R;
import com.example.jinboy.codertodeveloperbytcler.java_demo.appdemo.ui.recyclerview.SwipeRefreshRecyclerViewActivity;

public class AndroidUIActivity extends Activity implements View.OnClickListener{

    private Button uiButton1,uiButton2,uiButton3,uiButton4,uiButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_activity);
        uiButton1 = (Button) findViewById(R.id.ui_button1);
        uiButton2 = (Button) findViewById(R.id.ui_button2);
        uiButton3 = (Button) findViewById(R.id.ui_button3);
        uiButton4 = (Button) findViewById(R.id.ui_button4);
        uiButton5 = (Button) findViewById(R.id.ui_button5);
        uiButton1.setOnClickListener(this);
        uiButton2.setOnClickListener(this);
        uiButton3.setOnClickListener(this);
        uiButton4.setOnClickListener(this);
        uiButton5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ui_button1:
                startActivity(new Intent(this,SwipeRefreshRecyclerViewActivity.class));
                break;
            case R.id.ui_button2:
                startActivity(new Intent(this,TimeViewActivity.class));
                break;
            case R.id.ui_button3:
                startActivity(new Intent(this,MyCsdnActivity.class));
                break;
            case R.id.ui_button4:
                startActivity(new Intent(this,DownLoadActivity.class));
                break;
            case R.id.ui_button5:
                startActivity(new Intent(this,ViewPagerCardsActivity.class));
                break;
            default:
        }
    }
}
