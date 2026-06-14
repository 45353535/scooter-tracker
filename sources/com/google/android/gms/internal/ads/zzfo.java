package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfo {
    private final zzfn zza;
    private final zzdx zzb;
    private final zzdx zzc;
    private boolean zzd;
    private boolean zze;

    public zzfo(Context context, Looper looper, zzdn zzdnVar) {
        this.zza = new zzfn(context.getApplicationContext());
        this.zzb = zzdnVar.zzd(looper, null);
        this.zzc = zzdnVar.zzd(Looper.getMainLooper(), null);
    }

    private final void zzf(final boolean z10, final boolean z11) {
        if (zzg(z10, z11)) {
            this.zzb.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd(z10, z11);
                }
            });
            return;
        }
        final zzfn zzfnVar = this.zza;
        Objects.requireNonNull(zzfnVar);
        final Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfnVar.zza();
            }
        };
        this.zzc.zzo(runnable, 1000L);
        this.zzb.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(runnable, z10, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzg(boolean z10, boolean z11) {
        return z10 && z11;
    }

    public final void zza(boolean z10) {
        if (this.zzd == z10) {
            return;
        }
        this.zzd = z10;
        zzf(z10, this.zze);
    }

    public final void zzb(boolean z10) {
        if (this.zze == z10) {
            return;
        }
        this.zze = z10;
        if (this.zzd) {
            zzf(true, z10);
        }
    }

    final /* synthetic */ void zzc(Runnable runnable, boolean z10, boolean z11) {
        this.zzc.zzl(runnable);
        this.zza.zzb(z10, z11);
    }

    final /* synthetic */ void zzd(boolean z10, boolean z11) {
        this.zza.zzb(z10, z11);
    }
}
