package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbep implements Comparator {
    public zzbep(zzbeq zzbeqVar) {
        Objects.requireNonNull(zzbeqVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbef zzbefVar = (zzbef) obj;
        zzbef zzbefVar2 = (zzbef) obj2;
        if (zzbefVar.zzb() < zzbefVar2.zzb()) {
            return -1;
        }
        if (zzbefVar.zzb() > zzbefVar2.zzb()) {
            return 1;
        }
        if (zzbefVar.zza() < zzbefVar2.zza()) {
            return -1;
        }
        if (zzbefVar.zza() > zzbefVar2.zza()) {
            return 1;
        }
        float fZzd = (zzbefVar.zzd() - zzbefVar.zzb()) * (zzbefVar.zzc() - zzbefVar.zza());
        float fZzd2 = (zzbefVar2.zzd() - zzbefVar2.zzb()) * (zzbefVar2.zzc() - zzbefVar2.zza());
        if (fZzd > fZzd2) {
            return -1;
        }
        return fZzd < fZzd2 ? 1 : 0;
    }
}
