package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes8.dex */
final class zzhhx extends ThreadLocal {
    zzhhx() {
    }

    protected static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzhxe.zza.zzb("AES/GCM-SIV/NoPadding");
            if (zzhgq.zzb(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
