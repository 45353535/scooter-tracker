package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfxc {
    final /* synthetic */ zzfxd zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfxc(zzfxd zzfxdVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfxdVar);
        this.zza = zzfxdVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfxd zzfxdVar = this.zza;
            if (zzfxdVar.zzb) {
                zzfxg zzfxgVar = zzfxdVar.zza;
                zzfxgVar.zzg(this.zzb);
                zzfxgVar.zzh(this.zzc);
                zzfxgVar.zzi(this.zzd);
                zzfxgVar.zzf(null);
                zzfxgVar.zze();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }

    public final zzfxc zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzfxc zzc(int i10) {
        this.zzd = i10;
        return this;
    }
}
