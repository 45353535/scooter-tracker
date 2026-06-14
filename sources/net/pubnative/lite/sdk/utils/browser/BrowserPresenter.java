package net.pubnative.lite.sdk.utils.browser;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.browser.BrowserModel;

/* JADX INFO: loaded from: classes3.dex */
public class BrowserPresenter {
    private static final String TAG = "net.pubnative.lite.sdk.utils.browser.BrowserPresenter";
    private final BrowserModel browserModel;
    private final BrowserModel.Callback browserModelCallback;
    private BrowserView browserView;
    private final ClipboardManager clipboardManager;
    private final UrlCreator urlCreator;

    BrowserPresenter(BrowserModel browserModel, UrlCreator urlCreator, ClipboardManager clipboardManager) {
        BrowserModel.Callback callback = new BrowserModel.Callback() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserPresenter.1
            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            public void onGeneralError(int i10, String str, String str2) {
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            @TargetApi(23)
            public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            public void onPageNavigationStackChanged(boolean z10, boolean z11) {
                BrowserPresenter.this.updateNavigationUiControls(z10, z11);
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            public void onProgressChanged(int i10) {
                BrowserView browserView = BrowserPresenter.this.browserView;
                if (browserView != null && i10 >= 0 && i10 <= 100) {
                    if (i10 == 100) {
                        browserView.hideProgressIndicator();
                    } else {
                        browserView.updateProgressIndicator(i10);
                        BrowserPresenter.this.browserView.showProgressIndicator();
                    }
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            @TargetApi(26)
            public void onRenderProcessGone() {
                BrowserView browserView = BrowserPresenter.this.browserView;
                if (browserView != null) {
                    browserView.closeBrowser();
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            public void onUrlLoadingStarted(String str) {
                BrowserPresenter.this.updateHostnameAndSchemeControls(str);
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            public boolean shouldOverrideUrlLoading(String str) {
                BrowserPresenter.this.loadUrl(str);
                return true;
            }
        };
        this.browserModelCallback = callback;
        if (browserModel == null) {
            throw new NullPointerException("browserModel can not be null");
        }
        this.browserModel = browserModel;
        if (urlCreator == null) {
            throw new NullPointerException("urlCreator can not be null");
        }
        this.urlCreator = urlCreator;
        if (clipboardManager == null) {
            throw new NullPointerException("clipboardManager can not be null");
        }
        this.clipboardManager = clipboardManager;
        browserModel.setBrowserModelCallback(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHostnameAndSchemeControls(String str) {
        if (this.browserView == null) {
            return;
        }
        this.browserView.showHostname(this.urlCreator.extractHostname(str));
        this.browserView.showConnectionSecure(this.urlCreator.isSecureScheme(this.urlCreator.extractScheme(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigationUiControls(boolean z10, boolean z11) {
        BrowserView browserView = this.browserView;
        if (browserView == null) {
            return;
        }
        browserView.setPageNavigationBackEnabled(z10);
        this.browserView.setPageNavigationForwardEnabled(z11);
    }

    public void dropView() {
        this.browserView = null;
    }

    public void initWithView(BrowserView browserView, WebView webView) {
        if (browserView == null || webView == null) {
            return;
        }
        this.browserView = browserView;
        this.browserModel.setWebView(webView);
    }

    public void loadUrl(String str) {
        this.browserModel.load(str);
    }

    public void onCopyHostnameClicked() {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText(null, this.browserModel.getCurrentUrl()));
        Logger.d(TAG, "Link copied");
    }

    public void onPageNavigationBackClicked() {
        this.browserModel.goBack();
    }

    public void onPageNavigationForwardClicked() {
        this.browserModel.goForward();
    }

    public void onPause() {
        this.browserModel.pause();
    }

    public void onReloadClicked() {
        this.browserModel.reload();
    }

    public void onResume() {
        this.browserModel.resume();
    }
}
