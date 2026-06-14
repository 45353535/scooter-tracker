package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzequ extends com.google.android.gms.ads.internal.client.zzbw implements zzdeb {
    private final Context zza;
    private final zzfff zzb;
    private final String zzc;
    private final zzerp zzd;
    private com.google.android.gms.ads.internal.client.zzr zze;
    private final zzfjj zzf;
    private final VersionInfoParcel zzg;
    private final zzdxz zzh;

    @Nullable
    private zzctx zzi;

    public zzequ(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfff zzfffVar, zzerp zzerpVar, VersionInfoParcel versionInfoParcel, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzfffVar;
        this.zze = zzrVar;
        this.zzc = str;
        this.zzd = zzerpVar;
        this.zzf = zzfffVar.zzg();
        this.zzg = versionInfoParcel;
        this.zzh = zzdxzVar;
        zzfffVar.zzi(this);
    }

    private final synchronized void zzO(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzfjj zzfjjVar = this.zzf;
        zzfjjVar.zzc(zzrVar);
        zzfjjVar.zze(this.zze.zzn);
    }

    private final synchronized boolean zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        try {
            if (zzW()) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zza;
            if (!com.google.android.gms.ads.internal.util.zzs.zzM(context) || zzmVar.zzs != null) {
                zzfkh.zzb(context, zzmVar.zzf);
                return this.zzb.zza(zzmVar, this.zzc, null, new zzeqt(this));
            }
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            zzerp zzerpVar = this.zzd;
            if (zzerpVar != null) {
                zzerpVar.zzdI(zzfkm.zzd(4, null, null));
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzW() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbjc.zzf
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzmF
            com.google.android.gms.internal.ads.zzbhc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r3.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r6.zzg
            int r3 = r3.clientJarVersion
            com.google.android.gms.internal.ads.zzbgv r4 = com.google.android.gms.internal.ads.zzbhe.zzmG
            com.google.android.gms.internal.ads.zzbhc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzequ.zzW():boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzA() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            if (zzctxVar.zzs()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzB() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzcam zzcamVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzed zzF() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null) {
            return null;
        }
        return zzctxVar.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzG(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        try {
            if (zzW()) {
                Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzi(zzgaVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(com.google.android.gms.ads.internal.client.zzeh zzehVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzbfa zzbfaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdeb
    public final synchronized void zzL() throws ExecutionException, InterruptedException {
        zzfff zzfffVar = this.zzb;
        if (zzfffVar.zzh()) {
            zzfffVar.zzc();
        } else {
            zzfffVar.zzk();
        }
    }

    final /* synthetic */ zzctx zzM() {
        return this.zzi;
    }

    final /* synthetic */ void zzN(zzctx zzctxVar) {
        this.zzi = zzctxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdtVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzd.zzo(zzdtVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzT(long j10) {
        this.zzf.zzx(j10);
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzo() == null) {
            return;
        }
        zzctxVar.zzo().zzb(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized long zzU() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzo() == null) {
            return this.zzf.zzw();
        }
        return zzctxVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzY(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzZ(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdeb
    public final synchronized void zza() {
        try {
            if (!this.zzb.zzh()) {
                this.zzb.zzj();
                return;
            }
            zzfjj zzfjjVar = this.zzf;
            com.google.android.gms.ads.internal.client.zzr zzrVarZzf = zzfjjVar.zzf();
            if (this.zzi != null && zzfjjVar.zzC()) {
                zzrVarZzf = zzfjq.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
            }
            zzO(zzrVarZzf);
            zzfjjVar.zzd(true);
            try {
                zzV(zzfjjVar.zzb());
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to refresh the banner ad.");
            }
            this.zzf.zzd(false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzb() {
        if (zzW()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzc() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbjc.zze     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzmC     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzmH     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4a
        L3a:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.zzctx r0 = r3.zzi     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L48
            r0.zzd()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzequ.zzc():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzdR(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzl(zzbkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        zzO(this.zze);
        return zzV(zzmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzf() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbjc.zzg     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzmD     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzmH     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.zzctx r0 = r3.zzi     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzdce r0 = r0.zzl()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.zza(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzequ.zzf():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzg() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbjc.zzh     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzmB     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzmH     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.zzctx r0 = r3.zzi     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzdce r0 = r0.zzl()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzequ.zzg():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzi(com.google.android.gms.ads.internal.client.zzco zzcoVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzn(zzcoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzj(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzk() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzm() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            zzctxVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzn() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            return zzfjq.zza(this.zza, Collections.singletonList(zzctxVar.zze()));
        }
        return this.zzf.zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzc(zzrVar);
        this.zze = zzrVar;
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            zzctxVar.zzb(this.zzb.zzd(), zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzp(zzbyb zzbybVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzq(zzbye zzbyeVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @Nullable
    public final synchronized String zzr() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzn() == null) {
            return null;
        }
        return zzctxVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @Nullable
    public final synchronized String zzs() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzn() == null) {
            return null;
        }
        return zzctxVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzt() {
        zzctx zzctxVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhG)).booleanValue() && (zzctxVar = this.zzi) != null) {
            return zzctxVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzu() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzco zzv() {
        return this.zzd.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk zzw() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzx(zzbhz zzbhzVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zze(zzbhzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzf(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzz(boolean z10) {
        try {
            if (zzW()) {
                Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzk(z10);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
