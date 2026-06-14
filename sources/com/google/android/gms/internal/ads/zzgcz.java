package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgcz implements zzgda {
    private final zzidc zza;

    public zzgcz(zzidc zzidcVar) {
        this.zza = zzidcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        ((zzidc) obj).zzaO(outputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return (zzidc) this.zza.zzbd().zza(inputStream, zzibb.zza());
        } catch (zzicg e10) {
            throw new zzgcw("Cannot read proto.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
