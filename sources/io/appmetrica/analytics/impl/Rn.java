package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* JADX INFO: loaded from: classes12.dex */
public final class Rn implements vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M8 f76379a;

    public Rn() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.vo
    @NonNull
    public final byte[] a(@NonNull S8 s82, @NonNull C5351ph c5351ph) {
        byte[] bArrDecompressBase64GzipAsBytes = new byte[0];
        try {
            bArrDecompressBase64GzipAsBytes = Base64Utils.decompressBase64GzipAsBytes(s82.f76409b);
        } catch (Throwable unused) {
        }
        byte[] bArrA = ((L8) this.f76379a.f76120a.a(s82.f76422o)).a(bArrDecompressBase64GzipAsBytes);
        return bArrA == null ? new byte[0] : bArrA;
    }

    public Rn(M8 m82) {
        this.f76379a = m82;
    }

    @NonNull
    @VisibleForTesting
    public final M8 a() {
        return this.f76379a;
    }
}
