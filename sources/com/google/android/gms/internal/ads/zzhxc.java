package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzhxc implements zzhxd {
    private final zzhxm zza;

    @Override // com.google.android.gms.internal.ads.zzhxd
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzhxe.zza("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
