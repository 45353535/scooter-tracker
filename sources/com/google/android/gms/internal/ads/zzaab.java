package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaab {
    public final zzbg zza;
    public final int[] zzb;

    public zzaab(zzbg zzbgVar, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzee.zzf("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbgVar;
        this.zzb = iArr;
    }
}
