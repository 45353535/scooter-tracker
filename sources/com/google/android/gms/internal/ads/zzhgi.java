package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes8.dex */
final class zzhgi extends ThreadLocal {
    zzhgi() {
    }

    protected static final Cipher zza() {
        try {
            return (Cipher) zzhxe.zza.zzb("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
