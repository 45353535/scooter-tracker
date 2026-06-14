package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5093fe implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77163a;

    public C5093fe(@NonNull String str) {
        this.f77163a = str;
    }

    @Override // io.appmetrica.analytics.impl.uo
    public final so a(@Nullable Collection<Object> collection) {
        if (!no.a((Collection) collection)) {
            return new so(this, true, "");
        }
        return new so(this, false, this.f77163a + " is null or empty.");
    }
}
