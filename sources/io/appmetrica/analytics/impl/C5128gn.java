package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5128gn implements Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nn f77278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f77279b;

    public C5128gn(@NonNull Nn nn, @Nullable Object obj) {
        this.f77278a = nn;
        this.f77279b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Nn
    @Nullable
    public final Object a(@Nullable Object obj) {
        return obj != this.f77278a.a(obj) ? this.f77279b : obj;
    }
}
