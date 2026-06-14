package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
final class zzema implements zzdmc {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfir zzd;
    private final zzcjl zze;
    private final zzfjk zzf;
    private final zzbok zzg;
    private final boolean zzh;
    private final zzejf zzi;
    private final zzdxz zzj;

    zzema(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfir zzfirVar, zzcjl zzcjlVar, zzfjk zzfjkVar, boolean z10, zzbok zzbokVar, zzejf zzejfVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfirVar;
        this.zze = zzcjlVar;
        this.zzf = zzfjkVar;
        this.zzg = zzbokVar;
        this.zzh = z10;
        this.zzi = zzejfVar;
        this.zzj = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z10, Context context, zzdbs zzdbsVar) {
        zzdko zzdkoVar = (zzdko) zzgzo.zzt(this.zzc);
        zzcjl zzcjlVar = this.zze;
        zzcjlVar.zzag(true);
        boolean z11 = this.zzh;
        boolean zZzc = z11 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzN = com.google.android.gms.ads.internal.util.zzs.zzN(this.zza);
        boolean z12 = z11 && this.zzg.zzd();
        float fZze = z11 ? this.zzg.zze() : 0.0f;
        zzfir zzfirVar = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, zZzN, z12, fZze, -1, z10, zzfirVar.zzO, false);
        if (zzdbsVar != null) {
            zzdbsVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdlr zzdlrVarZzj = zzdkoVar.zzj();
        int i10 = zzfirVar.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzfirVar.zzB;
        zzfiw zzfiwVar = zzfirVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdlrVarZzj, null, zzcjlVar, i10, versionInfoParcel, str, zzlVar, zzfiwVar.zzb, zzfiwVar.zza, this.zzf.zzg, zzdbsVar, zzfirVar.zzb() ? this.zzi : null, zzcjlVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zzd;
    }
}
