package com.timer.my;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;

import com.timer.my.R;



import android.annotation.TargetApi;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Build;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;




import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
 
 Button buttonStart;
 
 ScheduledExecutorService scheduledExecutorService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        buttonStart = (Button)findViewById(R.id.start);
        buttonStart.setOnClickListener(new OnClickListener(){

   @Override
   public void onClick(View v) {
    
    Toast.makeText(MainActivity.this, 
      "Start", 
      Toast.LENGTH_LONG).show();
    
    scheduledExecutorService = Executors.newScheduledThreadPool(1);
    
    scheduledExecutorService.schedule(new Runnable(){

     @Override
     public void run() {
      MainActivity.this.runOnUiThread(new Runnable(){

       @Override
       public void run() {      
       
       Intent intent =new Intent (MainActivity.this,inn.class);
       startActivity(intent);
          }});   
     }}, 
     5, 
     TimeUnit.SECONDS);
       }
        });  
         }



}