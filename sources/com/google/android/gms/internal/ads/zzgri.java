package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes8.dex */
final class zzgri extends zzgrp {
    final /* synthetic */ zzgqq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgri(zzgrr zzgrrVar, CharSequence charSequence, zzgqq zzgqqVar) {
        super(zzgrrVar, charSequence);
        this.zza = zzgqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    final int zzc(int i10) {
        CharSequence charSequence = ((zzgrp) this).zzb;
        int length = charSequence.length();
        zzgrc.zzn(i10, length, FirebaseAnalytics.Param.INDEX);
        while (i10 < length) {
            if (this.zza.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    final int zzd(int i10) {
        return i10 + 1;
    }
}
