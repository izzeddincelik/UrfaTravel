package com.urfatravel.urfatravelgobeklitepe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webb = (WebView)findViewById(R.id.web1);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("https://urfatravel.com");
        //getSystemService()

        WebSettings webSettings = webb.getSettings();
        webSettings.setJavaScriptEnabled(true); 

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //setContentView(R.layout.activity_main);
    }
}
