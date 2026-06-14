package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzhxa implements zzhxd {
    private final zzhxm zza;

    @Override // com.google.android.gms.internal.ads.zzhxd
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzhxe.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
