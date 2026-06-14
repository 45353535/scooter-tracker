package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.C4240b4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgn {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzgm zzd;

    public zzgn(zzgm zzgmVar) {
        this.zzd = zzgmVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjm.zzc, zzjm.zza, zza);
    }

    protected final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjn.zzb, zzjn.zza, zzb);
    }

    protected final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zzg(str, zzjo.zzb, zzjo.zza, zzc);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String zzd(zzbg zzbgVar) {
        zzgm zzgmVar = this.zzd;
        if (!zzgmVar.zza()) {
            return zzbgVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(zzbgVar.zzc);
        sb2.append(",name=");
        sb2.append(zza(zzbgVar.zza));
        sb2.append(",params=");
        zzbe zzbeVar = zzbgVar.zzb;
        sb2.append(zzbeVar == null ? null : !zzgmVar.zza() ? zzbeVar.toString() : zze(zzbeVar.zzf()));
        return sb2.toString();
    }

    protected final String zze(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(zzb(str));
            sb2.append(C4240b4.j.f42668b);
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? zzf(new Object[]{obj}) : obj instanceof Object[] ? zzf((Object[]) obj) : obj instanceof ArrayList ? zzf(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    protected final String zzf(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C4240b4.j.f42672d);
        for (Object obj : objArr) {
            String strZze = obj instanceof Bundle ? zze((Bundle) obj) : String.valueOf(obj);
            if (strZze != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strZze);
            }
        }
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }
}
