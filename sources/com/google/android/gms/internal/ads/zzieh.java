package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzieh extends zzief {
    zzieh() {
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ void zza(Object obj, int i10, long j10) {
        ((zzieg) obj).zzk(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ void zzb(Object obj, int i10, int i11) {
        ((zzieg) obj).zzk((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ void zzc(Object obj, int i10, long j10) {
        ((zzieg) obj).zzk((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, zzian zzianVar) {
        ((zzieg) obj).zzk((i10 << 3) | 2, zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ void zze(Object obj, int i10, Object obj2) {
        ((zzieg) obj).zzk((i10 << 3) | 3, (zzieg) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* synthetic */ Object zzf() {
        return zzieg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* synthetic */ Object zzg(Object obj) {
        zzieg zziegVar = (zzieg) obj;
        zziegVar.zzd();
        return zziegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        if (zziegVar != zzieg.zza()) {
            return zziegVar;
        }
        zzieg zziegVarZzb = zzieg.zzb();
        zzibrVar.zzt = zziegVarZzb;
        return zziegVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzibr) obj).zzt = (zzieg) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final void zzj(Object obj) {
        ((zzibr) obj).zzt.zzd();
    }
}
