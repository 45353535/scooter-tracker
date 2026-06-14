package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes10.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f45241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f45242b = false;

    r(s sVar) {
        this.f45241a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f45242b) {
            return "";
        }
        this.f45242b = true;
        return this.f45241a.b();
    }
}
