package com.javaclass.anima.android28webviewclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    internal lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById<View>(R.id.animaWeb) as WebView

        webView.loadUrl("file:///android_asset/anima_Index.php")
    }
}
