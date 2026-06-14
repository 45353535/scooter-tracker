package io.appmetrica.analytics.impl;

import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5448tf implements Xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5068ef f78293a;

    @VisibleForTesting
    public C5448tf(@NotNull C5068ef c5068ef) {
        this.f78293a = c5068ef;
    }

    @Override // io.appmetrica.analytics.impl.Xi
    public final boolean a() {
        return this.f78293a.i();
    }

    @Override // io.appmetrica.analytics.impl.Xi
    public final void b() {
        this.f78293a.h().b();
    }

    public C5448tf() {
        this(C5468ua.k().z());
    }
}
