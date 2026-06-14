package com.bytedance.sdk.component.qdl;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class tvp {
    boolean exu;
    rq jpc;
    wd mml;
    boolean mo;
    Context mzz;
    WebView qdl;
    fs tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    qdl f16667ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    boolean f16668wd;
    String lnr = "IESJSBridge";
    String to = "host";
    final Set<String> rq = new LinkedHashSet();
    final Set<String> fs = new LinkedHashSet();

    tvp(WebView webView) {
        this.qdl = webView;
    }

    public tvp qdl(qdl qdlVar) {
        this.f16667ud = qdlVar;
        return this;
    }

    public tvp ud(boolean z10) {
        this.f16668wd = z10;
        return this;
    }

    private void ud() {
        if ((this.qdl == null && !this.exu && this.f16667ud == null) || ((TextUtils.isEmpty(this.lnr) && this.qdl != null) || this.mml == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public tvp qdl(String str) {
        this.lnr = str;
        return this;
    }

    public tvp qdl(to toVar) {
        this.mml = wd.qdl(toVar);
        return this;
    }

    public tvp qdl(boolean z10) {
        this.mo = z10;
        return this;
    }

    public bjy qdl() {
        ud();
        return new bjy(this);
    }

    tvp() {
    }
}
