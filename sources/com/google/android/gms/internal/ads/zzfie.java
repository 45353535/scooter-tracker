package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfie implements zzesf {
    private final Context zza;
    private final Executor zzb;
    private final zzcma zzc;
    private final zzfhv zzd;
    private final zzfgj zze;
    private final zzfjd zzf;
    private final zzfor zzg;
    private final zzfjj zzh;
    private ListenableFuture zzi;

    public zzfie(Context context, Executor executor, zzcma zzcmaVar, zzfgj zzfgjVar, zzfhv zzfhvVar, zzfjj zzfjjVar, zzfjd zzfjdVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmaVar;
        this.zze = zzfgjVar;
        this.zzd = zzfhvVar;
        this.zzh = zzfjjVar;
        this.zzf = zzfjdVar;
        this.zzg = zzcmaVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdud zze(zzfgh zzfghVar) {
        zzdud zzdudVarZzp = this.zzc.zzp();
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(this.zza);
        zzdanVar.zzb(((zzfid) zzfghVar).zza);
        zzdanVar.zzf(this.zzf);
        zzdudVarZzp.zzd(zzdanVar.zze());
        zzdudVarZzp.zze(new zzdhe().zzn());
        return zzdudVarZzp;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    @Override // com.google.android.gms.internal.ads.zzesf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm r12, java.lang.String r13, com.google.android.gms.internal.ads.zzesd r14, com.google.android.gms.internal.ads.zzese r15) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfie.zza(com.google.android.gms.ads.internal.client.zzm, java.lang.String, com.google.android.gms.internal.ads.zzesd, com.google.android.gms.internal.ads.zzese):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        throw null;
    }

    final /* synthetic */ void zzc() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzfhv zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzfgj zzh() {
        return this.zze;
    }

    final /* synthetic */ zzfor zzi() {
        return this.zzg;
    }

    final void zzj(int i10) {
        this.zzh.zzj().zza(i10);
    }
}
