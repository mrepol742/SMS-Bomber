package com.android.DROID_MJ.smsbomber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.content.Intent;
import android.widget.EditText;
import android.text.TextUtils;
import android.support.v4.app.ActivityCompat;
import java.util.List;
import android.telephony.SmsManager;
import android.widget.Toast;
import android.app.PendingIntent;
import android.support.v7.widget.Toolbar;
import android.graphics.Typeface;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.pm.PackageManager;
import android.Manifest;
import android.os.Build.VERSION;
import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.view.inputmethod.EditorInfo;

public class a extends AppCompatActivity {
    private EditText a;
    private EditText b;
    private EditText c;
    private Button d;
    private String e;
    private String f;
    private String g;
    private SmsManager h;
    private int i;
    private Toolbar j;
    private TextView k;
    private TextView m;
    private TextView n;
    private TextView o;
private String p = "com.android.DROID_MJ";
private String q = "SMS";
private String r;
private String t;
private String[] x = {
  android.Manifest.permission.READ_PHONE_STATE, 
  android.Manifest.permission.SEND_SMS
};
  private View u;
    private Toast v;
    private Typeface w;
   
   private SharedPreferences.Editor y;

   private SharedPreferences z;
   private SharedPreferences.Editor a1;

   private SharedPreferences a2;
   private SharedPreferences.Editor a3;
private String a4;
private String a5;
private String a6;
private String a7;
private String a8;
private String a9;
private SharedPreferences a10;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);
        a = (EditText) findViewById(R.id.a);
        b = (EditText) findViewById(R.id.b);
        c = (EditText) findViewById(R.id.c);
        d = (Button) findViewById(R.id.d);
        j = (Toolbar) findViewById(R.id.e);
        setSupportActionBar(j);
        k = (TextView) findViewById(R.id.f);
        m = (TextView) findViewById(R.id.g);
        n = (TextView) findViewById(R.id.h);
        o = (TextView) findViewById(R.id.i);
        k.setText("SMS Bomber");
getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
  
   a10 = getApplicationContext().getSharedPreferences("num", 0);
        a4 = a10.getString("num", a9);
if (a4 != null) {
    a.setText(a4);
}
 z = getApplicationContext().getSharedPreferences("ant", 0);
        a5 = z.getString("ant", a6);
if (a5 != null) {
    b.setText(a5);
}
 a2 = getApplicationContext().getSharedPreferences("msg", 0);
        a8 = a2.getString("msg", a7);
if (a8 != null) {
    c.setText(a8);
}
        e = a.getText().toString();
        f = b.getText().toString();
        g = c.getText().toString();
        Typeface l = Typeface.createFromAsset(getAssets(), "fonts/a.ttf");
k.setTypeface(l);
m.setTypeface(l);
n.setTypeface(l);
o.setTypeface(l);
a.setTypeface(l);
b.setTypeface(l);
c.setTypeface(l);
if (VERSION.SDK_INT >= 23) {
a7();
}
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(a1() && a2() && a3()){ 
                  
 a4(a.this.a.getText().toString(), a.this.c.getText().toString());
                }
             }
        });
       c.setOnEditorActionListener(new OnEditorActionListener() {
            public boolean onEditorAction(android.widget.TextView a, int b, KeyEvent c) {
                boolean d = false;
                if (b == EditorInfo.IME_ACTION_DONE) { 
                if(a1() && a2() && a3()){ 
                  
 a4(a.this.a.getText().toString(), a.this.c.getText().toString());
                }
getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    d = true;
                }
                return d;
            }
        });
        this.r = getApplicationContext().getPackageName();
        if (this.r.length() != 30) {
            a6();
        }
        if (!this.r.startsWith(this.p)) {
            a6();
        }
        this.t = getApplicationInfo().loadLabel(getPackageManager()).toString();
        if (this.t.length() != 10) {
            a6();
        }
        if (!this.t.startsWith(this.q)) {
            a6();
        }
