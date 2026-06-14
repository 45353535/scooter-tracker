package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhnn extends zzhnq {
    private final zzhno zza;
    private final zzhyg zzb;

    private zzhnn(zzhno zzhnoVar, zzhyg zzhygVar) {
        this.zza = zzhnoVar;
        this.zzb = zzhygVar;
    }

    public static zzhnn zzc(zzhno zzhnoVar, zzhyg zzhygVar) throws GeneralSecurityException {
        if (zzhnoVar.zzc() == zzhygVar.zzd()) {
            return new zzhnn(zzhnoVar, zzhygVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhnq, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return null;
    }

    public final zzhyg zzd() {
        return this.zzb;
    }
}
