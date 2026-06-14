package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
final class zzggm extends zzghb {
    private final Context zza;

    zzggm(zzawg zzawgVar, zzgfx zzgfxVar, Context context, zzgoe zzgoeVar) {
        super("PH59Z8k3dpWxORUT8HU0o+g5WN12ilbJvwpqiSzw0bSm8ti3u+Yy1pYDsitXR/IS", "EBTPDqTGNNE4oafrCuyvamIcg1nistjqiNmDYn1J+fs=", zzawgVar, zzgfxVar, zzgoeVar.zza(115));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        int i10 = 1;
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzO(((Integer) objArr[0]).intValue());
                zzawgVar.zzd(((Integer) objArr[1]).intValue());
                zzawgVar.zze(((Integer) objArr[2]).intValue());
                zzawgVar.zzab(((Integer) objArr[3]).intValue());
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    zzawgVar.zzaf(3);
                } else {
                    zzawgVar.zzaf(true != bool.booleanValue() ? 1 : 2);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    zzawgVar.zzae(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i10 = 2;
                    }
                    zzawgVar.zzae(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
