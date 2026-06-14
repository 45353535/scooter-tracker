package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzag {
    public final Uri zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final zzad zzc;

    @Nullable
    public final zzy zzd;
    public final List zze;

    @Nullable
    public final String zzf;
    public final zzguf zzg;

    @Nullable
    public final Object zzh;
    public final long zzi;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    /* synthetic */ zzag(Uri uri, String str, zzad zzadVar, zzy zzyVar, List list, String str2, zzguf zzgufVar, Object obj, long j10, byte[] bArr) {
        this.zza = uri;
        int i10 = zzas.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzgufVar;
        int i11 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        if (zzgufVar.size() > 0) {
            throw null;
        }
        zzgucVar.zzi();
        this.zzh = null;
        this.zzi = -9223372036854775807L;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.zza.equals(zzagVar.zza) && this.zze.equals(zzagVar.zze) && this.zzg.equals(zzagVar.zzg);
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31)) * 31) - Long.MAX_VALUE);
    }
}
