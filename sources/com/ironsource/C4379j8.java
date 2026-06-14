package com.ironsource;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: com.ironsource.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4379j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4430m8 f43408a;

    C4379j8(C4430m8 c4430m8) {
        this.f43408a = c4430m8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f43408a.handleMessageFromAd(str);
    }
}
