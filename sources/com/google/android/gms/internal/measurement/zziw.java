package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zziw extends zzmf implements zznn {
    private static final zziw zzd;
    private zzmo zzb = zzmf.zzcv();

    static {
        zziw zziwVar = new zziw();
        zzd = zziwVar;
        zzmf.zzcp(zziw.class, zziwVar);
    }

    private zziw() {
    }

    public static zziw zzc() {
        return zzd;
    }

    public final List zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    protected final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zziy.class});
        }
        if (i11 == 3) {
            return new zziw();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zziv(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
