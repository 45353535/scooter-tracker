package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhhi extends zzhhg {
    public zzhhi(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    final zzhhe zza(byte[] bArr, int i10) throws InvalidKeyException {
        return new zzhhh(bArr, i10);
    }
}
