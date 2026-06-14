package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfio extends zzcai {
    private final zzfie zza;
    private final zzfhv zzb;
    private final zzfjd zzc;

    @Nullable
    private zzdtz zzd;
    private boolean zze = false;

    public zzfio(zzfie zzfieVar, zzfhv zzfhvVar, zzfjd zzfjdVar) {
        this.zza = zzfieVar;
        this.zzb = zzfhvVar;
        this.zzc = zzfjdVar;
    }

    private final synchronized boolean zzy() {
        zzdtz zzdtzVar = this.zzd;
        if (zzdtzVar != null) {
            if (!zzdtzVar.zze()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzgx)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzcaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzcan r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzgv     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L62
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzcdu r2 = com.google.android.gms.ads.internal.zzt.zzh()     // Catch: java.lang.Throwable -> L20
            r2.zzg(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzgx     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzfhx r0 = new com.google.android.gms.internal.ads.zzfhx     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfie r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzm r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfim r3 = new com.google.android.gms.internal.ads.zzfim     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zza(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfio.zzb(com.google.android.gms.internal.ads.zzcan):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzc() throws RemoteException {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzd(zzcam zzcamVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzcamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final boolean zze() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzh() throws RemoteException {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    @Nullable
    public final synchronized String zzl() throws RemoteException {
        zzdtz zzdtzVar = this.zzd;
        if (zzdtzVar == null || zzdtzVar.zzn() == null) {
            return null;
        }
        return zzdtzVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzn(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzcbVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfin(this, zzcbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final Bundle zzo() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdtz zzdtzVar = this.zzd;
        return zzdtzVar != null ? zzdtzVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzp(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException {
        try {
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (iObjectWrapper != null) {
                    Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                    if (objUnwrap instanceof Activity) {
                        activity = (Activity) objUnwrap;
                    }
                }
                this.zzd.zza(this.zze, activity);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzq(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzr(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final boolean zzs() {
        zzdtz zzdtzVar = this.zzd;
        return zzdtzVar != null && zzdtzVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzt() throws RemoteException {
        zzdtz zzdtzVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhG)).booleanValue() && (zzdtzVar = this.zzd) != null) {
            return zzdtzVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzu(zzcah zzcahVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzp(zzcahVar);
    }

    final /* synthetic */ zzfjd zzv() {
        return this.zzc;
    }

    final /* synthetic */ zzdtz zzw() {
        return this.zzd;
    }

    final /* synthetic */ void zzx(zzdtz zzdtzVar) {
        this.zzd = zzdtzVar;
    }
}
