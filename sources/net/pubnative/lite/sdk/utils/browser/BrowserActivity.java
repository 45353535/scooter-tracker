package net.pubnative.lite.sdk.utils.browser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class BrowserActivity extends Activity implements BrowserView {
    private static final String KEY_CTA_URL = "KEY_CTA_URL";
    private static final String TAG = "net.pubnative.lite.sdk.utils.browser.BrowserActivity";
    protected BrowserPresenter browserPresenter;
    private View btnNavigationBackward;
    private View btnNavigationForward;
    private ProgressBar progressBar;
    private TextView tvHostname;
    private WebView webView;

    public interface WebViewCloseListener {
        void onWebViewCloseRequested();
    }

    public static /* synthetic */ boolean a(BrowserActivity browserActivity, View view) {
        BrowserPresenter browserPresenter = browserActivity.browserPresenter;
        if (browserPresenter == null) {
            return false;
        }
        browserPresenter.onCopyHostnameClicked();
        return true;
    }

    public static Intent createIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) BrowserActivity.class);
        intent.addFlags(536870912);
        intent.putExtra(KEY_CTA_URL, str);
        return intent;
    }

    private void initLogic() {
        BrowserPresenter browserPresenter;
        WebView webView = this.webView;
        if (webView != null && (browserPresenter = this.browserPresenter) != null) {
            browserPresenter.initWithView(this, webView);
        }
        String stringExtra = getIntent().getStringExtra(KEY_CTA_URL);
        BrowserPresenter browserPresenter2 = this.browserPresenter;
        if (browserPresenter2 != null) {
            browserPresenter2.loadUrl(stringExtra);
        }
    }

    private void initViews() {
        this.webView = (WebView) findViewById(R.id.webView);
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar);
        findViewById(R.id.btnClose).setOnClickListener(createCloseButtonListener());
        findViewById(R.id.btnRefresh).setOnClickListener(createRefreshButtonListener());
        View viewFindViewById = findViewById(R.id.btnBackward);
        this.btnNavigationBackward = viewFindViewById;
        viewFindViewById.setOnClickListener(createBackwardButtonListener());
        View viewFindViewById2 = findViewById(R.id.btnForward);
        this.btnNavigationForward = viewFindViewById2;
        viewFindViewById2.setOnClickListener(createForwardButtonListener());
        TextView textView = (TextView) findViewById(R.id.tvHostname);
        this.tvHostname = textView;
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: net.pubnative.lite.sdk.utils.browser.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return BrowserActivity.a(this.f95965b, view);
            }
        });
    }

    private void initWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            settings.setUseWideViewPort(true);
            settings.setSupportZoom(true);
            settings.setDomStorageEnabled(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWebViewCloseRequested() {
        finish();
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void closeBrowser() {
        finish();
    }

    protected DoubleClickPreventionListener createBackwardButtonListener() {
        return new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.3
            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                BrowserPresenter browserPresenter = BrowserActivity.this.browserPresenter;
                if (browserPresenter != null) {
                    browserPresenter.onPageNavigationBackClicked();
                }
            }
        };
    }

    protected DoubleClickPreventionListener createCloseButtonListener() {
        return new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.1
            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                BrowserActivity.this.finish();
            }
        };
    }

    protected DoubleClickPreventionListener createForwardButtonListener() {
        return new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.4
            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                BrowserPresenter browserPresenter = BrowserActivity.this.browserPresenter;
                if (browserPresenter != null) {
                    browserPresenter.onPageNavigationForwardClicked();
                }
            }
        };
    }

    protected DoubleClickPreventionListener createRefreshButtonListener() {
        return new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.2
            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                BrowserPresenter browserPresenter = BrowserActivity.this.browserPresenter;
                if (browserPresenter != null) {
                    browserPresenter.onReloadClicked();
                }
            }
        };
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void hideProgressIndicator() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void launchExternalBrowser(Intent intent) {
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            e10.printStackTrace();
            Logger.e(TAG, "The url seems to be invalid while launching external browser");
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.browserPresenter = new BrowserPresenter(new BrowserModel(new BaseWebViewClient(new WebViewCloseListener() { // from class: net.pubnative.lite.sdk.utils.browser.a
            @Override // net.pubnative.lite.sdk.utils.browser.BrowserActivity.WebViewCloseListener
            public final void onWebViewCloseRequested() {
                this.f95964a.onWebViewCloseRequested();
            }
        }), new BaseWebChromeClient(), new BrowserCookieManager(CookieManager.getInstance())), new UrlCreator(), (ClipboardManager) getApplication().getSystemService("clipboard"));
        setContentView(R.layout.activity_internal_browser);
        initViews();
        initWebView();
        initLogic();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        WebView webView = this.webView;
        if (webView != null) {
            webView.destroy();
        }
        BrowserPresenter browserPresenter = this.browserPresenter;
        if (browserPresenter != null) {
            browserPresenter.dropView();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        BrowserPresenter browserPresenter = this.browserPresenter;
        if (browserPresenter != null) {
            browserPresenter.onPause();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        BrowserPresenter browserPresenter = this.browserPresenter;
        if (browserPresenter != null) {
            browserPresenter.onResume();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void redirectToExternalApp(Intent intent) {
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            e10.printStackTrace();
            Logger.e(TAG, "The url seems to be invalid while redirecting to external app");
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void setPageNavigationBackEnabled(boolean z10) {
        View view = this.btnNavigationBackward;
        if (view != null) {
            view.setEnabled(z10);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void setPageNavigationForwardEnabled(boolean z10) {
        View view = this.btnNavigationForward;
        if (view != null) {
            view.setEnabled(z10);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void showConnectionSecure(boolean z10) {
        int i10 = z10 ? R.drawable.browser_secure_connection : 0;
        TextView textView = this.tvHostname;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i10, 0, 0, 0);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void showHostname(String str) {
        TextView textView = this.tvHostname;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void showProgressIndicator() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void updateProgressIndicator(int i10) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(i10);
        }
    }
}
