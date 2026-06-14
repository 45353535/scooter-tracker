package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
final class zzph extends zzpk {
    zzph(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzpm.zzi(0, 47, bArr.length);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte zza(int i10) {
        if (((47 - (i10 + 1)) | i10) >= 0) {
            return ((zzpk) this).zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", 47");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    final byte zzb(int i10) {
        return ((zzpk) this).zza[i10];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final int zzd() {
        return 47;
    }
}
