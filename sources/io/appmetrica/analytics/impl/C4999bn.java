package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4999bn extends A4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Nn f76929g;

    public C4999bn(@NonNull String str, @NonNull String str2, @NonNull Nn nn, @NonNull uo uoVar, @NonNull R2 r22) {
        super(0, str, str2, uoVar, r22);
        this.f76929g = nn;
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(@NonNull C5155ho c5155ho) {
        String str = (String) this.f76929g.a((String) this.f75492f);
        c5155ho.f77358d.f77573a = str == null ? new byte[0] : str.getBytes();
    }

    @VisibleForTesting
    public final Nn h() {
        return this.f76929g;
    }
}
