package com.google.android.gms.internal.ads;

import com.ironsource.C4240b4;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzhyr extends zzhys {
    final /* synthetic */ zzhys zza;

    /* synthetic */ zzhyr(zzhys zzhysVar, byte[] bArr) {
        Objects.requireNonNull(zzhysVar);
        this.zza = zzhysVar;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 21);
        sb2.append("NullSafeTypeAdapter[");
        sb2.append(string);
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhys
    public final void zza(zzhzs zzhzsVar, Object obj) throws IOException {
        throw null;
    }
}
