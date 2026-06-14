package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes7.dex */
public class k1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21327a;

    public k1(String str, int i10) {
        super(str);
        this.f21327a = i10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return String.valueOf(this.f21327a);
    }
}
