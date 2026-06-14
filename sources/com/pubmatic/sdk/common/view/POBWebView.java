package com.pubmatic.sdk.common.view;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;

/* JADX INFO: loaded from: classes11.dex */
public class POBWebView extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebViewBackPress f62599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnFocusChangedListener f62600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MutableContextWrapper f62601c;

    public interface OnFocusChangedListener {
        void onFocusChanged(boolean z10);
    }

    public interface WebViewBackPress {
        void onBackPress();
    }

    protected POBWebView(@NonNull Context context) {
        super(context);
        setBackgroundColor(0);
    }

    @Nullable
    public static POBWebView createInstance(@NonNull Context context) {
        POBWebView pOBWebView;
        MutableContextWrapper mutableContextWrapper;
        try {
            mutableContextWrapper = new MutableContextWrapper(context);
            pOBWebView = new POBWebView(mutableContextWrapper);
        } catch (Exception unused) {
            pOBWebView = null;
        }
        try {
            pOBWebView.f62601c = mutableContextWrapper;
            return pOBWebView;
        } catch (Exception unused2) {
            POBLog.error("POBWebView", "Unable to instantiate Web View", new Object[0]);
            return pOBWebView;
        }
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (i10 == 4) {
                WebViewBackPress webViewBackPress = this.f62599a;
                if (webViewBackPress != null) {
                    webViewBackPress.onBackPress();
                    return true;
                }
            } else {
                POBLog.debug("POBWebView", "default case, keyCode:" + i10, new Object[0]);
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        POBLog.debug("POBWebView", "hasWindowFocus :" + z10, new Object[0]);
        OnFocusChangedListener onFocusChangedListener = this.f62600b;
        if (onFocusChangedListener != null) {
            onFocusChangedListener.onFocusChanged(z10);
        }
    }

    public void setBaseContext(@NonNull Context context) {
        MutableContextWrapper mutableContextWrapper = this.f62601c;
        if (mutableContextWrapper != null) {
            mutableContextWrapper.setBaseContext(context);
        }
    }

    public void setOnfocusChangedListener(@Nullable OnFocusChangedListener onFocusChangedListener) {
        this.f62600b = onFocusChangedListener;
    }

    public void setWebViewBackPress(@Nullable WebViewBackPress webViewBackPress) {
        this.f62599a = webViewBackPress;
    }
}
