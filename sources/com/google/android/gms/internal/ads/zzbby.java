package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbby implements Callable {
    protected final zzbak zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzawg zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzbby(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11) {
        this.zza = zzbakVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzawgVar;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i10;
        try {
            long jNanoTime = System.nanoTime();
            zzbak zzbakVar = this.zza;
            Method methodZzo = zzbakVar.zzo(this.zzb, this.zzc);
            this.zze = methodZzo;
            if (methodZzo == null) {
                return null;
            }
            zza();
            zzazb zzazbVarZzh = zzbakVar.zzh();
            if (zzazbVarZzh == null || (i10 = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzazbVarZzh.zza(this.zzg, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
