package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdo {
    private final zzdk zza;

    private zzdo(zzdk zzdkVar) {
        int i10 = zzdg.zzb;
        this.zza = zzdkVar;
    }

    public static zzdo zza(char c10) {
        return new zzdo(new zzdk(new zzde(',')));
    }

    static /* bridge */ /* synthetic */ Iterator zzc(zzdo zzdoVar, CharSequence charSequence) {
        return new zzdl(zzdoVar, charSequence, zzdoVar.zza.zza);
    }

    public final Iterable zzb(CharSequence charSequence) {
        return new zzdm(this, charSequence);
    }
}
