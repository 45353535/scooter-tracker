package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzdn extends zzdc {
    final CharSequence zza;
    int zzb = 0;
    int zzc = Integer.MAX_VALUE;

    zzdn(zzdo zzdoVar, CharSequence charSequence) {
        this.zza = charSequence;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdc
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i10 = this.zzb;
        while (true) {
            int i11 = this.zzb;
            if (i11 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i11);
            if (iZzd == -1) {
                iZzd = this.zza.length();
                this.zzb = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzb = iZzc;
            }
            if (iZzc != i10) {
                if (i10 < iZzd) {
                    this.zza.charAt(i10);
                }
                if (i10 < iZzd) {
                    this.zza.charAt(iZzd - 1);
                }
                int i12 = this.zzc;
                if (i12 == 1) {
                    CharSequence charSequence = this.zza;
                    int length = charSequence.length();
                    this.zzb = -1;
                    if (length > i10) {
                        charSequence.charAt(length - 1);
                    }
                    iZzd = length;
                } else {
                    this.zzc = i12 - 1;
                }
                return this.zza.subSequence(i10, iZzd).toString();
            }
            int i13 = iZzc + 1;
            this.zzb = i13;
            if (i13 > this.zza.length()) {
                this.zzb = -1;
            }
        }
    }

    abstract int zzc(int i10);

    abstract int zzd(int i10);
}
