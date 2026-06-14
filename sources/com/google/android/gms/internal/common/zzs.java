package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes8.dex */
final class zzs extends zzv {
    final /* synthetic */ zzp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(zzw zzwVar, CharSequence charSequence, zzp zzpVar) {
        super(zzwVar, charSequence);
        this.zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.common.zzv
    final int zzc(int i10) {
        CharSequence charSequence = ((zzv) this).zzb;
        int length = charSequence.length();
        zzr.zzc(i10, length, FirebaseAnalytics.Param.INDEX);
        while (i10 < length) {
            if (this.zza.zza(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzv
    final int zzd(int i10) {
        return i10 + 1;
    }
}
