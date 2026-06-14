package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
final class zzhxq implements zzhnp {
    final zzhnp zza;
    final zzhnp zzb;

    /* synthetic */ zzhxq(zzhnp zzhnpVar, zzhnp zzhnpVar2, byte[] bArr) {
        this.zza = zzhnpVar;
        this.zzb = zzhnpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhnp
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i10) : this.zzb.zza(bArr, i10);
    }
}
