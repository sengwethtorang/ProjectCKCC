package com.example.wethtorang.ckcc.SplanhScreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.wethtorang.ckcc.MainActivity;
import com.example.wethtorang.ckcc.R;


/**
 * Created by WETHTORANG on 7/18/2016.
 */
public class splanhScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splanh);
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(splanhScreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timerThread.start();
    }
}
