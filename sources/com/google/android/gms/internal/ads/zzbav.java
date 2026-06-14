package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbav extends zzbby {
    public zzbav(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11) {
        super(zzbakVar, "x/S3A4n6lbyzTdn/kz8tPqUf3a1YB5vAd5r7wQYCBb3DYPiGQZB67fbWL/+XFcZ5", "kB0lJ6HHV2i/5ncg76cGz3oLPH/Yq3P6CviApgv8Ipc=", zzawgVar, i10, 89);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        String str = (String) this.zze.invoke(null, null);
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzaa(str);
        }
    }
}
