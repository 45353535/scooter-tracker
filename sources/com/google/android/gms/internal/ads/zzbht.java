package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class zzbht {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbht(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbhq zzf() {
        return new zzbhq(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(@Nullable zzbht zzbhtVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbhq zzbhqVar, long j10, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbhq(j10, strArr[0], zzbhqVar));
        }
        return true;
    }

    public final zzbhs zzc() {
        zzbhs zzbhsVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbhq> list = this.zza;
                for (zzbhq zzbhqVar : list) {
                    long jZza = zzbhqVar.zza();
                    String strZzb = zzbhqVar.zzb();
                    zzbhq zzbhqVarZzc = zzbhqVar.zzc();
                    if (zzbhqVarZzc != null && jZza > 0) {
                        long jZza2 = jZza - zzbhqVarZzc.zza();
                        sb2.append(strZzb);
                        sb2.append('.');
                        sb2.append(jZza2);
                        sb2.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbhqVarZzc.zza()))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(zzbhqVarZzc.zza()));
                                sb3.append('+');
                                sb3.append(strZzb);
                            } else {
                                map.put(Long.valueOf(zzbhqVarZzc.zza()), new StringBuilder(strZzb));
                            }
                        }
                    }
                }
                list.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        sb4.append(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                zzbhsVar = new zzbhs(sb2.toString(), string);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbhsVar;
    }

    public final void zzd(String str, String str2) {
        zzbhj zzbhjVarZza;
        if (TextUtils.isEmpty(str2) || (zzbhjVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbhp zzbhpVarZzd = zzbhjVarZza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzbhpVarZzd.zza((String) map.get(str), str2));
        }
    }

    @VisibleForTesting
    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
