package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes8.dex */
public final class zzarq {
    private final String zza;
    private final String zzb;

    public zzarq(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzarq.class == obj.getClass()) {
            zzarq zzarqVar = (zzarq) obj;
            if (TextUtils.equals(this.zza, zzarqVar.zza) && TextUtils.equals(this.zzb, zzarqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        sb2.append("Header[name=");
        sb2.append(str);
        sb2.append(",value=");
        sb2.append(str2);
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
