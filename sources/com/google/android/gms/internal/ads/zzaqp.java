package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaqp implements zzaeu {
    private final zzer zza = new zzer(4);
    private final zzaga zzb = new zzaga(-1, -1, MimeTypes.IMAGE_WEBP);

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(4);
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        if (zzerVar.zzz() == 1380533830) {
            zzaelVar.zzj(4, false);
            zzerVar.zza(4);
            zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
            if (zzerVar.zzz() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ List zzb() {
        return k.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzb.zzc(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        return this.zzb.zzd(zzaevVar, zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzb.zze(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ zzaeu zzg() {
        return k.b(this);
    }
}
