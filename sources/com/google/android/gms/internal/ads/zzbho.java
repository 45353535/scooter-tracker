package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes8.dex */
final class zzbho extends zzbhp {
    zzbho() {
    }

    @Nullable
    private static final String zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < str.length() && str.charAt(i11) == ',') {
            i11++;
        }
        while (length > 0) {
            int i12 = length - 1;
            if (str.charAt(i12) != ',') {
                break;
            }
            length = i12;
        }
        if (length < i11) {
            return null;
        }
        if (i11 != 0) {
            i10 = i11;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i10, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final String zza(@Nullable String str, String str2) {
        String strZzb = zzb(str);
        String strZzb2 = zzb(str2);
        if (TextUtils.isEmpty(strZzb)) {
            return strZzb2;
        }
        if (TextUtils.isEmpty(strZzb2)) {
            return strZzb;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZzb).length() + 1 + String.valueOf(strZzb2).length());
        sb2.append(strZzb);
        sb2.append(StringUtils.COMMA);
        sb2.append(strZzb2);
        return sb2.toString();
    }
}
