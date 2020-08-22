package com.timer.my;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Activity;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toast;
import com.timer.my.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends Activity {
 ////////
 
int h=1;

// returns a Date-object
                                      // with date set to May 14, 2012
 /////////
 ////////
  ////////
SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd-HH:mm:ss:ms", Locale.getDefault());
Date datee = new Date();
String date=  dateFormat.format(datee);
///// ///////////   
  SimpleDateFormat sdf = new SimpleDateFormat("20-8-22-13:59:10:23");
//////
//////






 
///// ///////////     
 //////////
 
 Button buttonStart;
 TextView textView;
 ScheduledExecutorService scheduledExecutorService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {            super.onCreate(savedInstanceState);       setContentView(R.layout.activity_main);
   textView=(TextView)findViewById(R.id.textView); 
buttonStart = (Button)findViewById(R.id.start);        buttonStart.setOnClickListener(new OnClickListener(){
   @Override
   public void onClick(View v) {
    
    Toast.makeText(MainActivity.this, 
      "Start", 
      Toast.LENGTH_LONG).show();
    
    scheduledExecutorService = Executors.newScheduledThreadPool(2);
scheduledExecutorService.schedule(new Runnable(){
    @Override
     public void run() {
                MainActivity.this.runOnUiThread(new Runnable(){
                
       @Override
       public void run() {    
       Toast.makeText(MainActivity.this, 
      "Please check your apps", 
      Toast.LENGTH_LONG).show();
                
       Intent intent =new Intent (MainActivity.this,inn.class);
       startActivity(intent);
       
       
          }});   
     }},  
     h,
     TimeUnit.MINUTES);
       }
        });  
/////        
        
 ScheduledExecutorService scheduler =
    Executors.newSingleThreadScheduledExecutor();

scheduler.scheduleAtFixedRate
      (new Runnable() {
      
       @Override 
         public void run() {
        
  /////////
  MainActivity.this.runOnUiThread(new Runnable(){
                
       @Override
       public void run() {             
       Intent intent =new Intent (MainActivity.this,inn.class);
       startActivity(intent);
          }});   
  
  
  
  //////////      
        
        
            // call service
         }
      }, 10, 160, TimeUnit.SECONDS);       
        
 
 
 
 
 
 
 
 
 
 
        
  //////
         }
}