package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f75448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f75450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f75451g;

    public y(String str, boolean z10, String str2, boolean z11, int i10, byte[] bArr, Map map) {
        this.f75445a = str;
        this.f75446b = z10;
        this.f75447c = str2;
        this.f75448d = z11;
        this.f75449e = i10;
        this.f75450f = bArr;
        this.f75451g = map;
    }

    public final String toString() {
        return "RequestResult(type='" + this.f75445a + "', isCompleted=" + this.f75446b + ", url=" + this.f75447c + ", responseCodeIsValid=" + this.f75448d + ", responseCode=" + this.f75449e + ", responseBody=" + this.f75450f + ", responseHeaders=" + this.f75451g + ')';
    }
}
