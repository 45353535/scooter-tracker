package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzchr implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzchr(zzcge zzcgeVar) {
        Context context = zzcgeVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcgeVar.zzs().afmaVersion);
        this.zzc = new WeakReference(zzcgeVar);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract boolean zze(String str);

    public boolean zzf(String str, String[] strArr) {
        return zze(str);
    }

    public boolean zzg(String str, String[] strArr, zzchj zzchjVar) {
        return zze(str);
    }

    protected void zzh(int i10) {
    }

    protected void zzi(int i10) {
    }

    protected void zzj(int i10) {
    }

    protected void zzk(int i10) {
    }

    public abstract void zzl();

    public final void zzm(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchm(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchn(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    protected final void zzo(String str, String str2, int i10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcho(this, str, str2, i10));
    }

    public final void zzp(String str, String str2, long j10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchp(this, str, str2, j10));
    }

    public final void zzq(String str, @Nullable String str2, String str3, @Nullable String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchq(this, str, str2, str3, str4));
    }

    final /* synthetic */ void zzw(String str, Map map) {
        zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null) {
            zzcgeVar.zze("onPrecacheEvent", map);
        }
    }
}
