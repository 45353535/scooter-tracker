package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5171ie implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77432a;

    public C5171ie(@NonNull String str) {
        this.f77432a = str;
    }

    @Override // io.appmetrica.analytics.impl.uo
    public final so a(@Nullable Object obj) {
        if (obj != null) {
            return new so(this, true, "");
        }
        return new so(this, false, this.f77432a + " is null.");
    }

    @NonNull
    public final String a() {
        return this.f77432a;
    }
}
