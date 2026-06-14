package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ValidationException;

/* JADX INFO: loaded from: classes12.dex */
public class Gn implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo f75835a;

    public Gn(@NonNull uo uoVar) {
        this.f75835a = uoVar;
    }

    @Override // io.appmetrica.analytics.impl.uo
    public final so a(@Nullable Object obj) {
        so soVarA = this.f75835a.a(obj);
        if (soVarA.f78248a) {
            return soVarA;
        }
        throw new ValidationException(soVarA.f78249b);
    }

    @NonNull
    @VisibleForTesting
    public final uo a() {
        return this.f75835a;
    }
}
