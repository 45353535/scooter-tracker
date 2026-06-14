package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public class Ln implements Li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76100c = 0;

    public Ln(int i10, int i11) {
        this.f76098a = i10;
        this.f76099b = i11;
    }

    public final int a() {
        return this.f76099b;
    }

    public final boolean b() {
        int i10 = this.f76100c;
        this.f76100c = i10 + 1;
        return i10 < this.f76098a;
    }

    public final void c() {
        this.f76100c = 0;
    }
}
