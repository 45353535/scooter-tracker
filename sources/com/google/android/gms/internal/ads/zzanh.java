package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzanh {
    @Nullable
    public static zzani zza(@Nullable zzani zzaniVar, @Nullable String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (zzaniVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzani) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzani zzaniVar2 = new zzani();
                while (i10 < length2) {
                    zzaniVar2.zzr((zzani) map.get(strArr[i10]));
                    i10++;
                }
                return zzaniVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaniVar.zzr((zzani) map.get(strArr[0]));
                return zzaniVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i10 < length) {
                    zzaniVar.zzr((zzani) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return zzaniVar;
    }
}
