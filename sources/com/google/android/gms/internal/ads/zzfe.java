package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzfe implements zzdx {

    @GuardedBy("messagePool")
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfe(Handler handler) {
        this.zzb = handler;
    }

    static /* synthetic */ void zzp(zzfd zzfdVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzfdVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static zzfd zzq() {
        zzfd zzfdVar;
        List list = zza;
        synchronized (list) {
            try {
                zzfdVar = list.isEmpty() ? new zzfd(null) : (zzfd) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzfdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzb(int i10) {
        return this.zzb.hasMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final zzdw zzc(int i10) {
        Handler handler = this.zzb;
        zzfd zzfdVarZzq = zzq();
        zzfdVarZzq.zzb(handler.obtainMessage(i10), this);
        return zzfdVarZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final zzdw zzd(int i10, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzfd zzfdVarZzq = zzq();
        zzfdVarZzq.zzb(handler.obtainMessage(i10, obj), this);
        return zzfdVarZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final zzdw zze(int i10, int i11, int i12) {
        Handler handler = this.zzb;
        zzfd zzfdVarZzq = zzq();
        zzfdVarZzq.zzb(handler.obtainMessage(i10, i11, i12), this);
        return zzfdVarZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final zzdw zzf(int i10, int i11, int i12, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzfd zzfdVarZzq = zzq();
        zzfdVarZzq.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzfdVarZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzg(zzdw zzdwVar) {
        return ((zzfd) zzdwVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzh(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzi(int i10, int i11) {
        return this.zzb.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzj(int i10, long j10) {
        return this.zzb.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final void zzk(int i10) {
        this.zzb.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final void zzl(Runnable runnable) {
        this.zzb.removeCallbacks(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final void zzm(@Nullable Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzn(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzo(Runnable runnable, long j10) {
        return this.zzb.postDelayed(runnable, 1000L);
    }
}
