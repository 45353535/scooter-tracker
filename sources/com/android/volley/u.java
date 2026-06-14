package com.android.volley;

/* JADX INFO: loaded from: classes5.dex */
public class u extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f7586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7587c;

    public u() {
        this.f7586b = null;
    }

    public long d() {
        return this.f7587c;
    }

    void g(long j10) {
        this.f7587c = j10;
    }

    public u(k kVar) {
        this.f7586b = kVar;
    }

    public u(String str) {
        super(str);
        this.f7586b = null;
    }

    public u(Throwable th2) {
        super(th2);
        this.f7586b = null;
    }
}
