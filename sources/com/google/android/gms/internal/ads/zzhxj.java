package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhxj implements zzhxm {
    @Override // com.google.android.gms.internal.ads.zzhxm
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
