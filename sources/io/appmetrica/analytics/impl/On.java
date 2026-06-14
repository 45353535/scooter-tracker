package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class On implements InterfaceC5185j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f76209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC5185j3 f76210b;

    public On(@Nullable Object obj, @NonNull InterfaceC5185j3 interfaceC5185j3) {
        this.f76209a = obj;
        this.f76210b = interfaceC5185j3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5185j3
    public final int getBytesTruncated() {
        return this.f76210b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "TrimmingResult{value=" + this.f76209a + ", metaInfo=" + this.f76210b + '}';
    }
}
