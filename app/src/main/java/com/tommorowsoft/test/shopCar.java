package com.tommorowsoft.test;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class shopCar extends Activity {

    WebView webShopCar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopcar);
        webShopCar= (WebView) findViewById(R.id.webShopCar);
        WebSettings webSettings=webShopCar.getSettings();
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webShopCar.loadUrl("http://p.m.jd.com/cart/cart.action");
        webShopCar.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
    }
}
