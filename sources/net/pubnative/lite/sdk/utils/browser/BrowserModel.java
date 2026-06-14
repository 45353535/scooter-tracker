package net.pubnative.lite.sdk.utils.browser;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.browser.BaseWebChromeClient;
import net.pubnative.lite.sdk.utils.browser.BaseWebViewClient;

/* JADX INFO: loaded from: classes3.dex */
class BrowserModel {
    private static final String TAG = "BrowserModel";
    private Callback browserModelCallback;
    private final BrowserCookieManager cookieManager;
    private String lastKnownUrl;
    private final BaseWebChromeClient webChromeClient;
    private final BaseWebChromeClient.WebChromeClientCallback webChromeClientCallback;
    private WebView webView;
    private final BaseWebViewClient webViewClient;
    private final BaseWebViewClient.WebViewClientCallback webViewClientCallback;

    public interface Callback {
        void onGeneralError(int i10, String str, String str2);

        @TargetApi(23)
        void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

        void onPageNavigationStackChanged(boolean z10, boolean z11);

        void onProgressChanged(int i10);

        @TargetApi(26)
        void onRenderProcessGone();

        void onUrlLoadingStarted(String str);

        boolean shouldOverrideUrlLoading(String str);
    }

    BrowserModel(BaseWebViewClient baseWebViewClient, BaseWebChromeClient baseWebChromeClient, BrowserCookieManager browserCookieManager) {
        BaseWebChromeClient.WebChromeClientCallback webChromeClientCallback = new BaseWebChromeClient.WebChromeClientCallback() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserModel.1
            @Override // net.pubnative.lite.sdk.utils.browser.BaseWebChromeClient.WebChromeClientCallback
            public void onProgressChanged(int i10) {
                Callback callback = BrowserModel.this.browserModelCallback;
                if (callback != null) {
                    callback.onProgressChanged(i10);
                    BrowserModel browserModel = BrowserModel.this;
                    WebView webView = browserModel.webView;
                    if (webView != null) {
                        browserModel.browserModelCallback.onPageNavigationStackChanged(webView.canGoBack(), BrowserModel.this.webView.canGoForward());
                    }
                }
            }
        };
        this.webChromeClientCallback = webChromeClientCallback;
        WebViewClientCallbackAdapter webViewClientCallbackAdapter = new WebViewClientCallbackAdapter() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserModel.2
            @Override // net.pubnative.lite.sdk.utils.browser.WebViewClientCallbackAdapter, net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
            public void onGeneralError(int i10, String str, String str2) {
                Logger.e(BrowserModel.TAG, "onGeneralError. Errorcode " + i10 + " Description: " + str);
                Callback callback = BrowserModel.this.browserModelCallback;
                if (callback != null) {
                    callback.onGeneralError(i10, str, str2);
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.WebViewClientCallbackAdapter, net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
            public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                Logger.e(BrowserModel.TAG, "onHttpError: " + webResourceResponse.toString());
                Callback callback = BrowserModel.this.browserModelCallback;
                if (callback != null) {
                    callback.onHttpError(webResourceRequest, webResourceResponse);
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.WebViewClientCallbackAdapter, net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
            public void onPageStartedLoading(String str) {
                BrowserModel browserModel = BrowserModel.this;
                browserModel.lastKnownUrl = str;
                Callback callback = browserModel.browserModelCallback;
                if (callback != null) {
                    callback.onUrlLoadingStarted(str);
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.WebViewClientCallbackAdapter, net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
            public void onRenderProcessGone() {
                Logger.e(BrowserModel.TAG, "WebView's render process has exited");
                Callback callback = BrowserModel.this.browserModelCallback;
                if (callback != null) {
                    callback.onRenderProcessGone();
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.WebViewClientCallbackAdapter, net.pubnative.lite.sdk.utils.browser.BaseWebViewClient.WebViewClientCallback
            public boolean shouldOverrideUrlLoading(String str) {
                Callback callback = BrowserModel.this.browserModelCallback;
                if (callback != null) {
                    return callback.shouldOverrideUrlLoading(str);
                }
                return false;
            }
        };
        this.webViewClientCallback = webViewClientCallbackAdapter;
        if (baseWebViewClient == null) {
            throw new NullPointerException("BrowserModel: webViewClient can not be null");
        }
        this.webViewClient = baseWebViewClient;
        if (baseWebChromeClient == null) {
            throw new NullPointerException("BrowserModel: webChromeClient can not be null");
        }
        this.webChromeClient = baseWebChromeClient;
        if (browserCookieManager == null) {
            throw new NullPointerException("BrowserModel: cookieManager can not be null");
        }
        this.cookieManager = browserCookieManager;
        baseWebViewClient.setWebViewClientCallback(webViewClientCallbackAdapter);
        baseWebChromeClient.setWebChromeClientCallback(webChromeClientCallback);
    }

    public String getCurrentUrl() {
        if (this.lastKnownUrl == null) {
            Logger.e(TAG, "Internal error: loadUrl() was not called");
        }
        return this.lastKnownUrl;
    }

    public void goBack() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.goBack();
        }
    }

    public void goForward() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.goForward();
        }
    }

    public void load(String str) {
        if (str != null) {
            this.lastKnownUrl = str;
            WebView webView = this.webView;
            if (webView != null) {
                webView.loadUrl(str);
            }
        }
        this.lastKnownUrl = str;
    }

    public void pause() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public void reload() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.reload();
        }
    }

    public void resume() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
    }

    public void setBrowserModelCallback(Callback callback) {
        this.browserModelCallback = callback;
    }

    public void setWebView(WebView webView) {
        if (webView == null) {
            throw new NullPointerException("BrowserModel: Parameter webView cannot be null");
        }
        this.webView = webView;
        webView.setWebViewClient(this.webViewClient);
        webView.setWebChromeClient(this.webChromeClient);
        this.cookieManager.setupCookiePolicy(webView);
    }
}
