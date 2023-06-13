package com.tufanakcay.androidwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        viewUrl();
        // viewHtml();

    }

    private void init() {

        webView = findViewById(R.id.webView);
    }

    private void viewUrl() {

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.google.com");
    }

    private void viewHtml() {

        String htmlCode = "<html><head><title>Webview HTML Example</title></head><body><h1>HTML EXAMPLE</h1></body></html>";
        webView.loadData(htmlCode, "text/html", "UTF-8");
    }

}