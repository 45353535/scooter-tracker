package com.google.android.gms.internal.ads;

import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzgkb {
    private final zzatr zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzgkb(zzatr zzatrVar, long j10, long j11, String str) {
        this.zza = zzatrVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = str;
    }

    static /* synthetic */ zzgkb zza(zzatr zzatrVar, byte[] bArr) throws zzatt, zzatp {
        zzatrVar.zza();
        zzatrVar.zzb(bArr);
        List list = (List) zzatrVar.zzc(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzatrVar.zzd(jLongValue, Optional.empty());
        return new zzgkb(zzatrVar, jLongValue2, jLongValue3, "3.825731049.".concat(zzgca.zza(zzatu.zza(), false)));
    }

    final /* synthetic */ String zzb(Map map) {
        return zzgca.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    final /* synthetic */ void zzc(Map map) throws zzatt, zzatp {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    final /* synthetic */ String zzd() {
        return this.zzd;
    }
}
