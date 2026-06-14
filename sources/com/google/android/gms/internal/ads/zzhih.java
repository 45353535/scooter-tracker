package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhih {
    private static final String[] zza = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider zza() {
        String[] strArr = zza;
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
