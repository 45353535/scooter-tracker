package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class Cif implements W7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C5498vf f77433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<C5146hf> f77434b;

    public Cif(@NonNull C5498vf c5498vf, @NonNull List<C5146hf> list) {
        this.f77433a = c5498vf;
        this.f77434b = list;
    }

    @Override // io.appmetrica.analytics.impl.W7
    @NonNull
    public final List<C5146hf> a() {
        return this.f77434b;
    }

    @Override // io.appmetrica.analytics.impl.W7
    @Nullable
    public final Object b() {
        return this.f77433a;
    }

    @Nullable
    public final C5498vf c() {
        return this.f77433a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f77433a + ", candidates=" + this.f77434b + '}';
    }
}
