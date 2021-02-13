package com.ghodel.gicons.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import com.ghodel.gicons.R;

public class SplashActivity extends BaseActivity {

    private ImageView img;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initViews();
        initLogic();
        initListeners();
        
    }
    
       @Override
    public void initViews() {
        img = (ImageView)findViewById(R.id.app_logo);
        text = (TextView)findViewById(R.id.app_name);
    }

    @Override
    public void initLogic() {
        
       new Handler().postDelayed(new Runnable(){

                @Override
                public void run() {
                    Intent next = new Intent();
                    next.setClass(getApplicationContext(), MainActivity.class);
                   startActivity(next);
                    finish();
                }
            }, 3000);
        
    }

    @Override
    public void initListeners() {
       
    }
    
}
