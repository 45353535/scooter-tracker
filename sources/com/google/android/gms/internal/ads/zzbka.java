package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbka extends zzbkk {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze = new ArrayList();
    private final List zzf = new ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        zzc = iRgb;
        zza = Color.rgb(204, 204, 204);
        zzb = iRgb;
    }

    public zzbka(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11, boolean z10) {
        this.zzd = str;
        for (int i12 = 0; i12 < list.size(); i12++) {
            zzbkd zzbkdVar = (zzbkd) list.get(i12);
            this.zze.add(zzbkdVar);
            this.zzf.add(zzbkdVar);
        }
        this.zzg = num != null ? num.intValue() : zza;
        this.zzh = num2 != null ? num2.intValue() : zzb;
        this.zzi = num3 != null ? num3.intValue() : 12;
        this.zzj = i10;
        this.zzk = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final String zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final List zzc() {
        return this.zzf;
    }

    public final List zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzg;
    }

    public final int zzf() {
        return this.zzh;
    }

    public final int zzg() {
        return this.zzi;
    }

    public final int zzh() {
        return this.zzj;
    }

    public final int zzi() {
        return this.zzk;
    }
}
