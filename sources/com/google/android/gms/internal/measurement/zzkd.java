package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
final class zzkd extends zzkm {
    zzkd(zzkg zzkgVar, String str, Boolean bool, boolean z10) {
        super(zzkgVar, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzjg.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzjg.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.zzb;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str2.length() + 28 + string.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
