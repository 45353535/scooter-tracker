package com.mbridge.msdk.dycreator.baseview.webview.client;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.dycreator.baseview.webview.communicator.WebCommunicator;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class MBWebChromeClient extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47987a = "MBWebChromeClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebViewEventListener f47988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebCommunicator f47989c;

    private boolean a(String str) {
        WebCommunicator webCommunicator;
        try {
        } catch (Throwable th2) {
            q0.b("MBWebChromeClient", th2.getMessage());
        }
        if (!str.startsWith("mv:")) {
            if (str.startsWith("mraid:")) {
            }
            return false;
        }
        if (str.contains("wv_hybrid:")) {
            str = str.substring(0, str.lastIndexOf(" ") + 1);
        }
        q0.a("MBWebChromeClient", "onConsoleMessage: message.length() = " + str.length() + " " + str);
        if (!TextUtils.isEmpty(str) && (webCommunicator = this.f47989c) != null) {
            webCommunicator.onCommunication(str);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (TextUtils.isEmpty(consoleMessage.message()) || !a(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (TextUtils.isEmpty(str2) || !a(str2)) {
            return false;
        }
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        WebViewEventListener webViewEventListener = this.f47988b;
        if (webViewEventListener != null) {
            webViewEventListener.onProgressChanged(webView, i10);
        }
    }

    public void setCommunicator(WebCommunicator webCommunicator) {
        this.f47989c = webCommunicator;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.f47988b = webViewEventListener;
    }
}
