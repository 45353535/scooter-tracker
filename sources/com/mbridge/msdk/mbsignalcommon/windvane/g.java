package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f49831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object f49832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected WindVaneWebView f49833c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f49831a = context;
        this.f49833c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f49832b = obj;
        this.f49833c = windVaneWebView;
    }
}
