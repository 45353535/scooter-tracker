package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
final class zzgia implements zzgdv {
    private final zzika zza;
    private final zzika zzb;
    private final zzika zzc;
    private final boolean zzd;
    private final long zze;

    zzgia(zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, boolean z10, long j10) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = zzikaVar3;
        this.zzd = z10;
        this.zze = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final String zza() {
        return ((zzgjf) this.zzb.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zzb() {
        if (this.zzd) {
            return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzg.zzw(((zzgis) this.zza.zzb()).zzb()), Throwable.class, zzghw.zza, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzghx
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzj((zzgir) obj);
                }
            }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzghy
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzk((Boolean) obj);
                }
            }, zzhaf.zza());
        }
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzg.zzw(((zzgkx) this.zzc.zzb()).zza()), Throwable.class, zzghz.zza, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzghu
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh((Boolean) obj);
            }
        }, zzhaf.zza());
        zzgzgVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzghv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        }, zzhaf.zza());
        return zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zzc(Context context) {
        return ((zzgjf) this.zzb.zzb()).zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        return ((zzgjf) this.zzb.zzb()).zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        return ((zzgjf) this.zzb.zzb()).zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final void zzf(InputEvent inputEvent) {
        ((zzgjf) this.zzb.zzb()).zzf(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final int zzg() {
        return ((zzgjf) this.zzb.zzb()).zzg();
    }

    final /* synthetic */ ListenableFuture zzh(Boolean bool) {
        return ((zzgjf) this.zzb.zzb()).zzb();
    }

    final /* synthetic */ void zzi() {
        ((zzgis) this.zza.zzb()).zza(this.zze);
    }

    final /* synthetic */ ListenableFuture zzj(zzgir zzgirVar) {
        return ((zzgkx) this.zzc.zzb()).zza();
    }

    final /* synthetic */ ListenableFuture zzk(Boolean bool) {
        return ((zzgjf) this.zzb.zzb()).zzb();
    }
}
