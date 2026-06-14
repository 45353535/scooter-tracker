package com.startapp.sdk.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class yf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f65608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ag f65609c;

    public yf(ag agVar, String str, JSONObject jSONObject) {
        this.f65609c = agVar;
        this.f65607a = str;
        this.f65608b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f65609c.c(this.f65607a, this.f65608b);
    }
}
