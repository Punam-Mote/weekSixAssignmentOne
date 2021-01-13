package com.punam.weeksixassignmentone.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.punam.weeksixassignmentone.R


class About : Fragment() {
    var mWebView: WebView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_about, container, false)
        mWebView = view.findViewById(R.id.webview) as WebView
        mWebView!!.loadUrl("https://softwarica.edu.np/about-softwarica/")

        // Enable Javascript
        // Enable Javascript
        val webSettings: WebSettings = mWebView!!.getSettings()
        webSettings.javaScriptEnabled = true
        // Force links and redirects to open in the WebView instead of in a browser
        // Force links and redirects to open in the WebView instead of in a browser
        mWebView!!.setWebViewClient(WebViewClient())

        return view

    }

}