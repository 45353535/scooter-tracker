package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes8.dex */
final class zzbfu extends PushbackInputStream implements AutoCloseable {
    final /* synthetic */ zzbfx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbfu(zzbfx zzbfxVar, InputStream inputStream, int i10) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbfxVar);
        this.zza = zzbfxVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zza.zzc.zzb();
        super.close();
    }
}
