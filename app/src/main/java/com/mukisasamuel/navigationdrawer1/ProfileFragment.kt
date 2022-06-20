package com.mukisasamuel.navigationdrawer1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val webView = view?.findViewById<WebView>(R.id.web_view)
        webView?.webViewClient = WebViewClient()
        webView?.loadUrl("www.bbc.com")
        val webSettings = webView?.settings
        webSettings?.javaScriptEnabled=true
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }


}