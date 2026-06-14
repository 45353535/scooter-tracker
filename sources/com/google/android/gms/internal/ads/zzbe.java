package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbe {
    public static final Object zza = new Object();
    private static final zzak zzp;

    @Nullable
    @Deprecated
    public Object zzc;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;

    @Nullable
    public zzaf zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;
    public Object zzb = zza;
    public zzak zzd = zzp;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("androidx.media3.common.Timeline");
        zzzVar.zzb(Uri.EMPTY);
        zzp = zzzVar.zzc();
        String str = zzfj.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbe.class.equals(obj.getClass())) {
            zzbe zzbeVar = (zzbe) obj;
            if (Objects.equals(this.zzb, zzbeVar.zzb) && Objects.equals(this.zzd, zzbeVar.zzd) && Objects.equals(this.zzj, zzbeVar.zzj) && this.zze == zzbeVar.zze && this.zzf == zzbeVar.zzf && this.zzg == zzbeVar.zzg && this.zzh == zzbeVar.zzh && this.zzi == zzbeVar.zzi && this.zzk == zzbeVar.zzk && this.zzm == zzbeVar.zzm && this.zzn == zzbeVar.zzn && this.zzo == zzbeVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zzb.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.zzd.hashCode();
        zzaf zzafVar = this.zzj;
        int iHashCode2 = ((iHashCode * 961) + (zzafVar == null ? 0 : zzafVar.hashCode())) * 31;
        long j10 = this.zze;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.zzf;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.zzg;
        int i12 = ((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j13 = this.zzm;
        return ((((((i12 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzbe zza(Object obj, @Nullable zzak zzakVar, @Nullable Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, @Nullable zzaf zzafVar, long j13, long j14, int i10, int i11, long j15) {
        this.zzb = obj;
        if (zzakVar == null) {
            zzakVar = zzp;
        }
        this.zzd = zzakVar;
        this.zzc = null;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z10;
        this.zzi = z11;
        this.zzj = zzafVar;
        this.zzl = 0L;
        this.zzm = j14;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}
