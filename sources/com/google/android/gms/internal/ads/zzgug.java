package com.google.android.gms.internal.ads;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes8.dex */
final class zzgug {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzgug(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        sb2.append("Multiple entries with same key: ");
        sb2.append(strValueOf);
        sb2.append(C4240b4.j.f42668b);
        sb2.append(strValueOf2);
        sb2.append(" and ");
        sb2.append(strValueOf3);
        sb2.append(C4240b4.j.f42668b);
        sb2.append(strValueOf4);
        return new IllegalArgumentException(sb2.toString());
    }
}
