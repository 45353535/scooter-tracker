package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzadl {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzadm zzb;

    public zzadl(@Nullable Handler handler, @Nullable zzadm zzadmVar) {
        if (zzadmVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzadmVar;
    }

    public final void zza(final zzin zzinVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzk(zzinVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl(str, j10, j11);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, @Nullable final zzio zzioVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(zzvVar, zzioVar);
                }
            });
        }
    }

    public final void zzd(final int i10, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzn(i10, j10);
                }
            });
        }
    }

    public final void zze(final long j10, final int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzade
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(j10, i10);
                }
            });
        }
    }

    public final void zzf(final zzbv zzbvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(zzbvVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(str);
                }
            });
        }
    }

    public final void zzi(final zzin zzinVar) {
        zzinVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(zzinVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(exc);
                }
            });
        }
    }

    final /* synthetic */ void zzk(zzin zzinVar) {
        String str = zzfj.zza;
        this.zzb.zzb(zzinVar);
    }

    final /* synthetic */ void zzl(String str, long j10, long j11) {
        String str2 = zzfj.zza;
        this.zzb.zzc(str, j10, j11);
    }

    final /* synthetic */ void zzm(zzv zzvVar, zzio zzioVar) {
        String str = zzfj.zza;
        this.zzb.zzd(zzvVar, zzioVar);
    }

    final /* synthetic */ void zzn(int i10, long j10) {
        String str = zzfj.zza;
        this.zzb.zze(i10, j10);
    }

    final /* synthetic */ void zzo(long j10, int i10) {
        String str = zzfj.zza;
        this.zzb.zzj(j10, i10);
    }

    final /* synthetic */ void zzp(zzbv zzbvVar) {
        String str = zzfj.zza;
        this.zzb.zzf(zzbvVar);
    }

    final /* synthetic */ void zzq(Object obj, long j10) {
        String str = zzfj.zza;
        this.zzb.zzg(obj, j10);
    }

    final /* synthetic */ void zzr(String str) {
        String str2 = zzfj.zza;
        this.zzb.zzh(str);
    }

    final /* synthetic */ void zzs(zzin zzinVar) {
        zzinVar.zza();
        String str = zzfj.zza;
        this.zzb.zzi(zzinVar);
    }

    final /* synthetic */ void zzt(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzk(exc);
    }
}
