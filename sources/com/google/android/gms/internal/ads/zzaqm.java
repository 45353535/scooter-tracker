package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzaqm {
    public final int zza;
    public final long zzb;

    private zzaqm(int i10, long j10) {
        this.zza = i10;
        this.zzb = j10;
    }

    public static zzaqm zza(zzaev zzaevVar, zzer zzerVar) throws IOException {
        zzaevVar.zzi(zzerVar.zzi(), 0, 8);
        zzerVar.zzh(0);
        return new zzaqm(zzerVar.zzB(), zzerVar.zzA());
    }
}
