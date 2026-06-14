package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
final class zzkc extends zzkm {
    zzkc(zzkg zzkgVar, String str, Long l10, boolean z10) {
        super(zzkgVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.zzb;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 25 + string.length());
        sb2.append("Invalid long value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
