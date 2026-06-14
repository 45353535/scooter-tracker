package com.startapp.sdk.internal;

import android.content.DialogInterface;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f64540a;

    public g0(WebView webView) {
        this.f64540a = webView;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f64540a.stopLoading();
    }
}
