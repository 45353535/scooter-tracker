package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes8.dex */
final class zzhxs extends ThreadLocal {
    final /* synthetic */ zzhxt zza;

    zzhxs(zzhxt zzhxtVar) {
        Objects.requireNonNull(zzhxtVar);
        this.zza = zzhxtVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zzhxe zzhxeVar = zzhxe.zzb;
            zzhxt zzhxtVar = this.zza;
            Mac mac = (Mac) zzhxeVar.zzb(zzhxtVar.zzb());
            mac.init(zzhxtVar.zzc());
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
