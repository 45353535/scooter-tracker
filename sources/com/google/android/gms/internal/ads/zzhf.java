package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhf {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;

    @Nullable
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzal.zzb("media3.datasource");
    }

    /* synthetic */ zzhf(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j11, j12, null, i11, null);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        long j10 = this.zze;
        int length2 = String.valueOf(j10).length();
        long j11 = this.zzf;
        int length3 = String.valueOf(j11).length();
        int i10 = this.zzg;
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i10).length() + 1);
        sb2.append("DataSpec[");
        sb2.append("GET");
        sb2.append(" ");
        sb2.append(string);
        sb2.append(", ");
        sb2.append(j10);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append(", null, ");
        sb2.append(i10);
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    public final boolean zza(int i10) {
        return (this.zzg & i10) == i10;
    }

    public final zzhe zzb() {
        return new zzhe(this, null);
    }

    private zzhf(Uri uri, long j10, int i10, @Nullable byte[] bArr, Map map, long j11, long j12, @Nullable String str, int i11, @Nullable Object obj) {
        boolean z10 = false;
        boolean z11 = j11 >= 0;
        zzgrc.zza(z11);
        zzgrc.zza(z11);
        if (j12 > 0) {
            z10 = true;
        } else if (j12 == -1) {
            j12 = -1;
            z10 = true;
        }
        zzgrc.zza(z10);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.zze = j11;
        this.zzf = j12;
        this.zzg = i11;
    }

    @Deprecated
    public zzhf(Uri uri, long j10, long j11, @Nullable String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, null, 0, null);
    }
}
