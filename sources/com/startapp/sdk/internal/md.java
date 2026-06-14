package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class md implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f64932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f64933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f64934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ od f64935d;

    public md(od odVar, String str, boolean z10, String str2) {
        this.f64935d = odVar;
        this.f64932a = str;
        this.f64933b = z10;
        this.f64934c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f64935d.a(this.f64932a, this.f64934c, this.f64933b);
    }
}
