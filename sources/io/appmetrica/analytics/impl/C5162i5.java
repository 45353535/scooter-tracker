package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5162i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X4 f77374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5112g7 f77375b;

    public C5162i5(Context context, X4 x42) {
        this(x42, C5112g7.a(context));
    }

    public final C4991bf a() {
        return new C4991bf(this.f77375b.b(this.f77374a));
    }

    public C5162i5(X4 x42, C5112g7 c5112g7) {
        this.f77374a = x42;
        this.f77375b = c5112g7;
    }
}
