package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes12.dex */
public abstract class K2 implements Aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76015a;

    public K2(int i10) {
        this.f76015a = i10;
    }

    @VisibleForTesting(otherwise = 4)
    public final int a() {
        return this.f76015a;
    }

    @Override // io.appmetrica.analytics.impl.Aa
    @NonNull
    public abstract /* synthetic */ On a(@Nullable Object obj);
}
