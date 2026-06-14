package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzapz {
    public final int zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzapz(int i10, @Nullable String str, int i11, @Nullable List list, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = i11;
        this.zzd = list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i10 = this.zzc;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
