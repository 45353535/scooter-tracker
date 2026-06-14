package net.pubnative.lite.sdk.utils.browser;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import net.pubnative.lite.sdk.utils.browser.BaseWebViewClient;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewClientCallbackAdapter implements BaseWebViewClient.WebViewClientCallback {
    @Override // net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
    public void onGeneralError(int i10, String str, String str2) {
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
    public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
    public void onPageFinishedLoading(String str) {
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
    public void onPageStartedLoading(String str) {
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
    public void onRenderProcessGone() {
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
    public boolean shouldOverrideUrlLoading(String str) {
        return false;
    }
}
