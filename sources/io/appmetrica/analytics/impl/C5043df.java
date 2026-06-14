package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5043df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77017b;

    public C5043df(String str, String str2) {
        this.f77016a = str;
        this.f77017b = a(str2);
    }

    public final String a(String str) {
        if (str == null) {
            return this.f77016a;
        }
        return this.f77016a + str;
    }
}
