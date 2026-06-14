package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzath extends zzijr implements Closeable, AutoCloseable {
    static {
        zzijy.zzb(zzath.class);
    }

    public zzath(zzijs zzijsVar, zzatg zzatgVar) throws IOException {
        zzd(zzijsVar, zzijsVar.zzb(), zzatgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzijr
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
