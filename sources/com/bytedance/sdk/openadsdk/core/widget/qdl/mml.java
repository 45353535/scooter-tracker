package com.bytedance.sdk.openadsdk.core.widget.qdl;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.mml.fs;
import com.bytedance.sdk.openadsdk.utils.exc;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends WebChromeClient {
    private static final String qdl = WebChromeClient.class.getSimpleName();
    private fs lnr;
    private com.bytedance.sdk.openadsdk.common.mml mml;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final hkc f17568ud;

    public mml(hkc hkcVar) {
        this.f17568ud = hkcVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (!TextUtils.isEmpty(str)) {
            qdl(str);
        }
        super.onConsoleMessage(str, i10, str2);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        fs fsVar = this.lnr;
        if (fsVar != null) {
            fsVar.qdl(webView, i10);
        }
        com.bytedance.sdk.openadsdk.common.mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.qdl(webView, i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    private boolean qdl(@NonNull final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                rdp.lnr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.qdl.mml.1
                    @Override // java.lang.Runnable
                    public void run() {
                        exc.qdl(Uri.parse(str), mml.this.f17568ud);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public mml(hkc hkcVar, fs fsVar, com.bytedance.sdk.openadsdk.common.mml mmlVar) {
        this(hkcVar, fsVar);
        this.mml = mmlVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !qdl(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    public mml(hkc hkcVar, fs fsVar) {
        this.f17568ud = hkcVar;
        this.lnr = fsVar;
    }
}
