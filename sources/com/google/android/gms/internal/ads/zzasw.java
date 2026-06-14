package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzasw {
    private final int zza;
    private final List zzb;
    private final int zzc;

    @Nullable
    private final InputStream zzd;

    public zzasw(int i10, List list, int i11, InputStream inputStream) {
        this.zza = i10;
        this.zzb = list;
        this.zzc = i11;
        this.zzd = inputStream;
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return DesugarCollections.unmodifiableList(this.zzb);
    }

    public final int zzc() {
        return this.zzc;
    }

    @Nullable
    public final InputStream zzd() {
        InputStream inputStream = this.zzd;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }
}
