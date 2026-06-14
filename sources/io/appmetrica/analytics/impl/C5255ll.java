package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5255ll implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5533x0 f77716a;

    public C5255ll(@NonNull C5533x0 c5533x0) {
        this.f77716a = c5533x0;
    }

    @Override // io.appmetrica.analytics.impl.uo
    public final so a(@Nullable Void r32) {
        this.f77716a.getClass();
        return C5533x0.a() ? new so(this, true, "") : new so(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final so a() {
        return a((Void) null);
    }
}
