package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzik {
    private final Map zza;

    public zzik() {
        this.zza = new HashMap();
    }

    public final zzik zza(String str, int i10) {
        this.zza.put(str, Integer.valueOf(i10));
        return this;
    }

    public final zzik zzb(String str, long j10) {
        this.zza.put(str, Long.valueOf(j10));
        return this;
    }

    public final zzik zzc(String str, float f10) {
        this.zza.put(str, Float.valueOf(f10));
        return this;
    }

    public final zzik zzd(String str, @Nullable String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzik zze(String str, @Nullable ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.zza.put(str, null);
            return this;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        this.zza.put(str, byteBufferAllocate);
        return this;
    }

    public final zzik zzf(String str) {
        this.zza.remove(str);
        return this;
    }

    public final zzil zzg() {
        return new zzil(this.zza, null);
    }
}
