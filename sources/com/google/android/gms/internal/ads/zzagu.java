package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzagu implements zzagq {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzagu(int i10, int i11, int i12, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzagu zzb(zzer zzerVar) {
        int iZzC = zzerVar.zzC();
        zzerVar.zzk(8);
        int iZzC2 = zzerVar.zzC();
        int iZzC3 = zzerVar.zzC();
        zzerVar.zzk(4);
        int iZzC4 = zzerVar.zzC();
        zzerVar.zzk(12);
        return new zzagu(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final int zza() {
        return 1751742049;
    }
}
