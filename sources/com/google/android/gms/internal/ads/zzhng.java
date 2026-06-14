package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhng implements zzhlx {
    public zzhng(zzhmb zzhmbVar) throws GeneralSecurityException {
        if (!zzhid.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
