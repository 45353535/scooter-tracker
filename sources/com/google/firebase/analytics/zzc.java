package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
final class zzc implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ FirebaseAnalytics f31761b;

    zzc(FirebaseAnalytics firebaseAnalytics) {
        Objects.requireNonNull(firebaseAnalytics);
        this.f31761b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return this.f31761b.a().zzH();
    }
}
