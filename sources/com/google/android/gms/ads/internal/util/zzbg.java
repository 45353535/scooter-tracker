package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzasc;
import com.google.android.gms.internal.ads.zzash;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzbg implements zzasc {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzash zzashVar) {
        String str = this.zza;
        String string = zzashVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb2.append("Failed to load URL: ");
        sb2.append(str);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb2.append(string);
        String string2 = sb2.toString();
        int i10 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(string2);
        this.zzb.zza((Object) null);
    }
}
