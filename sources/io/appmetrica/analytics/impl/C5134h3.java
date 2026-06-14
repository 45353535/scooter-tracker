package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5134h3 extends U2 {
    public C5134h3(int i10, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i10, str, publicLogger);
    }

    @VisibleForTesting(otherwise = 3)
    public final int b() {
        return this.f76544a;
    }

    @Override // io.appmetrica.analytics.impl.Nn
    @Nullable
    public final byte[] a(@Nullable byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i10 = this.f76544a;
            if (length > i10) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, i10);
                this.f76546c.warning("\"%s\" %s exceeded limit of %d bytes", this.f76545b, bArr, Integer.valueOf(this.f76544a));
                return bArr2;
            }
        }
        return bArr;
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    public final String a() {
        return this.f76545b;
    }
}
