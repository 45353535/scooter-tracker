package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzrb {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzrc zzb;

    public zzrb(@Nullable Handler handler, @Nullable zzrc zzrcVar) {
        this.zza = zzrcVar == null ? null : handler;
        this.zzb = zzrcVar;
    }

    final /* synthetic */ void zzA(int i10) {
        String str = zzfj.zza;
        this.zzb.zzx(i10);
    }

    final /* synthetic */ void zzB(zzil zzilVar) {
        String str = zzfj.zza;
        this.zzb.zzy(zzilVar);
    }

    public final void zza(final zzin zzinVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzra
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(zzinVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(str, j10, j11);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, @Nullable final zzio zzioVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(zzvVar, zzioVar);
                }
            });
        }
    }

    public final void zzd(final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(j10);
                }
            });
        }
    }

    public final void zze(final int i10, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(i10, j10, j11);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(str);
                }
            });
        }
    }

    public final void zzg(final zzin zzinVar) {
        zzinVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(zzinVar);
                }
            });
        }
    }

    public final void zzh(final boolean z10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(z10);
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzw(exc);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx(exc);
                }
            });
        }
    }

    public final void zzk(final zzrd zzrdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzy(zzrdVar);
                }
            });
        }
    }

    public final void zzl(final zzrd zzrdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzz(zzrdVar);
                }
            });
        }
    }

    public final void zzm(final int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzA(i10);
                }
            });
        }
    }

    public final void zzn(final zzil zzilVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzB(zzilVar);
                }
            });
        }
    }

    final /* synthetic */ void zzo(zzin zzinVar) {
        String str = zzfj.zza;
        this.zzb.zzl(zzinVar);
    }

    final /* synthetic */ void zzp(String str, long j10, long j11) {
        String str2 = zzfj.zza;
        this.zzb.zzm(str, j10, j11);
    }

    final /* synthetic */ void zzq(zzv zzvVar, zzio zzioVar) {
        String str = zzfj.zza;
        this.zzb.zzn(zzvVar, zzioVar);
    }

    final /* synthetic */ void zzr(long j10) {
        String str = zzfj.zza;
        this.zzb.zzo(j10);
    }

    final /* synthetic */ void zzs(int i10, long j10, long j11) {
        String str = zzfj.zza;
        this.zzb.zzp(i10, j10, j11);
    }

    final /* synthetic */ void zzt(String str) {
        String str2 = zzfj.zza;
        this.zzb.zzq(str);
    }

    final /* synthetic */ void zzu(zzin zzinVar) {
        zzinVar.zza();
        String str = zzfj.zza;
        this.zzb.zzr(zzinVar);
    }

    final /* synthetic */ void zzv(boolean z10) {
        String str = zzfj.zza;
        this.zzb.zzs(z10);
    }

    final /* synthetic */ void zzw(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzt(exc);
    }

    final /* synthetic */ void zzx(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzu(exc);
    }

    final /* synthetic */ void zzy(zzrd zzrdVar) {
        String str = zzfj.zza;
        this.zzb.zzv(zzrdVar);
    }

    final /* synthetic */ void zzz(zzrd zzrdVar) {
        String str = zzfj.zza;
        this.zzb.zzw(zzrdVar);
    }
}
