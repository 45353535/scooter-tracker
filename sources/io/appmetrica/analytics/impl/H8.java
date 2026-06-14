package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class H8 implements vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M8 f75844a;

    public H8() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.vo
    @NonNull
    public final byte[] a(@NonNull S8 s82, @NonNull C5351ph c5351ph) {
        String str = s82.f76409b;
        return ((L8) this.f75844a.f76120a.a(s82.f76422o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public H8(M8 m82) {
        this.f75844a = m82;
    }
}
