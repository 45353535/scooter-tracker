package net.pubnative.lite.sdk.consent;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class UserConsentActivity extends Activity {
    private static final String REDIRECT_ACCEPT = "https://cdn.pubnative.net/static/consent/GDPR-consent-dialog-accept.html";
    private static final String REDIRECT_CLOSE = "https://pubnative.net/";
    private static final String REDIRECT_REJECT = "https://cdn.pubnative.net/static/consent/GDPR-consent-dialog-reject.html";
    public static final int RESULT_CONSENT_ACCEPTED = 200;
    public static final int RESULT_CONSENT_REJECTED = 201;
    private static final String TAG = "UserConsentActivity";
    private final WebViewClient webViewClient = new WebViewClient() { // from class: net.pubnative.lite.sdk.consent.UserConsentActivity.1
        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            str.getClass();
            switch (str) {
                case "https://pubnative.net/":
                    UserConsentActivity.this.finish();
                    return false;
                case "https://cdn.pubnative.net/static/consent/GDPR-consent-dialog-accept.html":
                    HyBid.getUserDataManager().grantConsent();
                    UserConsentActivity.this.setResult(200);
                    return false;
                case "https://cdn.pubnative.net/static/consent/GDPR-consent-dialog-reject.html":
                    HyBid.getUserDataManager().denyConsent();
                    UserConsentActivity.this.setResult(201);
                    return false;
                default:
                    return super.shouldOverrideUrlLoading(webView, str);
            }
        }
    };

    private void loadConsentPage(WebView webView) {
        if (!HyBid.isInitialized() || HyBid.getUserDataManager() == null) {
            Logger.e(TAG, "HyBid SDK has not been initialised yet. Dropping call.");
            finish();
            return;
        }
        String consentPageLink = HyBid.getUserDataManager().getConsentPageLink();
        if (!TextUtils.isEmpty(consentPageLink)) {
            webView.loadUrl(consentPageLink);
        } else {
            Logger.e(TAG, "Invalid consent page URL. Dropping call.");
            finish();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void setupWebView(WebView webView) {
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setLoadWithOverviewMode(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        webView.setWebViewClient(this.webViewClient);
        setContentView(webView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        setupWebView(webView);
        loadConsentPage(webView);
    }
}
