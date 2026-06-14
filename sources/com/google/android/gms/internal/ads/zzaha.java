package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaha implements zzaeu {
    private final zzer zza = new zzer(4);
    private final zzaga zzb = new zzaga(-1, -1, MimeTypes.IMAGE_AVIF);

    private final boolean zzh(zzaev zzaevVar, int i10) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(4);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, 4, false);
        return zzerVar.zzz() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        ((zzael) zzaevVar).zzj(4, false);
        return zzh(zzaevVar, 1718909296) && zzh(zzaevVar, 1635150182);
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
