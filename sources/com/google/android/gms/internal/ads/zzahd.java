package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzahd implements zzaef {
    private final zzafh zza;
    private final int zzb;
    private final zzafb zzc = new zzafb();

    /* synthetic */ zzahd(zzafh zzafhVar, int i10, byte[] bArr) {
        this.zza = zzafhVar;
        this.zzb = i10;
    }

    private final long zzc(zzaev zzaevVar) throws IOException {
        while (zzaevVar.zzm() < zzaevVar.zzo() - 6) {
            zzafh zzafhVar = this.zza;
            int i10 = this.zzb;
            zzafb zzafbVar = this.zzc;
            long jZzm = zzaevVar.zzm();
            zzer zzerVar = new zzer(17);
            zzaevVar.zzi(zzerVar.zzi(), 0, 2);
            if (zzerVar.zzo() != i10) {
                zzaevVar.zzl();
                zzaevVar.zzk((int) (jZzm - zzaevVar.zzn()));
            } else {
                zzerVar.zzf(zzaey.zzb(zzaevVar, zzerVar.zzi(), 2, 15) + 2);
                zzaevVar.zzl();
                zzaevVar.zzk((int) (jZzm - zzaevVar.zzn()));
                if (zzafc.zza(zzerVar, zzafhVar, i10, zzafbVar)) {
                    break;
                }
            }
            zzaevVar.zzk(1);
        }
        if (zzaevVar.zzm() < zzaevVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzaevVar.zzk((int) (zzaevVar.zzo() - zzaevVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaee zza(zzaev zzaevVar, long j10) throws IOException {
        long jZzn = zzaevVar.zzn();
        long jZzc = zzc(zzaevVar);
        long jZzm = zzaevVar.zzm();
        zzaevVar.zzk(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzaevVar);
        return (jZzc > j10 || jZzc2 <= j10) ? jZzc2 <= j10 ? zzaee.zzb(jZzc2, zzaevVar.zzm()) : zzaee.zza(jZzc, jZzn) : zzaee.zzc(jZzm);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public /* synthetic */ void zzb() {
        j.a(this);
    }
}