try {
TelephonyManager tm=(TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
String jop =tm.getDeviceId();
if (!jop.equals("355035080698936")) {
 getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
}
} catch (Exception ex) {
 getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
}
    }

    protected void onStop() {
        super.onStop();

          a10 = getApplicationContext().getSharedPreferences("num", 0);
            
            y = a10.edit();
         y.putString("num", a.getText().toString());
         y.commit();


 z = getApplicationContext().getSharedPreferences("ant", 0);
            
            a1 = z.edit();
         a1.putString("ant", b.getText().toString());
         a1.commit();


 a2 = getApplicationContext().getSharedPreferences("msg", 0);
            
            a3 = a2.edit();
         a3.putString("msg", c.getText().toString());
         a3.commit();


    }
protected void onResume() {
super.onResume();
getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
}

    private boolean a1(){ 
        if(this.a.length() == 0) {
           this.a.setError("Please enter a number"); 
  	        return false; 
  	     } 
  	        return true; 
    }

    private boolean a2(){ 
        if(this.b.length() == 0) {
           this.b.setError("Please enter the amount"); 
  	        return false; 
  	     } 
        if (this.b.getText().toString().startsWith("0")) {
this.b.setError("Invalid amount");
           return false;
        }
  	        return true; 
    }

    private boolean a3(){ 
        if(this.c.length() == 0) {
           this.c.setError("Please enter a message"); 
  	        return false; 
  	     } 
  	        return true; 
    }

    private void a4(String a, String b) {
        try {
            this.i = Integer.parseInt(this.b.getText().toString());
        } catch (NumberFormatException e) {
        }
      try {
          for (int i = 0; i < this.i; i++ ) {
               this.h = SmsManager.getDefault();
              
 this.h.sendTextMessage( a, null, b, null, null);
          }
           a5();
      } catch (Exception ex) {
a7();

        this.u = getLayoutInflater().inflate(R.layout.b, (ViewGroup) findViewById(R.id.j));
        this.w = Typeface.createFromAsset(getAssets(), "fonts/a.ttf");
        ((TextView) this.u.findViewById(R.id.k)).setText(ex.getMessage());
        ((TextView) this.u.findViewById(R.id.k)).setTypeface(this.w);
        this.v = new Toast(getApplicationContext());
        this.v.setDuration(0);
        this.v.setView(this.u);
        this.v.show();
      }
   }

   private void a5() {
        this.u = getLayoutInflater().inflate(R.layout.c, (ViewGroup) findViewById(R.id.l));
        this.w = Typeface.createFromAsset(getAssets(), "fonts/a.ttf");
        ((TextView) this.u.findViewById(R.id.m)).setText("Sending " +this.i +" messages to "+ this.a.getText().toString());
        ((TextView) this.u.findViewById(R.id.m)).setTypeface(this.w);
        this.v = new Toast(getApplicationContext());
        this.v.setDuration(0);
        this.v.setView(this.u);
        this.v.show();
   }

   private void a6() {
        this.u = getLayoutInflater().inflate(R.layout.b, (ViewGroup) findViewById(R.id.j));
        this.w = Typeface.createFromAsset(getAssets(), "fonts/a.ttf");
        ((TextView) this.u.findViewById(R.id.k)).setText("Invalid License");
        ((TextView) this.u.findViewById(R.id.k)).setTypeface(this.w);
        this.v = new Toast(getApplicationContext());
        this.v.setDuration(0);
        this.v.setView(this.u);
        this.v.show();
        finish();
   }

private void a7() {
       Context co = a.this;

if (VERSION.SDK_INT >= 23) {
if(!hasPermissions(co, x)){
    ActivityCompat.requestPermissions(this, x, 1);
} 
}
      

}

public  boolean hasPermissions(Context context, String... permissions) {
    if (context != null && permissions != null) {
        for (String permission : permissions) {
            if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {

                return false;
            }
        }
    }
    return true;
}


public void onRequestPermissionsResult(int a, String[] b, int[] c) {
        super.onRequestPermissionsResult(a, b, c);
        if (c[0]== PackageManager.PERMISSION_GRANTED){
        }
    }
}