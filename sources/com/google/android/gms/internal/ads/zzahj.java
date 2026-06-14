package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzahj implements zzaeu {
    private zzaex zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzahh zzo;
    private zzahn zzp;
    private final zzer zza = new zzer(4);
    private final zzer zzb = new zzer(9);
    private final zzer zzc = new zzer(11);
    private final zzer zzd = new zzer();
    private final zzahk zze = new zzahk();
    private int zzg = 1;

    private final zzer zzh(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zzd;
        if (this.zzl > zzerVar.zzj()) {
            int iZzj = zzerVar.zzj();
            zzerVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzl)], 0);
        } else {
            zzerVar.zzh(0);
        }
        zzerVar.zzf(this.zzl);
        zzaevVar.zzc(zzerVar.zzi(), 0, this.zzl);
        return zzerVar;
    }

    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzerVar.zzi(), 0, 3, false);
        zzerVar.zzh(0);
        if (zzerVar.zzx() != 4607062) {
            return false;
        }
        zzaelVar.zzh(zzerVar.zzi(), 0, 2, false);
        zzerVar.zzh(0);
        if ((zzerVar.zzt() & 250) != 0) {
            return false;
        }
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        zzerVar.zzh(0);
        int iZzB = zzerVar.zzB();
        zzaevVar.zzl();
        zzael zzaelVar2 = (zzael) zzaevVar;
        zzaelVar2.zzj(iZzB, false);
        zzaelVar2.zzh(zzerVar.zzi(), 0, 4, false);
        zzerVar.zzh(0);
        return zzerVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ List zzb() {
        return k.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzf = zzaexVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzaev r17, com.google.android.gms.internal.ads.zzafv r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahj.zzd(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzafv):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        if (j10 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ zzaeu zzg() {
        return k.b(this);
    }
}
