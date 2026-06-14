package com.google.android.gms.internal.consent_sdk;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes8.dex */
final class zzdl extends zzdn {
    zzdl(zzdo zzdoVar, CharSequence charSequence, zzdh zzdhVar) {
        super(zzdoVar, charSequence);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    final int zzd(int i10) {
        CharSequence charSequence = ((zzdn) this).zza;
        int length = charSequence.length();
        zzdj.zzb(i10, length, FirebaseAnalytics.Param.INDEX);
        while (i10 < length) {
            if (charSequence.charAt(i10) == ',') {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
