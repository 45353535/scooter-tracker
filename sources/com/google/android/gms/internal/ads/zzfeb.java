package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzfeb implements zzesf {
    protected final zzcma zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfer zzd;
    private final zzfgj zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfor zzh;
    private final zzfjj zzi;
    private ListenableFuture zzj;

    protected zzfeb(Context context, Executor executor, zzcma zzcmaVar, zzfgj zzfgjVar, zzfer zzferVar, zzfjj zzfjjVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcmaVar;
        this.zze = zzfgjVar;
        this.zzd = zzferVar;
        this.zzi = zzfjjVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcmaVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized zzdal zzg(zzfgh zzfghVar) {
        zzfdy zzfdyVar = (zzfdy) zzfghVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjx)).booleanValue()) {
            zzctu zzctuVar = new zzctu(this.zzg);
            zzdan zzdanVar = new zzdan();
            zzdanVar.zza(this.zzb);
            zzdanVar.zzb(zzfdyVar.zza);
            zzdao zzdaoVarZze = zzdanVar.zze();
            zzdhe zzdheVar = new zzdhe();
            zzfer zzferVar = this.zzd;
            Executor executor = this.zzc;
            zzdheVar.zzd(zzferVar, executor);
            zzdheVar.zzg(zzferVar, executor);
            return zzc(zzctuVar, zzdaoVarZze, zzdheVar.zzn());
        }
        zzfer zzferVarZzn = zzfer.zzn(this.zzd);
        zzdhe zzdheVar2 = new zzdhe();
        Executor executor2 = this.zzc;
        zzdheVar2.zzc(zzferVarZzn, executor2);
        zzdheVar2.zzi(zzferVarZzn, executor2);
        zzdheVar2.zzj(zzferVarZzn, executor2);
        zzdheVar2.zzk(zzferVarZzn, executor2);
        zzdheVar2.zzd(zzferVarZzn, executor2);
        zzdheVar2.zzg(zzferVarZzn, executor2);
        zzdheVar2.zzl(zzferVarZzn);
        zzctu zzctuVar2 = new zzctu(this.zzg);
        zzdan zzdanVar2 = new zzdan();
        zzdanVar2.zza(this.zzb);
        zzdanVar2.zzb(zzfdyVar.zza);
        return zzc(zzctuVar2, zzdanVar2.zze(), zzdheVar2.zzn());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // com.google.android.gms.internal.ads.zzesf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zza(com.google.android.gms.ads.internal.client.zzm r11, java.lang.String r12, com.google.android.gms.internal.ads.zzesd r13, com.google.android.gms.internal.ads.zzese r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfeb.zza(com.google.android.gms.ads.internal.client.zzm, java.lang.String, com.google.android.gms.internal.ads.zzesd, com.google.android.gms.internal.ads.zzese):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    protected abstract zzdal zzc(zzctu zzctuVar, zzdao zzdaoVar, zzdhf zzdhfVar);

    public final void zzd(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi.zzp(zzxVar);
    }

    final /* synthetic */ void zze() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzfer zzi() {
        return this.zzd;
    }

    final /* synthetic */ zzfgj zzj() {
        return this.zze;
    }

    final /* synthetic */ zzfor zzk() {
        return this.zzh;
    }

    final /* synthetic */ void zzl(ListenableFuture listenableFuture) {
        this.zzj = null;
    }
}
